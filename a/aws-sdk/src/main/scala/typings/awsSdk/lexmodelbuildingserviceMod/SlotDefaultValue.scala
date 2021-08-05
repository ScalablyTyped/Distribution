package typings.awsSdk.lexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlotDefaultValue extends StObject {
  
  /**
    * The default value for the slot. You can specify one of the following:    #context-name.slot-name - The slot value "slot-name" in the context "context-name."    {attribute} - The slot value of the session attribute "attribute."    'value' - The discrete value "value."  
    */
  var defaultValue: SlotDefaultValueString
}
object SlotDefaultValue {
  
  inline def apply(defaultValue: SlotDefaultValueString): SlotDefaultValue = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlotDefaultValue]
  }
  
  extension [Self <: SlotDefaultValue](x: Self) {
    
    inline def setDefaultValue(value: SlotDefaultValueString): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
  }
}
