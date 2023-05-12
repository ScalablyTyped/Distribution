package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreTableFromBackupInput extends StObject {
  
  /**
    * <p>The Amazon Resource Name (ARN) associated with the backup.</p>
    */
  var BackupArn: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The billing mode of the restored table.</p>
    */
  var BillingModeOverride: js.UndefOr[BillingMode | String] = js.undefined
  
  /**
    * <p>List of global secondary indexes for the restored table. The indexes provided should
    *             match existing secondary indexes. You can choose to exclude some or all of the indexes
    *             at the time of restore.</p>
    */
  var GlobalSecondaryIndexOverride: js.UndefOr[js.Array[GlobalSecondaryIndex]] = js.undefined
  
  /**
    * <p>List of local secondary indexes for the restored table. The indexes provided should
    *             match existing secondary indexes. You can choose to exclude some or all of the indexes
    *             at the time of restore.</p>
    */
  var LocalSecondaryIndexOverride: js.UndefOr[js.Array[LocalSecondaryIndex]] = js.undefined
  
  /**
    * <p>Provisioned throughput settings for the restored table.</p>
    */
  var ProvisionedThroughputOverride: js.UndefOr[ProvisionedThroughput] = js.undefined
  
  /**
    * <p>The new server-side encryption settings for the restored table.</p>
    */
  var SSESpecificationOverride: js.UndefOr[SSESpecification] = js.undefined
  
  /**
    * <p>The name of the new table to which the backup must be restored.</p>
    */
  var TargetTableName: js.UndefOr[String] = js.undefined
}
object RestoreTableFromBackupInput {
  
  inline def apply(): RestoreTableFromBackupInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestoreTableFromBackupInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RestoreTableFromBackupInput] (val x: Self) extends AnyVal {
    
    inline def setBackupArn(value: String): Self = StObject.set(x, "BackupArn", value.asInstanceOf[js.Any])
    
    inline def setBackupArnUndefined: Self = StObject.set(x, "BackupArn", js.undefined)
    
    inline def setBillingModeOverride(value: BillingMode | String): Self = StObject.set(x, "BillingModeOverride", value.asInstanceOf[js.Any])
    
    inline def setBillingModeOverrideUndefined: Self = StObject.set(x, "BillingModeOverride", js.undefined)
    
    inline def setGlobalSecondaryIndexOverride(value: js.Array[GlobalSecondaryIndex]): Self = StObject.set(x, "GlobalSecondaryIndexOverride", value.asInstanceOf[js.Any])
    
    inline def setGlobalSecondaryIndexOverrideUndefined: Self = StObject.set(x, "GlobalSecondaryIndexOverride", js.undefined)
    
    inline def setGlobalSecondaryIndexOverrideVarargs(value: GlobalSecondaryIndex*): Self = StObject.set(x, "GlobalSecondaryIndexOverride", js.Array(value*))
    
    inline def setLocalSecondaryIndexOverride(value: js.Array[LocalSecondaryIndex]): Self = StObject.set(x, "LocalSecondaryIndexOverride", value.asInstanceOf[js.Any])
    
    inline def setLocalSecondaryIndexOverrideUndefined: Self = StObject.set(x, "LocalSecondaryIndexOverride", js.undefined)
    
    inline def setLocalSecondaryIndexOverrideVarargs(value: LocalSecondaryIndex*): Self = StObject.set(x, "LocalSecondaryIndexOverride", js.Array(value*))
    
    inline def setProvisionedThroughputOverride(value: ProvisionedThroughput): Self = StObject.set(x, "ProvisionedThroughputOverride", value.asInstanceOf[js.Any])
    
    inline def setProvisionedThroughputOverrideUndefined: Self = StObject.set(x, "ProvisionedThroughputOverride", js.undefined)
    
    inline def setSSESpecificationOverride(value: SSESpecification): Self = StObject.set(x, "SSESpecificationOverride", value.asInstanceOf[js.Any])
    
    inline def setSSESpecificationOverrideUndefined: Self = StObject.set(x, "SSESpecificationOverride", js.undefined)
    
    inline def setTargetTableName(value: String): Self = StObject.set(x, "TargetTableName", value.asInstanceOf[js.Any])
    
    inline def setTargetTableNameUndefined: Self = StObject.set(x, "TargetTableName", js.undefined)
  }
}
