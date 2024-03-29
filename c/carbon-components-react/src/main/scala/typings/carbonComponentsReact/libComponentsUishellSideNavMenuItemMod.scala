package typings.carbonComponentsReact

import typings.carbonComponentsReact.libComponentsUishellLinkMod.LinkProps
import typings.carbonComponentsReact.typingsSharedMod.FCReturn
import typings.carbonComponentsReact.typingsSharedMod.ForwardRefProps
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsUishellSideNavMenuItemMod {
  
  @JSImport("carbon-components-react/lib/components/UIShell/SideNavMenuItem", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[E /* <: js.Object */, R](props: ForwardRefProps[R, SideNavMenuItemProps[E]]): FCReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[FCReturn]
  
  type SideNavMenuItemProps[E /* <: js.Object */] = (LinkProps[E, E]) & SideNavMenuItemPropsBase
  
  trait SideNavMenuItemPropsBase extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var isActive: js.UndefOr[Boolean] = js.undefined
  }
  object SideNavMenuItemPropsBase {
    
    inline def apply(): SideNavMenuItemPropsBase = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SideNavMenuItemPropsBase]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SideNavMenuItemPropsBase] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
      
      inline def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
    }
  }
}
