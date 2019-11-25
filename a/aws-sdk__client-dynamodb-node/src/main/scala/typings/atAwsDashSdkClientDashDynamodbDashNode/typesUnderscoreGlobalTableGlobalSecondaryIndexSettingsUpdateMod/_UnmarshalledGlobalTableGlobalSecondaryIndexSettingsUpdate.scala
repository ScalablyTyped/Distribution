package typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreGlobalTableGlobalSecondaryIndexSettingsUpdateMod

import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreAutoScalingSettingsUpdateMod._UnmarshalledAutoScalingSettingsUpdate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledGlobalTableGlobalSecondaryIndexSettingsUpdate extends _GlobalTableGlobalSecondaryIndexSettingsUpdate {
  /**
    * <p>AutoScaling settings for managing a global secondary index's write capacity units.</p>
    */
  @JSName("ProvisionedWriteCapacityAutoScalingSettingsUpdate")
  var ProvisionedWriteCapacityAutoScalingSettingsUpdate__UnmarshalledGlobalTableGlobalSecondaryIndexSettingsUpdate: js.UndefOr[_UnmarshalledAutoScalingSettingsUpdate] = js.undefined
}

object _UnmarshalledGlobalTableGlobalSecondaryIndexSettingsUpdate {
  @scala.inline
  def apply(
    IndexName: String,
    ProvisionedWriteCapacityAutoScalingSettingsUpdate: _UnmarshalledAutoScalingSettingsUpdate = null,
    ProvisionedWriteCapacityUnits: Int | Double = null
  ): _UnmarshalledGlobalTableGlobalSecondaryIndexSettingsUpdate = {
    val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any])
    if (ProvisionedWriteCapacityAutoScalingSettingsUpdate != null) __obj.updateDynamic("ProvisionedWriteCapacityAutoScalingSettingsUpdate")(ProvisionedWriteCapacityAutoScalingSettingsUpdate.asInstanceOf[js.Any])
    if (ProvisionedWriteCapacityUnits != null) __obj.updateDynamic("ProvisionedWriteCapacityUnits")(ProvisionedWriteCapacityUnits.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledGlobalTableGlobalSecondaryIndexSettingsUpdate]
  }
}

