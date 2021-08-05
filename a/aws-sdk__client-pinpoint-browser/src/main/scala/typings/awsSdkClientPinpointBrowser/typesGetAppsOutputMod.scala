package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesApplicationsResponseMod.UnmarshalledApplicationsResponse
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetAppsOutputMod {
  
  trait GetAppsOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * Get Applications Result.
      */
    var ApplicationsResponse: UnmarshalledApplicationsResponse
  }
  object GetAppsOutput {
    
    inline def apply($metadata: ResponseMetadata, ApplicationsResponse: UnmarshalledApplicationsResponse): GetAppsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ApplicationsResponse = ApplicationsResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetAppsOutput]
    }
    
    extension [Self <: GetAppsOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setApplicationsResponse(value: UnmarshalledApplicationsResponse): Self = StObject.set(x, "ApplicationsResponse", value.asInstanceOf[js.Any])
    }
  }
}
