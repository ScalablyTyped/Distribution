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
    * The AWS KMS customer master key (CMK) of the replica that will be used for AWS KMS encryption.
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
  var ReplicaInaccessibleDateTime: js.UndefOr[Date] = js.undefined
  
  /**
    * The current state of the replica:    CREATING - The replica is being created.    UPDATING - The replica is being updated.    DELETING - The replica is being deleted.    ACTIVE - The replica is ready for use.    REGION_DISABLED - The replica is inaccessible because the AWS Region has been disabled.  If the AWS Region remains inaccessible for more than 20 hours, DynamoDB will remove this replica from the replication group. The replica will not be deleted and replication will stop from and to this region.     INACCESSIBLE_ENCRYPTION_CREDENTIALS  - The AWS KMS key used to encrypt the table is inaccessible.  If the AWS KMS key remains inaccessible for more than 20 hours, DynamoDB will remove this replica from the replication group. The replica will not be deleted and replication will stop from and to this region.   
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
}
object ReplicaDescription {
  
  @scala.inline
  def apply(): ReplicaDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicaDescription]
  }
  
  @scala.inline
  implicit class ReplicaDescriptionMutableBuilder[Self <: ReplicaDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGlobalSecondaryIndexes(value: ReplicaGlobalSecondaryIndexDescriptionList): Self = StObject.set(x, "GlobalSecondaryIndexes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalSecondaryIndexesUndefined: Self = StObject.set(x, "GlobalSecondaryIndexes", js.undefined)
    
    @scala.inline
    def setGlobalSecondaryIndexesVarargs(value: ReplicaGlobalSecondaryIndexDescription*): Self = StObject.set(x, "GlobalSecondaryIndexes", js.Array(value :_*))
    
    @scala.inline
    def setKMSMasterKeyId(value: KMSMasterKeyId): Self = StObject.set(x, "KMSMasterKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKMSMasterKeyIdUndefined: Self = StObject.set(x, "KMSMasterKeyId", js.undefined)
    
    @scala.inline
    def setProvisionedThroughputOverride(value: ProvisionedThroughputOverride): Self = StObject.set(x, "ProvisionedThroughputOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisionedThroughputOverrideUndefined: Self = StObject.set(x, "ProvisionedThroughputOverride", js.undefined)
    
    @scala.inline
    def setRegionName(value: RegionName): Self = StObject.set(x, "RegionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionNameUndefined: Self = StObject.set(x, "RegionName", js.undefined)
    
    @scala.inline
    def setReplicaInaccessibleDateTime(value: Date): Self = StObject.set(x, "ReplicaInaccessibleDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicaInaccessibleDateTimeUndefined: Self = StObject.set(x, "ReplicaInaccessibleDateTime", js.undefined)
    
    @scala.inline
    def setReplicaStatus(value: ReplicaStatus): Self = StObject.set(x, "ReplicaStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicaStatusDescription(value: ReplicaStatusDescription): Self = StObject.set(x, "ReplicaStatusDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicaStatusDescriptionUndefined: Self = StObject.set(x, "ReplicaStatusDescription", js.undefined)
    
    @scala.inline
    def setReplicaStatusPercentProgress(value: ReplicaStatusPercentProgress): Self = StObject.set(x, "ReplicaStatusPercentProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicaStatusPercentProgressUndefined: Self = StObject.set(x, "ReplicaStatusPercentProgress", js.undefined)
    
    @scala.inline
    def setReplicaStatusUndefined: Self = StObject.set(x, "ReplicaStatus", js.undefined)
  }
}
