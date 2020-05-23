package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WriteApplicationSettingsRequest extends js.Object {
  /**
    * The settings for the AWS Lambda function to invoke by default as a code hook for campaigns in the application. You can use this hook to customize segments that are used by campaigns in the application. To override these settings and define custom settings for a specific campaign, use the CampaignHook object of the Campaign resource.
    */
  var CampaignHook: js.UndefOr[typings.awsSdk.pinpointMod.CampaignHook] = js.native
  /**
    * Specifies whether to enable application-related alarms in Amazon CloudWatch.
    */
  var CloudWatchMetricsEnabled: js.UndefOr[boolean] = js.native
  /**
    * The default sending limits for campaigns and journeys in the application. To override these limits and define custom limits for a specific campaign or journey, use the Campaign resource or the Journey resource, respectively.
    */
  var Limits: js.UndefOr[CampaignLimits] = js.native
  /**
    * The default quiet time for campaigns and journeys in the application. Quiet time is a specific time range when messages aren't sent to endpoints, if all the following conditions are met: The EndpointDemographic.Timezone property of the endpoint is set to a valid value. The current time in the endpoint's time zone is later than or equal to the time specified by the QuietTime.Start property for the application (or a campaign or journey that has custom quiet time settings). The current time in the endpoint's time zone is earlier than or equal to the time specified by the QuietTime.End property for the application (or a campaign or journey that has custom quiet time settings). If any of the preceding conditions isn't met, the endpoint will receive messages from a campaign or journey, even if quiet time is enabled. To override the default quiet time settings for a specific campaign or journey, use the Campaign resource or the Journey resource to define a custom quiet time for the campaign or journey.
    */
  var QuietTime: js.UndefOr[typings.awsSdk.pinpointMod.QuietTime] = js.native
}

object WriteApplicationSettingsRequest {
  @scala.inline
  def apply(
    CampaignHook: CampaignHook = null,
    CloudWatchMetricsEnabled: js.UndefOr[boolean] = js.undefined,
    Limits: CampaignLimits = null,
    QuietTime: QuietTime = null
  ): WriteApplicationSettingsRequest = {
    val __obj = js.Dynamic.literal()
    if (CampaignHook != null) __obj.updateDynamic("CampaignHook")(CampaignHook.asInstanceOf[js.Any])
    if (!js.isUndefined(CloudWatchMetricsEnabled)) __obj.updateDynamic("CloudWatchMetricsEnabled")(CloudWatchMetricsEnabled.get.asInstanceOf[js.Any])
    if (Limits != null) __obj.updateDynamic("Limits")(Limits.asInstanceOf[js.Any])
    if (QuietTime != null) __obj.updateDynamic("QuietTime")(QuietTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteApplicationSettingsRequest]
  }
}

