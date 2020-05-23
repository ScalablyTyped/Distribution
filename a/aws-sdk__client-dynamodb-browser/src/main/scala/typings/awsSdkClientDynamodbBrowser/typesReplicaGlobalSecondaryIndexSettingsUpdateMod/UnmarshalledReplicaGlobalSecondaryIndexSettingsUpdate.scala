package typings.awsSdkClientDynamodbBrowser.typesReplicaGlobalSecondaryIndexSettingsUpdateMod

import typings.awsSdkClientDynamodbBrowser.typesAutoScalingSettingsUpdateMod.UnmarshalledAutoScalingSettingsUpdate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledReplicaGlobalSecondaryIndexSettingsUpdate extends ReplicaGlobalSecondaryIndexSettingsUpdate {
  /**
    * <p>Autoscaling settings for managing a global secondary index replica's read capacity units.</p>
    */
  @JSName("ProvisionedReadCapacityAutoScalingSettingsUpdate")
  var ProvisionedReadCapacityAutoScalingSettingsUpdate_UnmarshalledReplicaGlobalSecondaryIndexSettingsUpdate: js.UndefOr[UnmarshalledAutoScalingSettingsUpdate] = js.undefined
}

object UnmarshalledReplicaGlobalSecondaryIndexSettingsUpdate {
  @scala.inline
  def apply(
    IndexName: String,
    ProvisionedReadCapacityAutoScalingSettingsUpdate: UnmarshalledAutoScalingSettingsUpdate = null,
    ProvisionedReadCapacityUnits: js.UndefOr[Double] = js.undefined
  ): UnmarshalledReplicaGlobalSecondaryIndexSettingsUpdate = {
    val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any])
    if (ProvisionedReadCapacityAutoScalingSettingsUpdate != null) __obj.updateDynamic("ProvisionedReadCapacityAutoScalingSettingsUpdate")(ProvisionedReadCapacityAutoScalingSettingsUpdate.asInstanceOf[js.Any])
    if (!js.isUndefined(ProvisionedReadCapacityUnits)) __obj.updateDynamic("ProvisionedReadCapacityUnits")(ProvisionedReadCapacityUnits.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledReplicaGlobalSecondaryIndexSettingsUpdate]
  }
}

