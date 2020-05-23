package typings.awsSdkClientDynamodbBrowser.typesReplicaGlobalSecondaryIndexSettingsUpdateMod

import typings.awsSdkClientDynamodbBrowser.typesAutoScalingSettingsUpdateMod.AutoScalingSettingsUpdate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplicaGlobalSecondaryIndexSettingsUpdate extends js.Object {
  /**
    * <p>The name of the global secondary index. The name must be unique among all other indexes on this table.</p>
    */
  var IndexName: String
  /**
    * <p>Autoscaling settings for managing a global secondary index replica's read capacity units.</p>
    */
  var ProvisionedReadCapacityAutoScalingSettingsUpdate: js.UndefOr[AutoScalingSettingsUpdate] = js.undefined
  /**
    * <p>The maximum number of strongly consistent reads consumed per second before DynamoDB returns a <code>ThrottlingException</code>.</p>
    */
  var ProvisionedReadCapacityUnits: js.UndefOr[Double] = js.undefined
}

object ReplicaGlobalSecondaryIndexSettingsUpdate {
  @scala.inline
  def apply(
    IndexName: String,
    ProvisionedReadCapacityAutoScalingSettingsUpdate: AutoScalingSettingsUpdate = null,
    ProvisionedReadCapacityUnits: js.UndefOr[Double] = js.undefined
  ): ReplicaGlobalSecondaryIndexSettingsUpdate = {
    val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any])
    if (ProvisionedReadCapacityAutoScalingSettingsUpdate != null) __obj.updateDynamic("ProvisionedReadCapacityAutoScalingSettingsUpdate")(ProvisionedReadCapacityAutoScalingSettingsUpdate.asInstanceOf[js.Any])
    if (!js.isUndefined(ProvisionedReadCapacityUnits)) __obj.updateDynamic("ProvisionedReadCapacityUnits")(ProvisionedReadCapacityUnits.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicaGlobalSecondaryIndexSettingsUpdate]
  }
}

