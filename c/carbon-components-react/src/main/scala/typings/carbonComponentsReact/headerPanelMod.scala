package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.typingsSharedMod.ForwardRefReturn
import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headerPanelMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/UIShell/HeaderPanel", JSImport.Default)
  @js.native
  val default: ForwardRefReturn[HTMLDivElement, HeaderPanelProps] = js.native
  
  trait HeaderPanelProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    var expanded: js.UndefOr[Boolean] = js.undefined
  }
  object HeaderPanelProps {
    
    @scala.inline
    def apply(): HeaderPanelProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeaderPanelProps]
    }
    
    @scala.inline
    implicit class HeaderPanelPropsMutableBuilder[Self <: HeaderPanelProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
    }
  }
  
  type _To = ForwardRefReturn[HTMLDivElement, HeaderPanelProps]
  
  /* This means you don't have to write `default`, but can instead just say `headerPanelMod.foo` */
  override def _to: ForwardRefReturn[HTMLDivElement, HeaderPanelProps] = default
}
