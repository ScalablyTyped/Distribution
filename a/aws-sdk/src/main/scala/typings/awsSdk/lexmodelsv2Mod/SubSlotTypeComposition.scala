package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubSlotTypeComposition extends StObject {
  
  /**
    * Name of a constituent sub slot inside a composite slot.
    */
  var name: Name
  
  /**
    * The unique identifier assigned to a slot type. This refers to either a built-in slot type or the unique slotTypeId of a custom slot type.
    */
  var slotTypeId: BuiltInOrCustomSlotTypeId
}
object SubSlotTypeComposition {
  
  inline def apply(name: Name, slotTypeId: BuiltInOrCustomSlotTypeId): SubSlotTypeComposition = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], slotTypeId = slotTypeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubSlotTypeComposition]
  }
  
  extension [Self <: SubSlotTypeComposition](x: Self) {
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSlotTypeId(value: BuiltInOrCustomSlotTypeId): Self = StObject.set(x, "slotTypeId", value.asInstanceOf[js.Any])
  }
}
