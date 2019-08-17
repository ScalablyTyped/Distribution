package typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreReplicaSettingsDescriptionMod

import typings.atAwsDashSdkClientDashDynamodbDashNode.atAwsDashSdkClientDashDynamodbDashNodeStrings.ACTIVE
import typings.atAwsDashSdkClientDashDynamodbDashNode.atAwsDashSdkClientDashDynamodbDashNodeStrings.CREATING
import typings.atAwsDashSdkClientDashDynamodbDashNode.atAwsDashSdkClientDashDynamodbDashNodeStrings.DELETING
import typings.atAwsDashSdkClientDashDynamodbDashNode.atAwsDashSdkClientDashDynamodbDashNodeStrings.UPDATING
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreAutoScalingSettingsDescriptionMod._UnmarshalledAutoScalingSettingsDescription
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreReplicaGlobalSecondaryIndexSettingsDescriptionMod._UnmarshalledReplicaGlobalSecondaryIndexSettingsDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledReplicaSettingsDescription extends _ReplicaSettingsDescription {
  /**
    * <p>Replica global secondary index settings for the global table.</p>
    */
  @JSName("ReplicaGlobalSecondaryIndexSettings")
  var ReplicaGlobalSecondaryIndexSettings__UnmarshalledReplicaSettingsDescription: js.UndefOr[js.Array[_UnmarshalledReplicaGlobalSecondaryIndexSettingsDescription]] = js.undefined
  /**
    * <p>Autoscaling settings for a global table replica's read capacity units.</p>
    */
  @JSName("ReplicaProvisionedReadCapacityAutoScalingSettings")
  var ReplicaProvisionedReadCapacityAutoScalingSettings__UnmarshalledReplicaSettingsDescription: js.UndefOr[_UnmarshalledAutoScalingSettingsDescription] = js.undefined
  /**
    * <p>AutoScaling settings for a global table replica's write capacity units.</p>
    */
  @JSName("ReplicaProvisionedWriteCapacityAutoScalingSettings")
  var ReplicaProvisionedWriteCapacityAutoScalingSettings__UnmarshalledReplicaSettingsDescription: js.UndefOr[_UnmarshalledAutoScalingSettingsDescription] = js.undefined
}

object _UnmarshalledReplicaSettingsDescription {
  @scala.inline
  def apply(
    RegionName: String,
    ReplicaGlobalSecondaryIndexSettings: js.Array[_UnmarshalledReplicaGlobalSecondaryIndexSettingsDescription] = null,
    ReplicaProvisionedReadCapacityAutoScalingSettings: _UnmarshalledAutoScalingSettingsDescription = null,
    ReplicaProvisionedReadCapacityUnits: Int | Double = null,
    ReplicaProvisionedWriteCapacityAutoScalingSettings: _UnmarshalledAutoScalingSettingsDescription = null,
    ReplicaProvisionedWriteCapacityUnits: Int | Double = null,
    ReplicaStatus: CREATING | UPDATING | DELETING | ACTIVE | String = null
  ): _UnmarshalledReplicaSettingsDescription = {
    val __obj = js.Dynamic.literal(RegionName = RegionName)
    if (ReplicaGlobalSecondaryIndexSettings != null) __obj.updateDynamic("ReplicaGlobalSecondaryIndexSettings")(ReplicaGlobalSecondaryIndexSettings)
    if (ReplicaProvisionedReadCapacityAutoScalingSettings != null) __obj.updateDynamic("ReplicaProvisionedReadCapacityAutoScalingSettings")(ReplicaProvisionedReadCapacityAutoScalingSettings)
    if (ReplicaProvisionedReadCapacityUnits != null) __obj.updateDynamic("ReplicaProvisionedReadCapacityUnits")(ReplicaProvisionedReadCapacityUnits.asInstanceOf[js.Any])
    if (ReplicaProvisionedWriteCapacityAutoScalingSettings != null) __obj.updateDynamic("ReplicaProvisionedWriteCapacityAutoScalingSettings")(ReplicaProvisionedWriteCapacityAutoScalingSettings)
    if (ReplicaProvisionedWriteCapacityUnits != null) __obj.updateDynamic("ReplicaProvisionedWriteCapacityUnits")(ReplicaProvisionedWriteCapacityUnits.asInstanceOf[js.Any])
    if (ReplicaStatus != null) __obj.updateDynamic("ReplicaStatus")(ReplicaStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledReplicaSettingsDescription]
  }
}

