package typings.baseui.sideNavigationMod

import typings.react.mod.Component
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
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

