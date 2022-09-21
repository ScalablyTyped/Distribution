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
    * The identifier of the KMS key that will be used for KMS encryption for the replica.
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
    * The current status of the replica. Valid values are as follows:    ACTIVE     CREATING     CREATION_FAILED     DELETING     UPDATING   
    */
  var ReplicaStatus: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Detailed information about the replica status.
    */
  var ReplicaStatusDescription: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsDynamoDbTableReplica {
  
  inline def apply(): AwsDynamoDbTableReplica = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsDynamoDbTableReplica]
  }
  
  extension [Self <: AwsDynamoDbTableReplica](x: Self) {
    
    inline def setGlobalSecondaryIndexes(value: AwsDynamoDbTableReplicaGlobalSecondaryIndexList): Self = StObject.set(x, "GlobalSecondaryIndexes", value.asInstanceOf[js.Any])
    
    inline def setGlobalSecondaryIndexesUndefined: Self = StObject.set(x, "GlobalSecondaryIndexes", js.undefined)
    
    inline def setGlobalSecondaryIndexesVarargs(value: AwsDynamoDbTableReplicaGlobalSecondaryIndex*): Self = StObject.set(x, "GlobalSecondaryIndexes", js.Array(value*))
    
    inline def setKmsMasterKeyId(value: NonEmptyString): Self = StObject.set(x, "KmsMasterKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsMasterKeyIdUndefined: Self = StObject.set(x, "KmsMasterKeyId", js.undefined)
    
    inline def setProvisionedThroughputOverride(value: AwsDynamoDbTableProvisionedThroughputOverride): Self = StObject.set(x, "ProvisionedThroughputOverride", value.asInstanceOf[js.Any])
    
    inline def setProvisionedThroughputOverrideUndefined: Self = StObject.set(x, "ProvisionedThroughputOverride", js.undefined)
    
    inline def setRegionName(value: NonEmptyString): Self = StObject.set(x, "RegionName", value.asInstanceOf[js.Any])
    
    inline def setRegionNameUndefined: Self = StObject.set(x, "RegionName", js.undefined)
    
    inline def setReplicaStatus(value: NonEmptyString): Self = StObject.set(x, "ReplicaStatus", value.asInstanceOf[js.Any])
    
    inline def setReplicaStatusDescription(value: NonEmptyString): Self = StObject.set(x, "ReplicaStatusDescription", value.asInstanceOf[js.Any])
    
    inline def setReplicaStatusDescriptionUndefined: Self = StObject.set(x, "ReplicaStatusDescription", js.undefined)
    
    inline def setReplicaStatusUndefined: Self = StObject.set(x, "ReplicaStatus", js.undefined)
  }
}
