package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.typesCampaignResponseMod.CampaignResponse
import typings.awsSdkClientPinpointBrowser.typesCampaignResponseMod.UnmarshalledCampaignResponse
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCampaignsResponseMod {
  
  trait CampaignsResponse extends StObject {
    
    /**
      * A list of campaigns.
      */
    var Item: js.UndefOr[js.Array[CampaignResponse] | Iterable[CampaignResponse]] = js.undefined
    
    /**
      * The string that you use in a subsequent request to get the next page of results in a paginated response.
      */
    var NextToken: js.UndefOr[String] = js.undefined
  }
  object CampaignsResponse {
    
    @scala.inline
    def apply(): CampaignsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CampaignsResponse]
    }
    
    @scala.inline
    implicit class CampaignsResponseMutableBuilder[Self <: CampaignsResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItem(value: js.Array[CampaignResponse] | Iterable[CampaignResponse]): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemUndefined: Self = StObject.set(x, "Item", js.undefined)
      
      @scala.inline
      def setItemVarargs(value: CampaignResponse*): Self = StObject.set(x, "Item", js.Array(value :_*))
      
      @scala.inline
      def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
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
    
    @scala.inline
    def apply(): UnmarshalledCampaignsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledCampaignsResponse]
    }
    
    @scala.inline
    implicit class UnmarshalledCampaignsResponseMutableBuilder[Self <: UnmarshalledCampaignsResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItem(value: js.Array[UnmarshalledCampaignResponse]): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemUndefined: Self = StObject.set(x, "Item", js.undefined)
      
      @scala.inline
      def setItemVarargs(value: UnmarshalledCampaignResponse*): Self = StObject.set(x, "Item", js.Array(value :_*))
    }
  }
}
