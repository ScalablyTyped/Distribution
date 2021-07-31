package typings.baseui.accordionMod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatefulPanelContainerProps
  extends StObject
     with SharedStatefulPanelContainerProps {
  
  var children: ReactNode
}
object StatefulPanelContainerProps {
  
  @scala.inline
  def apply(): StatefulPanelContainerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatefulPanelContainerProps]
  }
  
  @scala.inline
  implicit class StatefulPanelContainerPropsMutableBuilder[Self <: StatefulPanelContainerProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
  }
}
