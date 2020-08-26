package typings.awsSdkClientPinpointBrowser.typesCampaignResponseMod

import typings.awsSdkClientPinpointBrowser.typesCampaignHookMod.UnmarshalledCampaignHook
import typings.awsSdkClientPinpointBrowser.typesCampaignLimitsMod.UnmarshalledCampaignLimits
import typings.awsSdkClientPinpointBrowser.typesCampaignStateMod.UnmarshalledCampaignState
import typings.awsSdkClientPinpointBrowser.typesMessageConfigurationMod.UnmarshalledMessageConfiguration
import typings.awsSdkClientPinpointBrowser.typesScheduleMod.UnmarshalledSchedule
import typings.awsSdkClientPinpointBrowser.typesTreatmentResourceMod.UnmarshalledTreatmentResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledCampaignResponse extends CampaignResponse {
  /**
    * Treatments that are defined in addition to the default treatment.
    */
  @JSName("AdditionalTreatments")
  var AdditionalTreatments_UnmarshalledCampaignResponse: js.UndefOr[js.Array[UnmarshalledTreatmentResource]] = js.native
  /**
    * The status of the campaign's default treatment. Only present for A/B test campaigns.
    */
  @JSName("DefaultState")
  var DefaultState_UnmarshalledCampaignResponse: js.UndefOr[UnmarshalledCampaignState] = js.native
  /**
    * Campaign hook information.
    */
  @JSName("Hook")
  var Hook_UnmarshalledCampaignResponse: js.UndefOr[UnmarshalledCampaignHook] = js.native
  /**
    * The campaign limits settings.
    */
  @JSName("Limits")
  var Limits_UnmarshalledCampaignResponse: js.UndefOr[UnmarshalledCampaignLimits] = js.native
  /**
    * The message configuration settings.
    */
  @JSName("MessageConfiguration")
  var MessageConfiguration_UnmarshalledCampaignResponse: js.UndefOr[UnmarshalledMessageConfiguration] = js.native
  /**
    * The campaign schedule.
    */
  @JSName("Schedule")
  var Schedule_UnmarshalledCampaignResponse: js.UndefOr[UnmarshalledSchedule] = js.native
  /**
    * The campaign status.
    *
    * An A/B test campaign will have a status of COMPLETED only when all treatments have a status of COMPLETED.
    */
  @JSName("State")
  var State_UnmarshalledCampaignResponse: js.UndefOr[UnmarshalledCampaignState] = js.native
}

object UnmarshalledCampaignResponse {
  @scala.inline
  def apply(): UnmarshalledCampaignResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledCampaignResponse]
  }
  @scala.inline
  implicit class UnmarshalledCampaignResponseOps[Self <: UnmarshalledCampaignResponse] (val x: Self) extends AnyVal {
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
    def setAdditionalTreatmentsVarargs(value: UnmarshalledTreatmentResource*): Self = this.set("AdditionalTreatments", js.Array(value :_*))
    @scala.inline
    def setAdditionalTreatments(value: js.Array[UnmarshalledTreatmentResource]): Self = this.set("AdditionalTreatments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionalTreatments: Self = this.set("AdditionalTreatments", js.undefined)
    @scala.inline
    def setDefaultState(value: UnmarshalledCampaignState): Self = this.set("DefaultState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultState: Self = this.set("DefaultState", js.undefined)
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
    @scala.inline
    def setState(value: UnmarshalledCampaignState): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
  }
  
}

