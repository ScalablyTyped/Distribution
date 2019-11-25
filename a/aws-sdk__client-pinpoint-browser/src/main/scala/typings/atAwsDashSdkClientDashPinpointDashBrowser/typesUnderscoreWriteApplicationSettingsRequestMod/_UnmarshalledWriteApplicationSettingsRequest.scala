package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreWriteApplicationSettingsRequestMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreCampaignHookMod._UnmarshalledCampaignHook
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreCampaignLimitsMod._UnmarshalledCampaignLimits
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreQuietTimeMod._UnmarshalledQuietTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledWriteApplicationSettingsRequest extends _WriteApplicationSettingsRequest {
  /**
    * Default campaign hook information.
    */
  @JSName("CampaignHook")
  var CampaignHook__UnmarshalledWriteApplicationSettingsRequest: js.UndefOr[_UnmarshalledCampaignHook] = js.undefined
  /**
    * The limits that apply to each campaign in the project by default. Campaigns can also have their own limits, which override the settings at the project level.
    */
  @JSName("Limits")
  var Limits__UnmarshalledWriteApplicationSettingsRequest: js.UndefOr[_UnmarshalledCampaignLimits] = js.undefined
  /**
    * The default quiet time for the app. Each campaign for this app sends no messages during this time unless the campaign overrides the default with a quiet time of its own.
    */
  @JSName("QuietTime")
  var QuietTime__UnmarshalledWriteApplicationSettingsRequest: js.UndefOr[_UnmarshalledQuietTime] = js.undefined
}

object _UnmarshalledWriteApplicationSettingsRequest {
  @scala.inline
  def apply(
    CampaignHook: _UnmarshalledCampaignHook = null,
    CloudWatchMetricsEnabled: js.UndefOr[Boolean] = js.undefined,
    Limits: _UnmarshalledCampaignLimits = null,
    QuietTime: _UnmarshalledQuietTime = null
  ): _UnmarshalledWriteApplicationSettingsRequest = {
    val __obj = js.Dynamic.literal()
    if (CampaignHook != null) __obj.updateDynamic("CampaignHook")(CampaignHook.asInstanceOf[js.Any])
    if (!js.isUndefined(CloudWatchMetricsEnabled)) __obj.updateDynamic("CloudWatchMetricsEnabled")(CloudWatchMetricsEnabled.asInstanceOf[js.Any])
    if (Limits != null) __obj.updateDynamic("Limits")(Limits.asInstanceOf[js.Any])
    if (QuietTime != null) __obj.updateDynamic("QuietTime")(QuietTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledWriteApplicationSettingsRequest]
  }
}

