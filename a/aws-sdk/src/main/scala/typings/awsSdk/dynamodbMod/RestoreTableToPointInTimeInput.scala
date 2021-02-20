package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestoreTableToPointInTimeInput extends StObject {
  
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
  implicit class RestoreTableToPointInTimeInputMutableBuilder[Self <: RestoreTableToPointInTimeInput] (val x: Self) extends AnyVal {
    
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
    def setRestoreDateTime(value: Date): Self = StObject.set(x, "RestoreDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestoreDateTimeUndefined: Self = StObject.set(x, "RestoreDateTime", js.undefined)
    
    @scala.inline
    def setSSESpecificationOverride(value: SSESpecification): Self = StObject.set(x, "SSESpecificationOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSSESpecificationOverrideUndefined: Self = StObject.set(x, "SSESpecificationOverride", js.undefined)
    
    @scala.inline
    def setSourceTableArn(value: TableArn): Self = StObject.set(x, "SourceTableArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceTableArnUndefined: Self = StObject.set(x, "SourceTableArn", js.undefined)
    
    @scala.inline
    def setSourceTableName(value: TableName): Self = StObject.set(x, "SourceTableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceTableNameUndefined: Self = StObject.set(x, "SourceTableName", js.undefined)
    
    @scala.inline
    def setTargetTableName(value: TableName): Self = StObject.set(x, "TargetTableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseLatestRestorableTime(value: BooleanObject): Self = StObject.set(x, "UseLatestRestorableTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseLatestRestorableTimeUndefined: Self = StObject.set(x, "UseLatestRestorableTime", js.undefined)
  }
}
