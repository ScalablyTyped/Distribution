package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesExportJobsResponseMod.UnmarshalledExportJobsResponse
import typings.awsSdkTypes.responseMod.ResponseMetadata
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
    
    @scala.inline
    def apply($metadata: ResponseMetadata, ExportJobsResponse: UnmarshalledExportJobsResponse): GetExportJobsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ExportJobsResponse = ExportJobsResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetExportJobsOutput]
    }
    
    @scala.inline
    implicit class GetExportJobsOutputMutableBuilder[Self <: GetExportJobsOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExportJobsResponse(value: UnmarshalledExportJobsResponse): Self = StObject.set(x, "ExportJobsResponse", value.asInstanceOf[js.Any])
    }
  }
}
