package typings.baseui

import typings.baseui.breadcrumbsTypesMod.BreadcrumbsProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object breadcrumbsBreadcrumbsMod {
  
  object default {
    
    inline def apply(props: BreadcrumbsProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("baseui/breadcrumbs/breadcrumbs", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object defaultProps {
      
      @JSImport("baseui/breadcrumbs/breadcrumbs", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("baseui/breadcrumbs/breadcrumbs", "default.defaultProps.showTrailingSeparator")
      @js.native
      def showTrailingSeparator: Boolean = js.native
      inline def showTrailingSeparator_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showTrailingSeparator")(x.asInstanceOf[js.Any])
    }
  }
  
  object Breadcrumbs {
    
    inline def apply(props: BreadcrumbsProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("baseui/breadcrumbs/breadcrumbs", "Breadcrumbs")
    @js.native
    val ^ : js.Any = js.native
    
    object defaultProps {
      
      @JSImport("baseui/breadcrumbs/breadcrumbs", "Breadcrumbs.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("baseui/breadcrumbs/breadcrumbs", "Breadcrumbs.defaultProps.showTrailingSeparator")
      @js.native
      def showTrailingSeparator: Boolean = js.native
      inline def showTrailingSeparator_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showTrailingSeparator")(x.asInstanceOf[js.Any])
    }
  }
}
