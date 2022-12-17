package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.typingsSharedMod.ForwardRefReturn
import typings.carbonComponentsReact.typingsSharedMod.RequiresChildrenProps
import typings.react.mod.ReactNode
import typings.std.HTMLUListElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsUishellSwitcherMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/UIShell/Switcher", JSImport.Default)
  @js.native
  val default: ForwardRefReturn[HTMLUListElement, SwitcherProps] = js.native
  
  trait SwitcherProps
    extends StObject
       with RequiresChildrenProps[ReactNode] {
    
    var `aria-label`: js.UndefOr[String] = js.undefined
    
    var `aria-labelledby`: js.UndefOr[String] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
  }
  object SwitcherProps {
    
    inline def apply(): SwitcherProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwitcherProps]
    }
    
    extension [Self <: SwitcherProps](x: Self) {
      
      inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    }
  }
  
  type _To = ForwardRefReturn[HTMLUListElement, SwitcherProps]
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsUishellSwitcherMod.foo` */
  override def _to: ForwardRefReturn[HTMLUListElement, SwitcherProps] = default
}
