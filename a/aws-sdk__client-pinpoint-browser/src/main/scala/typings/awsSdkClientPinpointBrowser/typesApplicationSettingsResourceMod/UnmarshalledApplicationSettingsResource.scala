package typings.awsSdkClientPinpointBrowser.typesApplicationSettingsResourceMod

import typings.awsSdkClientPinpointBrowser.typesCampaignHookMod.UnmarshalledCampaignHook
import typings.awsSdkClientPinpointBrowser.typesCampaignLimitsMod.UnmarshalledCampaignLimits
import typings.awsSdkClientPinpointBrowser.typesQuietTimeMod.UnmarshalledQuietTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledApplicationSettingsResource extends ApplicationSettingsResource {
  /**
    * Default campaign hook.
    */
  @JSName("CampaignHook")
  var CampaignHook_UnmarshalledApplicationSettingsResource: js.UndefOr[UnmarshalledCampaignHook] = js.undefined
  /**
    * The default campaign limits for the app. These limits apply to each campaign for the app, unless the campaign overrides the default with limits of its own.
    */
  @JSName("Limits")
  var Limits_UnmarshalledApplicationSettingsResource: js.UndefOr[UnmarshalledCampaignLimits] = js.undefined
  /**
    * The default quiet time for the app. Each campaign for this app sends no messages during this time unless the campaign overrides the default with a quiet time of its own.
    */
  @JSName("QuietTime")
  var QuietTime_UnmarshalledApplicationSettingsResource: js.UndefOr[UnmarshalledQuietTime] = js.undefined
}

object UnmarshalledApplicationSettingsResource {
  @scala.inline
  def apply(
    ApplicationId: String = null,
    CampaignHook: UnmarshalledCampaignHook = null,
    LastModifiedDate: String = null,
    Limits: UnmarshalledCampaignLimits = null,
    QuietTime: UnmarshalledQuietTime = null
  ): UnmarshalledApplicationSettingsResource = {
    val __obj = js.Dynamic.literal()
    if (ApplicationId != null) __obj.updateDynamic("ApplicationId")(ApplicationId.asInstanceOf[js.Any])
    if (CampaignHook != null) __obj.updateDynamic("CampaignHook")(CampaignHook.asInstanceOf[js.Any])
    if (LastModifiedDate != null) __obj.updateDynamic("LastModifiedDate")(LastModifiedDate.asInstanceOf[js.Any])
    if (Limits != null) __obj.updateDynamic("Limits")(Limits.asInstanceOf[js.Any])
    if (QuietTime != null) __obj.updateDynamic("QuietTime")(QuietTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledApplicationSettingsResource]
  }
}

