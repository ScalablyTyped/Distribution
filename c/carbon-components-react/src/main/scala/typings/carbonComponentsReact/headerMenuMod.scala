package typings.carbonComponentsReact

import typings.carbonComponentsReact.typingsSharedMod.FCReturn
import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headerMenuMod {
  
  @JSImport("carbon-components-react/lib/components/UIShell/HeaderMenu", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[RP](props: HeaderMenuProps[RP]): FCReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[FCReturn]
  
  type HeaderMenu = Component[HeaderMenuProps[js.Object], js.Object, js.Any]
  
  trait HeaderMenuProps[RP] extends StObject {
    
    var `aria-label`: js.UndefOr[String] = js.undefined
    
    var `aria-labelledby`: js.UndefOr[String] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var menuLinkName: String
    
    var ref: js.UndefOr[js.Function1[/* element */ HTMLElement, Unit]] = js.undefined
    
    var renderMenuContent: js.UndefOr[ComponentType[RP]] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
  }
  object HeaderMenuProps {
    
    inline def apply[RP](menuLinkName: String): HeaderMenuProps[RP] = {
      val __obj = js.Dynamic.literal(menuLinkName = menuLinkName.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeaderMenuProps[RP]]
    }
    
    extension [Self <: HeaderMenuProps[?], RP](x: Self & HeaderMenuProps[RP]) {
      
      inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setMenuLinkName(value: String): Self = StObject.set(x, "menuLinkName", value.asInstanceOf[js.Any])
      
      inline def setRef(value: /* element */ HTMLElement => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setRenderMenuContent(value: ComponentType[RP]): Self = StObject.set(x, "renderMenuContent", value.asInstanceOf[js.Any])
      
      inline def setRenderMenuContentUndefined: Self = StObject.set(x, "renderMenuContent", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    }
  }
}
