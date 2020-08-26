package typings.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicaGlobalSecondaryIndexSettingsDescription extends js.Object {
  /**
    * The name of the global secondary index. The name must be unique among all other indexes on this table.
    */
  var IndexName: typings.awsSdk.dynamodbMod.IndexName = js.native
  /**
    *  The current status of the global secondary index:    CREATING - The global secondary index is being created.    UPDATING - The global secondary index is being updated.    DELETING - The global secondary index is being deleted.    ACTIVE - The global secondary index is ready for use.  
    */
  var IndexStatus: js.UndefOr[typings.awsSdk.dynamodbMod.IndexStatus] = js.native
  /**
    * Auto scaling settings for a global secondary index replica's read capacity units.
    */
  var ProvisionedReadCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.native
  /**
    * The maximum number of strongly consistent reads consumed per second before DynamoDB returns a ThrottlingException.
    */
  var ProvisionedReadCapacityUnits: js.UndefOr[PositiveLongObject] = js.native
  /**
    * Auto scaling settings for a global secondary index replica's write capacity units.
    */
  var ProvisionedWriteCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.native
  /**
    * The maximum number of writes consumed per second before DynamoDB returns a ThrottlingException.
    */
  var ProvisionedWriteCapacityUnits: js.UndefOr[PositiveLongObject] = js.native
}

object ReplicaGlobalSecondaryIndexSettingsDescription {
  @scala.inline
  def apply(IndexName: IndexName): ReplicaGlobalSecondaryIndexSettingsDescription = {
    val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicaGlobalSecondaryIndexSettingsDescription]
  }
  @scala.inline
  implicit class ReplicaGlobalSecondaryIndexSettingsDescriptionOps[Self <: ReplicaGlobalSecondaryIndexSettingsDescription] (val x: Self) extends AnyVal {
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
    def setIndexStatus(value: IndexStatus): Self = this.set("IndexStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndexStatus: Self = this.set("IndexStatus", js.undefined)
    @scala.inline
    def setProvisionedReadCapacityAutoScalingSettings(value: AutoScalingSettingsDescription): Self = this.set("ProvisionedReadCapacityAutoScalingSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvisionedReadCapacityAutoScalingSettings: Self = this.set("ProvisionedReadCapacityAutoScalingSettings", js.undefined)
    @scala.inline
    def setProvisionedReadCapacityUnits(value: PositiveLongObject): Self = this.set("ProvisionedReadCapacityUnits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvisionedReadCapacityUnits: Self = this.set("ProvisionedReadCapacityUnits", js.undefined)
    @scala.inline
    def setProvisionedWriteCapacityAutoScalingSettings(value: AutoScalingSettingsDescription): Self = this.set("ProvisionedWriteCapacityAutoScalingSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvisionedWriteCapacityAutoScalingSettings: Self = this.set("ProvisionedWriteCapacityAutoScalingSettings", js.undefined)
    @scala.inline
    def setProvisionedWriteCapacityUnits(value: PositiveLongObject): Self = this.set("ProvisionedWriteCapacityUnits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvisionedWriteCapacityUnits: Self = this.set("ProvisionedWriteCapacityUnits", js.undefined)
  }
  
}

