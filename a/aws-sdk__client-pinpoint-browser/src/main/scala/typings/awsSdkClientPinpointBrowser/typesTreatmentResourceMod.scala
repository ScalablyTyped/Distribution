package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.typesCampaignStateMod.CampaignState
import typings.awsSdkClientPinpointBrowser.typesCampaignStateMod.UnmarshalledCampaignState
import typings.awsSdkClientPinpointBrowser.typesMessageConfigurationMod.MessageConfiguration
import typings.awsSdkClientPinpointBrowser.typesMessageConfigurationMod.UnmarshalledMessageConfiguration
import typings.awsSdkClientPinpointBrowser.typesScheduleMod.Schedule
import typings.awsSdkClientPinpointBrowser.typesScheduleMod.UnmarshalledSchedule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTreatmentResourceMod {
  
  trait TreatmentResource extends StObject {
    
    /**
      * The unique treatment ID.
      */
    var Id: js.UndefOr[String] = js.undefined
    
    /**
      * The message configuration settings.
      */
    var MessageConfiguration: js.UndefOr[
        typings.awsSdkClientPinpointBrowser.typesMessageConfigurationMod.MessageConfiguration
      ] = js.undefined
    
    /**
      * The campaign schedule.
      */
    var Schedule: js.UndefOr[typings.awsSdkClientPinpointBrowser.typesScheduleMod.Schedule] = js.undefined
    
    /**
      * The allocated percentage of users for this treatment.
      */
    var SizePercent: js.UndefOr[Double] = js.undefined
    
    /**
      * The treatment status.
      */
    var State: js.UndefOr[CampaignState] = js.undefined
    
    /**
      * A custom description for the treatment.
      */
    var TreatmentDescription: js.UndefOr[String] = js.undefined
    
    /**
      * The custom name of a variation of the campaign used for A/B testing.
      */
    var TreatmentName: js.UndefOr[String] = js.undefined
  }
  object TreatmentResource {
    
    inline def apply(): TreatmentResource = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TreatmentResource]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TreatmentResource] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
      
      inline def setMessageConfiguration(value: MessageConfiguration): Self = StObject.set(x, "MessageConfiguration", value.asInstanceOf[js.Any])
      
      inline def setMessageConfigurationUndefined: Self = StObject.set(x, "MessageConfiguration", js.undefined)
      
      inline def setSchedule(value: Schedule): Self = StObject.set(x, "Schedule", value.asInstanceOf[js.Any])
      
      inline def setScheduleUndefined: Self = StObject.set(x, "Schedule", js.undefined)
      
      inline def setSizePercent(value: Double): Self = StObject.set(x, "SizePercent", value.asInstanceOf[js.Any])
      
      inline def setSizePercentUndefined: Self = StObject.set(x, "SizePercent", js.undefined)
      
      inline def setState(value: CampaignState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
      
      inline def setTreatmentDescription(value: String): Self = StObject.set(x, "TreatmentDescription", value.asInstanceOf[js.Any])
      
      inline def setTreatmentDescriptionUndefined: Self = StObject.set(x, "TreatmentDescription", js.undefined)
      
      inline def setTreatmentName(value: String): Self = StObject.set(x, "TreatmentName", value.asInstanceOf[js.Any])
      
      inline def setTreatmentNameUndefined: Self = StObject.set(x, "TreatmentName", js.undefined)
    }
  }
  
  trait UnmarshalledTreatmentResource
    extends StObject
       with TreatmentResource {
    
    /**
      * The message configuration settings.
      */
    @JSName("MessageConfiguration")
    var MessageConfiguration_UnmarshalledTreatmentResource: js.UndefOr[UnmarshalledMessageConfiguration] = js.undefined
    
    /**
      * The campaign schedule.
      */
    @JSName("Schedule")
    var Schedule_UnmarshalledTreatmentResource: js.UndefOr[UnmarshalledSchedule] = js.undefined
    
    /**
      * The treatment status.
      */
    @JSName("State")
    var State_UnmarshalledTreatmentResource: js.UndefOr[UnmarshalledCampaignState] = js.undefined
  }
  object UnmarshalledTreatmentResource {
    
    inline def apply(): UnmarshalledTreatmentResource = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledTreatmentResource]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UnmarshalledTreatmentResource] (val x: Self) extends AnyVal {
      
      inline def setMessageConfiguration(value: UnmarshalledMessageConfiguration): Self = StObject.set(x, "MessageConfiguration", value.asInstanceOf[js.Any])
      
      inline def setMessageConfigurationUndefined: Self = StObject.set(x, "MessageConfiguration", js.undefined)
      
      inline def setSchedule(value: UnmarshalledSchedule): Self = StObject.set(x, "Schedule", value.asInstanceOf[js.Any])
      
      inline def setScheduleUndefined: Self = StObject.set(x, "Schedule", js.undefined)
      
      inline def setState(value: UnmarshalledCampaignState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    }
  }
}
