package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlotSummary extends StObject {
  
  /**
    * The description of the slot.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The timestamp of the last date and time that the slot was updated.
    */
  var lastUpdatedDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Whether the slot is required or optional. An intent is complete when all required slots are filled.
    */
  var slotConstraint: js.UndefOr[SlotConstraint] = js.undefined
  
  /**
    * The unique identifier of the slot.
    */
  var slotId: js.UndefOr[Id] = js.undefined
  
  /**
    * The name given to the slot.
    */
  var slotName: js.UndefOr[Name] = js.undefined
  
  /**
    * The unique identifier for the slot type that defines the values for the slot.
    */
  var slotTypeId: js.UndefOr[BuiltInOrCustomSlotTypeId] = js.undefined
  
  /**
    * Prompts that are sent to the user to elicit a value for the slot.
    */
  var valueElicitationPromptSpecification: js.UndefOr[PromptSpecification] = js.undefined
}
object SlotSummary {
  
  inline def apply(): SlotSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlotSummary]
  }
  
  extension [Self <: SlotSummary](x: Self) {
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLastUpdatedDateTime(value: js.Date): Self = StObject.set(x, "lastUpdatedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedDateTimeUndefined: Self = StObject.set(x, "lastUpdatedDateTime", js.undefined)
    
    inline def setSlotConstraint(value: SlotConstraint): Self = StObject.set(x, "slotConstraint", value.asInstanceOf[js.Any])
    
    inline def setSlotConstraintUndefined: Self = StObject.set(x, "slotConstraint", js.undefined)
    
    inline def setSlotId(value: Id): Self = StObject.set(x, "slotId", value.asInstanceOf[js.Any])
    
    inline def setSlotIdUndefined: Self = StObject.set(x, "slotId", js.undefined)
    
    inline def setSlotName(value: Name): Self = StObject.set(x, "slotName", value.asInstanceOf[js.Any])
    
    inline def setSlotNameUndefined: Self = StObject.set(x, "slotName", js.undefined)
    
    inline def setSlotTypeId(value: BuiltInOrCustomSlotTypeId): Self = StObject.set(x, "slotTypeId", value.asInstanceOf[js.Any])
    
    inline def setSlotTypeIdUndefined: Self = StObject.set(x, "slotTypeId", js.undefined)
    
    inline def setValueElicitationPromptSpecification(value: PromptSpecification): Self = StObject.set(x, "valueElicitationPromptSpecification", value.asInstanceOf[js.Any])
    
    inline def setValueElicitationPromptSpecificationUndefined: Self = StObject.set(x, "valueElicitationPromptSpecification", js.undefined)
  }
}
