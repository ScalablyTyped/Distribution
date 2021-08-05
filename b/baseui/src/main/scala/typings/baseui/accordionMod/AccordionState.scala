package typings.baseui.accordionMod

import typings.react.mod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccordionState extends StObject {
  
  var expanded: js.Array[Key]
}
object AccordionState {
  
  inline def apply(expanded: js.Array[Key]): AccordionState = {
    val __obj = js.Dynamic.literal(expanded = expanded.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccordionState]
  }
  
  extension [Self <: AccordionState](x: Self) {
    
    inline def setExpanded(value: js.Array[Key]): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    inline def setExpandedVarargs(value: Key*): Self = StObject.set(x, "expanded", js.Array(value :_*))
  }
}
