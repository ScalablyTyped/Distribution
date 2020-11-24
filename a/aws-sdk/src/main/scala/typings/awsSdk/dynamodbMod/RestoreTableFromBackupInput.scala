package typings.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestoreTableFromBackupInput extends js.Object {
  
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
  implicit class RestoreTableFromBackupInputOps[Self <: RestoreTableFromBackupInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBackupArn(value: BackupArn): Self = this.set("BackupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetTableName(value: TableName): Self = this.set("TargetTableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingModeOverride(value: BillingMode): Self = this.set("BillingModeOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBillingModeOverride: Self = this.set("BillingModeOverride", js.undefined)
    
    @scala.inline
    def setGlobalSecondaryIndexOverrideVarargs(value: GlobalSecondaryIndex*): Self = this.set("GlobalSecondaryIndexOverride", js.Array(value :_*))
    
    @scala.inline
    def setGlobalSecondaryIndexOverride(value: GlobalSecondaryIndexList): Self = this.set("GlobalSecondaryIndexOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobalSecondaryIndexOverride: Self = this.set("GlobalSecondaryIndexOverride", js.undefined)
    
    @scala.inline
    def setLocalSecondaryIndexOverrideVarargs(value: LocalSecondaryIndex*): Self = this.set("LocalSecondaryIndexOverride", js.Array(value :_*))
    
    @scala.inline
    def setLocalSecondaryIndexOverride(value: LocalSecondaryIndexList): Self = this.set("LocalSecondaryIndexOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalSecondaryIndexOverride: Self = this.set("LocalSecondaryIndexOverride", js.undefined)
    
    @scala.inline
    def setProvisionedThroughputOverride(value: ProvisionedThroughput): Self = this.set("ProvisionedThroughputOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvisionedThroughputOverride: Self = this.set("ProvisionedThroughputOverride", js.undefined)
    
    @scala.inline
    def setSSESpecificationOverride(value: SSESpecification): Self = this.set("SSESpecificationOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSSESpecificationOverride: Self = this.set("SSESpecificationOverride", js.undefined)
  }
}
