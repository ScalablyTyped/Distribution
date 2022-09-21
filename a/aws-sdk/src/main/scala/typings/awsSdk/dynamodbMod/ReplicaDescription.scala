package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplicaDescription extends StObject {
  
  /**
    * Replica-specific global secondary index settings.
    */
  var GlobalSecondaryIndexes: js.UndefOr[ReplicaGlobalSecondaryIndexDescriptionList] = js.undefined
  
  /**
    * The KMS key of the replica that will be used for KMS encryption.
    */
  var KMSMasterKeyId: js.UndefOr[typings.awsSdk.dynamodbMod.KMSMasterKeyId] = js.undefined
  
  /**
    * Replica-specific provisioned throughput. If not described, uses the source table's provisioned throughput settings.
    */
  var ProvisionedThroughputOverride: js.UndefOr[typings.awsSdk.dynamodbMod.ProvisionedThroughputOverride] = js.undefined
  
  /**
    * The name of the Region.
    */
  var RegionName: js.UndefOr[typings.awsSdk.dynamodbMod.RegionName] = js.undefined
  
  /**
    * The time at which the replica was first detected as inaccessible. To determine cause of inaccessibility check the ReplicaStatus property.
    */
  var ReplicaInaccessibleDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The current state of the replica:    CREATING - The replica is being created.    UPDATING - The replica is being updated.    DELETING - The replica is being deleted.    ACTIVE - The replica is ready for use.    REGION_DISABLED - The replica is inaccessible because the Amazon Web Services Region has been disabled.  If the Amazon Web Services Region remains inaccessible for more than 20 hours, DynamoDB will remove this replica from the replication group. The replica will not be deleted and replication will stop from and to this region.     INACCESSIBLE_ENCRYPTION_CREDENTIALS  - The KMS key used to encrypt the table is inaccessible.  If the KMS key remains inaccessible for more than 20 hours, DynamoDB will remove this replica from the replication group. The replica will not be deleted and replication will stop from and to this region.   
    */
  var ReplicaStatus: js.UndefOr[typings.awsSdk.dynamodbMod.ReplicaStatus] = js.undefined
  
  /**
    * Detailed information about the replica status.
    */
  var ReplicaStatusDescription: js.UndefOr[typings.awsSdk.dynamodbMod.ReplicaStatusDescription] = js.undefined
  
  /**
    * Specifies the progress of a Create, Update, or Delete action on the replica as a percentage.
    */
  var ReplicaStatusPercentProgress: js.UndefOr[typings.awsSdk.dynamodbMod.ReplicaStatusPercentProgress] = js.undefined
  
  var ReplicaTableClassSummary: js.UndefOr[TableClassSummary] = js.undefined
}
object ReplicaDescription {
  
  inline def apply(): ReplicaDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicaDescription]
  }
  
  extension [Self <: ReplicaDescription](x: Self) {
    
    inline def setGlobalSecondaryIndexes(value: ReplicaGlobalSecondaryIndexDescriptionList): Self = StObject.set(x, "GlobalSecondaryIndexes", value.asInstanceOf[js.Any])
    
    inline def setGlobalSecondaryIndexesUndefined: Self = StObject.set(x, "GlobalSecondaryIndexes", js.undefined)
    
    inline def setGlobalSecondaryIndexesVarargs(value: ReplicaGlobalSecondaryIndexDescription*): Self = StObject.set(x, "GlobalSecondaryIndexes", js.Array(value*))
    
    inline def setKMSMasterKeyId(value: KMSMasterKeyId): Self = StObject.set(x, "KMSMasterKeyId", value.asInstanceOf[js.Any])
    
    inline def setKMSMasterKeyIdUndefined: Self = StObject.set(x, "KMSMasterKeyId", js.undefined)
    
    inline def setProvisionedThroughputOverride(value: ProvisionedThroughputOverride): Self = StObject.set(x, "ProvisionedThroughputOverride", value.asInstanceOf[js.Any])
    
    inline def setProvisionedThroughputOverrideUndefined: Self = StObject.set(x, "ProvisionedThroughputOverride", js.undefined)
    
    inline def setRegionName(value: RegionName): Self = StObject.set(x, "RegionName", value.asInstanceOf[js.Any])
    
    inline def setRegionNameUndefined: Self = StObject.set(x, "RegionName", js.undefined)
    
    inline def setReplicaInaccessibleDateTime(value: js.Date): Self = StObject.set(x, "ReplicaInaccessibleDateTime", value.asInstanceOf[js.Any])
    
    inline def setReplicaInaccessibleDateTimeUndefined: Self = StObject.set(x, "ReplicaInaccessibleDateTime", js.undefined)
    
    inline def setReplicaStatus(value: ReplicaStatus): Self = StObject.set(x, "ReplicaStatus", value.asInstanceOf[js.Any])
    
    inline def setReplicaStatusDescription(value: ReplicaStatusDescription): Self = StObject.set(x, "ReplicaStatusDescription", value.asInstanceOf[js.Any])
    
    inline def setReplicaStatusDescriptionUndefined: Self = StObject.set(x, "ReplicaStatusDescription", js.undefined)
    
    inline def setReplicaStatusPercentProgress(value: ReplicaStatusPercentProgress): Self = StObject.set(x, "ReplicaStatusPercentProgress", value.asInstanceOf[js.Any])
    
    inline def setReplicaStatusPercentProgressUndefined: Self = StObject.set(x, "ReplicaStatusPercentProgress", js.undefined)
    
    inline def setReplicaStatusUndefined: Self = StObject.set(x, "ReplicaStatus", js.undefined)
    
    inline def setReplicaTableClassSummary(value: TableClassSummary): Self = StObject.set(x, "ReplicaTableClassSummary", value.asInstanceOf[js.Any])
    
    inline def setReplicaTableClassSummaryUndefined: Self = StObject.set(x, "ReplicaTableClassSummary", js.undefined)
  }
}
