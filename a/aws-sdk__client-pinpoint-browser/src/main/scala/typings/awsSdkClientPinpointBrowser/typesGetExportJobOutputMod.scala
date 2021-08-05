package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesExportJobResponseMod.UnmarshalledExportJobResponse
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetExportJobOutputMod {
  
  trait GetExportJobOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * Export job response.
      */
    var ExportJobResponse: UnmarshalledExportJobResponse
  }
  object GetExportJobOutput {
    
    inline def apply($metadata: ResponseMetadata, ExportJobResponse: UnmarshalledExportJobResponse): GetExportJobOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ExportJobResponse = ExportJobResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetExportJobOutput]
    }
    
    extension [Self <: GetExportJobOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setExportJobResponse(value: UnmarshalledExportJobResponse): Self = StObject.set(x, "ExportJobResponse", value.asInstanceOf[js.Any])
    }
  }
}
