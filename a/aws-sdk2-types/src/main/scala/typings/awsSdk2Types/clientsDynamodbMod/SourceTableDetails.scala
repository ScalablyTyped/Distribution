package typings.awsSdk2Types.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceTableDetails extends StObject {
  
  /**
    * Controls how you are charged for read and write throughput and how you manage capacity. This setting can be changed later.    PROVISIONED - Sets the read/write capacity mode to PROVISIONED. We recommend using PROVISIONED for predictable workloads.    PAY_PER_REQUEST - Sets the read/write capacity mode to PAY_PER_REQUEST. We recommend using PAY_PER_REQUEST for unpredictable workloads.   
    */
  var BillingMode: js.UndefOr[typings.awsSdk2Types.clientsDynamodbMod.BillingMode] = js.undefined
  
  /**
    * Number of items in the table. Note that this is an approximate value. 
    */
  var ItemCount: js.UndefOr[typings.awsSdk2Types.clientsDynamodbMod.ItemCount] = js.undefined
  
  /**
    * Schema of the table. 
    */
  var KeySchema: typings.awsSdk2Types.clientsDynamodbMod.KeySchema
  
  /**
    * Read IOPs and Write IOPS on the table when the backup was created.
    */
  var ProvisionedThroughput: typings.awsSdk2Types.clientsDynamodbMod.ProvisionedThroughput
  
  /**
    * ARN of the table for which backup was created. 
    */
  var TableArn: js.UndefOr[typings.awsSdk2Types.clientsDynamodbMod.TableArn] = js.undefined
  
  /**
    * Time when the source table was created. 
    */
  var TableCreationDateTime: js.Date
  
  /**
    * Unique identifier for the table for which the backup was created. 
    */
  var TableId: typings.awsSdk2Types.clientsDynamodbMod.TableId
  
  /**
    * The name of the table for which the backup was created. 
    */
  var TableName: typings.awsSdk2Types.clientsDynamodbMod.TableName
  
  /**
    * Size of the table in bytes. Note that this is an approximate value.
    */
  var TableSizeBytes: js.UndefOr[Long] = js.undefined
}
object SourceTableDetails {
  
  inline def apply(
    KeySchema: KeySchema,
    ProvisionedThroughput: ProvisionedThroughput,
    TableCreationDateTime: js.Date,
    TableId: TableId,
    TableName: TableName
  ): SourceTableDetails = {
    val __obj = js.Dynamic.literal(KeySchema = KeySchema.asInstanceOf[js.Any], ProvisionedThroughput = ProvisionedThroughput.asInstanceOf[js.Any], TableCreationDateTime = TableCreationDateTime.asInstanceOf[js.Any], TableId = TableId.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceTableDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SourceTableDetails] (val x: Self) extends AnyVal {
    
    inline def setBillingMode(value: BillingMode): Self = StObject.set(x, "BillingMode", value.asInstanceOf[js.Any])
    
    inline def setBillingModeUndefined: Self = StObject.set(x, "BillingMode", js.undefined)
    
    inline def setItemCount(value: ItemCount): Self = StObject.set(x, "ItemCount", value.asInstanceOf[js.Any])
    
    inline def setItemCountUndefined: Self = StObject.set(x, "ItemCount", js.undefined)
    
    inline def setKeySchema(value: KeySchema): Self = StObject.set(x, "KeySchema", value.asInstanceOf[js.Any])
    
    inline def setKeySchemaVarargs(value: KeySchemaElement*): Self = StObject.set(x, "KeySchema", js.Array(value*))
    
    inline def setProvisionedThroughput(value: ProvisionedThroughput): Self = StObject.set(x, "ProvisionedThroughput", value.asInstanceOf[js.Any])
    
    inline def setTableArn(value: TableArn): Self = StObject.set(x, "TableArn", value.asInstanceOf[js.Any])
    
    inline def setTableArnUndefined: Self = StObject.set(x, "TableArn", js.undefined)
    
    inline def setTableCreationDateTime(value: js.Date): Self = StObject.set(x, "TableCreationDateTime", value.asInstanceOf[js.Any])
    
    inline def setTableId(value: TableId): Self = StObject.set(x, "TableId", value.asInstanceOf[js.Any])
    
    inline def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    inline def setTableSizeBytes(value: Long): Self = StObject.set(x, "TableSizeBytes", value.asInstanceOf[js.Any])
    
    inline def setTableSizeBytesUndefined: Self = StObject.set(x, "TableSizeBytes", js.undefined)
  }
}
