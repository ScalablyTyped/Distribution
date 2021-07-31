package typings.carbonComponentsReact

import typings.carbonComponentsReact.typingsSharedMod.FCProps
import typings.carbonComponentsReact.typingsSharedMod.FCReturn
import typings.carbonComponentsReact.typingsSharedMod.RequiresChildrenProps
import typings.carbonComponentsReact.uishellLinkMod.LinkProps
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headerNameMod {
  
  @JSImport("carbon-components-react/lib/components/UIShell/HeaderName", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[E /* <: js.Object */](props: FCProps[HeaderNameProps[E]]): FCReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[FCReturn]
  
  type HeaderNameProps[E /* <: js.Object */] = (LinkProps[E, E]) & HeaderNamePropsBase
  
  trait HeaderNamePropsBase
    extends StObject
       with RequiresChildrenProps[ReactNode] {
    
    var className: js.UndefOr[String] = js.undefined
    
    var href: js.UndefOr[String] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
  }
  object HeaderNamePropsBase {
    
    @scala.inline
    def apply(): HeaderNamePropsBase = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeaderNamePropsBase]
    }
    
    @scala.inline
    implicit class HeaderNamePropsBaseMutableBuilder[Self <: HeaderNamePropsBase] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    }
  }
}
