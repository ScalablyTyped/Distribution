package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateReplicationGroupMemberAction extends StObject {
  
  /**
    * <p>Replica-specific global secondary index settings.</p>
    */
  var GlobalSecondaryIndexes: js.UndefOr[js.Array[ReplicaGlobalSecondaryIndex]] = js.undefined
  
  /**
    * <p>The KMS key of the replica that should be used for KMS
    *             encryption. To specify a key, use its key ID, Amazon Resource Name (ARN), alias name, or
    *             alias ARN. Note that you should only provide this parameter if the key is different from
    *             the default DynamoDB KMS key <code>alias/aws/dynamodb</code>.</p>
    */
  var KMSMasterKeyId: js.UndefOr[String] = js.undefined
  
  /**
    * <p>Replica-specific provisioned throughput. If not specified, uses the source table's
    *             provisioned throughput settings.</p>
    */
  var ProvisionedThroughputOverride: js.UndefOr[
    typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ProvisionedThroughputOverride
  ] = js.undefined
  
  /**
    * <p>The Region where the replica exists.</p>
    */
  var RegionName: js.UndefOr[String] = js.undefined
  
  /**
    * <p>Replica-specific table class. If not specified, uses the source table's table
    *             class.</p>
    */
  var TableClassOverride: js.UndefOr[TableClass | String] = js.undefined
}
object UpdateReplicationGroupMemberAction {
  
  inline def apply(): UpdateReplicationGroupMemberAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateReplicationGroupMemberAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateReplicationGroupMemberAction] (val x: Self) extends AnyVal {
    
    inline def setGlobalSecondaryIndexes(value: js.Array[ReplicaGlobalSecondaryIndex]): Self = StObject.set(x, "GlobalSecondaryIndexes", value.asInstanceOf[js.Any])
    
    inline def setGlobalSecondaryIndexesUndefined: Self = StObject.set(x, "GlobalSecondaryIndexes", js.undefined)
    
    inline def setGlobalSecondaryIndexesVarargs(value: ReplicaGlobalSecondaryIndex*): Self = StObject.set(x, "GlobalSecondaryIndexes", js.Array(value*))
    
    inline def setKMSMasterKeyId(value: String): Self = StObject.set(x, "KMSMasterKeyId", value.asInstanceOf[js.Any])
    
    inline def setKMSMasterKeyIdUndefined: Self = StObject.set(x, "KMSMasterKeyId", js.undefined)
    
    inline def setProvisionedThroughputOverride(value: ProvisionedThroughputOverride): Self = StObject.set(x, "ProvisionedThroughputOverride", value.asInstanceOf[js.Any])
    
    inline def setProvisionedThroughputOverrideUndefined: Self = StObject.set(x, "ProvisionedThroughputOverride", js.undefined)
    
    inline def setRegionName(value: String): Self = StObject.set(x, "RegionName", value.asInstanceOf[js.Any])
    
    inline def setRegionNameUndefined: Self = StObject.set(x, "RegionName", js.undefined)
    
    inline def setTableClassOverride(value: TableClass | String): Self = StObject.set(x, "TableClassOverride", value.asInstanceOf[js.Any])
    
    inline def setTableClassOverrideUndefined: Self = StObject.set(x, "TableClassOverride", js.undefined)
  }
}
