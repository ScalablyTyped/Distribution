package typings.awsSdkClientSqsNode

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientSqsNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesListQueueTagsOutputMod {
  
  trait ListQueueTagsOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>The list of all tags added to the specified queue.</p>
      */
    var Tags: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object ListQueueTagsOutput {
    
    inline def apply($metadata: ResponseMetadata): ListQueueTagsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListQueueTagsOutput]
    }
    
    extension [Self <: ListQueueTagsOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    }
  }
}
