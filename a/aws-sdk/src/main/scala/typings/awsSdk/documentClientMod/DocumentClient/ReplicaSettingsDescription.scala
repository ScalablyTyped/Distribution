package typings.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicaSettingsDescription extends js.Object {
  /**
    * The Region name of the replica.
    */
  var RegionName: typings.awsSdk.documentClientMod.DocumentClient.RegionName = js.native
  /**
    * The read/write capacity mode of the replica.
    */
  var ReplicaBillingModeSummary: js.UndefOr[BillingModeSummary] = js.native
  /**
    * Replica global secondary index settings for the global table.
    */
  var ReplicaGlobalSecondaryIndexSettings: js.UndefOr[ReplicaGlobalSecondaryIndexSettingsDescriptionList] = js.native
  /**
    * Auto scaling settings for a global table replica's read capacity units.
    */
  var ReplicaProvisionedReadCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.native
  /**
    * The maximum number of strongly consistent reads consumed per second before DynamoDB returns a ThrottlingException. For more information, see Specifying Read and Write Requirements in the Amazon DynamoDB Developer Guide. 
    */
  var ReplicaProvisionedReadCapacityUnits: js.UndefOr[NonNegativeLongObject] = js.native
  /**
    * Auto scaling settings for a global table replica's write capacity units.
    */
  var ReplicaProvisionedWriteCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.native
  /**
    * The maximum number of writes consumed per second before DynamoDB returns a ThrottlingException. For more information, see Specifying Read and Write Requirements in the Amazon DynamoDB Developer Guide.
    */
  var ReplicaProvisionedWriteCapacityUnits: js.UndefOr[NonNegativeLongObject] = js.native
  /**
    * The current state of the Region:    CREATING - The Region is being created.    UPDATING - The Region is being updated.    DELETING - The Region is being deleted.    ACTIVE - The Region is ready for use.  
    */
  var ReplicaStatus: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ReplicaStatus] = js.native
}

object ReplicaSettingsDescription {
  @scala.inline
  def apply(RegionName: RegionName): ReplicaSettingsDescription = {
    val __obj = js.Dynamic.literal(RegionName = RegionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicaSettingsDescription]
  }
  @scala.inline
  implicit class ReplicaSettingsDescriptionOps[Self <: ReplicaSettingsDescription] (val x: Self) extends AnyVal {
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
    def setRegionName(value: RegionName): Self = this.set("RegionName", value.asInstanceOf[js.Any])
    @scala.inline
    def setReplicaBillingModeSummary(value: BillingModeSummary): Self = this.set("ReplicaBillingModeSummary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicaBillingModeSummary: Self = this.set("ReplicaBillingModeSummary", js.undefined)
    @scala.inline
    def setReplicaGlobalSecondaryIndexSettingsVarargs(value: ReplicaGlobalSecondaryIndexSettingsDescription*): Self = this.set("ReplicaGlobalSecondaryIndexSettings", js.Array(value :_*))
    @scala.inline
    def setReplicaGlobalSecondaryIndexSettings(value: ReplicaGlobalSecondaryIndexSettingsDescriptionList): Self = this.set("ReplicaGlobalSecondaryIndexSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicaGlobalSecondaryIndexSettings: Self = this.set("ReplicaGlobalSecondaryIndexSettings", js.undefined)
    @scala.inline
    def setReplicaProvisionedReadCapacityAutoScalingSettings(value: AutoScalingSettingsDescription): Self = this.set("ReplicaProvisionedReadCapacityAutoScalingSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicaProvisionedReadCapacityAutoScalingSettings: Self = this.set("ReplicaProvisionedReadCapacityAutoScalingSettings", js.undefined)
    @scala.inline
    def setReplicaProvisionedReadCapacityUnits(value: NonNegativeLongObject): Self = this.set("ReplicaProvisionedReadCapacityUnits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicaProvisionedReadCapacityUnits: Self = this.set("ReplicaProvisionedReadCapacityUnits", js.undefined)
    @scala.inline
    def setReplicaProvisionedWriteCapacityAutoScalingSettings(value: AutoScalingSettingsDescription): Self = this.set("ReplicaProvisionedWriteCapacityAutoScalingSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicaProvisionedWriteCapacityAutoScalingSettings: Self = this.set("ReplicaProvisionedWriteCapacityAutoScalingSettings", js.undefined)
    @scala.inline
    def setReplicaProvisionedWriteCapacityUnits(value: NonNegativeLongObject): Self = this.set("ReplicaProvisionedWriteCapacityUnits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicaProvisionedWriteCapacityUnits: Self = this.set("ReplicaProvisionedWriteCapacityUnits", js.undefined)
    @scala.inline
    def setReplicaStatus(value: ReplicaStatus): Self = this.set("ReplicaStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicaStatus: Self = this.set("ReplicaStatus", js.undefined)
  }
  
}

