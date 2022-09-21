package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreTableToPointInTimeInput extends StObject {
  
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
    * Time in the past to restore the table to.
    */
  var RestoreDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The new server-side encryption settings for the restored table.
    */
  var SSESpecificationOverride: js.UndefOr[SSESpecification] = js.undefined
  
  /**
    * The DynamoDB table that will be restored. This value is an Amazon Resource Name (ARN).
    */
  var SourceTableArn: js.UndefOr[TableArn] = js.undefined
  
  /**
    * Name of the source table that is being restored.
    */
  var SourceTableName: js.UndefOr[TableName] = js.undefined
  
  /**
    * The name of the new table to which it must be restored to.
    */
  var TargetTableName: TableName
  
  /**
    * Restore the table to the latest possible time. LatestRestorableDateTime is typically 5 minutes before the current time. 
    */
  var UseLatestRestorableTime: js.UndefOr[BooleanObject] = js.undefined
}
object RestoreTableToPointInTimeInput {
  
  inline def apply(TargetTableName: TableName): RestoreTableToPointInTimeInput = {
    val __obj = js.Dynamic.literal(TargetTableName = TargetTableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreTableToPointInTimeInput]
  }
  
  extension [Self <: RestoreTableToPointInTimeInput](x: Self) {
    
    inline def setBillingModeOverride(value: BillingMode): Self = StObject.set(x, "BillingModeOverride", value.asInstanceOf[js.Any])
    
    inline def setBillingModeOverrideUndefined: Self = StObject.set(x, "BillingModeOverride", js.undefined)
    
    inline def setGlobalSecondaryIndexOverride(value: GlobalSecondaryIndexList): Self = StObject.set(x, "GlobalSecondaryIndexOverride", value.asInstanceOf[js.Any])
    
    inline def setGlobalSecondaryIndexOverrideUndefined: Self = StObject.set(x, "GlobalSecondaryIndexOverride", js.undefined)
    
    inline def setGlobalSecondaryIndexOverrideVarargs(value: GlobalSecondaryIndex*): Self = StObject.set(x, "GlobalSecondaryIndexOverride", js.Array(value*))
    
    inline def setLocalSecondaryIndexOverride(value: LocalSecondaryIndexList): Self = StObject.set(x, "LocalSecondaryIndexOverride", value.asInstanceOf[js.Any])
    
    inline def setLocalSecondaryIndexOverrideUndefined: Self = StObject.set(x, "LocalSecondaryIndexOverride", js.undefined)
    
    inline def setLocalSecondaryIndexOverrideVarargs(value: LocalSecondaryIndex*): Self = StObject.set(x, "LocalSecondaryIndexOverride", js.Array(value*))
    
    inline def setProvisionedThroughputOverride(value: ProvisionedThroughput): Self = StObject.set(x, "ProvisionedThroughputOverride", value.asInstanceOf[js.Any])
    
    inline def setProvisionedThroughputOverrideUndefined: Self = StObject.set(x, "ProvisionedThroughputOverride", js.undefined)
    
    inline def setRestoreDateTime(value: js.Date): Self = StObject.set(x, "RestoreDateTime", value.asInstanceOf[js.Any])
    
    inline def setRestoreDateTimeUndefined: Self = StObject.set(x, "RestoreDateTime", js.undefined)
    
    inline def setSSESpecificationOverride(value: SSESpecification): Self = StObject.set(x, "SSESpecificationOverride", value.asInstanceOf[js.Any])
    
    inline def setSSESpecificationOverrideUndefined: Self = StObject.set(x, "SSESpecificationOverride", js.undefined)
    
    inline def setSourceTableArn(value: TableArn): Self = StObject.set(x, "SourceTableArn", value.asInstanceOf[js.Any])
    
    inline def setSourceTableArnUndefined: Self = StObject.set(x, "SourceTableArn", js.undefined)
    
    inline def setSourceTableName(value: TableName): Self = StObject.set(x, "SourceTableName", value.asInstanceOf[js.Any])
    
    inline def setSourceTableNameUndefined: Self = StObject.set(x, "SourceTableName", js.undefined)
    
    inline def setTargetTableName(value: TableName): Self = StObject.set(x, "TargetTableName", value.asInstanceOf[js.Any])
    
    inline def setUseLatestRestorableTime(value: BooleanObject): Self = StObject.set(x, "UseLatestRestorableTime", value.asInstanceOf[js.Any])
    
    inline def setUseLatestRestorableTimeUndefined: Self = StObject.set(x, "UseLatestRestorableTime", js.undefined)
  }
}
