package typings.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicaSettingsUpdate extends js.Object {
  /**
    * The Region of the replica to be added.
    */
  var RegionName: typings.awsSdk.dynamodbMod.RegionName = js.native
  /**
    * Represents the settings of a global secondary index for a global table that will be modified.
    */
  var ReplicaGlobalSecondaryIndexSettingsUpdate: js.UndefOr[ReplicaGlobalSecondaryIndexSettingsUpdateList] = js.native
  /**
    * Auto scaling settings for managing a global table replica's read capacity units.
    */
  var ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate: js.UndefOr[AutoScalingSettingsUpdate] = js.native
  /**
    * The maximum number of strongly consistent reads consumed per second before DynamoDB returns a ThrottlingException. For more information, see Specifying Read and Write Requirements in the Amazon DynamoDB Developer Guide. 
    */
  var ReplicaProvisionedReadCapacityUnits: js.UndefOr[PositiveLongObject] = js.native
}

object ReplicaSettingsUpdate {
  @scala.inline
  def apply(
    RegionName: RegionName,
    ReplicaGlobalSecondaryIndexSettingsUpdate: ReplicaGlobalSecondaryIndexSettingsUpdateList = null,
    ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate: AutoScalingSettingsUpdate = null,
    ReplicaProvisionedReadCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined
  ): ReplicaSettingsUpdate = {
    val __obj = js.Dynamic.literal(RegionName = RegionName.asInstanceOf[js.Any])
    if (ReplicaGlobalSecondaryIndexSettingsUpdate != null) __obj.updateDynamic("ReplicaGlobalSecondaryIndexSettingsUpdate")(ReplicaGlobalSecondaryIndexSettingsUpdate.asInstanceOf[js.Any])
    if (ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate != null) __obj.updateDynamic("ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate")(ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate.asInstanceOf[js.Any])
    if (!js.isUndefined(ReplicaProvisionedReadCapacityUnits)) __obj.updateDynamic("ReplicaProvisionedReadCapacityUnits")(ReplicaProvisionedReadCapacityUnits.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicaSettingsUpdate]
  }
}

