package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreatmentResource extends StObject {
  
  /**
    * The delivery configuration settings for sending the treatment through a custom channel. This object is required if the MessageConfiguration object for the treatment specifies a CustomMessage object.
    */
  var CustomDeliveryConfiguration: js.UndefOr[typings.awsSdk.pinpointMod.CustomDeliveryConfiguration] = js.undefined
  
  /**
    * The unique identifier for the treatment.
    */
  var Id: string
  
  /**
    * The message configuration settings for the treatment.
    */
  var MessageConfiguration: js.UndefOr[typings.awsSdk.pinpointMod.MessageConfiguration] = js.undefined
  
  /**
    * The schedule settings for the treatment.
    */
  var Schedule: js.UndefOr[typings.awsSdk.pinpointMod.Schedule] = js.undefined
  
  /**
    * The allocated percentage of users (segment members) that the treatment is sent to.
    */
  var SizePercent: integer
  
  /**
    * The current status of the treatment.
    */
  var State: js.UndefOr[CampaignState] = js.undefined
  
  /**
    * The message template to use for the treatment.
    */
  var TemplateConfiguration: js.UndefOr[typings.awsSdk.pinpointMod.TemplateConfiguration] = js.undefined
  
  /**
    * The custom description of the treatment.
    */
  var TreatmentDescription: js.UndefOr[string] = js.undefined
  
  /**
    * The custom name of the treatment.
    */
  var TreatmentName: js.UndefOr[string] = js.undefined
}
object TreatmentResource {
  
  inline def apply(Id: string, SizePercent: integer): TreatmentResource = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], SizePercent = SizePercent.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreatmentResource]
  }
  
  extension [Self <: TreatmentResource](x: Self) {
    
    inline def setCustomDeliveryConfiguration(value: CustomDeliveryConfiguration): Self = StObject.set(x, "CustomDeliveryConfiguration", value.asInstanceOf[js.Any])
    
    inline def setCustomDeliveryConfigurationUndefined: Self = StObject.set(x, "CustomDeliveryConfiguration", js.undefined)
    
    inline def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setMessageConfiguration(value: MessageConfiguration): Self = StObject.set(x, "MessageConfiguration", value.asInstanceOf[js.Any])
    
    inline def setMessageConfigurationUndefined: Self = StObject.set(x, "MessageConfiguration", js.undefined)
    
    inline def setSchedule(value: Schedule): Self = StObject.set(x, "Schedule", value.asInstanceOf[js.Any])
    
    inline def setScheduleUndefined: Self = StObject.set(x, "Schedule", js.undefined)
    
    inline def setSizePercent(value: integer): Self = StObject.set(x, "SizePercent", value.asInstanceOf[js.Any])
    
    inline def setState(value: CampaignState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTemplateConfiguration(value: TemplateConfiguration): Self = StObject.set(x, "TemplateConfiguration", value.asInstanceOf[js.Any])
    
    inline def setTemplateConfigurationUndefined: Self = StObject.set(x, "TemplateConfiguration", js.undefined)
    
    inline def setTreatmentDescription(value: string): Self = StObject.set(x, "TreatmentDescription", value.asInstanceOf[js.Any])
    
    inline def setTreatmentDescriptionUndefined: Self = StObject.set(x, "TreatmentDescription", js.undefined)
    
    inline def setTreatmentName(value: string): Self = StObject.set(x, "TreatmentName", value.asInstanceOf[js.Any])
    
    inline def setTreatmentNameUndefined: Self = StObject.set(x, "TreatmentName", js.undefined)
  }
}
