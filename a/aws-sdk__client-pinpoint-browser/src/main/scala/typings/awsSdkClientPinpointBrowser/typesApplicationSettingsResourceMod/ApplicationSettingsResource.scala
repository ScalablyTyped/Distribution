package typings.awsSdkClientPinpointBrowser.typesApplicationSettingsResourceMod

import typings.awsSdkClientPinpointBrowser.typesCampaignHookMod.CampaignHook
import typings.awsSdkClientPinpointBrowser.typesCampaignLimitsMod.CampaignLimits
import typings.awsSdkClientPinpointBrowser.typesQuietTimeMod.QuietTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationSettingsResource extends js.Object {
  /**
    * The unique ID for the application.
    */
  var ApplicationId: js.UndefOr[String] = js.undefined
  /**
    * Default campaign hook.
    */
  var CampaignHook: js.UndefOr[typings.awsSdkClientPinpointBrowser.typesCampaignHookMod.CampaignHook] = js.undefined
  /**
    * The date that the settings were last updated in ISO 8601 format.
    */
  var LastModifiedDate: js.UndefOr[String] = js.undefined
  /**
    * The default campaign limits for the app. These limits apply to each campaign for the app, unless the campaign overrides the default with limits of its own.
    */
  var Limits: js.UndefOr[CampaignLimits] = js.undefined
  /**
    * The default quiet time for the app. Each campaign for this app sends no messages during this time unless the campaign overrides the default with a quiet time of its own.
    */
  var QuietTime: js.UndefOr[typings.awsSdkClientPinpointBrowser.typesQuietTimeMod.QuietTime] = js.undefined
}

object ApplicationSettingsResource {
  @scala.inline
  def apply(
    ApplicationId: String = null,
    CampaignHook: CampaignHook = null,
    LastModifiedDate: String = null,
    Limits: CampaignLimits = null,
    QuietTime: QuietTime = null
  ): ApplicationSettingsResource = {
    val __obj = js.Dynamic.literal()
    if (ApplicationId != null) __obj.updateDynamic("ApplicationId")(ApplicationId.asInstanceOf[js.Any])
    if (CampaignHook != null) __obj.updateDynamic("CampaignHook")(CampaignHook.asInstanceOf[js.Any])
    if (LastModifiedDate != null) __obj.updateDynamic("LastModifiedDate")(LastModifiedDate.asInstanceOf[js.Any])
    if (Limits != null) __obj.updateDynamic("Limits")(Limits.asInstanceOf[js.Any])
    if (QuietTime != null) __obj.updateDynamic("QuietTime")(QuietTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationSettingsResource]
  }
}

