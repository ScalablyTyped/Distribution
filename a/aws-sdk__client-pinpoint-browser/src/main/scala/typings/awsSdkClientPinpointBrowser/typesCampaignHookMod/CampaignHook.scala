package typings.awsSdkClientPinpointBrowser.typesCampaignHookMod

import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.DELIVERY
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.FILTER
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CampaignHook extends js.Object {
  
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
    def setLambdaFunctionName(value: String): Self = this.set("LambdaFunctionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLambdaFunctionName: Self = this.set("LambdaFunctionName", js.undefined)
    
    @scala.inline
    def setMode(value: DELIVERY | FILTER | String): Self = this.set("Mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("Mode", js.undefined)
    
    @scala.inline
    def setWebUrl(value: String): Self = this.set("WebUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebUrl: Self = this.set("WebUrl", js.undefined)
  }
}
