package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesCampaignsResponseMod.UnmarshalledCampaignsResponse
import typings.awsSdkTypes.responseMod.ResponseMetadata
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
    
    @scala.inline
    def apply($metadata: ResponseMetadata, CampaignsResponse: UnmarshalledCampaignsResponse): GetCampaignVersionsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], CampaignsResponse = CampaignsResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetCampaignVersionsOutput]
    }
    
    @scala.inline
    implicit class GetCampaignVersionsOutputMutableBuilder[Self <: GetCampaignVersionsOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCampaignsResponse(value: UnmarshalledCampaignsResponse): Self = StObject.set(x, "CampaignsResponse", value.asInstanceOf[js.Any])
    }
  }
}
