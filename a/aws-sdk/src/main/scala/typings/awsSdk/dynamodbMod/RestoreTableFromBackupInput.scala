package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestoreTableFromBackupInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) associated with the backup.
    */
  var BackupArn: typings.awsSdk.dynamodbMod.BackupArn = js.native
  
  /**
    * The billing mode of the restored table.
    */
  var BillingModeOverride: js.UndefOr[BillingMode] = js.native
  
  /**
    * List of global secondary indexes for the restored table. The indexes provided should match existing secondary indexes. You can choose to exclude some or all of the indexes at the time of restore.
    */
  var GlobalSecondaryIndexOverride: js.UndefOr[GlobalSecondaryIndexList] = js.native
  
  /**
    * List of local secondary indexes for the restored table. The indexes provided should match existing secondary indexes. You can choose to exclude some or all of the indexes at the time of restore.
    */
  var LocalSecondaryIndexOverride: js.UndefOr[LocalSecondaryIndexList] = js.native
  
  /**
    * Provisioned throughput settings for the restored table.
    */
  var ProvisionedThroughputOverride: js.UndefOr[ProvisionedThroughput] = js.native
  
  /**
    * The new server-side encryption settings for the restored table.
    */
  var SSESpecificationOverride: js.UndefOr[SSESpecification] = js.native
  
  /**
    * The name of the new table to which the backup must be restored.
    */
  var TargetTableName: TableName = js.native
}
object RestoreTableFromBackupInput {
  
  @scala.inline
  def apply(BackupArn: BackupArn, TargetTableName: TableName): RestoreTableFromBackupInput = {
    val __obj = js.Dynamic.literal(BackupArn = BackupArn.asInstanceOf[js.Any], TargetTableName = TargetTableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreTableFromBackupInput]
  }
  
  @scala.inline
  implicit class RestoreTableFromBackupInputMutableBuilder[Self <: RestoreTableFromBackupInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackupArn(value: BackupArn): Self = StObject.set(x, "BackupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingModeOverride(value: BillingMode): Self = StObject.set(x, "BillingModeOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingModeOverrideUndefined: Self = StObject.set(x, "BillingModeOverride", js.undefined)
    
    @scala.inline
    def setGlobalSecondaryIndexOverride(value: GlobalSecondaryIndexList): Self = StObject.set(x, "GlobalSecondaryIndexOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalSecondaryIndexOverrideUndefined: Self = StObject.set(x, "GlobalSecondaryIndexOverride", js.undefined)
    
    @scala.inline
    def setGlobalSecondaryIndexOverrideVarargs(value: GlobalSecondaryIndex*): Self = StObject.set(x, "GlobalSecondaryIndexOverride", js.Array(value :_*))
    
    @scala.inline
    def setLocalSecondaryIndexOverride(value: LocalSecondaryIndexList): Self = StObject.set(x, "LocalSecondaryIndexOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalSecondaryIndexOverrideUndefined: Self = StObject.set(x, "LocalSecondaryIndexOverride", js.undefined)
    
    @scala.inline
    def setLocalSecondaryIndexOverrideVarargs(value: LocalSecondaryIndex*): Self = StObject.set(x, "LocalSecondaryIndexOverride", js.Array(value :_*))
    
    @scala.inline
    def setProvisionedThroughputOverride(value: ProvisionedThroughput): Self = StObject.set(x, "ProvisionedThroughputOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisionedThroughputOverrideUndefined: Self = StObject.set(x, "ProvisionedThroughputOverride", js.undefined)
    
    @scala.inline
    def setSSESpecificationOverride(value: SSESpecification): Self = StObject.set(x, "SSESpecificationOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSSESpecificationOverrideUndefined: Self = StObject.set(x, "SSESpecificationOverride", js.undefined)
    
    @scala.inline
    def setTargetTableName(value: TableName): Self = StObject.set(x, "TargetTableName", value.asInstanceOf[js.Any])
  }
}
