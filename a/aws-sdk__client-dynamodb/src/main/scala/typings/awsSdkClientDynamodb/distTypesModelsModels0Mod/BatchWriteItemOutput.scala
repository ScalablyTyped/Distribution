package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchWriteItemOutput extends StObject {
  
  /**
    * <p>The capacity units consumed by the entire <code>BatchWriteItem</code>
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
    * <p>A list of tables that were processed by <code>BatchWriteItem</code> and, for each
    *             table, information about any item collections that were affected by individual
    *                 <code>DeleteItem</code> or <code>PutItem</code> operations.</p>
    *          <p>Each entry consists of the following subelements:</p>
    *          <ul>
    *             <li>
    *                <p>
    *                   <code>ItemCollectionKey</code> - The partition key value of the item collection.
    *                     This is the same as the partition key value of the item.</p>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>SizeEstimateRangeGB</code> - An estimate of item collection size,
    *                     expressed in GB. This is a two-element array containing a lower bound and an
    *                     upper bound for the estimate. The estimate includes the size of all the items in
    *                     the table, plus the size of all attributes projected into all of the local
    *                     secondary indexes on the table. Use this estimate to measure whether a local
    *                     secondary index is approaching its size limit.</p>
    *                <p>The estimate is subject to change over time; therefore, do not rely on the
    *                     precision or accuracy of the estimate.</p>
    *             </li>
    *          </ul>
    */
  var ItemCollectionMetrics: js.UndefOr[
    Record[
      String, 
      js.Array[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ItemCollectionMetrics]
    ]
  ] = js.undefined
  
  /**
    * <p>A map of tables and requests against those tables that were not processed. The
    *                 <code>UnprocessedItems</code> value is in the same form as
    *             <code>RequestItems</code>, so you can provide this value directly to a subsequent
    *                 <code>BatchWriteItem</code> operation. For more information, see
    *                 <code>RequestItems</code> in the Request Parameters section.</p>
    *          <p>Each <code>UnprocessedItems</code> entry consists of a table name and, for that table,
    *             a list of operations to perform (<code>DeleteRequest</code> or
    *             <code>PutRequest</code>).</p>
    *          <ul>
    *             <li>
    *                <p>
    *                   <code>DeleteRequest</code> - Perform a <code>DeleteItem</code> operation on the
    *                     specified item. The item to be deleted is identified by a <code>Key</code>
    *                     subelement:</p>
    *                <ul>
    *                   <li>
    *                      <p>
    *                         <code>Key</code> - A map of primary key attribute values that uniquely
    *                             identify the item. Each entry in this map consists of an attribute name
    *                             and an attribute value.</p>
    *                   </li>
    *                </ul>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>PutRequest</code> - Perform a <code>PutItem</code> operation on the
    *                     specified item. The item to be put is identified by an <code>Item</code>
    *                     subelement:</p>
    *                <ul>
    *                   <li>
    *                      <p>
    *                         <code>Item</code> - A map of attributes and their values. Each entry in
    *                             this map consists of an attribute name and an attribute value. Attribute
    *                             values must not be null; string and binary type attributes must have
    *                             lengths greater than zero; and set type attributes must not be empty.
    *                             Requests that contain empty values will be rejected with a
    *                                 <code>ValidationException</code> exception.</p>
    *                      <p>If you specify any attributes that are part of an index key, then the
    *                             data types for those attributes must match those of the schema in the
    *                             table's attribute definition.</p>
    *                   </li>
    *                </ul>
    *             </li>
    *          </ul>
    *          <p>If there are no unprocessed items remaining, the response contains an empty
    *                 <code>UnprocessedItems</code> map.</p>
    */
  var UnprocessedItems: js.UndefOr[Record[String, js.Array[WriteRequest]]] = js.undefined
}
object BatchWriteItemOutput {
  
  inline def apply(): BatchWriteItemOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchWriteItemOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchWriteItemOutput] (val x: Self) extends AnyVal {
    
    inline def setConsumedCapacity(value: js.Array[ConsumedCapacity]): Self = StObject.set(x, "ConsumedCapacity", value.asInstanceOf[js.Any])
    
    inline def setConsumedCapacityUndefined: Self = StObject.set(x, "ConsumedCapacity", js.undefined)
    
    inline def setConsumedCapacityVarargs(value: ConsumedCapacity*): Self = StObject.set(x, "ConsumedCapacity", js.Array(value*))
    
    inline def setItemCollectionMetrics(value: Record[String, js.Array[ItemCollectionMetrics]]): Self = StObject.set(x, "ItemCollectionMetrics", value.asInstanceOf[js.Any])
    
    inline def setItemCollectionMetricsUndefined: Self = StObject.set(x, "ItemCollectionMetrics", js.undefined)
    
    inline def setUnprocessedItems(value: Record[String, js.Array[WriteRequest]]): Self = StObject.set(x, "UnprocessedItems", value.asInstanceOf[js.Any])
    
    inline def setUnprocessedItemsUndefined: Self = StObject.set(x, "UnprocessedItems", js.undefined)
  }
}
