package typings.awsSdkClientPinpointBrowser.typesApplicationSettingsResourceMod

import typings.awsSdkClientPinpointBrowser.typesCampaignHookMod.CampaignHook
import typings.awsSdkClientPinpointBrowser.typesCampaignLimitsMod.CampaignLimits
import typings.awsSdkClientPinpointBrowser.typesQuietTimeMod.QuietTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationSettingsResource extends js.Object {
  /**
    * The unique ID for the application.
    */
  var ApplicationId: js.UndefOr[String] = js.native
  /**
    * Default campaign hook.
    */
  var CampaignHook: js.UndefOr[typings.awsSdkClientPinpointBrowser.typesCampaignHookMod.CampaignHook] = js.native
  /**
    * The date that the settings were last updated in ISO 8601 format.
    */
  var LastModifiedDate: js.UndefOr[String] = js.native
  /**
    * The default campaign limits for the app. These limits apply to each campaign for the app, unless the campaign overrides the default with limits of its own.
    */
  var Limits: js.UndefOr[CampaignLimits] = js.native
  /**
    * The default quiet time for the app. Each campaign for this app sends no messages during this time unless the campaign overrides the default with a quiet time of its own.
    */
  var QuietTime: js.UndefOr[typings.awsSdkClientPinpointBrowser.typesQuietTimeMod.QuietTime] = js.native
}

object ApplicationSettingsResource {
  @scala.inline
  def apply(): ApplicationSettingsResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationSettingsResource]
  }
  @scala.inline
  implicit class ApplicationSettingsResourceOps[Self <: ApplicationSettingsResource] (val x: Self) extends AnyVal {
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
    def setApplicationId(value: String): Self = this.set("ApplicationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplicationId: Self = this.set("ApplicationId", js.undefined)
    @scala.inline
    def setCampaignHook(value: CampaignHook): Self = this.set("CampaignHook", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCampaignHook: Self = this.set("CampaignHook", js.undefined)
    @scala.inline
    def setLastModifiedDate(value: String): Self = this.set("LastModifiedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedDate: Self = this.set("LastModifiedDate", js.undefined)
    @scala.inline
    def setLimits(value: CampaignLimits): Self = this.set("Limits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimits: Self = this.set("Limits", js.undefined)
    @scala.inline
    def setQuietTime(value: QuietTime): Self = this.set("QuietTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuietTime: Self = this.set("QuietTime", js.undefined)
  }
  
}

