package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreApplicationSettingsResourceMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreCampaignHookMod._UnmarshalledCampaignHook
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreCampaignLimitsMod._UnmarshalledCampaignLimits
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreQuietTimeMod._UnmarshalledQuietTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledApplicationSettingsResource extends _ApplicationSettingsResource {
  /**
    * Default campaign hook.
    */
  @JSName("CampaignHook")
  var CampaignHook__UnmarshalledApplicationSettingsResource: js.UndefOr[_UnmarshalledCampaignHook] = js.undefined
  /**
    * The default campaign limits for the app. These limits apply to each campaign for the app, unless the campaign overrides the default with limits of its own.
    */
  @JSName("Limits")
  var Limits__UnmarshalledApplicationSettingsResource: js.UndefOr[_UnmarshalledCampaignLimits] = js.undefined
  /**
    * The default quiet time for the app. Each campaign for this app sends no messages during this time unless the campaign overrides the default with a quiet time of its own.
    */
  @JSName("QuietTime")
  var QuietTime__UnmarshalledApplicationSettingsResource: js.UndefOr[_UnmarshalledQuietTime] = js.undefined
}

object _UnmarshalledApplicationSettingsResource {
  @scala.inline
  def apply(
    ApplicationId: String = null,
    CampaignHook: _UnmarshalledCampaignHook = null,
    LastModifiedDate: String = null,
    Limits: _UnmarshalledCampaignLimits = null,
    QuietTime: _UnmarshalledQuietTime = null
  ): _UnmarshalledApplicationSettingsResource = {
    val __obj = js.Dynamic.literal()
    if (ApplicationId != null) __obj.updateDynamic("ApplicationId")(ApplicationId.asInstanceOf[js.Any])
    if (CampaignHook != null) __obj.updateDynamic("CampaignHook")(CampaignHook.asInstanceOf[js.Any])
    if (LastModifiedDate != null) __obj.updateDynamic("LastModifiedDate")(LastModifiedDate.asInstanceOf[js.Any])
    if (Limits != null) __obj.updateDynamic("Limits")(Limits.asInstanceOf[js.Any])
    if (QuietTime != null) __obj.updateDynamic("QuietTime")(QuietTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledApplicationSettingsResource]
  }
}

