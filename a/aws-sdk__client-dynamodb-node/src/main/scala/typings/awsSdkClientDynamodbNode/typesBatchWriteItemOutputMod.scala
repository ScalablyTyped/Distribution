package typings.awsSdkClientDynamodbNode

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbNode.typesConsumedCapacityMod.UnmarshalledConsumedCapacity
import typings.awsSdkClientDynamodbNode.typesItemCollectionMetricsMod.UnmarshalledItemCollectionMetrics
import typings.awsSdkClientDynamodbNode.typesWriteRequestMod.UnmarshalledWriteRequest
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBatchWriteItemOutputMod {
  
  @js.native
  trait BatchWriteItemOutput extends OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    
    /**
      * <p>The capacity units consumed by the entire <code>BatchWriteItem</code> operation.</p> <p>Each element consists of:</p> <ul> <li> <p> <code>TableName</code> - The table that consumed the provisioned throughput.</p> </li> <li> <p> <code>CapacityUnits</code> - The total number of capacity units consumed.</p> </li> </ul>
      */
    var ConsumedCapacity: js.UndefOr[js.Array[UnmarshalledConsumedCapacity]] = js.native
    
    /**
      * <p>A list of tables that were processed by <code>BatchWriteItem</code> and, for each table, information about any item collections that were affected by individual <code>DeleteItem</code> or <code>PutItem</code> operations.</p> <p>Each entry consists of the following subelements:</p> <ul> <li> <p> <code>ItemCollectionKey</code> - The partition key value of the item collection. This is the same as the partition key value of the item.</p> </li> <li> <p> <code>SizeEstimateRangeGB</code> - An estimate of item collection size, expressed in GB. This is a two-element array containing a lower bound and an upper bound for the estimate. The estimate includes the size of all the items in the table, plus the size of all attributes projected into all of the local secondary indexes on the table. Use this estimate to measure whether a local secondary index is approaching its size limit.</p> <p>The estimate is subject to change over time; therefore, do not rely on the precision or accuracy of the estimate.</p> </li> </ul>
      */
    var ItemCollectionMetrics: js.UndefOr[StringDictionary[js.Array[UnmarshalledItemCollectionMetrics]]] = js.native
    
    /**
      * <p>A map of tables and requests against those tables that were not processed. The <code>UnprocessedItems</code> value is in the same form as <code>RequestItems</code>, so you can provide this value directly to a subsequent <code>BatchGetItem</code> operation. For more information, see <code>RequestItems</code> in the Request Parameters section.</p> <p>Each <code>UnprocessedItems</code> entry consists of a table name and, for that table, a list of operations to perform (<code>DeleteRequest</code> or <code>PutRequest</code>).</p> <ul> <li> <p> <code>DeleteRequest</code> - Perform a <code>DeleteItem</code> operation on the specified item. The item to be deleted is identified by a <code>Key</code> subelement:</p> <ul> <li> <p> <code>Key</code> - A map of primary key attribute values that uniquely identify the item. Each entry in this map consists of an attribute name and an attribute value.</p> </li> </ul> </li> <li> <p> <code>PutRequest</code> - Perform a <code>PutItem</code> operation on the specified item. The item to be put is identified by an <code>Item</code> subelement:</p> <ul> <li> <p> <code>Item</code> - A map of attributes and their values. Each entry in this map consists of an attribute name and an attribute value. Attribute values must not be null; string and binary type attributes must have lengths greater than zero; and set type attributes must not be empty. Requests that contain empty values will be rejected with a <code>ValidationException</code> exception.</p> <p>If you specify any attributes that are part of an index key, then the data types for those attributes must match those of the schema in the table's attribute definition.</p> </li> </ul> </li> </ul> <p>If there are no unprocessed items remaining, the response contains an empty <code>UnprocessedItems</code> map.</p>
      */
    var UnprocessedItems: js.UndefOr[StringDictionary[js.Array[UnmarshalledWriteRequest]]] = js.native
  }
  object BatchWriteItemOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): BatchWriteItemOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[BatchWriteItemOutput]
    }
    
    @scala.inline
    implicit class BatchWriteItemOutputMutableBuilder[Self <: BatchWriteItemOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConsumedCapacity(value: js.Array[UnmarshalledConsumedCapacity]): Self = StObject.set(x, "ConsumedCapacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConsumedCapacityUndefined: Self = StObject.set(x, "ConsumedCapacity", js.undefined)
      
      @scala.inline
      def setConsumedCapacityVarargs(value: UnmarshalledConsumedCapacity*): Self = StObject.set(x, "ConsumedCapacity", js.Array(value :_*))
      
      @scala.inline
      def setItemCollectionMetrics(value: StringDictionary[js.Array[UnmarshalledItemCollectionMetrics]]): Self = StObject.set(x, "ItemCollectionMetrics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemCollectionMetricsUndefined: Self = StObject.set(x, "ItemCollectionMetrics", js.undefined)
      
      @scala.inline
      def setUnprocessedItems(value: StringDictionary[js.Array[UnmarshalledWriteRequest]]): Self = StObject.set(x, "UnprocessedItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnprocessedItemsUndefined: Self = StObject.set(x, "UnprocessedItems", js.undefined)
    }
  }
}
