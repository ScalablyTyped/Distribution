package typings.awsSdk.ioteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DynamoDBAction extends StObject {
  
  /**
    * The name of the hash key (also called the partition key). The hashKeyField value must match the partition key of the target DynamoDB table.
    */
  var hashKeyField: DynamoKeyField
  
  /**
    * The data type for the hash key (also called the partition key). You can specify the following values:    'STRING' - The hash key is a string.    'NUMBER' - The hash key is a number.   If you don't specify hashKeyType, the default value is 'STRING'.
    */
  var hashKeyType: js.UndefOr[DynamoKeyType] = js.undefined
  
  /**
    * The value of the hash key (also called the partition key).
    */
  var hashKeyValue: DynamoKeyValue
  
  /**
    * The type of operation to perform. You can specify the following values:     'INSERT' - Insert data as a new item into the DynamoDB table. This item uses the specified hash key as a partition key. If you specified a range key, the item uses the range key as a sort key.    'UPDATE' - Update an existing item of the DynamoDB table with new data. This item's partition key must match the specified hash key. If you specified a range key, the range key must match the item's sort key.    'DELETE' - Delete an existing item of the DynamoDB table. This item's partition key must match the specified hash key. If you specified a range key, the range key must match the item's sort key.   If you don't specify this parameter, AWS IoT Events triggers the 'INSERT' operation.
    */
  var operation: js.UndefOr[DynamoOperation] = js.undefined
  
  var payload: js.UndefOr[Payload] = js.undefined
  
  /**
    * The name of the DynamoDB column that receives the action payload. If you don't specify this parameter, the name of the DynamoDB column is payload.
    */
  var payloadField: js.UndefOr[DynamoKeyField] = js.undefined
  
  /**
    * The name of the range key (also called the sort key). The rangeKeyField value must match the sort key of the target DynamoDB table. 
    */
  var rangeKeyField: js.UndefOr[DynamoKeyField] = js.undefined
  
  /**
    * The data type for the range key (also called the sort key), You can specify the following values:    'STRING' - The range key is a string.    'NUMBER' - The range key is number.   If you don't specify rangeKeyField, the default value is 'STRING'.
    */
  var rangeKeyType: js.UndefOr[DynamoKeyType] = js.undefined
  
  /**
    * The value of the range key (also called the sort key).
    */
  var rangeKeyValue: js.UndefOr[DynamoKeyValue] = js.undefined
  
  /**
    * The name of the DynamoDB table. The tableName value must match the table name of the target DynamoDB table. 
    */
  var tableName: DynamoTableName
}
object DynamoDBAction {
  
  inline def apply(hashKeyField: DynamoKeyField, hashKeyValue: DynamoKeyValue, tableName: DynamoTableName): DynamoDBAction = {
    val __obj = js.Dynamic.literal(hashKeyField = hashKeyField.asInstanceOf[js.Any], hashKeyValue = hashKeyValue.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamoDBAction]
  }
  
  extension [Self <: DynamoDBAction](x: Self) {
    
    inline def setHashKeyField(value: DynamoKeyField): Self = StObject.set(x, "hashKeyField", value.asInstanceOf[js.Any])
    
    inline def setHashKeyType(value: DynamoKeyType): Self = StObject.set(x, "hashKeyType", value.asInstanceOf[js.Any])
    
    inline def setHashKeyTypeUndefined: Self = StObject.set(x, "hashKeyType", js.undefined)
    
    inline def setHashKeyValue(value: DynamoKeyValue): Self = StObject.set(x, "hashKeyValue", value.asInstanceOf[js.Any])
    
    inline def setOperation(value: DynamoOperation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    inline def setPayload(value: Payload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadField(value: DynamoKeyField): Self = StObject.set(x, "payloadField", value.asInstanceOf[js.Any])
    
    inline def setPayloadFieldUndefined: Self = StObject.set(x, "payloadField", js.undefined)
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    inline def setRangeKeyField(value: DynamoKeyField): Self = StObject.set(x, "rangeKeyField", value.asInstanceOf[js.Any])
    
    inline def setRangeKeyFieldUndefined: Self = StObject.set(x, "rangeKeyField", js.undefined)
    
    inline def setRangeKeyType(value: DynamoKeyType): Self = StObject.set(x, "rangeKeyType", value.asInstanceOf[js.Any])
    
    inline def setRangeKeyTypeUndefined: Self = StObject.set(x, "rangeKeyType", js.undefined)
    
    inline def setRangeKeyValue(value: DynamoKeyValue): Self = StObject.set(x, "rangeKeyValue", value.asInstanceOf[js.Any])
    
    inline def setRangeKeyValueUndefined: Self = StObject.set(x, "rangeKeyValue", js.undefined)
    
    inline def setTableName(value: DynamoTableName): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
  }
}
