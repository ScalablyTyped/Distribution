package typings.baseui.accordionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PanelProps
  extends StObject
     with SharedPanelProps {
  
  var expanded: js.UndefOr[Boolean] = js.undefined
}
object PanelProps {
  
  @scala.inline
  def apply(): PanelProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PanelProps]
  }
  
  @scala.inline
  implicit class PanelPropsMutableBuilder[Self <: PanelProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
  }
}
