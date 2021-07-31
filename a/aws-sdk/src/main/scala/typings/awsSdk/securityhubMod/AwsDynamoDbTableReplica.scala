package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsDynamoDbTableReplica extends StObject {
  
  /**
    * List of global secondary indexes for the replica.
    */
  var GlobalSecondaryIndexes: js.UndefOr[AwsDynamoDbTableReplicaGlobalSecondaryIndexList] = js.undefined
  
  /**
    * The identifier of the AWS KMS customer master key (CMK) that will be used for AWS KMS encryption for the replica.
    */
  var KmsMasterKeyId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Replica-specific configuration for the provisioned throughput.
    */
  var ProvisionedThroughputOverride: js.UndefOr[AwsDynamoDbTableProvisionedThroughputOverride] = js.undefined
  
  /**
    * The name of the Region where the replica is located.
    */
  var RegionName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The current status of the replica.
    */
  var ReplicaStatus: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Detailed information about the replica status.
    */
  var ReplicaStatusDescription: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsDynamoDbTableReplica {
  
  @scala.inline
  def apply(): AwsDynamoDbTableReplica = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsDynamoDbTableReplica]
  }
  
  @scala.inline
  implicit class AwsDynamoDbTableReplicaMutableBuilder[Self <: AwsDynamoDbTableReplica] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGlobalSecondaryIndexes(value: AwsDynamoDbTableReplicaGlobalSecondaryIndexList): Self = StObject.set(x, "GlobalSecondaryIndexes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalSecondaryIndexesUndefined: Self = StObject.set(x, "GlobalSecondaryIndexes", js.undefined)
    
    @scala.inline
    def setGlobalSecondaryIndexesVarargs(value: AwsDynamoDbTableReplicaGlobalSecondaryIndex*): Self = StObject.set(x, "GlobalSecondaryIndexes", js.Array(value :_*))
    
    @scala.inline
    def setKmsMasterKeyId(value: NonEmptyString): Self = StObject.set(x, "KmsMasterKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsMasterKeyIdUndefined: Self = StObject.set(x, "KmsMasterKeyId", js.undefined)
    
    @scala.inline
    def setProvisionedThroughputOverride(value: AwsDynamoDbTableProvisionedThroughputOverride): Self = StObject.set(x, "ProvisionedThroughputOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisionedThroughputOverrideUndefined: Self = StObject.set(x, "ProvisionedThroughputOverride", js.undefined)
    
    @scala.inline
    def setRegionName(value: NonEmptyString): Self = StObject.set(x, "RegionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionNameUndefined: Self = StObject.set(x, "RegionName", js.undefined)
    
    @scala.inline
    def setReplicaStatus(value: NonEmptyString): Self = StObject.set(x, "ReplicaStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicaStatusDescription(value: NonEmptyString): Self = StObject.set(x, "ReplicaStatusDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicaStatusDescriptionUndefined: Self = StObject.set(x, "ReplicaStatusDescription", js.undefined)
    
    @scala.inline
    def setReplicaStatusUndefined: Self = StObject.set(x, "ReplicaStatus", js.undefined)
  }
}
