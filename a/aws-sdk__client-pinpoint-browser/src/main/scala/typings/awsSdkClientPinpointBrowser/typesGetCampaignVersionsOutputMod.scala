package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.typesCampaignsResponseMod.UnmarshalledCampaignsResponse
import typings.awsSdkClientPinpointBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetCampaignVersionsOutputMod {
  
  trait GetCampaignVersionsOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * List of available campaigns.
      */
    var CampaignsResponse: UnmarshalledCampaignsResponse
  }
  object GetCampaignVersionsOutput {
    
    inline def apply($metadata: ResponseMetadata, CampaignsResponse: UnmarshalledCampaignsResponse): GetCampaignVersionsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], CampaignsResponse = CampaignsResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetCampaignVersionsOutput]
    }
    
    extension [Self <: GetCampaignVersionsOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setCampaignsResponse(value: UnmarshalledCampaignsResponse): Self = StObject.set(x, "CampaignsResponse", value.asInstanceOf[js.Any])
    }
  }
}
