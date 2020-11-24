package typings.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestoreTableToPointInTimeInput extends js.Object {
  
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
    * Time in the past to restore the table to.
    */
  var RestoreDateTime: js.UndefOr[Date] = js.native
  
  /**
    * The new server-side encryption settings for the restored table.
    */
  var SSESpecificationOverride: js.UndefOr[SSESpecification] = js.native
  
  /**
    * The DynamoDB table that will be restored. This value is an Amazon Resource Name (ARN).
    */
  var SourceTableArn: js.UndefOr[TableArn] = js.native
  
  /**
    * Name of the source table that is being restored.
    */
  var SourceTableName: js.UndefOr[TableName] = js.native
  
  /**
    * The name of the new table to which it must be restored to.
    */
  var TargetTableName: TableName = js.native
  
  /**
    * Restore the table to the latest possible time. LatestRestorableDateTime is typically 5 minutes before the current time. 
    */
  var UseLatestRestorableTime: js.UndefOr[BooleanObject] = js.native
}
object RestoreTableToPointInTimeInput {
  
  @scala.inline
  def apply(TargetTableName: TableName): RestoreTableToPointInTimeInput = {
    val __obj = js.Dynamic.literal(TargetTableName = TargetTableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreTableToPointInTimeInput]
  }
  
  @scala.inline
  implicit class RestoreTableToPointInTimeInputOps[Self <: RestoreTableToPointInTimeInput] (val x: Self) extends AnyVal {
    
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
    def setRestoreDateTime(value: Date): Self = this.set("RestoreDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestoreDateTime: Self = this.set("RestoreDateTime", js.undefined)
    
    @scala.inline
    def setSSESpecificationOverride(value: SSESpecification): Self = this.set("SSESpecificationOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSSESpecificationOverride: Self = this.set("SSESpecificationOverride", js.undefined)
    
    @scala.inline
    def setSourceTableArn(value: TableArn): Self = this.set("SourceTableArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceTableArn: Self = this.set("SourceTableArn", js.undefined)
    
    @scala.inline
    def setSourceTableName(value: TableName): Self = this.set("SourceTableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceTableName: Self = this.set("SourceTableName", js.undefined)
    
    @scala.inline
    def setUseLatestRestorableTime(value: BooleanObject): Self = this.set("UseLatestRestorableTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseLatestRestorableTime: Self = this.set("UseLatestRestorableTime", js.undefined)
  }
}
