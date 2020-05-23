package typings.awsSdkClientPinpointBrowser.typesWriteApplicationSettingsRequestMod

import typings.awsSdkClientPinpointBrowser.typesCampaignHookMod.CampaignHook
import typings.awsSdkClientPinpointBrowser.typesCampaignLimitsMod.CampaignLimits
import typings.awsSdkClientPinpointBrowser.typesQuietTimeMod.QuietTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteApplicationSettingsRequest extends js.Object {
  /**
    * Default campaign hook information.
    */
  var CampaignHook: js.UndefOr[typings.awsSdkClientPinpointBrowser.typesCampaignHookMod.CampaignHook] = js.undefined
  /**
    * The CloudWatchMetrics settings for the app.
    */
  var CloudWatchMetricsEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The limits that apply to each campaign in the project by default. Campaigns can also have their own limits, which override the settings at the project level.
    */
  var Limits: js.UndefOr[CampaignLimits] = js.undefined
  /**
    * The default quiet time for the app. Each campaign for this app sends no messages during this time unless the campaign overrides the default with a quiet time of its own.
    */
  var QuietTime: js.UndefOr[typings.awsSdkClientPinpointBrowser.typesQuietTimeMod.QuietTime] = js.undefined
}

object WriteApplicationSettingsRequest {
  @scala.inline
  def apply(
    CampaignHook: CampaignHook = null,
    CloudWatchMetricsEnabled: js.UndefOr[Boolean] = js.undefined,
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

