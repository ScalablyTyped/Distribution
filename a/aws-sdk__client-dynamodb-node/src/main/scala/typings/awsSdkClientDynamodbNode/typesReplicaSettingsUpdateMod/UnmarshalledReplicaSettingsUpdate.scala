package typings.awsSdkClientDynamodbNode.typesReplicaSettingsUpdateMod

import typings.awsSdkClientDynamodbNode.typesAutoScalingSettingsUpdateMod.UnmarshalledAutoScalingSettingsUpdate
import typings.awsSdkClientDynamodbNode.typesReplicaGlobalSecondaryIndexSettingsUpdateMod.UnmarshalledReplicaGlobalSecondaryIndexSettingsUpdate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledReplicaSettingsUpdate extends ReplicaSettingsUpdate {
  /**
    * <p>Represents the settings of a global secondary index for a global table that will be modified.</p>
    */
  @JSName("ReplicaGlobalSecondaryIndexSettingsUpdate")
  var ReplicaGlobalSecondaryIndexSettingsUpdate_UnmarshalledReplicaSettingsUpdate: js.UndefOr[js.Array[UnmarshalledReplicaGlobalSecondaryIndexSettingsUpdate]] = js.native
  /**
    * <p>Autoscaling settings for managing a global table replica's read capacity units.</p>
    */
  @JSName("ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate")
  var ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate_UnmarshalledReplicaSettingsUpdate: js.UndefOr[UnmarshalledAutoScalingSettingsUpdate] = js.native
}

object UnmarshalledReplicaSettingsUpdate {
  @scala.inline
  def apply(RegionName: String): UnmarshalledReplicaSettingsUpdate = {
    val __obj = js.Dynamic.literal(RegionName = RegionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledReplicaSettingsUpdate]
  }
  @scala.inline
  implicit class UnmarshalledReplicaSettingsUpdateOps[Self <: UnmarshalledReplicaSettingsUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setReplicaGlobalSecondaryIndexSettingsUpdateVarargs(value: UnmarshalledReplicaGlobalSecondaryIndexSettingsUpdate*): Self = this.set("ReplicaGlobalSecondaryIndexSettingsUpdate", js.Array(value :_*))
    @scala.inline
    def setReplicaGlobalSecondaryIndexSettingsUpdate(value: js.Array[UnmarshalledReplicaGlobalSecondaryIndexSettingsUpdate]): Self = this.set("ReplicaGlobalSecondaryIndexSettingsUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicaGlobalSecondaryIndexSettingsUpdate: Self = this.set("ReplicaGlobalSecondaryIndexSettingsUpdate", js.undefined)
    @scala.inline
    def setReplicaProvisionedReadCapacityAutoScalingSettingsUpdate(value: UnmarshalledAutoScalingSettingsUpdate): Self = this.set("ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicaProvisionedReadCapacityAutoScalingSettingsUpdate: Self = this.set("ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate", js.undefined)
  }
  
}

