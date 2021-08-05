package typings.awsSdk.lexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSlotTypeRequest extends StObject {
  
  /**
    * The name of the slot type. The name is case sensitive. 
    */
  var name: SlotTypeName
}
object DeleteSlotTypeRequest {
  
  inline def apply(name: SlotTypeName): DeleteSlotTypeRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSlotTypeRequest]
  }
  
  extension [Self <: DeleteSlotTypeRequest](x: Self) {
    
    inline def setName(value: SlotTypeName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
