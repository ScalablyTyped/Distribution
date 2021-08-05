package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.typingsSharedMod.ForwardRefReturn
import typings.react.mod.ChangeEvent
import typings.react.mod.ReactNode
import typings.std.HTMLSelectElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sideNavSwitcherMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/UIShell/SideNavSwitcher", JSImport.Default)
  @js.native
  val default: ForwardRefReturn[HTMLSelectElement, SideNavSwitcherProps] = js.native
  
  trait SideNavSwitcherProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var labelText: String
    
    var onChange: js.UndefOr[js.Function1[/* event */ ChangeEvent[HTMLSelectElement], Unit]] = js.undefined
    
    var options: js.Array[String]
  }
  object SideNavSwitcherProps {
    
    inline def apply(labelText: String, options: js.Array[String]): SideNavSwitcherProps = {
      val __obj = js.Dynamic.literal(labelText = labelText.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[SideNavSwitcherProps]
    }
    
    extension [Self <: SideNavSwitcherProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setLabelText(value: String): Self = StObject.set(x, "labelText", value.asInstanceOf[js.Any])
      
      inline def setOnChange(value: /* event */ ChangeEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOptions(value: js.Array[String]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsVarargs(value: String*): Self = StObject.set(x, "options", js.Array(value :_*))
    }
  }
  
  type _To = ForwardRefReturn[HTMLSelectElement, SideNavSwitcherProps]
  
  /* This means you don't have to write `default`, but can instead just say `sideNavSwitcherMod.foo` */
  override def _to: ForwardRefReturn[HTMLSelectElement, SideNavSwitcherProps] = default
}
