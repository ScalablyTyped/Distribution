package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryOutput extends StObject {
  
  /**
    * The capacity units consumed by the Query operation. The data returned includes the total provisioned throughput consumed, along with statistics for the table and any indexes involved in the operation. ConsumedCapacity is only returned if the ReturnConsumedCapacity parameter was specified. For more information, see Provisioned Throughput in the Amazon DynamoDB Developer Guide.
    */
  var ConsumedCapacity: js.UndefOr[typings.awsSdk.dynamodbMod.ConsumedCapacity] = js.undefined
  
  /**
    * The number of items in the response. If you used a QueryFilter in the request, then Count is the number of items returned after the filter was applied, and ScannedCount is the number of matching items before the filter was applied. If you did not use a filter in the request, then Count and ScannedCount are the same.
    */
  var Count: js.UndefOr[Integer] = js.undefined
  
  /**
    * An array of item attributes that match the query criteria. Each element in this array consists of an attribute name and the value for that attribute.
    */
  var Items: js.UndefOr[ItemList] = js.undefined
  
  /**
    * The primary key of the item where the operation stopped, inclusive of the previous result set. Use this value to start a new operation, excluding this value in the new request. If LastEvaluatedKey is empty, then the "last page" of results has been processed and there is no more data to be retrieved. If LastEvaluatedKey is not empty, it does not necessarily mean that there is more data in the result set. The only way to know when you have reached the end of the result set is when LastEvaluatedKey is empty.
    */
  var LastEvaluatedKey: js.UndefOr[Key] = js.undefined
  
  /**
    * The number of items evaluated, before any QueryFilter is applied. A high ScannedCount value with few, or no, Count results indicates an inefficient Query operation. For more information, see Count and ScannedCount in the Amazon DynamoDB Developer Guide. If you did not use a filter in the request, then ScannedCount is the same as Count.
    */
  var ScannedCount: js.UndefOr[Integer] = js.undefined
}
object QueryOutput {
  
  inline def apply(): QueryOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryOutput]
  }
  
  extension [Self <: QueryOutput](x: Self) {
    
    inline def setConsumedCapacity(value: ConsumedCapacity): Self = StObject.set(x, "ConsumedCapacity", value.asInstanceOf[js.Any])
    
    inline def setConsumedCapacityUndefined: Self = StObject.set(x, "ConsumedCapacity", js.undefined)
    
    inline def setCount(value: Integer): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "Count", js.undefined)
    
    inline def setItems(value: ItemList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    inline def setItemsVarargs(value: AttributeMap*): Self = StObject.set(x, "Items", js.Array(value*))
    
    inline def setLastEvaluatedKey(value: Key): Self = StObject.set(x, "LastEvaluatedKey", value.asInstanceOf[js.Any])
    
    inline def setLastEvaluatedKeyUndefined: Self = StObject.set(x, "LastEvaluatedKey", js.undefined)
    
    inline def setScannedCount(value: Integer): Self = StObject.set(x, "ScannedCount", value.asInstanceOf[js.Any])
    
    inline def setScannedCountUndefined: Self = StObject.set(x, "ScannedCount", js.undefined)
  }
}
