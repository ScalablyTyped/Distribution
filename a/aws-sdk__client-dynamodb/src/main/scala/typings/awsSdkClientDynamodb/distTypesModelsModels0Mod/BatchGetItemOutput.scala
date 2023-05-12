package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetItemOutput extends StObject {
  
  /**
    * <p>The read capacity units consumed by the entire <code>BatchGetItem</code>
    *             operation.</p>
    *          <p>Each element consists of:</p>
    *          <ul>
    *             <li>
    *                <p>
    *                   <code>TableName</code> - The table that consumed the provisioned
    *                     throughput.</p>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>CapacityUnits</code> - The total number of capacity units consumed.</p>
    *             </li>
    *          </ul>
    */
  var ConsumedCapacity: js.UndefOr[
    js.Array[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ConsumedCapacity]
  ] = js.undefined
  
  /**
    * <p>A map of table name to a list of items. Each object in <code>Responses</code> consists
    *             of a table name, along with a map of attribute data consisting of the data type and
    *             attribute value.</p>
    */
  var Responses: js.UndefOr[Record[String, js.Array[Record[String, AttributeValue]]]] = js.undefined
  
  /**
    * <p>A map of tables and their respective keys that were not processed with the current
    *             response. The <code>UnprocessedKeys</code> value is in the same form as
    *                 <code>RequestItems</code>, so the value can be provided directly to a subsequent
    *                 <code>BatchGetItem</code> operation. For more information, see
    *                 <code>RequestItems</code> in the Request Parameters section.</p>
    *          <p>Each element consists of:</p>
    *          <ul>
    *             <li>
    *                <p>
    *                   <code>Keys</code> - An array of primary key attribute values that define
    *                     specific items in the table.</p>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>ProjectionExpression</code> - One or more attributes to be retrieved from
    *                     the table or index. By default, all attributes are returned. If a requested
    *                     attribute is not found, it does not appear in the result.</p>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>ConsistentRead</code> - The consistency of a read operation. If set to
    *                         <code>true</code>, then a strongly consistent read is used; otherwise, an
    *                     eventually consistent read is used.</p>
    *             </li>
    *          </ul>
    *          <p>If there are no unprocessed keys remaining, the response contains an empty
    *                 <code>UnprocessedKeys</code> map.</p>
    */
  var UnprocessedKeys: js.UndefOr[Record[String, KeysAndAttributes]] = js.undefined
}
object BatchGetItemOutput {
  
  inline def apply(): BatchGetItemOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetItemOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchGetItemOutput] (val x: Self) extends AnyVal {
    
    inline def setConsumedCapacity(value: js.Array[ConsumedCapacity]): Self = StObject.set(x, "ConsumedCapacity", value.asInstanceOf[js.Any])
    
    inline def setConsumedCapacityUndefined: Self = StObject.set(x, "ConsumedCapacity", js.undefined)
    
    inline def setConsumedCapacityVarargs(value: ConsumedCapacity*): Self = StObject.set(x, "ConsumedCapacity", js.Array(value*))
    
    inline def setResponses(value: Record[String, js.Array[Record[String, AttributeValue]]]): Self = StObject.set(x, "Responses", value.asInstanceOf[js.Any])
    
    inline def setResponsesUndefined: Self = StObject.set(x, "Responses", js.undefined)
    
    inline def setUnprocessedKeys(value: Record[String, KeysAndAttributes]): Self = StObject.set(x, "UnprocessedKeys", value.asInstanceOf[js.Any])
    
    inline def setUnprocessedKeysUndefined: Self = StObject.set(x, "UnprocessedKeys", js.undefined)
  }
}
