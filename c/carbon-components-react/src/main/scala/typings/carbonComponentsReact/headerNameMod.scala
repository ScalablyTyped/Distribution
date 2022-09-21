package typings.carbonComponentsReact

import typings.carbonComponentsReact.typingsSharedMod.FCProps
import typings.carbonComponentsReact.typingsSharedMod.FCReturn
import typings.carbonComponentsReact.typingsSharedMod.RequiresChildrenProps
import typings.carbonComponentsReact.uishellLinkMod.LinkProps
import typings.react.mod.ReactNode
import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headerNameMod {
  
  @JSImport("carbon-components-react/lib/components/UIShell/HeaderName", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[E /* <: js.Object */](props: FCProps[HeaderNameProps[E]]): FCReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[FCReturn]
  
  type HeaderNameProps[E /* <: js.Object */] = (LinkProps[E, E]) & HeaderNamePropsBase
  
  trait HeaderNamePropsBase
    extends StObject
       with RequiresChildrenProps[ReactNode] {
    
    var className: js.UndefOr[String] = js.undefined
    
    var href: js.UndefOr[String] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
  }
  object HeaderNamePropsBase {
    
    inline def apply(children: NonNullable[ReactNode]): HeaderNamePropsBase = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeaderNamePropsBase]
    }
    
    extension [Self <: HeaderNamePropsBase](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    }
  }
}
