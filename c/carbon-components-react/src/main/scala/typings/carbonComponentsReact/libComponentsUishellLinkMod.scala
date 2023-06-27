package typings.carbonComponentsReact

import typings.carbonComponentsReact.carbonComponentsReactStrings.element
import typings.carbonComponentsReact.typingsSharedMod.FCReturn
import typings.carbonComponentsReact.typingsSharedMod.ForwardRefProps
import typings.carbonComponentsReact.typingsSharedMod.Overwrite
import typings.carbonComponentsReact.typingsSharedMod.SideNavSharedProps
import typings.react.mod.JSXElementConstructor
import typings.react.mod.ReactNode
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsUishellLinkMod {
  
  @JSImport("carbon-components-react/lib/components/UIShell/Link", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[P /* <: js.Object */, R](props: ForwardRefProps[R, LinkProps[P, P]]): FCReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[FCReturn]
  
  type InnerElementProps[P] = Omit[P, element]
  
  type LinkProps[P /* <: js.Object */, IP] = Overwrite[P, LinkPropsBase[IP]]
  
  trait LinkPropsBase[P]
    extends StObject
       with SideNavSharedProps {
    
    var element: js.UndefOr[String | JSXElementConstructor[InnerElementProps[P]]] = js.undefined
  }
  object LinkPropsBase {
    
    inline def apply[P](): LinkPropsBase[P] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LinkPropsBase[P]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LinkPropsBase[?], P] (val x: Self & LinkPropsBase[P]) extends AnyVal {
      
      inline def setElement(value: String | JSXElementConstructor[InnerElementProps[P]]): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementFunction2(value: (InnerElementProps[P], /* deprecatedLegacyContext */ js.UndefOr[Any]) => ReactNode): Self = StObject.set(x, "element", js.Any.fromFunction2(value))
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    }
  }
}
