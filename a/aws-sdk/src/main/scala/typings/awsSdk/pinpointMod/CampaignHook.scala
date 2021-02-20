package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CampaignHook extends StObject {
  
  /**
    * The name or Amazon Resource Name (ARN) of the AWS Lambda function that Amazon Pinpoint invokes to customize a segment for a campaign.
    */
  var LambdaFunctionName: js.UndefOr[string] = js.native
  
  /**
    * The mode that Amazon Pinpoint uses to invoke the AWS Lambda function. Possible values are: FILTER - Invoke the function to customize the segment that's used by a campaign. DELIVERY - (Deprecated) Previously, invoked the function to send a campaign through a custom channel. This functionality is not supported anymore. To send a campaign through a custom channel, use the CustomDeliveryConfiguration and CampaignCustomMessage objects of the campaign.
    */
  var Mode: js.UndefOr[typings.awsSdk.pinpointMod.Mode] = js.native
  
  /**
    *  The web URL that Amazon Pinpoint calls to invoke the AWS Lambda function over HTTPS.
    */
  var WebUrl: js.UndefOr[string] = js.native
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
    def setLambdaFunctionName(value: string): Self = StObject.set(x, "LambdaFunctionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLambdaFunctionNameUndefined: Self = StObject.set(x, "LambdaFunctionName", js.undefined)
    
    @scala.inline
    def setMode(value: Mode): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "Mode", js.undefined)
    
    @scala.inline
    def setWebUrl(value: string): Self = StObject.set(x, "WebUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebUrlUndefined: Self = StObject.set(x, "WebUrl", js.undefined)
  }
}
