package typings.awsSdkClientDynamodbNode.typesReplicaGlobalSecondaryIndexSettingsUpdateMod

import typings.awsSdkClientDynamodbNode.typesAutoScalingSettingsUpdateMod.UnmarshalledAutoScalingSettingsUpdate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledReplicaGlobalSecondaryIndexSettingsUpdate extends ReplicaGlobalSecondaryIndexSettingsUpdate {
  /**
    * <p>Autoscaling settings for managing a global secondary index replica's read capacity units.</p>
    */
  @JSName("ProvisionedReadCapacityAutoScalingSettingsUpdate")
  var ProvisionedReadCapacityAutoScalingSettingsUpdate_UnmarshalledReplicaGlobalSecondaryIndexSettingsUpdate: js.UndefOr[UnmarshalledAutoScalingSettingsUpdate] = js.native
}

object UnmarshalledReplicaGlobalSecondaryIndexSettingsUpdate {
  @scala.inline
  def apply(IndexName: String): UnmarshalledReplicaGlobalSecondaryIndexSettingsUpdate = {
    val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledReplicaGlobalSecondaryIndexSettingsUpdate]
  }
  @scala.inline
  implicit class UnmarshalledReplicaGlobalSecondaryIndexSettingsUpdateOps[Self <: UnmarshalledReplicaGlobalSecondaryIndexSettingsUpdate] (val x: Self) extends AnyVal {
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
    def setProvisionedReadCapacityAutoScalingSettingsUpdate(value: UnmarshalledAutoScalingSettingsUpdate): Self = this.set("ProvisionedReadCapacityAutoScalingSettingsUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvisionedReadCapacityAutoScalingSettingsUpdate: Self = this.set("ProvisionedReadCapacityAutoScalingSettingsUpdate", js.undefined)
  }
  
}

