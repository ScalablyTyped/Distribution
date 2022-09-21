package typings.baseui

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Shortcut
import typings.baseui.anon.IsFocusVisible
import typings.baseui.anon.TypeofNavItem
import typings.baseui.baseuiStrings.a
import typings.baseui.baseuiStrings.item
import typings.baseui.baseuiStrings.itemMemoizationComparator
import typings.baseui.baseuiStrings.onSelect
import typings.baseui.baseuiStrings.overrides
import typings.baseui.sideNavigationTypesMod.NavItemProps
import typings.react.mod.Component
import typings.react.mod.ComponentProps
import typings.react.mod.MemoExoticComponent
import typings.std.Event
import typings.std.KeyboardEvent
import typings.std.Omit
import typings.styletronReact.typesMod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navItemMod {
  
  object default extends Shortcut {
    
    @JSImport("baseui/side-navigation/nav-item", JSImport.Default)
    @js.native
    val ^ : MemoExoticComponent[TypeofNavItem & Instantiable0[NavItem]] = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("baseui/side-navigation/nav-item", "default.type")
    @js.native
    open class `type` () extends NavItem
    
    type _To = MemoExoticComponent[TypeofNavItem & Instantiable0[NavItem]]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: MemoExoticComponent[TypeofNavItem & Instantiable0[NavItem]] = ^
  }
  
  @js.native
  trait NavItem
    extends Component[NavItemProps & SharedProps, js.Object, Any] {
    
    def handleClick(event: Event): Unit = js.native
    
    def handleKeyDown(event: KeyboardEvent): Unit = js.native
  }
  
  type SharedProps = Omit[
    (ComponentProps[StyletronComponent[a, IsFocusVisible]]) & (ComponentProps[TypeofNavItem & Instantiable0[NavItem]]), 
    onSelect | item | overrides | itemMemoizationComparator
  ]
}
