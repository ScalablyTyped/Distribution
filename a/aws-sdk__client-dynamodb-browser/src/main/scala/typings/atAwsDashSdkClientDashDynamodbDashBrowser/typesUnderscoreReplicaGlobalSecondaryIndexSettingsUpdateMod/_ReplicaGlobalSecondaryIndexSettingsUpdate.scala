package typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscoreReplicaGlobalSecondaryIndexSettingsUpdateMod

import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscoreAutoScalingSettingsUpdateMod._AutoScalingSettingsUpdate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ReplicaGlobalSecondaryIndexSettingsUpdate extends js.Object {
  /**
    * <p>The name of the global secondary index. The name must be unique among all other indexes on this table.</p>
    */
  var IndexName: String
  /**
    * <p>Autoscaling settings for managing a global secondary index replica's read capacity units.</p>
    */
  var ProvisionedReadCapacityAutoScalingSettingsUpdate: js.UndefOr[_AutoScalingSettingsUpdate] = js.undefined
  /**
    * <p>The maximum number of strongly consistent reads consumed per second before DynamoDB returns a <code>ThrottlingException</code>.</p>
    */
  var ProvisionedReadCapacityUnits: js.UndefOr[Double] = js.undefined
}

object _ReplicaGlobalSecondaryIndexSettingsUpdate {
  @scala.inline
  def apply(
    IndexName: String,
    ProvisionedReadCapacityAutoScalingSettingsUpdate: _AutoScalingSettingsUpdate = null,
    ProvisionedReadCapacityUnits: Int | Double = null
  ): _ReplicaGlobalSecondaryIndexSettingsUpdate = {
    val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any])
    if (ProvisionedReadCapacityAutoScalingSettingsUpdate != null) __obj.updateDynamic("ProvisionedReadCapacityAutoScalingSettingsUpdate")(ProvisionedReadCapacityAutoScalingSettingsUpdate.asInstanceOf[js.Any])
    if (ProvisionedReadCapacityUnits != null) __obj.updateDynamic("ProvisionedReadCapacityUnits")(ProvisionedReadCapacityUnits.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ReplicaGlobalSecondaryIndexSettingsUpdate]
  }
}

