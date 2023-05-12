package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplicaDescription extends StObject {
  
  /**
    * <p>Replica-specific global secondary index settings.</p>
    */
  var GlobalSecondaryIndexes: js.UndefOr[js.Array[ReplicaGlobalSecondaryIndexDescription]] = js.undefined
  
  /**
    * <p>The KMS key of the replica that will be used for KMS
    *             encryption.</p>
    */
  var KMSMasterKeyId: js.UndefOr[String] = js.undefined
  
  /**
    * <p>Replica-specific provisioned throughput. If not described, uses the source table's
    *             provisioned throughput settings.</p>
    */
  var ProvisionedThroughputOverride: js.UndefOr[
    typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ProvisionedThroughputOverride
  ] = js.undefined
  
  /**
    * <p>The name of the Region.</p>
    */
  var RegionName: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The time at which the replica was first detected as inaccessible. To determine cause
    *             of inaccessibility check the <code>ReplicaStatus</code> property.</p>
    */
  var ReplicaInaccessibleDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * <p>The current state of the replica:</p>
    *          <ul>
    *             <li>
    *                <p>
    *                   <code>CREATING</code> - The replica is being created.</p>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>UPDATING</code> - The replica is being updated.</p>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>DELETING</code> - The replica is being deleted.</p>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>ACTIVE</code> - The replica is ready for use.</p>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>REGION_DISABLED</code> - The replica is inaccessible because the Amazon Web Services Region has been disabled.</p>
    *                <note>
    *                   <p>If the Amazon Web Services Region remains inaccessible for more than 20
    *                         hours, DynamoDB will remove this replica from the replication
    *                         group. The replica will not be deleted and replication will stop from and to
    *                         this region.</p>
    *                </note>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>INACCESSIBLE_ENCRYPTION_CREDENTIALS </code> - The KMS key
    *                     used to encrypt the table is inaccessible.</p>
    *                <note>
    *                   <p>If the KMS key remains inaccessible for more than 20 hours,
    *                             DynamoDB will remove this replica from the replication group.
    *                         The replica will not be deleted and replication will stop from and to this
    *                         region.</p>
    *                </note>
    *             </li>
    *          </ul>
    */
  var ReplicaStatus: js.UndefOr[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ReplicaStatus | String] = js.undefined
  
  /**
    * <p>Detailed information about the replica status.</p>
    */
  var ReplicaStatusDescription: js.UndefOr[String] = js.undefined
  
  /**
    * <p>Specifies the progress of a Create, Update, or Delete action on the replica as a
    *             percentage.</p>
    */
  var ReplicaStatusPercentProgress: js.UndefOr[String] = js.undefined
  
  /**
    * <p>Contains details of the table class.</p>
    */
  var ReplicaTableClassSummary: js.UndefOr[TableClassSummary] = js.undefined
}
object ReplicaDescription {
  
  inline def apply(): ReplicaDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicaDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReplicaDescription] (val x: Self) extends AnyVal {
    
    inline def setGlobalSecondaryIndexes(value: js.Array[ReplicaGlobalSecondaryIndexDescription]): Self = StObject.set(x, "GlobalSecondaryIndexes", value.asInstanceOf[js.Any])
    
    inline def setGlobalSecondaryIndexesUndefined: Self = StObject.set(x, "GlobalSecondaryIndexes", js.undefined)
    
    inline def setGlobalSecondaryIndexesVarargs(value: ReplicaGlobalSecondaryIndexDescription*): Self = StObject.set(x, "GlobalSecondaryIndexes", js.Array(value*))
    
    inline def setKMSMasterKeyId(value: String): Self = StObject.set(x, "KMSMasterKeyId", value.asInstanceOf[js.Any])
    
    inline def setKMSMasterKeyIdUndefined: Self = StObject.set(x, "KMSMasterKeyId", js.undefined)
    
    inline def setProvisionedThroughputOverride(value: ProvisionedThroughputOverride): Self = StObject.set(x, "ProvisionedThroughputOverride", value.asInstanceOf[js.Any])
    
    inline def setProvisionedThroughputOverrideUndefined: Self = StObject.set(x, "ProvisionedThroughputOverride", js.undefined)
    
    inline def setRegionName(value: String): Self = StObject.set(x, "RegionName", value.asInstanceOf[js.Any])
    
    inline def setRegionNameUndefined: Self = StObject.set(x, "RegionName", js.undefined)
    
    inline def setReplicaInaccessibleDateTime(value: js.Date): Self = StObject.set(x, "ReplicaInaccessibleDateTime", value.asInstanceOf[js.Any])
    
    inline def setReplicaInaccessibleDateTimeUndefined: Self = StObject.set(x, "ReplicaInaccessibleDateTime", js.undefined)
    
    inline def setReplicaStatus(value: ReplicaStatus | String): Self = StObject.set(x, "ReplicaStatus", value.asInstanceOf[js.Any])
    
    inline def setReplicaStatusDescription(value: String): Self = StObject.set(x, "ReplicaStatusDescription", value.asInstanceOf[js.Any])
    
    inline def setReplicaStatusDescriptionUndefined: Self = StObject.set(x, "ReplicaStatusDescription", js.undefined)
    
    inline def setReplicaStatusPercentProgress(value: String): Self = StObject.set(x, "ReplicaStatusPercentProgress", value.asInstanceOf[js.Any])
    
    inline def setReplicaStatusPercentProgressUndefined: Self = StObject.set(x, "ReplicaStatusPercentProgress", js.undefined)
    
    inline def setReplicaStatusUndefined: Self = StObject.set(x, "ReplicaStatus", js.undefined)
    
    inline def setReplicaTableClassSummary(value: TableClassSummary): Self = StObject.set(x, "ReplicaTableClassSummary", value.asInstanceOf[js.Any])
    
    inline def setReplicaTableClassSummaryUndefined: Self = StObject.set(x, "ReplicaTableClassSummary", js.undefined)
  }
}
