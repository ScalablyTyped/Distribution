package typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreReplicaGlobalSecondaryIndexSettingsDescriptionMod

import typings.atAwsDashSdkClientDashDynamodbDashNode.atAwsDashSdkClientDashDynamodbDashNodeStrings.ACTIVE
import typings.atAwsDashSdkClientDashDynamodbDashNode.atAwsDashSdkClientDashDynamodbDashNodeStrings.CREATING
import typings.atAwsDashSdkClientDashDynamodbDashNode.atAwsDashSdkClientDashDynamodbDashNodeStrings.DELETING
import typings.atAwsDashSdkClientDashDynamodbDashNode.atAwsDashSdkClientDashDynamodbDashNodeStrings.UPDATING
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreAutoScalingSettingsDescriptionMod._UnmarshalledAutoScalingSettingsDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledReplicaGlobalSecondaryIndexSettingsDescription extends _ReplicaGlobalSecondaryIndexSettingsDescription {
  /**
    * <p>Autoscaling settings for a global secondary index replica's read capacity units.</p>
    */
  @JSName("ProvisionedReadCapacityAutoScalingSettings")
  var ProvisionedReadCapacityAutoScalingSettings__UnmarshalledReplicaGlobalSecondaryIndexSettingsDescription: js.UndefOr[_UnmarshalledAutoScalingSettingsDescription] = js.undefined
  /**
    * <p>AutoScaling settings for a global secondary index replica's write capacity units.</p>
    */
  @JSName("ProvisionedWriteCapacityAutoScalingSettings")
  var ProvisionedWriteCapacityAutoScalingSettings__UnmarshalledReplicaGlobalSecondaryIndexSettingsDescription: js.UndefOr[_UnmarshalledAutoScalingSettingsDescription] = js.undefined
}

object _UnmarshalledReplicaGlobalSecondaryIndexSettingsDescription {
  @scala.inline
  def apply(
    IndexName: String,
    IndexStatus: CREATING | UPDATING | DELETING | ACTIVE | String = null,
    ProvisionedReadCapacityAutoScalingSettings: _UnmarshalledAutoScalingSettingsDescription = null,
    ProvisionedReadCapacityUnits: Int | Double = null,
    ProvisionedWriteCapacityAutoScalingSettings: _UnmarshalledAutoScalingSettingsDescription = null,
    ProvisionedWriteCapacityUnits: Int | Double = null
  ): _UnmarshalledReplicaGlobalSecondaryIndexSettingsDescription = {
    val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any])
    if (IndexStatus != null) __obj.updateDynamic("IndexStatus")(IndexStatus.asInstanceOf[js.Any])
    if (ProvisionedReadCapacityAutoScalingSettings != null) __obj.updateDynamic("ProvisionedReadCapacityAutoScalingSettings")(ProvisionedReadCapacityAutoScalingSettings.asInstanceOf[js.Any])
    if (ProvisionedReadCapacityUnits != null) __obj.updateDynamic("ProvisionedReadCapacityUnits")(ProvisionedReadCapacityUnits.asInstanceOf[js.Any])
    if (ProvisionedWriteCapacityAutoScalingSettings != null) __obj.updateDynamic("ProvisionedWriteCapacityAutoScalingSettings")(ProvisionedWriteCapacityAutoScalingSettings.asInstanceOf[js.Any])
    if (ProvisionedWriteCapacityUnits != null) __obj.updateDynamic("ProvisionedWriteCapacityUnits")(ProvisionedWriteCapacityUnits.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledReplicaGlobalSecondaryIndexSettingsDescription]
  }
}

