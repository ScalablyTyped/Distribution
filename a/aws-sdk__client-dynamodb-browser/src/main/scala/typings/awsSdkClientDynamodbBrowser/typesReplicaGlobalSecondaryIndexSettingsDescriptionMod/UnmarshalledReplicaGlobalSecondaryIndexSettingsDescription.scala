package typings.awsSdkClientDynamodbBrowser.typesReplicaGlobalSecondaryIndexSettingsDescriptionMod

import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ACTIVE
import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.CREATING
import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.DELETING
import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.UPDATING
import typings.awsSdkClientDynamodbBrowser.typesAutoScalingSettingsDescriptionMod.UnmarshalledAutoScalingSettingsDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledReplicaGlobalSecondaryIndexSettingsDescription extends ReplicaGlobalSecondaryIndexSettingsDescription {
  /**
    * <p>Autoscaling settings for a global secondary index replica's read capacity units.</p>
    */
  @JSName("ProvisionedReadCapacityAutoScalingSettings")
  var ProvisionedReadCapacityAutoScalingSettings_UnmarshalledReplicaGlobalSecondaryIndexSettingsDescription: js.UndefOr[UnmarshalledAutoScalingSettingsDescription] = js.undefined
  /**
    * <p>AutoScaling settings for a global secondary index replica's write capacity units.</p>
    */
  @JSName("ProvisionedWriteCapacityAutoScalingSettings")
  var ProvisionedWriteCapacityAutoScalingSettings_UnmarshalledReplicaGlobalSecondaryIndexSettingsDescription: js.UndefOr[UnmarshalledAutoScalingSettingsDescription] = js.undefined
}

object UnmarshalledReplicaGlobalSecondaryIndexSettingsDescription {
  @scala.inline
  def apply(
    IndexName: String,
    IndexStatus: CREATING | UPDATING | DELETING | ACTIVE | String = null,
    ProvisionedReadCapacityAutoScalingSettings: UnmarshalledAutoScalingSettingsDescription = null,
    ProvisionedReadCapacityUnits: js.UndefOr[Double] = js.undefined,
    ProvisionedWriteCapacityAutoScalingSettings: UnmarshalledAutoScalingSettingsDescription = null,
    ProvisionedWriteCapacityUnits: js.UndefOr[Double] = js.undefined
  ): UnmarshalledReplicaGlobalSecondaryIndexSettingsDescription = {
    val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any])
    if (IndexStatus != null) __obj.updateDynamic("IndexStatus")(IndexStatus.asInstanceOf[js.Any])
    if (ProvisionedReadCapacityAutoScalingSettings != null) __obj.updateDynamic("ProvisionedReadCapacityAutoScalingSettings")(ProvisionedReadCapacityAutoScalingSettings.asInstanceOf[js.Any])
    if (!js.isUndefined(ProvisionedReadCapacityUnits)) __obj.updateDynamic("ProvisionedReadCapacityUnits")(ProvisionedReadCapacityUnits.get.asInstanceOf[js.Any])
    if (ProvisionedWriteCapacityAutoScalingSettings != null) __obj.updateDynamic("ProvisionedWriteCapacityAutoScalingSettings")(ProvisionedWriteCapacityAutoScalingSettings.asInstanceOf[js.Any])
    if (!js.isUndefined(ProvisionedWriteCapacityUnits)) __obj.updateDynamic("ProvisionedWriteCapacityUnits")(ProvisionedWriteCapacityUnits.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledReplicaGlobalSecondaryIndexSettingsDescription]
  }
}

