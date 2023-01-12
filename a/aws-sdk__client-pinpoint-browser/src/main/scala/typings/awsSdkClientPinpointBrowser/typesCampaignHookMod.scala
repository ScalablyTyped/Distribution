package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.DELIVERY
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.FILTER
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCampaignHookMod {
  
  trait CampaignHook extends StObject {
    
    /**
      * Lambda function name or arn to be called for delivery
      */
    var LambdaFunctionName: js.UndefOr[String] = js.undefined
    
    /**
      * What mode Lambda should be invoked in.
      */
    var Mode: js.UndefOr[DELIVERY | FILTER | String] = js.undefined
    
    /**
      * Web URL to call for hook. If the URL has authentication specified it will be added as authentication to the request
      */
    var WebUrl: js.UndefOr[String] = js.undefined
  }
  object CampaignHook {
    
    inline def apply(): CampaignHook = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CampaignHook]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CampaignHook] (val x: Self) extends AnyVal {
      
      inline def setLambdaFunctionName(value: String): Self = StObject.set(x, "LambdaFunctionName", value.asInstanceOf[js.Any])
      
      inline def setLambdaFunctionNameUndefined: Self = StObject.set(x, "LambdaFunctionName", js.undefined)
      
      inline def setMode(value: DELIVERY | FILTER | String): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "Mode", js.undefined)
      
      inline def setWebUrl(value: String): Self = StObject.set(x, "WebUrl", value.asInstanceOf[js.Any])
      
      inline def setWebUrlUndefined: Self = StObject.set(x, "WebUrl", js.undefined)
    }
  }
  
  type UnmarshalledCampaignHook = CampaignHook
}
