package typings.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicaGlobalSecondaryIndexAutoScalingDescription extends js.Object {
  /**
    * The name of the global secondary index.
    */
  var IndexName: js.UndefOr[typings.awsSdk.dynamodbMod.IndexName] = js.native
  /**
    * The current state of the replica global secondary index:    CREATING - The index is being created.    UPDATING - The index is being updated.    DELETING - The index is being deleted.    ACTIVE - The index is ready for use.  
    */
  var IndexStatus: js.UndefOr[typings.awsSdk.dynamodbMod.IndexStatus] = js.native
  var ProvisionedReadCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.native
  var ProvisionedWriteCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.native
}

object ReplicaGlobalSecondaryIndexAutoScalingDescription {
  @scala.inline
  def apply(): ReplicaGlobalSecondaryIndexAutoScalingDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicaGlobalSecondaryIndexAutoScalingDescription]
  }
  @scala.inline
  implicit class ReplicaGlobalSecondaryIndexAutoScalingDescriptionOps[Self <: ReplicaGlobalSecondaryIndexAutoScalingDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIndexName(value: IndexName): Self = this.set("IndexName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndexName: Self = this.set("IndexName", js.undefined)
    @scala.inline
    def setIndexStatus(value: IndexStatus): Self = this.set("IndexStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndexStatus: Self = this.set("IndexStatus", js.undefined)
    @scala.inline
    def setProvisionedReadCapacityAutoScalingSettings(value: AutoScalingSettingsDescription): Self = this.set("ProvisionedReadCapacityAutoScalingSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvisionedReadCapacityAutoScalingSettings: Self = this.set("ProvisionedReadCapacityAutoScalingSettings", js.undefined)
    @scala.inline
    def setProvisionedWriteCapacityAutoScalingSettings(value: AutoScalingSettingsDescription): Self = this.set("ProvisionedWriteCapacityAutoScalingSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvisionedWriteCapacityAutoScalingSettings: Self = this.set("ProvisionedWriteCapacityAutoScalingSettings", js.undefined)
  }
  
}

