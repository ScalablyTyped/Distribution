package typings.baseui

import typings.baseui.anon.ActiveItemId
import typings.baseui.anon.IsFocusVisibleBoolean
import typings.baseui.sideNavigationTypesMod.Item
import typings.baseui.sideNavigationTypesMod.NavigationProps
import typings.react.mod.Component
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navMod {
  
  @JSImport("baseui/side-navigation/nav", JSImport.Default)
  @js.native
  open class default () extends SideNav
  /* static members */
  object default {
    
    @JSImport("baseui/side-navigation/nav", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/side-navigation/nav", "default.defaultProps")
    @js.native
    def defaultProps: ActiveItemId = js.native
    inline def defaultProps_=(x: ActiveItemId): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait SideNav extends Component[NavigationProps, IsFocusVisibleBoolean, Any] {
    
    def activePredicate(item: Item): Boolean = js.native
    
    def handleBlur(event: SyntheticEvent[Element, Event]): Unit = js.native
    
    def handleFocus(event: SyntheticEvent[Element, Event]): Unit = js.native
  }
}
