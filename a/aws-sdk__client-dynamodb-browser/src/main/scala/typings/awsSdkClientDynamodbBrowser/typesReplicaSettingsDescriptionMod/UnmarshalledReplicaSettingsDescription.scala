package typings.awsSdkClientDynamodbBrowser.typesReplicaSettingsDescriptionMod

import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ACTIVE
import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.CREATING
import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.DELETING
import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.UPDATING
import typings.awsSdkClientDynamodbBrowser.typesAutoScalingSettingsDescriptionMod.UnmarshalledAutoScalingSettingsDescription
import typings.awsSdkClientDynamodbBrowser.typesReplicaGlobalSecondaryIndexSettingsDescriptionMod.UnmarshalledReplicaGlobalSecondaryIndexSettingsDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledReplicaSettingsDescription extends ReplicaSettingsDescription {
  /**
    * <p>Replica global secondary index settings for the global table.</p>
    */
  @JSName("ReplicaGlobalSecondaryIndexSettings")
  var ReplicaGlobalSecondaryIndexSettings_UnmarshalledReplicaSettingsDescription: js.UndefOr[js.Array[UnmarshalledReplicaGlobalSecondaryIndexSettingsDescription]] = js.undefined
  /**
    * <p>Autoscaling settings for a global table replica's read capacity units.</p>
    */
  @JSName("ReplicaProvisionedReadCapacityAutoScalingSettings")
  var ReplicaProvisionedReadCapacityAutoScalingSettings_UnmarshalledReplicaSettingsDescription: js.UndefOr[UnmarshalledAutoScalingSettingsDescription] = js.undefined
  /**
    * <p>AutoScaling settings for a global table replica's write capacity units.</p>
    */
  @JSName("ReplicaProvisionedWriteCapacityAutoScalingSettings")
  var ReplicaProvisionedWriteCapacityAutoScalingSettings_UnmarshalledReplicaSettingsDescription: js.UndefOr[UnmarshalledAutoScalingSettingsDescription] = js.undefined
}

object UnmarshalledReplicaSettingsDescription {
  @scala.inline
  def apply(
    RegionName: String,
    ReplicaGlobalSecondaryIndexSettings: js.Array[UnmarshalledReplicaGlobalSecondaryIndexSettingsDescription] = null,
    ReplicaProvisionedReadCapacityAutoScalingSettings: UnmarshalledAutoScalingSettingsDescription = null,
    ReplicaProvisionedReadCapacityUnits: Int | Double = null,
    ReplicaProvisionedWriteCapacityAutoScalingSettings: UnmarshalledAutoScalingSettingsDescription = null,
    ReplicaProvisionedWriteCapacityUnits: Int | Double = null,
    ReplicaStatus: CREATING | UPDATING | DELETING | ACTIVE | String = null
  ): UnmarshalledReplicaSettingsDescription = {
    val __obj = js.Dynamic.literal(RegionName = RegionName.asInstanceOf[js.Any])
    if (ReplicaGlobalSecondaryIndexSettings != null) __obj.updateDynamic("ReplicaGlobalSecondaryIndexSettings")(ReplicaGlobalSecondaryIndexSettings.asInstanceOf[js.Any])
    if (ReplicaProvisionedReadCapacityAutoScalingSettings != null) __obj.updateDynamic("ReplicaProvisionedReadCapacityAutoScalingSettings")(ReplicaProvisionedReadCapacityAutoScalingSettings.asInstanceOf[js.Any])
    if (ReplicaProvisionedReadCapacityUnits != null) __obj.updateDynamic("ReplicaProvisionedReadCapacityUnits")(ReplicaProvisionedReadCapacityUnits.asInstanceOf[js.Any])
    if (ReplicaProvisionedWriteCapacityAutoScalingSettings != null) __obj.updateDynamic("ReplicaProvisionedWriteCapacityAutoScalingSettings")(ReplicaProvisionedWriteCapacityAutoScalingSettings.asInstanceOf[js.Any])
    if (ReplicaProvisionedWriteCapacityUnits != null) __obj.updateDynamic("ReplicaProvisionedWriteCapacityUnits")(ReplicaProvisionedWriteCapacityUnits.asInstanceOf[js.Any])
    if (ReplicaStatus != null) __obj.updateDynamic("ReplicaStatus")(ReplicaStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledReplicaSettingsDescription]
  }
}

