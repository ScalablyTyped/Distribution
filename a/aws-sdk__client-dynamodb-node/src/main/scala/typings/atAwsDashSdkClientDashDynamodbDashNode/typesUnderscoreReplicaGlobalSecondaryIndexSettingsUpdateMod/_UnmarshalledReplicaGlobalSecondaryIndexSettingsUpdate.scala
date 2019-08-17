package typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreReplicaGlobalSecondaryIndexSettingsUpdateMod

import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreAutoScalingSettingsUpdateMod._UnmarshalledAutoScalingSettingsUpdate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledReplicaGlobalSecondaryIndexSettingsUpdate extends _ReplicaGlobalSecondaryIndexSettingsUpdate {
  /**
    * <p>Autoscaling settings for managing a global secondary index replica's read capacity units.</p>
    */
  @JSName("ProvisionedReadCapacityAutoScalingSettingsUpdate")
  var ProvisionedReadCapacityAutoScalingSettingsUpdate__UnmarshalledReplicaGlobalSecondaryIndexSettingsUpdate: js.UndefOr[_UnmarshalledAutoScalingSettingsUpdate] = js.undefined
}

object _UnmarshalledReplicaGlobalSecondaryIndexSettingsUpdate {
  @scala.inline
  def apply(
    IndexName: String,
    ProvisionedReadCapacityAutoScalingSettingsUpdate: _UnmarshalledAutoScalingSettingsUpdate = null,
    ProvisionedReadCapacityUnits: Int | Double = null
  ): _UnmarshalledReplicaGlobalSecondaryIndexSettingsUpdate = {
    val __obj = js.Dynamic.literal(IndexName = IndexName)
    if (ProvisionedReadCapacityAutoScalingSettingsUpdate != null) __obj.updateDynamic("ProvisionedReadCapacityAutoScalingSettingsUpdate")(ProvisionedReadCapacityAutoScalingSettingsUpdate)
    if (ProvisionedReadCapacityUnits != null) __obj.updateDynamic("ProvisionedReadCapacityUnits")(ProvisionedReadCapacityUnits.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledReplicaGlobalSecondaryIndexSettingsUpdate]
  }
}

