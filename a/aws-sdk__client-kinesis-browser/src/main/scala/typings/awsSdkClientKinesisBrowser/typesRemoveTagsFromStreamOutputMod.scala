package typings.awsSdkClientKinesisBrowser

import typings.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRemoveTagsFromStreamOutputMod {
  
  trait RemoveTagsFromStreamOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
  }
  object RemoveTagsFromStreamOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): RemoveTagsFromStreamOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemoveTagsFromStreamOutput]
    }
    
    @scala.inline
    implicit class RemoveTagsFromStreamOutputMutableBuilder[Self <: RemoveTagsFromStreamOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
    }
  }
}
