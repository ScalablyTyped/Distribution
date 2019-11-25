package typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreReplicaSettingsUpdateMod

import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreAutoScalingSettingsUpdateMod._AutoScalingSettingsUpdate
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreReplicaGlobalSecondaryIndexSettingsUpdateMod._ReplicaGlobalSecondaryIndexSettingsUpdate
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ReplicaSettingsUpdate extends js.Object {
  /**
    * <p>The region of the replica to be added.</p>
    */
  var RegionName: String
  /**
    * <p>Represents the settings of a global secondary index for a global table that will be modified.</p>
    */
  var ReplicaGlobalSecondaryIndexSettingsUpdate: js.UndefOr[
    js.Array[_ReplicaGlobalSecondaryIndexSettingsUpdate] | Iterable[_ReplicaGlobalSecondaryIndexSettingsUpdate]
  ] = js.undefined
  /**
    * <p>Autoscaling settings for managing a global table replica's read capacity units.</p>
    */
  var ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate: js.UndefOr[_AutoScalingSettingsUpdate] = js.undefined
  /**
    * <p>The maximum number of strongly consistent reads consumed per second before DynamoDB returns a <code>ThrottlingException</code>. For more information, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput">Specifying Read and Write Requirements</a> in the <i>Amazon DynamoDB Developer Guide</i>. </p>
    */
  var ReplicaProvisionedReadCapacityUnits: js.UndefOr[Double] = js.undefined
}

object _ReplicaSettingsUpdate {
  @scala.inline
  def apply(
    RegionName: String,
    ReplicaGlobalSecondaryIndexSettingsUpdate: js.Array[_ReplicaGlobalSecondaryIndexSettingsUpdate] | Iterable[_ReplicaGlobalSecondaryIndexSettingsUpdate] = null,
    ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate: _AutoScalingSettingsUpdate = null,
    ReplicaProvisionedReadCapacityUnits: Int | Double = null
  ): _ReplicaSettingsUpdate = {
    val __obj = js.Dynamic.literal(RegionName = RegionName.asInstanceOf[js.Any])
    if (ReplicaGlobalSecondaryIndexSettingsUpdate != null) __obj.updateDynamic("ReplicaGlobalSecondaryIndexSettingsUpdate")(ReplicaGlobalSecondaryIndexSettingsUpdate.asInstanceOf[js.Any])
    if (ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate != null) __obj.updateDynamic("ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate")(ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate.asInstanceOf[js.Any])
    if (ReplicaProvisionedReadCapacityUnits != null) __obj.updateDynamic("ReplicaProvisionedReadCapacityUnits")(ReplicaProvisionedReadCapacityUnits.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ReplicaSettingsUpdate]
  }
}

