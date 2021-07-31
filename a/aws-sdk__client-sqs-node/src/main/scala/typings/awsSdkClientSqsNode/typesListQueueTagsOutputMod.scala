package typings.awsSdkClientSqsNode

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
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
    
    @scala.inline
    def apply($metadata: ResponseMetadata): ListQueueTagsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListQueueTagsOutput]
    }
    
    @scala.inline
    implicit class ListQueueTagsOutputMutableBuilder[Self <: ListQueueTagsOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    }
  }
}
