package typings.awsSdkClientDynamodbNode.typesReplicaSettingsUpdateMod

import typings.awsSdkClientDynamodbNode.typesAutoScalingSettingsUpdateMod.UnmarshalledAutoScalingSettingsUpdate
import typings.awsSdkClientDynamodbNode.typesReplicaGlobalSecondaryIndexSettingsUpdateMod.UnmarshalledReplicaGlobalSecondaryIndexSettingsUpdate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledReplicaSettingsUpdate extends ReplicaSettingsUpdate {
  /**
    * <p>Represents the settings of a global secondary index for a global table that will be modified.</p>
    */
  @JSName("ReplicaGlobalSecondaryIndexSettingsUpdate")
  var ReplicaGlobalSecondaryIndexSettingsUpdate_UnmarshalledReplicaSettingsUpdate: js.UndefOr[js.Array[UnmarshalledReplicaGlobalSecondaryIndexSettingsUpdate]] = js.undefined
  /**
    * <p>Autoscaling settings for managing a global table replica's read capacity units.</p>
    */
  @JSName("ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate")
  var ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate_UnmarshalledReplicaSettingsUpdate: js.UndefOr[UnmarshalledAutoScalingSettingsUpdate] = js.undefined
}

object UnmarshalledReplicaSettingsUpdate {
  @scala.inline
  def apply(
    RegionName: String,
    ReplicaGlobalSecondaryIndexSettingsUpdate: js.Array[UnmarshalledReplicaGlobalSecondaryIndexSettingsUpdate] = null,
    ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate: UnmarshalledAutoScalingSettingsUpdate = null,
    ReplicaProvisionedReadCapacityUnits: js.UndefOr[Double] = js.undefined
  ): UnmarshalledReplicaSettingsUpdate = {
    val __obj = js.Dynamic.literal(RegionName = RegionName.asInstanceOf[js.Any])
    if (ReplicaGlobalSecondaryIndexSettingsUpdate != null) __obj.updateDynamic("ReplicaGlobalSecondaryIndexSettingsUpdate")(ReplicaGlobalSecondaryIndexSettingsUpdate.asInstanceOf[js.Any])
    if (ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate != null) __obj.updateDynamic("ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate")(ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate.asInstanceOf[js.Any])
    if (!js.isUndefined(ReplicaProvisionedReadCapacityUnits)) __obj.updateDynamic("ReplicaProvisionedReadCapacityUnits")(ReplicaProvisionedReadCapacityUnits.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledReplicaSettingsUpdate]
  }
}

