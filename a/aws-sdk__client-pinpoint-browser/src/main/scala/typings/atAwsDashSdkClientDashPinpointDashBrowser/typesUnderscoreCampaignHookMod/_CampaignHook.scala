package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreCampaignHookMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.DELIVERY
import typings.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.FILTER
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _CampaignHook extends js.Object {
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

object _CampaignHook {
  @scala.inline
  def apply(LambdaFunctionName: String = null, Mode: DELIVERY | FILTER | String = null, WebUrl: String = null): _CampaignHook = {
    val __obj = js.Dynamic.literal()
    if (LambdaFunctionName != null) __obj.updateDynamic("LambdaFunctionName")(LambdaFunctionName.asInstanceOf[js.Any])
    if (Mode != null) __obj.updateDynamic("Mode")(Mode.asInstanceOf[js.Any])
    if (WebUrl != null) __obj.updateDynamic("WebUrl")(WebUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[_CampaignHook]
  }
}

