package typings.baseui.sideDashNavigationMod

import typings.react.reactMod.Component
import typings.react.reactMod.KeyboardEvent
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.NativeMouseEvent
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/side-navigation", "NavItem")
@js.native
class NavItem ()
  extends Component[NavItemProps, js.Object, js.Any] {
  def handleClick(event: MouseEvent[Element, NativeMouseEvent]): Unit = js.native
  def handleKeyDown(event: KeyboardEvent[Element]): Unit = js.native
}

