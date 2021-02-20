package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.DELIVERY
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.FILTER
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCampaignHookMod {
  
  @js.native
  trait CampaignHook extends StObject {
    
    /**
      * Lambda function name or arn to be called for delivery
      */
    var LambdaFunctionName: js.UndefOr[String] = js.native
    
    /**
      * What mode Lambda should be invoked in.
      */
    var Mode: js.UndefOr[DELIVERY | FILTER | String] = js.native
    
    /**
      * Web URL to call for hook. If the URL has authentication specified it will be added as authentication to the request
      */
    var WebUrl: js.UndefOr[String] = js.native
  }
  object CampaignHook {
    
    @scala.inline
    def apply(): CampaignHook = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CampaignHook]
    }
    
    @scala.inline
    implicit class CampaignHookMutableBuilder[Self <: CampaignHook] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLambdaFunctionName(value: String): Self = StObject.set(x, "LambdaFunctionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLambdaFunctionNameUndefined: Self = StObject.set(x, "LambdaFunctionName", js.undefined)
      
      @scala.inline
      def setMode(value: DELIVERY | FILTER | String): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "Mode", js.undefined)
      
      @scala.inline
      def setWebUrl(value: String): Self = StObject.set(x, "WebUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebUrlUndefined: Self = StObject.set(x, "WebUrl", js.undefined)
    }
  }
  
  type UnmarshalledCampaignHook = CampaignHook
}
