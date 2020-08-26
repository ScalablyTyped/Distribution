package typings.awsSdkClientDynamodbNode.typesReplicaSettingsDescriptionMod

import typings.awsSdkClientDynamodbNode.typesAutoScalingSettingsDescriptionMod.UnmarshalledAutoScalingSettingsDescription
import typings.awsSdkClientDynamodbNode.typesReplicaGlobalSecondaryIndexSettingsDescriptionMod.UnmarshalledReplicaGlobalSecondaryIndexSettingsDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledReplicaSettingsDescription extends ReplicaSettingsDescription {
  /**
    * <p>Replica global secondary index settings for the global table.</p>
    */
  @JSName("ReplicaGlobalSecondaryIndexSettings")
  var ReplicaGlobalSecondaryIndexSettings_UnmarshalledReplicaSettingsDescription: js.UndefOr[js.Array[UnmarshalledReplicaGlobalSecondaryIndexSettingsDescription]] = js.native
  /**
    * <p>Autoscaling settings for a global table replica's read capacity units.</p>
    */
  @JSName("ReplicaProvisionedReadCapacityAutoScalingSettings")
  var ReplicaProvisionedReadCapacityAutoScalingSettings_UnmarshalledReplicaSettingsDescription: js.UndefOr[UnmarshalledAutoScalingSettingsDescription] = js.native
  /**
    * <p>AutoScaling settings for a global table replica's write capacity units.</p>
    */
  @JSName("ReplicaProvisionedWriteCapacityAutoScalingSettings")
  var ReplicaProvisionedWriteCapacityAutoScalingSettings_UnmarshalledReplicaSettingsDescription: js.UndefOr[UnmarshalledAutoScalingSettingsDescription] = js.native
}

object UnmarshalledReplicaSettingsDescription {
  @scala.inline
  def apply(RegionName: String): UnmarshalledReplicaSettingsDescription = {
    val __obj = js.Dynamic.literal(RegionName = RegionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledReplicaSettingsDescription]
  }
  @scala.inline
  implicit class UnmarshalledReplicaSettingsDescriptionOps[Self <: UnmarshalledReplicaSettingsDescription] (val x: Self) extends AnyVal {
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
    def setReplicaGlobalSecondaryIndexSettingsVarargs(value: UnmarshalledReplicaGlobalSecondaryIndexSettingsDescription*): Self = this.set("ReplicaGlobalSecondaryIndexSettings", js.Array(value :_*))
    @scala.inline
    def setReplicaGlobalSecondaryIndexSettings(value: js.Array[UnmarshalledReplicaGlobalSecondaryIndexSettingsDescription]): Self = this.set("ReplicaGlobalSecondaryIndexSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicaGlobalSecondaryIndexSettings: Self = this.set("ReplicaGlobalSecondaryIndexSettings", js.undefined)
    @scala.inline
    def setReplicaProvisionedReadCapacityAutoScalingSettings(value: UnmarshalledAutoScalingSettingsDescription): Self = this.set("ReplicaProvisionedReadCapacityAutoScalingSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicaProvisionedReadCapacityAutoScalingSettings: Self = this.set("ReplicaProvisionedReadCapacityAutoScalingSettings", js.undefined)
    @scala.inline
    def setReplicaProvisionedWriteCapacityAutoScalingSettings(value: UnmarshalledAutoScalingSettingsDescription): Self = this.set("ReplicaProvisionedWriteCapacityAutoScalingSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicaProvisionedWriteCapacityAutoScalingSettings: Self = this.set("ReplicaProvisionedWriteCapacityAutoScalingSettings", js.undefined)
  }
  
}

