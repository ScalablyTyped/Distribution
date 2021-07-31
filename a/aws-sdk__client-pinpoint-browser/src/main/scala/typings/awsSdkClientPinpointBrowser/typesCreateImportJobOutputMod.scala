package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesImportJobResponseMod.UnmarshalledImportJobResponse
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCreateImportJobOutputMod {
  
  trait CreateImportJobOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * Import job response.
      */
    var ImportJobResponse: UnmarshalledImportJobResponse
  }
  object CreateImportJobOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata, ImportJobResponse: UnmarshalledImportJobResponse): CreateImportJobOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ImportJobResponse = ImportJobResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateImportJobOutput]
    }
    
    @scala.inline
    implicit class CreateImportJobOutputMutableBuilder[Self <: CreateImportJobOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImportJobResponse(value: UnmarshalledImportJobResponse): Self = StObject.set(x, "ImportJobResponse", value.asInstanceOf[js.Any])
    }
  }
}
