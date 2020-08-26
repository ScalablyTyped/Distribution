package typings.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicaDescription extends js.Object {
  /**
    * Replica-specific global secondary index settings.
    */
  var GlobalSecondaryIndexes: js.UndefOr[ReplicaGlobalSecondaryIndexDescriptionList] = js.native
  /**
    * The AWS KMS customer master key (CMK) of the replica that will be used for AWS KMS encryption.
    */
  var KMSMasterKeyId: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.KMSMasterKeyId] = js.native
  /**
    * Replica-specific provisioned throughput. If not described, uses the source table's provisioned throughput settings.
    */
  var ProvisionedThroughputOverride: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ProvisionedThroughputOverride] = js.native
  /**
    * The name of the Region.
    */
  var RegionName: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.RegionName] = js.native
  /**
    * The current state of the replica:    CREATING - The replica is being created.    UPDATING - The replica is being updated.    DELETING - The replica is being deleted.    ACTIVE - The replica is ready for use.  
    */
  var ReplicaStatus: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ReplicaStatus] = js.native
  /**
    * Detailed information about the replica status.
    */
  var ReplicaStatusDescription: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ReplicaStatusDescription] = js.native
  /**
    * Specifies the progress of a Create, Update, or Delete action on the replica as a percentage.
    */
  var ReplicaStatusPercentProgress: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ReplicaStatusPercentProgress] = js.native
}

object ReplicaDescription {
  @scala.inline
  def apply(): ReplicaDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicaDescription]
  }
  @scala.inline
  implicit class ReplicaDescriptionOps[Self <: ReplicaDescription] (val x: Self) extends AnyVal {
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
    def setGlobalSecondaryIndexesVarargs(value: ReplicaGlobalSecondaryIndexDescription*): Self = this.set("GlobalSecondaryIndexes", js.Array(value :_*))
    @scala.inline
    def setGlobalSecondaryIndexes(value: ReplicaGlobalSecondaryIndexDescriptionList): Self = this.set("GlobalSecondaryIndexes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobalSecondaryIndexes: Self = this.set("GlobalSecondaryIndexes", js.undefined)
    @scala.inline
    def setKMSMasterKeyId(value: KMSMasterKeyId): Self = this.set("KMSMasterKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKMSMasterKeyId: Self = this.set("KMSMasterKeyId", js.undefined)
    @scala.inline
    def setProvisionedThroughputOverride(value: ProvisionedThroughputOverride): Self = this.set("ProvisionedThroughputOverride", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvisionedThroughputOverride: Self = this.set("ProvisionedThroughputOverride", js.undefined)
    @scala.inline
    def setRegionName(value: RegionName): Self = this.set("RegionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegionName: Self = this.set("RegionName", js.undefined)
    @scala.inline
    def setReplicaStatus(value: ReplicaStatus): Self = this.set("ReplicaStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicaStatus: Self = this.set("ReplicaStatus", js.undefined)
    @scala.inline
    def setReplicaStatusDescription(value: ReplicaStatusDescription): Self = this.set("ReplicaStatusDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicaStatusDescription: Self = this.set("ReplicaStatusDescription", js.undefined)
    @scala.inline
    def setReplicaStatusPercentProgress(value: ReplicaStatusPercentProgress): Self = this.set("ReplicaStatusPercentProgress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicaStatusPercentProgress: Self = this.set("ReplicaStatusPercentProgress", js.undefined)
  }
  
}

