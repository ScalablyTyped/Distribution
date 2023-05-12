package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchWriteItemInput extends StObject {
  
  /**
    * <p>A map of one or more table names and, for each table, a list of operations to be
    *             performed (<code>DeleteRequest</code> or <code>PutRequest</code>). Each element in the
    *             map consists of the following:</p>
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
    *                             and an attribute value. For each primary key, you must provide
    *                                 <i>all</i> of the key attributes. For example, with a
    *                             simple primary key, you only need to provide a value for the partition
    *                             key. For a composite primary key, you must provide values for
    *                                 <i>both</i> the partition key and the sort key.</p>
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
    *                             Requests that contain empty values are rejected with a
    *                                 <code>ValidationException</code> exception.</p>
    *                      <p>If you specify any attributes that are part of an index key, then the
    *                             data types for those attributes must match those of the schema in the
    *                             table's attribute definition.</p>
    *                   </li>
    *                </ul>
    *             </li>
    *          </ul>
    */
  var RequestItems: js.UndefOr[Record[String, js.Array[WriteRequest]]] = js.undefined
  
  /**
    * <p>Determines the level of detail about either provisioned or on-demand throughput
    *             consumption that is returned in the response:</p>
    *          <ul>
    *             <li>
    *                <p>
    *                   <code>INDEXES</code> - The response includes the aggregate
    *                         <code>ConsumedCapacity</code> for the operation, together with
    *                         <code>ConsumedCapacity</code> for each table and secondary index that was
    *                     accessed.</p>
    *                <p>Note that some operations, such as <code>GetItem</code> and
    *                         <code>BatchGetItem</code>, do not access any indexes at all. In these cases,
    *                     specifying <code>INDEXES</code> will only return <code>ConsumedCapacity</code>
    *                     information for table(s).</p>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>TOTAL</code> - The response includes only the aggregate
    *                         <code>ConsumedCapacity</code> for the operation.</p>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>NONE</code> - No <code>ConsumedCapacity</code> details are included in the
    *                     response.</p>
    *             </li>
    *          </ul>
    */
  var ReturnConsumedCapacity: js.UndefOr[
    typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ReturnConsumedCapacity | String
  ] = js.undefined
  
  /**
    * <p>Determines whether item collection metrics are returned. If set to <code>SIZE</code>,
    *             the response includes statistics about item collections, if any, that were modified
    *             during the operation are returned in the response. If set to <code>NONE</code> (the
    *             default), no statistics are returned.</p>
    */
  var ReturnItemCollectionMetrics: js.UndefOr[
    typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ReturnItemCollectionMetrics | String
  ] = js.undefined
}
object BatchWriteItemInput {
  
  inline def apply(): BatchWriteItemInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchWriteItemInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchWriteItemInput] (val x: Self) extends AnyVal {
    
    inline def setRequestItems(value: Record[String, js.Array[WriteRequest]]): Self = StObject.set(x, "RequestItems", value.asInstanceOf[js.Any])
    
    inline def setRequestItemsUndefined: Self = StObject.set(x, "RequestItems", js.undefined)
    
    inline def setReturnConsumedCapacity(value: ReturnConsumedCapacity | String): Self = StObject.set(x, "ReturnConsumedCapacity", value.asInstanceOf[js.Any])
    
    inline def setReturnConsumedCapacityUndefined: Self = StObject.set(x, "ReturnConsumedCapacity", js.undefined)
    
    inline def setReturnItemCollectionMetrics(value: ReturnItemCollectionMetrics | String): Self = StObject.set(x, "ReturnItemCollectionMetrics", value.asInstanceOf[js.Any])
    
    inline def setReturnItemCollectionMetricsUndefined: Self = StObject.set(x, "ReturnItemCollectionMetrics", js.undefined)
  }
}
