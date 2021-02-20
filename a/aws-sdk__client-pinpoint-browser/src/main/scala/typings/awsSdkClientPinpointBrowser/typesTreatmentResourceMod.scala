package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.typesCampaignStateMod.CampaignState
import typings.awsSdkClientPinpointBrowser.typesCampaignStateMod.UnmarshalledCampaignState
import typings.awsSdkClientPinpointBrowser.typesMessageConfigurationMod.MessageConfiguration
import typings.awsSdkClientPinpointBrowser.typesMessageConfigurationMod.UnmarshalledMessageConfiguration
import typings.awsSdkClientPinpointBrowser.typesScheduleMod.Schedule
import typings.awsSdkClientPinpointBrowser.typesScheduleMod.UnmarshalledSchedule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTreatmentResourceMod {
  
  @js.native
  trait TreatmentResource extends StObject {
    
    /**
      * The unique treatment ID.
      */
    var Id: js.UndefOr[String] = js.native
    
    /**
      * The message configuration settings.
      */
    var MessageConfiguration: js.UndefOr[
        typings.awsSdkClientPinpointBrowser.typesMessageConfigurationMod.MessageConfiguration
      ] = js.native
    
    /**
      * The campaign schedule.
      */
    var Schedule: js.UndefOr[typings.awsSdkClientPinpointBrowser.typesScheduleMod.Schedule] = js.native
    
    /**
      * The allocated percentage of users for this treatment.
      */
    var SizePercent: js.UndefOr[Double] = js.native
    
    /**
      * The treatment status.
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
  }
  object TreatmentResource {
    
    @scala.inline
    def apply(): TreatmentResource = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TreatmentResource]
    }
    
    @scala.inline
    implicit class TreatmentResourceMutableBuilder[Self <: TreatmentResource] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
      
      @scala.inline
      def setMessageConfiguration(value: MessageConfiguration): Self = StObject.set(x, "MessageConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageConfigurationUndefined: Self = StObject.set(x, "MessageConfiguration", js.undefined)
      
      @scala.inline
      def setSchedule(value: Schedule): Self = StObject.set(x, "Schedule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScheduleUndefined: Self = StObject.set(x, "Schedule", js.undefined)
      
      @scala.inline
      def setSizePercent(value: Double): Self = StObject.set(x, "SizePercent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizePercentUndefined: Self = StObject.set(x, "SizePercent", js.undefined)
      
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
    }
  }
  
  @js.native
  trait UnmarshalledTreatmentResource extends TreatmentResource {
    
    /**
      * The message configuration settings.
      */
    @JSName("MessageConfiguration")
    var MessageConfiguration_UnmarshalledTreatmentResource: js.UndefOr[UnmarshalledMessageConfiguration] = js.native
    
    /**
      * The campaign schedule.
      */
    @JSName("Schedule")
    var Schedule_UnmarshalledTreatmentResource: js.UndefOr[UnmarshalledSchedule] = js.native
    
    /**
      * The treatment status.
      */
    @JSName("State")
    var State_UnmarshalledTreatmentResource: js.UndefOr[UnmarshalledCampaignState] = js.native
  }
  object UnmarshalledTreatmentResource {
    
    @scala.inline
    def apply(): UnmarshalledTreatmentResource = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledTreatmentResource]
    }
    
    @scala.inline
    implicit class UnmarshalledTreatmentResourceMutableBuilder[Self <: UnmarshalledTreatmentResource] (val x: Self) extends AnyVal {
      
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
