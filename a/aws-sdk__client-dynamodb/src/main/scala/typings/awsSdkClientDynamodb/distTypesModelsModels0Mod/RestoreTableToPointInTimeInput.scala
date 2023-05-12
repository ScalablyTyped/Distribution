package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreTableToPointInTimeInput extends StObject {
  
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
    * <p>Time in the past to restore the table to.</p>
    */
  var RestoreDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * <p>The new server-side encryption settings for the restored table.</p>
    */
  var SSESpecificationOverride: js.UndefOr[SSESpecification] = js.undefined
  
  /**
    * <p>The DynamoDB table that will be restored. This value is an Amazon Resource Name
    *             (ARN).</p>
    */
  var SourceTableArn: js.UndefOr[String] = js.undefined
  
  /**
    * <p>Name of the source table that is being restored.</p>
    */
  var SourceTableName: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The name of the new table to which it must be restored to.</p>
    */
  var TargetTableName: js.UndefOr[String] = js.undefined
  
  /**
    * <p>Restore the table to the latest possible time. <code>LatestRestorableDateTime</code>
    *             is typically 5 minutes before the current time. </p>
    */
  var UseLatestRestorableTime: js.UndefOr[Boolean] = js.undefined
}
object RestoreTableToPointInTimeInput {
  
  inline def apply(): RestoreTableToPointInTimeInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestoreTableToPointInTimeInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RestoreTableToPointInTimeInput] (val x: Self) extends AnyVal {
    
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
    
    inline def setRestoreDateTime(value: js.Date): Self = StObject.set(x, "RestoreDateTime", value.asInstanceOf[js.Any])
    
    inline def setRestoreDateTimeUndefined: Self = StObject.set(x, "RestoreDateTime", js.undefined)
    
    inline def setSSESpecificationOverride(value: SSESpecification): Self = StObject.set(x, "SSESpecificationOverride", value.asInstanceOf[js.Any])
    
    inline def setSSESpecificationOverrideUndefined: Self = StObject.set(x, "SSESpecificationOverride", js.undefined)
    
    inline def setSourceTableArn(value: String): Self = StObject.set(x, "SourceTableArn", value.asInstanceOf[js.Any])
    
    inline def setSourceTableArnUndefined: Self = StObject.set(x, "SourceTableArn", js.undefined)
    
    inline def setSourceTableName(value: String): Self = StObject.set(x, "SourceTableName", value.asInstanceOf[js.Any])
    
    inline def setSourceTableNameUndefined: Self = StObject.set(x, "SourceTableName", js.undefined)
    
    inline def setTargetTableName(value: String): Self = StObject.set(x, "TargetTableName", value.asInstanceOf[js.Any])
    
    inline def setTargetTableNameUndefined: Self = StObject.set(x, "TargetTableName", js.undefined)
    
    inline def setUseLatestRestorableTime(value: Boolean): Self = StObject.set(x, "UseLatestRestorableTime", value.asInstanceOf[js.Any])
    
    inline def setUseLatestRestorableTimeUndefined: Self = StObject.set(x, "UseLatestRestorableTime", js.undefined)
  }
}
