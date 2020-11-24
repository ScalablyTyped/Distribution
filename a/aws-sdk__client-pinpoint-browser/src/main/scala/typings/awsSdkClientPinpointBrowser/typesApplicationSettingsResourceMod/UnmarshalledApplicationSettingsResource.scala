package typings.awsSdkClientPinpointBrowser.typesApplicationSettingsResourceMod

import typings.awsSdkClientPinpointBrowser.typesCampaignHookMod.UnmarshalledCampaignHook
import typings.awsSdkClientPinpointBrowser.typesCampaignLimitsMod.UnmarshalledCampaignLimits
import typings.awsSdkClientPinpointBrowser.typesQuietTimeMod.UnmarshalledQuietTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledApplicationSettingsResource extends ApplicationSettingsResource {
  
  /**
    * Default campaign hook.
    */
  @JSName("CampaignHook")
  var CampaignHook_UnmarshalledApplicationSettingsResource: js.UndefOr[UnmarshalledCampaignHook] = js.native
  
  /**
    * The default campaign limits for the app. These limits apply to each campaign for the app, unless the campaign overrides the default with limits of its own.
    */
  @JSName("Limits")
  var Limits_UnmarshalledApplicationSettingsResource: js.UndefOr[UnmarshalledCampaignLimits] = js.native
  
  /**
    * The default quiet time for the app. Each campaign for this app sends no messages during this time unless the campaign overrides the default with a quiet time of its own.
    */
  @JSName("QuietTime")
  var QuietTime_UnmarshalledApplicationSettingsResource: js.UndefOr[UnmarshalledQuietTime] = js.native
}
object UnmarshalledApplicationSettingsResource {
  
  @scala.inline
  def apply(): UnmarshalledApplicationSettingsResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledApplicationSettingsResource]
  }
  
  @scala.inline
  implicit class UnmarshalledApplicationSettingsResourceOps[Self <: UnmarshalledApplicationSettingsResource] (val x: Self) extends AnyVal {
    
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
