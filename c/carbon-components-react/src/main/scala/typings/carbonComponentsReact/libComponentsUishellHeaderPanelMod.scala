package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.typingsSharedMod.ForwardRefReturn
import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsUishellHeaderPanelMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/UIShell/HeaderPanel", JSImport.Default)
  @js.native
  val default: ForwardRefReturn[HTMLDivElement, HeaderPanelProps] = js.native
  
  trait HeaderPanelProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    var expanded: js.UndefOr[Boolean] = js.undefined
  }
  object HeaderPanelProps {
    
    inline def apply(): HeaderPanelProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeaderPanelProps]
    }
    
    extension [Self <: HeaderPanelProps](x: Self) {
      
      inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
    }
  }
  
  type _To = ForwardRefReturn[HTMLDivElement, HeaderPanelProps]
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsUishellHeaderPanelMod.foo` */
  override def _to: ForwardRefReturn[HTMLDivElement, HeaderPanelProps] = default
}
