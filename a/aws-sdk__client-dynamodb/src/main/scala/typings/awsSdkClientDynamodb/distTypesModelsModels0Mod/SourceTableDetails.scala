package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceTableDetails extends StObject {
  
  /**
    * <p>Controls how you are charged for read and write throughput and how you manage
    *             capacity. This setting can be changed later.</p>
    *          <ul>
    *             <li>
    *                <p>
    *                   <code>PROVISIONED</code> - Sets the read/write capacity mode to
    *                         <code>PROVISIONED</code>. We recommend using <code>PROVISIONED</code> for
    *                     predictable workloads.</p>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>PAY_PER_REQUEST</code> - Sets the read/write capacity mode to
    *                         <code>PAY_PER_REQUEST</code>. We recommend using
    *                         <code>PAY_PER_REQUEST</code> for unpredictable workloads. </p>
    *             </li>
    *          </ul>
    */
  var BillingMode: js.UndefOr[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.BillingMode | String] = js.undefined
  
  /**
    * <p>Number of items in the table. Note that this is an approximate value. </p>
    */
  var ItemCount: js.UndefOr[Double] = js.undefined
  
  /**
    * <p>Schema of the table. </p>
    */
  var KeySchema: js.UndefOr[js.Array[KeySchemaElement]] = js.undefined
  
  /**
    * <p>Read IOPs and Write IOPS on the table when the backup was created.</p>
    */
  var ProvisionedThroughput: js.UndefOr[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ProvisionedThroughput] = js.undefined
  
  /**
    * <p>ARN of the table for which backup was created. </p>
    */
  var TableArn: js.UndefOr[String] = js.undefined
  
  /**
    * <p>Time when the source table was created. </p>
    */
  var TableCreationDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * <p>Unique identifier for the table for which the backup was created. </p>
    */
  var TableId: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The name of the table for which the backup was created. </p>
    */
  var TableName: js.UndefOr[String] = js.undefined
  
  /**
    * <p>Size of the table in bytes. Note that this is an approximate value.</p>
    */
  var TableSizeBytes: js.UndefOr[Double] = js.undefined
}
object SourceTableDetails {
  
  inline def apply(): SourceTableDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceTableDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SourceTableDetails] (val x: Self) extends AnyVal {
    
    inline def setBillingMode(value: BillingMode | String): Self = StObject.set(x, "BillingMode", value.asInstanceOf[js.Any])
    
    inline def setBillingModeUndefined: Self = StObject.set(x, "BillingMode", js.undefined)
    
    inline def setItemCount(value: Double): Self = StObject.set(x, "ItemCount", value.asInstanceOf[js.Any])
    
    inline def setItemCountUndefined: Self = StObject.set(x, "ItemCount", js.undefined)
    
    inline def setKeySchema(value: js.Array[KeySchemaElement]): Self = StObject.set(x, "KeySchema", value.asInstanceOf[js.Any])
    
    inline def setKeySchemaUndefined: Self = StObject.set(x, "KeySchema", js.undefined)
    
    inline def setKeySchemaVarargs(value: KeySchemaElement*): Self = StObject.set(x, "KeySchema", js.Array(value*))
    
    inline def setProvisionedThroughput(value: ProvisionedThroughput): Self = StObject.set(x, "ProvisionedThroughput", value.asInstanceOf[js.Any])
    
    inline def setProvisionedThroughputUndefined: Self = StObject.set(x, "ProvisionedThroughput", js.undefined)
    
    inline def setTableArn(value: String): Self = StObject.set(x, "TableArn", value.asInstanceOf[js.Any])
    
    inline def setTableArnUndefined: Self = StObject.set(x, "TableArn", js.undefined)
    
    inline def setTableCreationDateTime(value: js.Date): Self = StObject.set(x, "TableCreationDateTime", value.asInstanceOf[js.Any])
    
    inline def setTableCreationDateTimeUndefined: Self = StObject.set(x, "TableCreationDateTime", js.undefined)
    
    inline def setTableId(value: String): Self = StObject.set(x, "TableId", value.asInstanceOf[js.Any])
    
    inline def setTableIdUndefined: Self = StObject.set(x, "TableId", js.undefined)
    
    inline def setTableName(value: String): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    inline def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
    
    inline def setTableSizeBytes(value: Double): Self = StObject.set(x, "TableSizeBytes", value.asInstanceOf[js.Any])
    
    inline def setTableSizeBytesUndefined: Self = StObject.set(x, "TableSizeBytes", js.undefined)
  }
}
