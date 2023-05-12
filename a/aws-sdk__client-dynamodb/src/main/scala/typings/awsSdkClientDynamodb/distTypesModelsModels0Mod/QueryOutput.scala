package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryOutput extends StObject {
  
  /**
    * <p>The capacity units consumed by the <code>Query</code> operation. The data returned
    *             includes the total provisioned throughput consumed, along with statistics for the table
    *             and any indexes involved in the operation. <code>ConsumedCapacity</code> is only
    *             returned if the <code>ReturnConsumedCapacity</code> parameter was specified. For more
    *             information, see <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ProvisionedThroughputIntro.html">Provisioned Throughput</a> in the <i>Amazon DynamoDB Developer
    *                 Guide</i>.</p>
    */
  var ConsumedCapacity: js.UndefOr[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ConsumedCapacity] = js.undefined
  
  /**
    * <p>The number of items in the response.</p>
    *          <p>If you used a <code>QueryFilter</code> in the request, then <code>Count</code> is the
    *             number of items returned after the filter was applied, and <code>ScannedCount</code> is
    *             the number of matching items before the filter was applied.</p>
    *          <p>If you did not use a filter in the request, then <code>Count</code> and
    *                 <code>ScannedCount</code> are the same.</p>
    */
  var Count: js.UndefOr[Double] = js.undefined
  
  /**
    * <p>An array of item attributes that match the query criteria. Each element in this array
    *             consists of an attribute name and the value for that attribute.</p>
    */
  var Items: js.UndefOr[js.Array[Record[String, AttributeValue]]] = js.undefined
  
  /**
    * <p>The primary key of the item where the operation stopped, inclusive of the previous
    *             result set. Use this value to start a new operation, excluding this value in the new
    *             request.</p>
    *          <p>If <code>LastEvaluatedKey</code> is empty, then the "last page" of results has been
    *             processed and there is no more data to be retrieved.</p>
    *          <p>If <code>LastEvaluatedKey</code> is not empty, it does not necessarily mean that there
    *             is more data in the result set. The only way to know when you have reached the end of
    *             the result set is when <code>LastEvaluatedKey</code> is empty.</p>
    */
  var LastEvaluatedKey: js.UndefOr[Record[String, AttributeValue]] = js.undefined
  
  /**
    * <p>The number of items evaluated, before any <code>QueryFilter</code> is applied. A high
    *                 <code>ScannedCount</code> value with few, or no, <code>Count</code> results
    *             indicates an inefficient <code>Query</code> operation. For more information, see <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html#Count">Count and
    *                 ScannedCount</a> in the <i>Amazon DynamoDB Developer
    *             Guide</i>.</p>
    *          <p>If you did not use a filter in the request, then <code>ScannedCount</code> is the same
    *             as <code>Count</code>.</p>
    */
  var ScannedCount: js.UndefOr[Double] = js.undefined
}
object QueryOutput {
  
  inline def apply(): QueryOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryOutput] (val x: Self) extends AnyVal {
    
    inline def setConsumedCapacity(value: ConsumedCapacity): Self = StObject.set(x, "ConsumedCapacity", value.asInstanceOf[js.Any])
    
    inline def setConsumedCapacityUndefined: Self = StObject.set(x, "ConsumedCapacity", js.undefined)
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "Count", js.undefined)
    
    inline def setItems(value: js.Array[Record[String, AttributeValue]]): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    inline def setItemsVarargs(value: (Record[String, AttributeValue])*): Self = StObject.set(x, "Items", js.Array(value*))
    
    inline def setLastEvaluatedKey(value: Record[String, AttributeValue]): Self = StObject.set(x, "LastEvaluatedKey", value.asInstanceOf[js.Any])
    
    inline def setLastEvaluatedKeyUndefined: Self = StObject.set(x, "LastEvaluatedKey", js.undefined)
    
    inline def setScannedCount(value: Double): Self = StObject.set(x, "ScannedCount", value.asInstanceOf[js.Any])
    
    inline def setScannedCountUndefined: Self = StObject.set(x, "ScannedCount", js.undefined)
  }
}
