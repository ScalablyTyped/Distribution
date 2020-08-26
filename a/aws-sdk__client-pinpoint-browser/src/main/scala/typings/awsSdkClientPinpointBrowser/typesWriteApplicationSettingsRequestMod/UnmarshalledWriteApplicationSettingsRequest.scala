package typings.awsSdkClientPinpointBrowser.typesWriteApplicationSettingsRequestMod

import typings.awsSdkClientPinpointBrowser.typesCampaignHookMod.UnmarshalledCampaignHook
import typings.awsSdkClientPinpointBrowser.typesCampaignLimitsMod.UnmarshalledCampaignLimits
import typings.awsSdkClientPinpointBrowser.typesQuietTimeMod.UnmarshalledQuietTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledWriteApplicationSettingsRequest extends WriteApplicationSettingsRequest {
  /**
    * Default campaign hook information.
    */
  @JSName("CampaignHook")
  var CampaignHook_UnmarshalledWriteApplicationSettingsRequest: js.UndefOr[UnmarshalledCampaignHook] = js.native
  /**
    * The limits that apply to each campaign in the project by default. Campaigns can also have their own limits, which override the settings at the project level.
    */
  @JSName("Limits")
  var Limits_UnmarshalledWriteApplicationSettingsRequest: js.UndefOr[UnmarshalledCampaignLimits] = js.native
  /**
    * The default quiet time for the app. Each campaign for this app sends no messages during this time unless the campaign overrides the default with a quiet time of its own.
    */
  @JSName("QuietTime")
  var QuietTime_UnmarshalledWriteApplicationSettingsRequest: js.UndefOr[UnmarshalledQuietTime] = js.native
}

object UnmarshalledWriteApplicationSettingsRequest {
  @scala.inline
  def apply(): UnmarshalledWriteApplicationSettingsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledWriteApplicationSettingsRequest]
  }
  @scala.inline
  implicit class UnmarshalledWriteApplicationSettingsRequestOps[Self <: UnmarshalledWriteApplicationSettingsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCampaignHook(value: UnmarshalledCampaignHook): Self = this.set("CampaignHook", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCampaignHook: Self = this.set("CampaignHook", js.undefined)
    @scala.inline
    def setLimits(value: UnmarshalledCampaignLimits): Self = this.set("Limits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimits: Self = this.set("Limits", js.undefined)
    @scala.inline
    def setQuietTime(value: UnmarshalledQuietTime): Self = this.set("QuietTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuietTime: Self = this.set("QuietTime", js.undefined)
  }
  
}

