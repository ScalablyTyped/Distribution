package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreApplicationSettingsResourceMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreCampaignHookMod._CampaignHook
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreCampaignLimitsMod._CampaignLimits
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreQuietTimeMod._QuietTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ApplicationSettingsResource extends js.Object {
  /**
    * The unique ID for the application.
    */
  var ApplicationId: js.UndefOr[String] = js.undefined
  /**
    * Default campaign hook.
    */
  var CampaignHook: js.UndefOr[_CampaignHook] = js.undefined
  /**
    * The date that the settings were last updated in ISO 8601 format.
    */
  var LastModifiedDate: js.UndefOr[String] = js.undefined
  /**
    * The default campaign limits for the app. These limits apply to each campaign for the app, unless the campaign overrides the default with limits of its own.
    */
  var Limits: js.UndefOr[_CampaignLimits] = js.undefined
  /**
    * The default quiet time for the app. Each campaign for this app sends no messages during this time unless the campaign overrides the default with a quiet time of its own.
    */
  var QuietTime: js.UndefOr[_QuietTime] = js.undefined
}

object _ApplicationSettingsResource {
  @scala.inline
  def apply(
    ApplicationId: String = null,
    CampaignHook: _CampaignHook = null,
    LastModifiedDate: String = null,
    Limits: _CampaignLimits = null,
    QuietTime: _QuietTime = null
  ): _ApplicationSettingsResource = {
    val __obj = js.Dynamic.literal()
    if (ApplicationId != null) __obj.updateDynamic("ApplicationId")(ApplicationId.asInstanceOf[js.Any])
    if (CampaignHook != null) __obj.updateDynamic("CampaignHook")(CampaignHook.asInstanceOf[js.Any])
    if (LastModifiedDate != null) __obj.updateDynamic("LastModifiedDate")(LastModifiedDate.asInstanceOf[js.Any])
    if (Limits != null) __obj.updateDynamic("Limits")(Limits.asInstanceOf[js.Any])
    if (QuietTime != null) __obj.updateDynamic("QuietTime")(QuietTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ApplicationSettingsResource]
  }
}

