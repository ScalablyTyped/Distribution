package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreWriteApplicationSettingsRequestMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreCampaignHookMod._CampaignHook
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreCampaignLimitsMod._CampaignLimits
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreQuietTimeMod._QuietTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _WriteApplicationSettingsRequest extends js.Object {
  /**
    * Default campaign hook information.
    */
  var CampaignHook: js.UndefOr[_CampaignHook] = js.undefined
  /**
    * The CloudWatchMetrics settings for the app.
    */
  var CloudWatchMetricsEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The limits that apply to each campaign in the project by default. Campaigns can also have their own limits, which override the settings at the project level.
    */
  var Limits: js.UndefOr[_CampaignLimits] = js.undefined
  /**
    * The default quiet time for the app. Each campaign for this app sends no messages during this time unless the campaign overrides the default with a quiet time of its own.
    */
  var QuietTime: js.UndefOr[_QuietTime] = js.undefined
}

object _WriteApplicationSettingsRequest {
  @scala.inline
  def apply(
    CampaignHook: _CampaignHook = null,
    CloudWatchMetricsEnabled: js.UndefOr[Boolean] = js.undefined,
    Limits: _CampaignLimits = null,
    QuietTime: _QuietTime = null
  ): _WriteApplicationSettingsRequest = {
    val __obj = js.Dynamic.literal()
    if (CampaignHook != null) __obj.updateDynamic("CampaignHook")(CampaignHook.asInstanceOf[js.Any])
    if (!js.isUndefined(CloudWatchMetricsEnabled)) __obj.updateDynamic("CloudWatchMetricsEnabled")(CloudWatchMetricsEnabled.asInstanceOf[js.Any])
    if (Limits != null) __obj.updateDynamic("Limits")(Limits.asInstanceOf[js.Any])
    if (QuietTime != null) __obj.updateDynamic("QuietTime")(QuietTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[_WriteApplicationSettingsRequest]
  }
}

