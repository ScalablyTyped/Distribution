package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.carbonComponentsReactStrings.lg
import typings.carbonComponentsReact.carbonComponentsReactStrings.md
import typings.carbonComponentsReact.carbonComponentsReactStrings.sm
import typings.carbonComponentsReact.typingsSharedMod.ForwardRefReturn
import typings.react.mod.AnchorHTMLAttributes
import typings.react.mod.ComponentType
import typings.std.HTMLAnchorElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsLinkLinkMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/Link/Link", JSImport.Default)
  @js.native
  val default: ForwardRefReturn[HTMLAnchorElement, LinkProps] = js.native
  
  trait LinkProps
    extends StObject
       with AnchorHTMLAttributes[HTMLAnchorElement] {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var `inline`: js.UndefOr[Boolean] = js.undefined
    
    var renderIcon: js.UndefOr[ComponentType[js.Object]] = js.undefined
    
    var size: js.UndefOr[sm | md | lg] = js.undefined
    
    var visited: js.UndefOr[Boolean] = js.undefined
  }
  object LinkProps {
    
    inline def apply(): LinkProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LinkProps]
    }
    
    extension [Self <: LinkProps](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      inline def setRenderIcon(value: ComponentType[js.Object]): Self = StObject.set(x, "renderIcon", value.asInstanceOf[js.Any])
      
      inline def setRenderIconUndefined: Self = StObject.set(x, "renderIcon", js.undefined)
      
      inline def setSize(value: sm | md | lg): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setVisited(value: Boolean): Self = StObject.set(x, "visited", value.asInstanceOf[js.Any])
      
      inline def setVisitedUndefined: Self = StObject.set(x, "visited", js.undefined)
    }
  }
  
  type _To = ForwardRefReturn[HTMLAnchorElement, LinkProps]
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsLinkLinkMod.foo` */
  override def _to: ForwardRefReturn[HTMLAnchorElement, LinkProps] = default
}
