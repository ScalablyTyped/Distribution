package typings.baseui.accordionMod

import typings.react.mod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccordionState extends StObject {
  
  var expanded: js.Array[Key]
}
object AccordionState {
  
  @scala.inline
  def apply(expanded: js.Array[Key]): AccordionState = {
    val __obj = js.Dynamic.literal(expanded = expanded.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccordionState]
  }
  
  @scala.inline
  implicit class AccordionStateMutableBuilder[Self <: AccordionState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpanded(value: js.Array[Key]): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandedVarargs(value: Key*): Self = StObject.set(x, "expanded", js.Array(value :_*))
  }
}
