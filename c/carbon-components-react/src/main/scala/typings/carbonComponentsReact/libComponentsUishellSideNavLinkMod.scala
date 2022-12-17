package typings.carbonComponentsReact

import typings.carbonComponentsReact.carbonComponentsReactStrings.element
import typings.carbonComponentsReact.libComponentsUishellLinkMod.LinkProps
import typings.carbonComponentsReact.typingsSharedMod.FCReturn
import typings.carbonComponentsReact.typingsSharedMod.ForwardRefProps
import typings.carbonComponentsReact.typingsSharedMod.RenderIconProps
import typings.carbonComponentsReact.typingsSharedMod.RequiresChildrenProps
import typings.carbonComponentsReact.typingsSharedMod.SideNavSharedProps
import typings.carbonComponentsReact.typingsSharedMod.SideNavSizingProps
import typings.react.mod.FC
import typings.std.HTMLElement
import typings.std.NonNullable
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsUishellSideNavLinkMod {
  
  @JSImport("carbon-components-react/lib/components/UIShell/SideNavLink", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[E /* <: js.Object */](props: ForwardRefProps[HTMLElement, SideNavLinkProps[E]]): FCReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[FCReturn]
  
  inline def createCustomSideNavLink_element[E /* <: js.Object */](
    element: /* import warning: importer.ImportType#apply Failed type conversion: carbon-components-react.carbon-components-react/lib/components/UIShell/SideNavLink.SideNavLinkProps<carbon-components-react.carbon-components-react/typings/shared.ReactAnchorAttr<std.HTMLAnchorElement>>['element'] */ js.Any
  ): SideNavLinkFC[Omit[E, element]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createCustomSideNavLink")(element.asInstanceOf[js.Any]).asInstanceOf[SideNavLinkFC[Omit[E, element]]]
  
  type SideNavLinkFC[E /* <: js.Object */] = FC[SideNavLinkProps[E]]
  
  type SideNavLinkProps[E /* <: js.Object */] = (LinkProps[E, E]) & SideNavLinkPropsBase
  
  trait SideNavLinkPropsBase
    extends StObject
       with RenderIconProps[Any]
       with RequiresChildrenProps[String]
       with SideNavSharedProps
       with SideNavSizingProps {
    
    var className: js.UndefOr[String] = js.undefined
  }
  object SideNavLinkPropsBase {
    
    inline def apply(children: NonNullable[String]): SideNavLinkPropsBase = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[SideNavLinkPropsBase]
    }
    
    extension [Self <: SideNavLinkPropsBase](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    }
  }
}
