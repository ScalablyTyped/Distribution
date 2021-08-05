package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreTableFromBackupInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) associated with the backup.
    */
  var BackupArn: typings.awsSdk.dynamodbMod.BackupArn
  
  /**
    * The billing mode of the restored table.
    */
  var BillingModeOverride: js.UndefOr[BillingMode] = js.undefined
  
  /**
    * List of global secondary indexes for the restored table. The indexes provided should match existing secondary indexes. You can choose to exclude some or all of the indexes at the time of restore.
    */
  var GlobalSecondaryIndexOverride: js.UndefOr[GlobalSecondaryIndexList] = js.undefined
  
  /**
    * List of local secondary indexes for the restored table. The indexes provided should match existing secondary indexes. You can choose to exclude some or all of the indexes at the time of restore.
    */
  var LocalSecondaryIndexOverride: js.UndefOr[LocalSecondaryIndexList] = js.undefined
  
  /**
    * Provisioned throughput settings for the restored table.
    */
  var ProvisionedThroughputOverride: js.UndefOr[ProvisionedThroughput] = js.undefined
  
  /**
    * The new server-side encryption settings for the restored table.
    */
  var SSESpecificationOverride: js.UndefOr[SSESpecification] = js.undefined
  
  /**
    * The name of the new table to which the backup must be restored.
    */
  var TargetTableName: TableName
}
object RestoreTableFromBackupInput {
  
  inline def apply(BackupArn: BackupArn, TargetTableName: TableName): RestoreTableFromBackupInput = {
    val __obj = js.Dynamic.literal(BackupArn = BackupArn.asInstanceOf[js.Any], TargetTableName = TargetTableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreTableFromBackupInput]
  }
  
  extension [Self <: RestoreTableFromBackupInput](x: Self) {
    
    inline def setBackupArn(value: BackupArn): Self = StObject.set(x, "BackupArn", value.asInstanceOf[js.Any])
    
    inline def setBillingModeOverride(value: BillingMode): Self = StObject.set(x, "BillingModeOverride", value.asInstanceOf[js.Any])
    
    inline def setBillingModeOverrideUndefined: Self = StObject.set(x, "BillingModeOverride", js.undefined)
    
    inline def setGlobalSecondaryIndexOverride(value: GlobalSecondaryIndexList): Self = StObject.set(x, "GlobalSecondaryIndexOverride", value.asInstanceOf[js.Any])
    
    inline def setGlobalSecondaryIndexOverrideUndefined: Self = StObject.set(x, "GlobalSecondaryIndexOverride", js.undefined)
    
    inline def setGlobalSecondaryIndexOverrideVarargs(value: GlobalSecondaryIndex*): Self = StObject.set(x, "GlobalSecondaryIndexOverride", js.Array(value :_*))
    
    inline def setLocalSecondaryIndexOverride(value: LocalSecondaryIndexList): Self = StObject.set(x, "LocalSecondaryIndexOverride", value.asInstanceOf[js.Any])
    
    inline def setLocalSecondaryIndexOverrideUndefined: Self = StObject.set(x, "LocalSecondaryIndexOverride", js.undefined)
    
    inline def setLocalSecondaryIndexOverrideVarargs(value: LocalSecondaryIndex*): Self = StObject.set(x, "LocalSecondaryIndexOverride", js.Array(value :_*))
    
    inline def setProvisionedThroughputOverride(value: ProvisionedThroughput): Self = StObject.set(x, "ProvisionedThroughputOverride", value.asInstanceOf[js.Any])
    
    inline def setProvisionedThroughputOverrideUndefined: Self = StObject.set(x, "ProvisionedThroughputOverride", js.undefined)
    
    inline def setSSESpecificationOverride(value: SSESpecification): Self = StObject.set(x, "SSESpecificationOverride", value.asInstanceOf[js.Any])
    
    inline def setSSESpecificationOverrideUndefined: Self = StObject.set(x, "SSESpecificationOverride", js.undefined)
    
    inline def setTargetTableName(value: TableName): Self = StObject.set(x, "TargetTableName", value.asInstanceOf[js.Any])
  }
}
