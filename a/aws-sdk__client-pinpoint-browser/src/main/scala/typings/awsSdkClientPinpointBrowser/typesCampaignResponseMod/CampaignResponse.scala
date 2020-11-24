package typings.awsSdkClientPinpointBrowser.typesCampaignResponseMod

import typings.awsSdkClientPinpointBrowser.typesCampaignHookMod.CampaignHook
import typings.awsSdkClientPinpointBrowser.typesCampaignLimitsMod.CampaignLimits
import typings.awsSdkClientPinpointBrowser.typesCampaignStateMod.CampaignState
import typings.awsSdkClientPinpointBrowser.typesMessageConfigurationMod.MessageConfiguration
import typings.awsSdkClientPinpointBrowser.typesScheduleMod.Schedule
import typings.awsSdkClientPinpointBrowser.typesTreatmentResourceMod.TreatmentResource
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CampaignResponse extends js.Object {
  
  /**
    * Treatments that are defined in addition to the default treatment.
    */
  var AdditionalTreatments: js.UndefOr[js.Array[TreatmentResource] | Iterable[TreatmentResource]] = js.native
  
  /**
    * The ID of the application to which the campaign applies.
    */
  var ApplicationId: js.UndefOr[String] = js.native
  
  /**
    * The date the campaign was created in ISO 8601 format.
    */
  var CreationDate: js.UndefOr[String] = js.native
  
  /**
    * The status of the campaign's default treatment. Only present for A/B test campaigns.
    */
  var DefaultState: js.UndefOr[CampaignState] = js.native
  
  /**
    * A description of the campaign.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * The allocated percentage of end users who will not receive messages from this campaign.
    */
  var HoldoutPercent: js.UndefOr[Double] = js.native
  
  /**
    * Campaign hook information.
    */
  var Hook: js.UndefOr[CampaignHook] = js.native
  
  /**
    * The unique campaign ID.
    */
  var Id: js.UndefOr[String] = js.native
  
  /**
    * Indicates whether the campaign is paused. A paused campaign does not send messages unless you resume it by setting IsPaused to false.
    */
  var IsPaused: js.UndefOr[Boolean] = js.native
  
  /**
    * The date the campaign was last updated in ISO 8601 format.
    */
  var LastModifiedDate: js.UndefOr[String] = js.native
  
  /**
    * The campaign limits settings.
    */
  var Limits: js.UndefOr[CampaignLimits] = js.native
  
  /**
    * The message configuration settings.
    */
  var MessageConfiguration: js.UndefOr[
    typings.awsSdkClientPinpointBrowser.typesMessageConfigurationMod.MessageConfiguration
  ] = js.native
  
  /**
    * The custom name of the campaign.
    */
  var Name: js.UndefOr[String] = js.native
  
  /**
    * The campaign schedule.
    */
  var Schedule: js.UndefOr[typings.awsSdkClientPinpointBrowser.typesScheduleMod.Schedule] = js.native
  
  /**
    * The ID of the segment to which the campaign sends messages.
    */
  var SegmentId: js.UndefOr[String] = js.native
  
  /**
    * The version of the segment to which the campaign sends messages.
    */
  var SegmentVersion: js.UndefOr[Double] = js.native
  
  /**
    * The campaign status.
    *
    * An A/B test campaign will have a status of COMPLETED only when all treatments have a status of COMPLETED.
    */
  var State: js.UndefOr[CampaignState] = js.native
  
  /**
    * A custom description for the treatment.
    */
  var TreatmentDescription: js.UndefOr[String] = js.native
  
  /**
    * The custom name of a variation of the campaign used for A/B testing.
    */
  var TreatmentName: js.UndefOr[String] = js.native
  
  /**
    * The campaign version number.
    */
  var Version: js.UndefOr[Double] = js.native
}
object CampaignResponse {
  
  @scala.inline
  def apply(): CampaignResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CampaignResponse]
  }
  
  @scala.inline
  implicit class CampaignResponseOps[Self <: CampaignResponse] (val x: Self) extends AnyVal {
    
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
    def setAdditionalTreatmentsVarargs(value: TreatmentResource*): Self = this.set("AdditionalTreatments", js.Array(value :_*))
    
    @scala.inline
    def setAdditionalTreatments(value: js.Array[TreatmentResource] | Iterable[TreatmentResource]): Self = this.set("AdditionalTreatments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalTreatments: Self = this.set("AdditionalTreatments", js.undefined)
    
    @scala.inline
    def setApplicationId(value: String): Self = this.set("ApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationId: Self = this.set("ApplicationId", js.undefined)
    
    @scala.inline
    def setCreationDate(value: String): Self = this.set("CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationDate: Self = this.set("CreationDate", js.undefined)
    
    @scala.inline
    def setDefaultState(value: CampaignState): Self = this.set("DefaultState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultState: Self = this.set("DefaultState", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setHoldoutPercent(value: Double): Self = this.set("HoldoutPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoldoutPercent: Self = this.set("HoldoutPercent", js.undefined)
    
    @scala.inline
    def setHook(value: CampaignHook): Self = this.set("Hook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHook: Self = this.set("Hook", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    
    @scala.inline
    def setIsPaused(value: Boolean): Self = this.set("IsPaused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsPaused: Self = this.set("IsPaused", js.undefined)
    
    @scala.inline
    def setLastModifiedDate(value: String): Self = this.set("LastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedDate: Self = this.set("LastModifiedDate", js.undefined)
    
    @scala.inline
    def setLimits(value: CampaignLimits): Self = this.set("Limits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimits: Self = this.set("Limits", js.undefined)
    
    @scala.inline
    def setMessageConfiguration(value: MessageConfiguration): Self = this.set("MessageConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageConfiguration: Self = this.set("MessageConfiguration", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setSchedule(value: Schedule): Self = this.set("Schedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchedule: Self = this.set("Schedule", js.undefined)
    
    @scala.inline
    def setSegmentId(value: String): Self = this.set("SegmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegmentId: Self = this.set("SegmentId", js.undefined)
    
    @scala.inline
    def setSegmentVersion(value: Double): Self = this.set("SegmentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegmentVersion: Self = this.set("SegmentVersion", js.undefined)
    
    @scala.inline
    def setState(value: CampaignState): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    
    @scala.inline
    def setTreatmentDescription(value: String): Self = this.set("TreatmentDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTreatmentDescription: Self = this.set("TreatmentDescription", js.undefined)
    
    @scala.inline
    def setTreatmentName(value: String): Self = this.set("TreatmentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTreatmentName: Self = this.set("TreatmentName", js.undefined)
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("Version", js.undefined)
  }
}
