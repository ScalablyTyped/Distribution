package typings.baseui.accordionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PanelState extends StObject {
  
  var expanded: Boolean
}
object PanelState {
  
  @scala.inline
  def apply(expanded: Boolean): PanelState = {
    val __obj = js.Dynamic.literal(expanded = expanded.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanelState]
  }
  
  @scala.inline
  implicit class PanelStateMutableBuilder[Self <: PanelState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
  }
}
