package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesCampaignResponseMod.UnmarshalledCampaignResponse
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUpdateCampaignOutputMod {
  
  trait UpdateCampaignOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * Campaign definition
      */
    var CampaignResponse: UnmarshalledCampaignResponse
  }
  object UpdateCampaignOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata, CampaignResponse: UnmarshalledCampaignResponse): UpdateCampaignOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], CampaignResponse = CampaignResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateCampaignOutput]
    }
    
    @scala.inline
    implicit class UpdateCampaignOutputMutableBuilder[Self <: UpdateCampaignOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCampaignResponse(value: UnmarshalledCampaignResponse): Self = StObject.set(x, "CampaignResponse", value.asInstanceOf[js.Any])
    }
  }
}
