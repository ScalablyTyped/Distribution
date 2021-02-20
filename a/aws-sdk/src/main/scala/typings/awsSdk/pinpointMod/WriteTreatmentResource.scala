package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WriteTreatmentResource extends StObject {
  
  /**
    * The delivery configuration settings for sending the treatment through a custom channel. This object is required if the MessageConfiguration object for the treatment specifies a CustomMessage object.
    */
  var CustomDeliveryConfiguration: js.UndefOr[typings.awsSdk.pinpointMod.CustomDeliveryConfiguration] = js.native
  
  /**
    * The message configuration settings for the treatment.
    */
  var MessageConfiguration: js.UndefOr[typings.awsSdk.pinpointMod.MessageConfiguration] = js.native
  
  /**
    * The schedule settings for the treatment.
    */
  var Schedule: js.UndefOr[typings.awsSdk.pinpointMod.Schedule] = js.native
  
  /**
    * The allocated percentage of users (segment members) to send the treatment to.
    */
  var SizePercent: integer = js.native
  
  /**
    * The message template to use for the treatment.
    */
  var TemplateConfiguration: js.UndefOr[typings.awsSdk.pinpointMod.TemplateConfiguration] = js.native
  
  /**
    * A custom description of the treatment.
    */
  var TreatmentDescription: js.UndefOr[string] = js.native
  
  /**
    * A custom name for the treatment.
    */
  var TreatmentName: js.UndefOr[string] = js.native
}
object WriteTreatmentResource {
  
  @scala.inline
  def apply(SizePercent: integer): WriteTreatmentResource = {
    val __obj = js.Dynamic.literal(SizePercent = SizePercent.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteTreatmentResource]
  }
  
  @scala.inline
  implicit class WriteTreatmentResourceMutableBuilder[Self <: WriteTreatmentResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomDeliveryConfiguration(value: CustomDeliveryConfiguration): Self = StObject.set(x, "CustomDeliveryConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomDeliveryConfigurationUndefined: Self = StObject.set(x, "CustomDeliveryConfiguration", js.undefined)
    
    @scala.inline
    def setMessageConfiguration(value: MessageConfiguration): Self = StObject.set(x, "MessageConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageConfigurationUndefined: Self = StObject.set(x, "MessageConfiguration", js.undefined)
    
    @scala.inline
    def setSchedule(value: Schedule): Self = StObject.set(x, "Schedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleUndefined: Self = StObject.set(x, "Schedule", js.undefined)
    
    @scala.inline
    def setSizePercent(value: integer): Self = StObject.set(x, "SizePercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateConfiguration(value: TemplateConfiguration): Self = StObject.set(x, "TemplateConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateConfigurationUndefined: Self = StObject.set(x, "TemplateConfiguration", js.undefined)
    
    @scala.inline
    def setTreatmentDescription(value: string): Self = StObject.set(x, "TreatmentDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTreatmentDescriptionUndefined: Self = StObject.set(x, "TreatmentDescription", js.undefined)
    
    @scala.inline
    def setTreatmentName(value: string): Self = StObject.set(x, "TreatmentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTreatmentNameUndefined: Self = StObject.set(x, "TreatmentName", js.undefined)
  }
}
