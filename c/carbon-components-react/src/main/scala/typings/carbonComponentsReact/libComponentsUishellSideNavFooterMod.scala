package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.typingsSharedMod.SideNavSharedProps
import typings.react.mod.FC
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsUishellSideNavFooterMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/UIShell/SideNavFooter", JSImport.Default)
  @js.native
  val default: FC[SideNavFooterProps] = js.native
  
  trait SideNavFooterProps
    extends StObject
       with SideNavSharedProps {
    
    var assistiveText: js.UndefOr[String] = js.undefined
    
    // required but has default value
    var className: js.UndefOr[String] = js.undefined
    
    var expanded: Boolean
    
    def onToggle(event: MouseEvent[HTMLButtonElement, NativeMouseEvent]): Unit
  }
  object SideNavFooterProps {
    
    inline def apply(expanded: Boolean, onToggle: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): SideNavFooterProps = {
      val __obj = js.Dynamic.literal(expanded = expanded.asInstanceOf[js.Any], onToggle = js.Any.fromFunction1(onToggle))
      __obj.asInstanceOf[SideNavFooterProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SideNavFooterProps] (val x: Self) extends AnyVal {
      
      inline def setAssistiveText(value: String): Self = StObject.set(x, "assistiveText", value.asInstanceOf[js.Any])
      
      inline def setAssistiveTextUndefined: Self = StObject.set(x, "assistiveText", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      inline def setOnToggle(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onToggle", js.Any.fromFunction1(value))
    }
  }
  
  type _To = FC[SideNavFooterProps]
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsUishellSideNavFooterMod.foo` */
  override def _to: FC[SideNavFooterProps] = default
}
