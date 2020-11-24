package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsDynamoDbTableReplica extends js.Object {
  
  /**
    * List of global secondary indexes for the replica.
    */
  var GlobalSecondaryIndexes: js.UndefOr[AwsDynamoDbTableReplicaGlobalSecondaryIndexList] = js.native
  
  /**
    * The identifier of the AWS KMS customer master key (CMK) that will be used for AWS KMS encryption for the replica.
    */
  var KmsMasterKeyId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Replica-specific configuration for the provisioned throughput.
    */
  var ProvisionedThroughputOverride: js.UndefOr[AwsDynamoDbTableProvisionedThroughputOverride] = js.native
  
  /**
    * The name of the Region where the replica is located.
    */
  var RegionName: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The current status of the replica.
    */
  var ReplicaStatus: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Detailed information about the replica status.
    */
  var ReplicaStatusDescription: js.UndefOr[NonEmptyString] = js.native
}
object AwsDynamoDbTableReplica {
  
  @scala.inline
  def apply(): AwsDynamoDbTableReplica = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsDynamoDbTableReplica]
  }
  
  @scala.inline
  implicit class AwsDynamoDbTableReplicaOps[Self <: AwsDynamoDbTableReplica] (val x: Self) extends AnyVal {
    
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
    def setGlobalSecondaryIndexesVarargs(value: AwsDynamoDbTableReplicaGlobalSecondaryIndex*): Self = this.set("GlobalSecondaryIndexes", js.Array(value :_*))
    
    @scala.inline
    def setGlobalSecondaryIndexes(value: AwsDynamoDbTableReplicaGlobalSecondaryIndexList): Self = this.set("GlobalSecondaryIndexes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobalSecondaryIndexes: Self = this.set("GlobalSecondaryIndexes", js.undefined)
    
    @scala.inline
    def setKmsMasterKeyId(value: NonEmptyString): Self = this.set("KmsMasterKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsMasterKeyId: Self = this.set("KmsMasterKeyId", js.undefined)
    
    @scala.inline
    def setProvisionedThroughputOverride(value: AwsDynamoDbTableProvisionedThroughputOverride): Self = this.set("ProvisionedThroughputOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvisionedThroughputOverride: Self = this.set("ProvisionedThroughputOverride", js.undefined)
    
    @scala.inline
    def setRegionName(value: NonEmptyString): Self = this.set("RegionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegionName: Self = this.set("RegionName", js.undefined)
    
    @scala.inline
    def setReplicaStatus(value: NonEmptyString): Self = this.set("ReplicaStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicaStatus: Self = this.set("ReplicaStatus", js.undefined)
    
    @scala.inline
    def setReplicaStatusDescription(value: NonEmptyString): Self = this.set("ReplicaStatusDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicaStatusDescription: Self = this.set("ReplicaStatusDescription", js.undefined)
  }
}
