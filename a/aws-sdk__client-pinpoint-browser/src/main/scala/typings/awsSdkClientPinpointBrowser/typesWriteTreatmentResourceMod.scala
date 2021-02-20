package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.typesMessageConfigurationMod.MessageConfiguration
import typings.awsSdkClientPinpointBrowser.typesMessageConfigurationMod.UnmarshalledMessageConfiguration
import typings.awsSdkClientPinpointBrowser.typesScheduleMod.Schedule
import typings.awsSdkClientPinpointBrowser.typesScheduleMod.UnmarshalledSchedule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesWriteTreatmentResourceMod {
  
  @js.native
  trait UnmarshalledWriteTreatmentResource extends WriteTreatmentResource {
    
    /**
      * The message configuration settings.
      */
    @JSName("MessageConfiguration")
    var MessageConfiguration_UnmarshalledWriteTreatmentResource: js.UndefOr[UnmarshalledMessageConfiguration] = js.native
    
    /**
      * The campaign schedule.
      */
    @JSName("Schedule")
    var Schedule_UnmarshalledWriteTreatmentResource: js.UndefOr[UnmarshalledSchedule] = js.native
  }
  object UnmarshalledWriteTreatmentResource {
    
    @scala.inline
    def apply(): UnmarshalledWriteTreatmentResource = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledWriteTreatmentResource]
    }
    
    @scala.inline
    implicit class UnmarshalledWriteTreatmentResourceMutableBuilder[Self <: UnmarshalledWriteTreatmentResource] (val x: Self) extends AnyVal {
      
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
  trait WriteTreatmentResource extends StObject {
    
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
      * A custom description for the treatment.
      */
    var TreatmentDescription: js.UndefOr[String] = js.native
    
    /**
      * The custom name of a variation of the campaign used for A/B testing.
      */
    var TreatmentName: js.UndefOr[String] = js.native
  }
  object WriteTreatmentResource {
    
    @scala.inline
    def apply(): WriteTreatmentResource = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WriteTreatmentResource]
    }
    
    @scala.inline
    implicit class WriteTreatmentResourceMutableBuilder[Self <: WriteTreatmentResource] (val x: Self) extends AnyVal {
      
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
