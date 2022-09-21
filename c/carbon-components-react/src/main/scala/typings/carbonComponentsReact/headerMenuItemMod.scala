package typings.carbonComponentsReact

import typings.carbonComponentsReact.typingsSharedMod.FCReturn
import typings.carbonComponentsReact.typingsSharedMod.ForwardRefProps
import typings.carbonComponentsReact.typingsSharedMod.RequiresChildrenProps
import typings.carbonComponentsReact.uishellLinkMod.LinkProps
import typings.react.mod.ReactNode
import typings.std.NonNullable
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headerMenuItemMod {
  
  @JSImport("carbon-components-react/lib/components/UIShell/HeaderMenuItem", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[E /* <: js.Object */, R](props: ForwardRefProps[R, HeaderMenuItemProps[E]]): FCReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[FCReturn]
  
  /* Rewritten from type alias, can be one of: 
    - typings.carbonComponentsReact.carbonComponentsReactStrings.children
    - typings.carbonComponentsReact.carbonComponentsReactStrings.ref
    - typings.carbonComponentsReact.carbonComponentsReactStrings.tabIndex
  */
  trait ExcludedAttributes extends StObject
  object ExcludedAttributes {
    
    inline def children: typings.carbonComponentsReact.carbonComponentsReactStrings.children = "children".asInstanceOf[typings.carbonComponentsReact.carbonComponentsReactStrings.children]
    
    inline def ref: typings.carbonComponentsReact.carbonComponentsReactStrings.ref = "ref".asInstanceOf[typings.carbonComponentsReact.carbonComponentsReactStrings.ref]
    
    inline def tabIndex: typings.carbonComponentsReact.carbonComponentsReactStrings.tabIndex = "tabIndex".asInstanceOf[typings.carbonComponentsReact.carbonComponentsReactStrings.tabIndex]
  }
  
  type HeaderMenuItemProps[E /* <: js.Object */] = (Omit[LinkProps[E, E], ExcludedAttributes]) & HeaderMenuItemPropsBase
  
  trait HeaderMenuItemPropsBase
    extends StObject
       with RequiresChildrenProps[ReactNode] {
    
    var isCurrentPage: js.UndefOr[Boolean] = js.undefined
  }
  object HeaderMenuItemPropsBase {
    
    inline def apply(children: NonNullable[ReactNode]): HeaderMenuItemPropsBase = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeaderMenuItemPropsBase]
    }
    
    extension [Self <: HeaderMenuItemPropsBase](x: Self) {
      
      inline def setIsCurrentPage(value: Boolean): Self = StObject.set(x, "isCurrentPage", value.asInstanceOf[js.Any])
      
      inline def setIsCurrentPageUndefined: Self = StObject.set(x, "isCurrentPage", js.undefined)
    }
  }
}
