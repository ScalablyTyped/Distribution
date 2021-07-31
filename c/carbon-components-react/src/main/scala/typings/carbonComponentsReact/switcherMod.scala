package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.typingsSharedMod.ForwardRefReturn
import typings.carbonComponentsReact.typingsSharedMod.RequiresChildrenProps
import typings.react.mod.ReactNode
import typings.std.HTMLUListElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object switcherMod extends Shortcut {
  
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
    
    @scala.inline
    def apply(): SwitcherProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwitcherProps]
    }
    
    @scala.inline
    implicit class SwitcherPropsMutableBuilder[Self <: SwitcherProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      @scala.inline
      def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    }
  }
  
  type _To = ForwardRefReturn[HTMLUListElement, SwitcherProps]
  
  /* This means you don't have to write `default`, but can instead just say `switcherMod.foo` */
  override def _to: ForwardRefReturn[HTMLUListElement, SwitcherProps] = default
}
