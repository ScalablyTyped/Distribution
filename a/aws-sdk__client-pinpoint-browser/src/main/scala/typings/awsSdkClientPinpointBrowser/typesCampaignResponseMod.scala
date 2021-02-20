package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.typesCampaignHookMod.CampaignHook
import typings.awsSdkClientPinpointBrowser.typesCampaignHookMod.UnmarshalledCampaignHook
import typings.awsSdkClientPinpointBrowser.typesCampaignLimitsMod.CampaignLimits
import typings.awsSdkClientPinpointBrowser.typesCampaignLimitsMod.UnmarshalledCampaignLimits
import typings.awsSdkClientPinpointBrowser.typesCampaignStateMod.CampaignState
import typings.awsSdkClientPinpointBrowser.typesCampaignStateMod.UnmarshalledCampaignState
import typings.awsSdkClientPinpointBrowser.typesMessageConfigurationMod.MessageConfiguration
import typings.awsSdkClientPinpointBrowser.typesMessageConfigurationMod.UnmarshalledMessageConfiguration
import typings.awsSdkClientPinpointBrowser.typesScheduleMod.Schedule
import typings.awsSdkClientPinpointBrowser.typesScheduleMod.UnmarshalledSchedule
import typings.awsSdkClientPinpointBrowser.typesTreatmentResourceMod.TreatmentResource
import typings.awsSdkClientPinpointBrowser.typesTreatmentResourceMod.UnmarshalledTreatmentResource
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCampaignResponseMod {
  
  @js.native
  trait CampaignResponse extends StObject {
    
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
    implicit class CampaignResponseMutableBuilder[Self <: CampaignResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdditionalTreatments(value: js.Array[TreatmentResource] | Iterable[TreatmentResource]): Self = StObject.set(x, "AdditionalTreatments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdditionalTreatmentsUndefined: Self = StObject.set(x, "AdditionalTreatments", js.undefined)
      
      @scala.inline
      def setAdditionalTreatmentsVarargs(value: TreatmentResource*): Self = StObject.set(x, "AdditionalTreatments", js.Array(value :_*))
      
      @scala.inline
      def setApplicationId(value: String): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplicationIdUndefined: Self = StObject.set(x, "ApplicationId", js.undefined)
      
      @scala.inline
      def setCreationDate(value: String): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
      
      @scala.inline
      def setDefaultState(value: CampaignState): Self = StObject.set(x, "DefaultState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultStateUndefined: Self = StObject.set(x, "DefaultState", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
      
      @scala.inline
      def setHoldoutPercent(value: Double): Self = StObject.set(x, "HoldoutPercent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoldoutPercentUndefined: Self = StObject.set(x, "HoldoutPercent", js.undefined)
      
      @scala.inline
      def setHook(value: CampaignHook): Self = StObject.set(x, "Hook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHookUndefined: Self = StObject.set(x, "Hook", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
      
      @scala.inline
      def setIsPaused(value: Boolean): Self = StObject.set(x, "IsPaused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsPausedUndefined: Self = StObject.set(x, "IsPaused", js.undefined)
      
      @scala.inline
      def setLastModifiedDate(value: String): Self = StObject.set(x, "LastModifiedDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastModifiedDateUndefined: Self = StObject.set(x, "LastModifiedDate", js.undefined)
      
      @scala.inline
      def setLimits(value: CampaignLimits): Self = StObject.set(x, "Limits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitsUndefined: Self = StObject.set(x, "Limits", js.undefined)
      
      @scala.inline
      def setMessageConfiguration(value: MessageConfiguration): Self = StObject.set(x, "MessageConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageConfigurationUndefined: Self = StObject.set(x, "MessageConfiguration", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
      
      @scala.inline
      def setSchedule(value: Schedule): Self = StObject.set(x, "Schedule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScheduleUndefined: Self = StObject.set(x, "Schedule", js.undefined)
      
      @scala.inline
      def setSegmentId(value: String): Self = StObject.set(x, "SegmentId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegmentIdUndefined: Self = StObject.set(x, "SegmentId", js.undefined)
      
      @scala.inline
      def setSegmentVersion(value: Double): Self = StObject.set(x, "SegmentVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegmentVersionUndefined: Self = StObject.set(x, "SegmentVersion", js.undefined)
      
      @scala.inline
      def setState(value: CampaignState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
      
      @scala.inline
      def setTreatmentDescription(value: String): Self = StObject.set(x, "TreatmentDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreatmentDescriptionUndefined: Self = StObject.set(x, "TreatmentDescription", js.undefined)
      
      @scala.inline
      def setTreatmentName(value: String): Self = StObject.set(x, "TreatmentName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreatmentNameUndefined: Self = StObject.set(x, "TreatmentName", js.undefined)
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
    }
  }
  
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
    implicit class UnmarshalledCampaignResponseMutableBuilder[Self <: UnmarshalledCampaignResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdditionalTreatments(value: js.Array[UnmarshalledTreatmentResource]): Self = StObject.set(x, "AdditionalTreatments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdditionalTreatmentsUndefined: Self = StObject.set(x, "AdditionalTreatments", js.undefined)
      
      @scala.inline
      def setAdditionalTreatmentsVarargs(value: UnmarshalledTreatmentResource*): Self = StObject.set(x, "AdditionalTreatments", js.Array(value :_*))
      
      @scala.inline
      def setDefaultState(value: UnmarshalledCampaignState): Self = StObject.set(x, "DefaultState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultStateUndefined: Self = StObject.set(x, "DefaultState", js.undefined)
      
      @scala.inline
      def setHook(value: UnmarshalledCampaignHook): Self = StObject.set(x, "Hook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHookUndefined: Self = StObject.set(x, "Hook", js.undefined)
      
      @scala.inline
      def setLimits(value: UnmarshalledCampaignLimits): Self = StObject.set(x, "Limits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitsUndefined: Self = StObject.set(x, "Limits", js.undefined)
      
      @scala.inline
      def setMessageConfiguration(value: UnmarshalledMessageConfiguration): Self = StObject.set(x, "MessageConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageConfigurationUndefined: Self = StObject.set(x, "MessageConfiguration", js.undefined)
      
      @scala.inline
      def setSchedule(value: UnmarshalledSchedule): Self = StObject.set(x, "Schedule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScheduleUndefined: Self = StObject.set(x, "Schedule", js.undefined)
      
      @scala.inline
      def setState(value: UnmarshalledCampaignState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    }
  }
}
