package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationSettingsResource extends js.Object {
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string = js.native
  /**
    * The settings for the AWS Lambda function to invoke by default as a code hook for campaigns in the application. You can use this hook to customize segments that are used by campaigns in the application.
    */
  var CampaignHook: js.UndefOr[typings.awsSdk.pinpointMod.CampaignHook] = js.native
  /**
    * The date and time, in ISO 8601 format, when the application's settings were last modified.
    */
  var LastModifiedDate: js.UndefOr[string] = js.native
  /**
    * The default sending limits for campaigns and journeys in the application.
    */
  var Limits: js.UndefOr[CampaignLimits] = js.native
  /**
    * The default quiet time for campaigns and journeys in the application. Quiet time is a specific time range when messages aren't sent to endpoints, if all the following conditions are met: The EndpointDemographic.Timezone property of the endpoint is set to a valid value. The current time in the endpoint's time zone is later than or equal to the time specified by the QuietTime.Start property for the application (or a campaign or journey that has custom quiet time settings). The current time in the endpoint's time zone is earlier than or equal to the time specified by the QuietTime.End property for the application (or a campaign or journey that has custom quiet time settings). If any of the preceding conditions isn't met, the endpoint will receive messages from a campaign or journey, even if quiet time is enabled.
    */
  var QuietTime: js.UndefOr[typings.awsSdk.pinpointMod.QuietTime] = js.native
}

object ApplicationSettingsResource {
  @scala.inline
  def apply(
    ApplicationId: string,
    CampaignHook: CampaignHook = null,
    LastModifiedDate: string = null,
    Limits: CampaignLimits = null,
    QuietTime: QuietTime = null
  ): ApplicationSettingsResource = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
    if (CampaignHook != null) __obj.updateDynamic("CampaignHook")(CampaignHook.asInstanceOf[js.Any])
    if (LastModifiedDate != null) __obj.updateDynamic("LastModifiedDate")(LastModifiedDate.asInstanceOf[js.Any])
    if (Limits != null) __obj.updateDynamic("Limits")(Limits.asInstanceOf[js.Any])
    if (QuietTime != null) __obj.updateDynamic("QuietTime")(QuietTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationSettingsResource]
  }
}

