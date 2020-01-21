package typings.awsSdkClientDynamodbNode.typesGlobalTableGlobalSecondaryIndexSettingsUpdateMod

import typings.awsSdkClientDynamodbNode.typesAutoScalingSettingsUpdateMod.UnmarshalledAutoScalingSettingsUpdate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledGlobalTableGlobalSecondaryIndexSettingsUpdate extends GlobalTableGlobalSecondaryIndexSettingsUpdate {
  /**
    * <p>AutoScaling settings for managing a global secondary index's write capacity units.</p>
    */
  @JSName("ProvisionedWriteCapacityAutoScalingSettingsUpdate")
  var ProvisionedWriteCapacityAutoScalingSettingsUpdate_UnmarshalledGlobalTableGlobalSecondaryIndexSettingsUpdate: js.UndefOr[UnmarshalledAutoScalingSettingsUpdate] = js.undefined
}

object UnmarshalledGlobalTableGlobalSecondaryIndexSettingsUpdate {
  @scala.inline
  def apply(
    IndexName: String,
    ProvisionedWriteCapacityAutoScalingSettingsUpdate: UnmarshalledAutoScalingSettingsUpdate = null,
    ProvisionedWriteCapacityUnits: Int | Double = null
  ): UnmarshalledGlobalTableGlobalSecondaryIndexSettingsUpdate = {
    val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any])
    if (ProvisionedWriteCapacityAutoScalingSettingsUpdate != null) __obj.updateDynamic("ProvisionedWriteCapacityAutoScalingSettingsUpdate")(ProvisionedWriteCapacityAutoScalingSettingsUpdate.asInstanceOf[js.Any])
    if (ProvisionedWriteCapacityUnits != null) __obj.updateDynamic("ProvisionedWriteCapacityUnits")(ProvisionedWriteCapacityUnits.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledGlobalTableGlobalSecondaryIndexSettingsUpdate]
  }
}

