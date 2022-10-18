package typings.awsSdkClientDynamodbBrowser

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientDynamodbBrowser.typesAttributeValueMod.UnmarshalledAttributeValue
import typings.awsSdkClientDynamodbBrowser.typesConsumedCapacityMod.UnmarshalledConsumedCapacity
import typings.awsSdkClientDynamodbBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetItemOutputMod {
  
  trait GetItemOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>The capacity units consumed by the <code>GetItem</code> operation. The data returned includes the total provisioned throughput consumed, along with statistics for the table and any indexes involved in the operation. <code>ConsumedCapacity</code> is only returned if the <code>ReturnConsumedCapacity</code> parameter was specified. For more information, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ProvisionedThroughputIntro.html">Provisioned Throughput</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
      */
    var ConsumedCapacity: js.UndefOr[UnmarshalledConsumedCapacity] = js.undefined
    
    /**
      * <p>A map of attribute names to <code>AttributeValue</code> objects, as specified by <code>ProjectionExpression</code>.</p>
      */
    var Item: js.UndefOr[StringDictionary[UnmarshalledAttributeValue]] = js.undefined
  }
  object GetItemOutput {
    
    inline def apply($metadata: ResponseMetadata): GetItemOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetItemOutput]
    }
    
    extension [Self <: GetItemOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setConsumedCapacity(value: UnmarshalledConsumedCapacity): Self = StObject.set(x, "ConsumedCapacity", value.asInstanceOf[js.Any])
      
      inline def setConsumedCapacityUndefined: Self = StObject.set(x, "ConsumedCapacity", js.undefined)
      
      inline def setItem(value: StringDictionary[UnmarshalledAttributeValue]): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
      
      inline def setItemUndefined: Self = StObject.set(x, "Item", js.undefined)
    }
  }
}
