package typings.carbonComponentsReact

import typings.carbonComponentsReact.carbonComponentsReactStrings.tabIndex
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

object switcherItemMod {
  
  @JSImport("carbon-components-react/lib/components/UIShell/SwitcherItem", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[E /* <: js.Object */, R](props: ForwardRefProps[R, SwitcherItemProps[E]]): FCReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[FCReturn]
  
  type SwitcherItemProps[E /* <: js.Object */] = (Omit[LinkProps[E, E], tabIndex]) & SwitcherItemPropsBase
  
  trait SwitcherItemPropsBase
    extends StObject
       with RequiresChildrenProps[ReactNode] {
    
    var className: js.UndefOr[String] = js.undefined
    
    var isSelected: js.UndefOr[Boolean] = js.undefined
  }
  object SwitcherItemPropsBase {
    
    inline def apply(children: NonNullable[ReactNode]): SwitcherItemPropsBase = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[SwitcherItemPropsBase]
    }
    
    extension [Self <: SwitcherItemPropsBase](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
      
      inline def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
    }
  }
}
