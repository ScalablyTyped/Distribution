package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(LambdaFunctionName: string = null, Mode: Mode = null, WebUrl: string = null): CampaignHook = {
    val __obj = js.Dynamic.literal()
    if (LambdaFunctionName != null) __obj.updateDynamic("LambdaFunctionName")(LambdaFunctionName.asInstanceOf[js.Any])
    if (Mode != null) __obj.updateDynamic("Mode")(Mode.asInstanceOf[js.Any])
    if (WebUrl != null) __obj.updateDynamic("WebUrl")(WebUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[CampaignHook]
  }
}

