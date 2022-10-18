package typings.baseui

import typings.baseui.anon.Align
import typings.baseui.baseuiStrings.`flex-end`
import typings.baseui.baseuiStrings.`flex-start`
import typings.baseui.baseuiStrings.li_
import typings.baseui.baseuiStrings.nav
import typings.baseui.baseuiStrings.ul
import typings.baseui.headerNavigationHeaderNavigationMod.default
import typings.styletronReact.libTypesMod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headerNavigationMod {
  
  object ALIGN {
    
    @JSImport("baseui/header-navigation", "ALIGN.center")
    @js.native
    val center: typings.baseui.baseuiStrings.center = js.native
    
    @JSImport("baseui/header-navigation", "ALIGN.left")
    @js.native
    val left: `flex-start` = js.native
    
    @JSImport("baseui/header-navigation", "ALIGN.right")
    @js.native
    val right: `flex-end` = js.native
  }
  
  @JSImport("baseui/header-navigation", "HeaderNavigation")
  @js.native
  open class HeaderNavigation () extends default
  
  @JSImport("baseui/header-navigation", "StyledNavigationItem")
  @js.native
  val StyledNavigationItem: StyletronComponent[li_, js.Object] = js.native
  
  @JSImport("baseui/header-navigation", "StyledNavigationList")
  @js.native
  val StyledNavigationList: StyletronComponent[ul, Align] = js.native
  
  @JSImport("baseui/header-navigation", "StyledRoot")
  @js.native
  val StyledRoot: StyletronComponent[nav, js.Object] = js.native
}
