package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbNode.typesTagMod.UnmarshalledTag
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesListTagsOfResourceOutputMod {
  
  trait ListTagsOfResourceOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>If this value is returned, there are additional results to be displayed. To retrieve them, call ListTagsOfResource again, with NextToken set to this value.</p>
      */
    var NextToken: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The tags currently associated with the Amazon DynamoDB resource.</p>
      */
    var Tags: js.UndefOr[js.Array[UnmarshalledTag]] = js.undefined
  }
  object ListTagsOfResourceOutput {
    
    inline def apply($metadata: ResponseMetadata): ListTagsOfResourceOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListTagsOfResourceOutput]
    }
    
    extension [Self <: ListTagsOfResourceOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
      
      inline def setTags(value: js.Array[UnmarshalledTag]): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
      
      inline def setTagsVarargs(value: UnmarshalledTag*): Self = StObject.set(x, "Tags", js.Array(value*))
    }
  }
}
