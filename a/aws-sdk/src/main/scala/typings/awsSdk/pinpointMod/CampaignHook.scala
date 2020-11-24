package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CampaignHook extends js.Object {
  
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
  implicit class CampaignHookOps[Self <: CampaignHook] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLambdaFunctionName(value: string): Self = this.set("LambdaFunctionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLambdaFunctionName: Self = this.set("LambdaFunctionName", js.undefined)
    
    @scala.inline
    def setMode(value: Mode): Self = this.set("Mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("Mode", js.undefined)
    
    @scala.inline
    def setWebUrl(value: string): Self = this.set("WebUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebUrl: Self = this.set("WebUrl", js.undefined)
  }
}
