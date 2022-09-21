package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.typesCampaignResponseMod.CampaignResponse
import typings.awsSdkClientPinpointBrowser.typesCampaignResponseMod.UnmarshalledCampaignResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCampaignsResponseMod {
  
  trait CampaignsResponse extends StObject {
    
    /**
      * A list of campaigns.
      */
    var Item: js.UndefOr[js.Array[CampaignResponse] | js.Iterable[CampaignResponse]] = js.undefined
    
    /**
      * The string that you use in a subsequent request to get the next page of results in a paginated response.
      */
    var NextToken: js.UndefOr[String] = js.undefined
  }
  object CampaignsResponse {
    
    inline def apply(): CampaignsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CampaignsResponse]
    }
    
    extension [Self <: CampaignsResponse](x: Self) {
      
      inline def setItem(value: js.Array[CampaignResponse] | js.Iterable[CampaignResponse]): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
      
      inline def setItemUndefined: Self = StObject.set(x, "Item", js.undefined)
      
      inline def setItemVarargs(value: CampaignResponse*): Self = StObject.set(x, "Item", js.Array(value*))
      
      inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    }
  }
  
  trait UnmarshalledCampaignsResponse
    extends StObject
       with CampaignsResponse {
    
    /**
      * A list of campaigns.
      */
    @JSName("Item")
    var Item_UnmarshalledCampaignsResponse: js.UndefOr[js.Array[UnmarshalledCampaignResponse]] = js.undefined
  }
  object UnmarshalledCampaignsResponse {
    
    inline def apply(): UnmarshalledCampaignsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledCampaignsResponse]
    }
    
    extension [Self <: UnmarshalledCampaignsResponse](x: Self) {
      
      inline def setItem(value: js.Array[UnmarshalledCampaignResponse]): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
      
      inline def setItemUndefined: Self = StObject.set(x, "Item", js.undefined)
      
      inline def setItemVarargs(value: UnmarshalledCampaignResponse*): Self = StObject.set(x, "Item", js.Array(value*))
    }
  }
}
