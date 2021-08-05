package typings.awsSdkClientDynamodbNode

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.INDEXES
import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.NONE
import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.SIZE
import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.TOTAL
import typings.awsSdkClientDynamodbNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientDynamodbNode.typesWriteRequestMod.WriteRequest
import typings.awsSdkTypes.abortMod.AbortSignal
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBatchWriteItemInputMod {
  
  trait BatchWriteItemInput
    extends StObject
       with InputTypesUnion {
    
    /**
      * An object that may be queried to determine if the underlying operation has been aborted.
      *
      * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
      */
    @JSName("$abortSignal")
    var $abortSignal: js.UndefOr[AbortSignal] = js.undefined
    
    /**
      * Per-request HTTP configuration options. If set, any options specified will override the corresponding HTTP option set on the client for this command.
      */
    @JSName("$httpOptions")
    var $httpOptions: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ js.Any
      ] = js.undefined
    
    /**
      * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
      */
    @JSName("$maxRetries")
    var $maxRetries: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>A map of one or more table names and, for each table, a list of operations to be performed (<code>DeleteRequest</code> or <code>PutRequest</code>). Each element in the map consists of the following:</p> <ul> <li> <p> <code>DeleteRequest</code> - Perform a <code>DeleteItem</code> operation on the specified item. The item to be deleted is identified by a <code>Key</code> subelement:</p> <ul> <li> <p> <code>Key</code> - A map of primary key attribute values that uniquely identify the item. Each entry in this map consists of an attribute name and an attribute value. For each primary key, you must provide <i>all</i> of the key attributes. For example, with a simple primary key, you only need to provide a value for the partition key. For a composite primary key, you must provide values for <i>both</i> the partition key and the sort key.</p> </li> </ul> </li> <li> <p> <code>PutRequest</code> - Perform a <code>PutItem</code> operation on the specified item. The item to be put is identified by an <code>Item</code> subelement:</p> <ul> <li> <p> <code>Item</code> - A map of attributes and their values. Each entry in this map consists of an attribute name and an attribute value. Attribute values must not be null; string and binary type attributes must have lengths greater than zero; and set type attributes must not be empty. Requests that contain empty values will be rejected with a <code>ValidationException</code> exception.</p> <p>If you specify any attributes that are part of an index key, then the data types for those attributes must match those of the schema in the table's attribute definition.</p> </li> </ul> </li> </ul>
      */
    var RequestItems: (StringDictionary[js.Array[WriteRequest] | Iterable[WriteRequest]]) | (Iterable[js.Tuple2[String, js.Array[WriteRequest] | Iterable[WriteRequest]]])
    
    /**
      * <p>Determines the level of detail about provisioned throughput consumption that is returned in the response:</p> <ul> <li> <p> <code>INDEXES</code> - The response includes the aggregate <code>ConsumedCapacity</code> for the operation, together with <code>ConsumedCapacity</code> for each table and secondary index that was accessed.</p> <p>Note that some operations, such as <code>GetItem</code> and <code>BatchGetItem</code>, do not access any indexes at all. In these cases, specifying <code>INDEXES</code> will only return <code>ConsumedCapacity</code> information for table(s).</p> </li> <li> <p> <code>TOTAL</code> - The response includes only the aggregate <code>ConsumedCapacity</code> for the operation.</p> </li> <li> <p> <code>NONE</code> - No <code>ConsumedCapacity</code> details are included in the response.</p> </li> </ul>
      */
    var ReturnConsumedCapacity: js.UndefOr[INDEXES | TOTAL | NONE | String] = js.undefined
    
    /**
      * <p>Determines whether item collection metrics are returned. If set to <code>SIZE</code>, the response includes statistics about item collections, if any, that were modified during the operation are returned in the response. If set to <code>NONE</code> (the default), no statistics are returned.</p>
      */
    var ReturnItemCollectionMetrics: js.UndefOr[SIZE | NONE | String] = js.undefined
  }
  object BatchWriteItemInput {
    
    inline def apply(
      RequestItems: (StringDictionary[js.Array[WriteRequest] | Iterable[WriteRequest]]) | (Iterable[js.Tuple2[String, js.Array[WriteRequest] | Iterable[WriteRequest]]])
    ): BatchWriteItemInput = {
      val __obj = js.Dynamic.literal(RequestItems = RequestItems.asInstanceOf[js.Any])
      __obj.asInstanceOf[BatchWriteItemInput]
    }
    
    extension [Self <: BatchWriteItemInput](x: Self) {
      
      inline def set$abortSignal(value: AbortSignal): Self = StObject.set(x, "$abortSignal", value.asInstanceOf[js.Any])
      
      inline def set$abortSignalUndefined: Self = StObject.set(x, "$abortSignal", js.undefined)
      
      inline def set$httpOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ js.Any
      ): Self = StObject.set(x, "$httpOptions", value.asInstanceOf[js.Any])
      
      inline def set$httpOptionsUndefined: Self = StObject.set(x, "$httpOptions", js.undefined)
      
      inline def set$maxRetries(value: Double): Self = StObject.set(x, "$maxRetries", value.asInstanceOf[js.Any])
      
      inline def set$maxRetriesUndefined: Self = StObject.set(x, "$maxRetries", js.undefined)
      
      inline def setRequestItems(
        value: (StringDictionary[js.Array[WriteRequest] | Iterable[WriteRequest]]) | (Iterable[js.Tuple2[String, js.Array[WriteRequest] | Iterable[WriteRequest]]])
      ): Self = StObject.set(x, "RequestItems", value.asInstanceOf[js.Any])
      
      inline def setReturnConsumedCapacity(value: INDEXES | TOTAL | NONE | String): Self = StObject.set(x, "ReturnConsumedCapacity", value.asInstanceOf[js.Any])
      
      inline def setReturnConsumedCapacityUndefined: Self = StObject.set(x, "ReturnConsumedCapacity", js.undefined)
      
      inline def setReturnItemCollectionMetrics(value: SIZE | NONE | String): Self = StObject.set(x, "ReturnItemCollectionMetrics", value.asInstanceOf[js.Any])
      
      inline def setReturnItemCollectionMetricsUndefined: Self = StObject.set(x, "ReturnItemCollectionMetrics", js.undefined)
    }
  }
}
