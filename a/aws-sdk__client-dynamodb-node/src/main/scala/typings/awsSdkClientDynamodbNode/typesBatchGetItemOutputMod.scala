package typings.awsSdkClientDynamodbNode

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbNode.typesAttributeValueMod.UnmarshalledAttributeValue
import typings.awsSdkClientDynamodbNode.typesConsumedCapacityMod.UnmarshalledConsumedCapacity
import typings.awsSdkClientDynamodbNode.typesKeysAndAttributesMod.UnmarshalledKeysAndAttributes
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBatchGetItemOutputMod {
  
  trait BatchGetItemOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>The read capacity units consumed by the entire <code>BatchGetItem</code> operation.</p> <p>Each element consists of:</p> <ul> <li> <p> <code>TableName</code> - The table that consumed the provisioned throughput.</p> </li> <li> <p> <code>CapacityUnits</code> - The total number of capacity units consumed.</p> </li> </ul>
      */
    var ConsumedCapacity: js.UndefOr[js.Array[UnmarshalledConsumedCapacity]] = js.undefined
    
    /**
      * <p>A map of table name to a list of items. Each object in <code>Responses</code> consists of a table name, along with a map of attribute data consisting of the data type and attribute value.</p>
      */
    var Responses: js.UndefOr[StringDictionary[js.Array[StringDictionary[UnmarshalledAttributeValue]]]] = js.undefined
    
    /**
      * <p>A map of tables and their respective keys that were not processed with the current response. The <code>UnprocessedKeys</code> value is in the same form as <code>RequestItems</code>, so the value can be provided directly to a subsequent <code>BatchGetItem</code> operation. For more information, see <code>RequestItems</code> in the Request Parameters section.</p> <p>Each element consists of:</p> <ul> <li> <p> <code>Keys</code> - An array of primary key attribute values that define specific items in the table.</p> </li> <li> <p> <code>ProjectionExpression</code> - One or more attributes to be retrieved from the table or index. By default, all attributes are returned. If a requested attribute is not found, it does not appear in the result.</p> </li> <li> <p> <code>ConsistentRead</code> - The consistency of a read operation. If set to <code>true</code>, then a strongly consistent read is used; otherwise, an eventually consistent read is used.</p> </li> </ul> <p>If there are no unprocessed keys remaining, the response contains an empty <code>UnprocessedKeys</code> map.</p>
      */
    var UnprocessedKeys: js.UndefOr[StringDictionary[UnmarshalledKeysAndAttributes]] = js.undefined
  }
  object BatchGetItemOutput {
    
    inline def apply($metadata: ResponseMetadata): BatchGetItemOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[BatchGetItemOutput]
    }
    
    extension [Self <: BatchGetItemOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setConsumedCapacity(value: js.Array[UnmarshalledConsumedCapacity]): Self = StObject.set(x, "ConsumedCapacity", value.asInstanceOf[js.Any])
      
      inline def setConsumedCapacityUndefined: Self = StObject.set(x, "ConsumedCapacity", js.undefined)
      
      inline def setConsumedCapacityVarargs(value: UnmarshalledConsumedCapacity*): Self = StObject.set(x, "ConsumedCapacity", js.Array(value :_*))
      
      inline def setResponses(value: StringDictionary[js.Array[StringDictionary[UnmarshalledAttributeValue]]]): Self = StObject.set(x, "Responses", value.asInstanceOf[js.Any])
      
      inline def setResponsesUndefined: Self = StObject.set(x, "Responses", js.undefined)
      
      inline def setUnprocessedKeys(value: StringDictionary[UnmarshalledKeysAndAttributes]): Self = StObject.set(x, "UnprocessedKeys", value.asInstanceOf[js.Any])
      
      inline def setUnprocessedKeysUndefined: Self = StObject.set(x, "UnprocessedKeys", js.undefined)
    }
  }
}
