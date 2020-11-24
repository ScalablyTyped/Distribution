package typings.awsSdkClientPinpointBrowser.typesWriteApplicationSettingsRequestMod

import typings.awsSdkClientPinpointBrowser.typesCampaignHookMod.CampaignHook
import typings.awsSdkClientPinpointBrowser.typesCampaignLimitsMod.CampaignLimits
import typings.awsSdkClientPinpointBrowser.typesQuietTimeMod.QuietTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WriteApplicationSettingsRequest extends js.Object {
  
  /**
    * Default campaign hook information.
    */
  var CampaignHook: js.UndefOr[typings.awsSdkClientPinpointBrowser.typesCampaignHookMod.CampaignHook] = js.native
  
  /**
    * The CloudWatchMetrics settings for the app.
    */
  var CloudWatchMetricsEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The limits that apply to each campaign in the project by default. Campaigns can also have their own limits, which override the settings at the project level.
    */
  var Limits: js.UndefOr[CampaignLimits] = js.native
  
  /**
    * The default quiet time for the app. Each campaign for this app sends no messages during this time unless the campaign overrides the default with a quiet time of its own.
    */
  var QuietTime: js.UndefOr[typings.awsSdkClientPinpointBrowser.typesQuietTimeMod.QuietTime] = js.native
}
object WriteApplicationSettingsRequest {
  
  @scala.inline
  def apply(): WriteApplicationSettingsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WriteApplicationSettingsRequest]
  }
  
  @scala.inline
  implicit class WriteApplicationSettingsRequestOps[Self <: WriteApplicationSettingsRequest] (val x: Self) extends AnyVal {
    
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
    def setCampaignHook(value: CampaignHook): Self = this.set("CampaignHook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCampaignHook: Self = this.set("CampaignHook", js.undefined)
    
    @scala.inline
    def setCloudWatchMetricsEnabled(value: Boolean): Self = this.set("CloudWatchMetricsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudWatchMetricsEnabled: Self = this.set("CloudWatchMetricsEnabled", js.undefined)
    
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
