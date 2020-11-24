package typings.awsSdkClientPinpointBrowser.typesWriteCampaignRequestMod

import typings.awsSdkClientPinpointBrowser.typesCampaignHookMod.UnmarshalledCampaignHook
import typings.awsSdkClientPinpointBrowser.typesCampaignLimitsMod.UnmarshalledCampaignLimits
import typings.awsSdkClientPinpointBrowser.typesMessageConfigurationMod.UnmarshalledMessageConfiguration
import typings.awsSdkClientPinpointBrowser.typesScheduleMod.UnmarshalledSchedule
import typings.awsSdkClientPinpointBrowser.typesWriteTreatmentResourceMod.UnmarshalledWriteTreatmentResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledWriteCampaignRequest extends WriteCampaignRequest {
  
  /**
    * Treatments that are defined in addition to the default treatment.
    */
  @JSName("AdditionalTreatments")
  var AdditionalTreatments_UnmarshalledWriteCampaignRequest: js.UndefOr[js.Array[UnmarshalledWriteTreatmentResource]] = js.native
  
  /**
    * Campaign hook information.
    */
  @JSName("Hook")
  var Hook_UnmarshalledWriteCampaignRequest: js.UndefOr[UnmarshalledCampaignHook] = js.native
  
  /**
    * The campaign limits settings.
    */
  @JSName("Limits")
  var Limits_UnmarshalledWriteCampaignRequest: js.UndefOr[UnmarshalledCampaignLimits] = js.native
  
  /**
    * The message configuration settings.
    */
  @JSName("MessageConfiguration")
  var MessageConfiguration_UnmarshalledWriteCampaignRequest: js.UndefOr[UnmarshalledMessageConfiguration] = js.native
  
  /**
    * The campaign schedule.
    */
  @JSName("Schedule")
  var Schedule_UnmarshalledWriteCampaignRequest: js.UndefOr[UnmarshalledSchedule] = js.native
}
object UnmarshalledWriteCampaignRequest {
  
  @scala.inline
  def apply(): UnmarshalledWriteCampaignRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledWriteCampaignRequest]
  }
  
  @scala.inline
  implicit class UnmarshalledWriteCampaignRequestOps[Self <: UnmarshalledWriteCampaignRequest] (val x: Self) extends AnyVal {
    
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
    def setAdditionalTreatmentsVarargs(value: UnmarshalledWriteTreatmentResource*): Self = this.set("AdditionalTreatments", js.Array(value :_*))
    
    @scala.inline
    def setAdditionalTreatments(value: js.Array[UnmarshalledWriteTreatmentResource]): Self = this.set("AdditionalTreatments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalTreatments: Self = this.set("AdditionalTreatments", js.undefined)
    
    @scala.inline
    def setHook(value: UnmarshalledCampaignHook): Self = this.set("Hook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHook: Self = this.set("Hook", js.undefined)
    
    @scala.inline
    def setLimits(value: UnmarshalledCampaignLimits): Self = this.set("Limits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimits: Self = this.set("Limits", js.undefined)
    
    @scala.inline
    def setMessageConfiguration(value: UnmarshalledMessageConfiguration): Self = this.set("MessageConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageConfiguration: Self = this.set("MessageConfiguration", js.undefined)
    
    @scala.inline
    def setSchedule(value: UnmarshalledSchedule): Self = this.set("Schedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchedule: Self = this.set("Schedule", js.undefined)
  }
}
