package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.typesCampaignResponseMod.UnmarshalledCampaignResponse
import typings.awsSdkClientPinpointBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDeleteCampaignOutputMod {
  
  trait DeleteCampaignOutput
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
  object DeleteCampaignOutput {
    
    inline def apply($metadata: ResponseMetadata, CampaignResponse: UnmarshalledCampaignResponse): DeleteCampaignOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], CampaignResponse = CampaignResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteCampaignOutput]
    }
    
    extension [Self <: DeleteCampaignOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setCampaignResponse(value: UnmarshalledCampaignResponse): Self = StObject.set(x, "CampaignResponse", value.asInstanceOf[js.Any])
    }
  }
}
