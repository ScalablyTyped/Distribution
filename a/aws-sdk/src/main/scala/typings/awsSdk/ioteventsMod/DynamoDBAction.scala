package typings.awsSdk.ioteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DynamoDBAction extends StObject {
  
  /**
    * The name of the hash key (also called the partition key).
    */
  var hashKeyField: DynamoKeyField = js.native
  
  /**
    * The data type for the hash key (also called the partition key). You can specify the following values:    STRING - The hash key is a string.    NUMBER - The hash key is a number.   If you don't specify hashKeyType, the default value is STRING.
    */
  var hashKeyType: js.UndefOr[DynamoKeyType] = js.native
  
  /**
    * The value of the hash key (also called the partition key).
    */
  var hashKeyValue: DynamoKeyValue = js.native
  
  /**
    * The type of operation to perform. You can specify the following values:     INSERT - Insert data as a new item into the DynamoDB table. This item uses the specified hash key as a partition key. If you specified a range key, the item uses the range key as a sort key.    UPDATE - Update an existing item of the DynamoDB table with new data. This item's partition key must match the specified hash key. If you specified a range key, the range key must match the item's sort key.    DELETE - Delete an existing item of the DynamoDB table. This item's partition key must match the specified hash key. If you specified a range key, the range key must match the item's sort key.   If you don't specify this parameter, AWS IoT Events triggers the INSERT operation.
    */
  var operation: js.UndefOr[DynamoOperation] = js.native
  
  var payload: js.UndefOr[Payload] = js.native
  
  /**
    * The name of the DynamoDB column that receives the action payload. If you don't specify this parameter, the name of the DynamoDB column is payload.
    */
  var payloadField: js.UndefOr[DynamoKeyField] = js.native
  
  /**
    * The name of the range key (also called the sort key).
    */
  var rangeKeyField: js.UndefOr[DynamoKeyField] = js.native
  
  /**
    * The data type for the range key (also called the sort key), You can specify the following values:    STRING - The range key is a string.    NUMBER - The range key is number.   If you don't specify rangeKeyField, the default value is STRING.
    */
  var rangeKeyType: js.UndefOr[DynamoKeyType] = js.native
  
  /**
    * The value of the range key (also called the sort key).
    */
  var rangeKeyValue: js.UndefOr[DynamoKeyValue] = js.native
  
  /**
    * The name of the DynamoDB table.
    */
  var tableName: DynamoTableName = js.native
}
object DynamoDBAction {
  
  @scala.inline
  def apply(hashKeyField: DynamoKeyField, hashKeyValue: DynamoKeyValue, tableName: DynamoTableName): DynamoDBAction = {
    val __obj = js.Dynamic.literal(hashKeyField = hashKeyField.asInstanceOf[js.Any], hashKeyValue = hashKeyValue.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamoDBAction]
  }
  
  @scala.inline
  implicit class DynamoDBActionMutableBuilder[Self <: DynamoDBAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHashKeyField(value: DynamoKeyField): Self = StObject.set(x, "hashKeyField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashKeyType(value: DynamoKeyType): Self = StObject.set(x, "hashKeyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashKeyTypeUndefined: Self = StObject.set(x, "hashKeyType", js.undefined)
    
    @scala.inline
    def setHashKeyValue(value: DynamoKeyValue): Self = StObject.set(x, "hashKeyValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperation(value: DynamoOperation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    @scala.inline
    def setPayload(value: Payload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadField(value: DynamoKeyField): Self = StObject.set(x, "payloadField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadFieldUndefined: Self = StObject.set(x, "payloadField", js.undefined)
    
    @scala.inline
    def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    @scala.inline
    def setRangeKeyField(value: DynamoKeyField): Self = StObject.set(x, "rangeKeyField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeKeyFieldUndefined: Self = StObject.set(x, "rangeKeyField", js.undefined)
    
    @scala.inline
    def setRangeKeyType(value: DynamoKeyType): Self = StObject.set(x, "rangeKeyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeKeyTypeUndefined: Self = StObject.set(x, "rangeKeyType", js.undefined)
    
    @scala.inline
    def setRangeKeyValue(value: DynamoKeyValue): Self = StObject.set(x, "rangeKeyValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeKeyValueUndefined: Self = StObject.set(x, "rangeKeyValue", js.undefined)
    
    @scala.inline
    def setTableName(value: DynamoTableName): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
  }
}
