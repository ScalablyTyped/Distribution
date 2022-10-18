package typings.baseui

import typings.baseui.baseuiStrings.div
import typings.baseui.baseuiStrings.li_
import typings.baseui.baseuiStrings.nav
import typings.baseui.baseuiStrings.ol
import typings.baseui.breadcrumbsTypesMod.BreadcrumbsProps
import typings.react.mod.global.JSX.Element
import typings.styletronReact.libTypesMod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object breadcrumbsMod {
  
  object Breadcrumbs {
    
    inline def apply(props: BreadcrumbsProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("baseui/breadcrumbs", "Breadcrumbs")
    @js.native
    val ^ : js.Any = js.native
    
    object defaultProps {
      
      @JSImport("baseui/breadcrumbs", "Breadcrumbs.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("baseui/breadcrumbs", "Breadcrumbs.defaultProps.showTrailingSeparator")
      @js.native
      def showTrailingSeparator: Boolean = js.native
      inline def showTrailingSeparator_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showTrailingSeparator")(x.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("baseui/breadcrumbs", "StyledList")
  @js.native
  val StyledList: StyletronComponent[ol, js.Object] = js.native
  
  @JSImport("baseui/breadcrumbs", "StyledListItem")
  @js.native
  val StyledListItem: StyletronComponent[li_, js.Object] = js.native
  
  @JSImport("baseui/breadcrumbs", "StyledRoot")
  @js.native
  val StyledRoot: StyletronComponent[nav, js.Object] = js.native
  
  @JSImport("baseui/breadcrumbs", "StyledSeparator")
  @js.native
  val StyledSeparator: StyletronComponent[div, js.Object] = js.native
}
