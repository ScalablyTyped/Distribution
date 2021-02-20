package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.typesCampaignHookMod.CampaignHook
import typings.awsSdkClientPinpointBrowser.typesCampaignHookMod.UnmarshalledCampaignHook
import typings.awsSdkClientPinpointBrowser.typesCampaignLimitsMod.CampaignLimits
import typings.awsSdkClientPinpointBrowser.typesCampaignLimitsMod.UnmarshalledCampaignLimits
import typings.awsSdkClientPinpointBrowser.typesMessageConfigurationMod.MessageConfiguration
import typings.awsSdkClientPinpointBrowser.typesMessageConfigurationMod.UnmarshalledMessageConfiguration
import typings.awsSdkClientPinpointBrowser.typesScheduleMod.Schedule
import typings.awsSdkClientPinpointBrowser.typesScheduleMod.UnmarshalledSchedule
import typings.awsSdkClientPinpointBrowser.typesWriteTreatmentResourceMod.UnmarshalledWriteTreatmentResource
import typings.awsSdkClientPinpointBrowser.typesWriteTreatmentResourceMod.WriteTreatmentResource
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesWriteCampaignRequestMod {
  
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
    implicit class UnmarshalledWriteCampaignRequestMutableBuilder[Self <: UnmarshalledWriteCampaignRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdditionalTreatments(value: js.Array[UnmarshalledWriteTreatmentResource]): Self = StObject.set(x, "AdditionalTreatments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdditionalTreatmentsUndefined: Self = StObject.set(x, "AdditionalTreatments", js.undefined)
      
      @scala.inline
      def setAdditionalTreatmentsVarargs(value: UnmarshalledWriteTreatmentResource*): Self = StObject.set(x, "AdditionalTreatments", js.Array(value :_*))
      
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
    }
  }
  
  @js.native
  trait WriteCampaignRequest extends StObject {
    
    /**
      * Treatments that are defined in addition to the default treatment.
      */
    var AdditionalTreatments: js.UndefOr[js.Array[WriteTreatmentResource] | Iterable[WriteTreatmentResource]] = js.native
    
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
      * Indicates whether the campaign is paused. A paused campaign does not send messages unless you resume it by setting IsPaused to false.
      */
    var IsPaused: js.UndefOr[Boolean] = js.native
    
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
      * A custom description for the treatment.
      */
    var TreatmentDescription: js.UndefOr[String] = js.native
    
    /**
      * The custom name of a variation of the campaign used for A/B testing.
      */
    var TreatmentName: js.UndefOr[String] = js.native
  }
  object WriteCampaignRequest {
    
    @scala.inline
    def apply(): WriteCampaignRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WriteCampaignRequest]
    }
    
    @scala.inline
    implicit class WriteCampaignRequestMutableBuilder[Self <: WriteCampaignRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdditionalTreatments(value: js.Array[WriteTreatmentResource] | Iterable[WriteTreatmentResource]): Self = StObject.set(x, "AdditionalTreatments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdditionalTreatmentsUndefined: Self = StObject.set(x, "AdditionalTreatments", js.undefined)
      
      @scala.inline
      def setAdditionalTreatmentsVarargs(value: WriteTreatmentResource*): Self = StObject.set(x, "AdditionalTreatments", js.Array(value :_*))
      
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
      def setIsPaused(value: Boolean): Self = StObject.set(x, "IsPaused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsPausedUndefined: Self = StObject.set(x, "IsPaused", js.undefined)
      
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
      def setTreatmentDescription(value: String): Self = StObject.set(x, "TreatmentDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreatmentDescriptionUndefined: Self = StObject.set(x, "TreatmentDescription", js.undefined)
      
      @scala.inline
      def setTreatmentName(value: String): Self = StObject.set(x, "TreatmentName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreatmentNameUndefined: Self = StObject.set(x, "TreatmentName", js.undefined)
    }
  }
}
