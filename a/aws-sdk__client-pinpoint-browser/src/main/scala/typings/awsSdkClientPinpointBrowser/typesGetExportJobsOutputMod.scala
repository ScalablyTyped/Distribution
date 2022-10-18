package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.typesExportJobsResponseMod.UnmarshalledExportJobsResponse
import typings.awsSdkClientPinpointBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetExportJobsOutputMod {
  
  trait GetExportJobsOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * Export job list.
      */
    var ExportJobsResponse: UnmarshalledExportJobsResponse
  }
  object GetExportJobsOutput {
    
    inline def apply($metadata: ResponseMetadata, ExportJobsResponse: UnmarshalledExportJobsResponse): GetExportJobsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ExportJobsResponse = ExportJobsResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetExportJobsOutput]
    }
    
    extension [Self <: GetExportJobsOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setExportJobsResponse(value: UnmarshalledExportJobsResponse): Self = StObject.set(x, "ExportJobsResponse", value.asInstanceOf[js.Any])
    }
  }
}
