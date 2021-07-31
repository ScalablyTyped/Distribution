package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesImportJobsResponseMod.UnmarshalledImportJobsResponse
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetSegmentImportJobsOutputMod {
  
  trait GetSegmentImportJobsOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * Import job list.
      */
    var ImportJobsResponse: UnmarshalledImportJobsResponse
  }
  object GetSegmentImportJobsOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata, ImportJobsResponse: UnmarshalledImportJobsResponse): GetSegmentImportJobsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ImportJobsResponse = ImportJobsResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetSegmentImportJobsOutput]
    }
    
    @scala.inline
    implicit class GetSegmentImportJobsOutputMutableBuilder[Self <: GetSegmentImportJobsOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImportJobsResponse(value: UnmarshalledImportJobsResponse): Self = StObject.set(x, "ImportJobsResponse", value.asInstanceOf[js.Any])
    }
  }
}
