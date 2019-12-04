package typings.baseui.menuMod

import typings.react.reactMod.Component
import typings.react.reactMod.Ref
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/menu", "NestedMenus")
@js.native
class NestedMenus ()
  extends Component[NestedMenuProps, NestedMenuState, js.Any] {
  def addMenuToNesting(ref: Ref[HTMLElement]): Unit = js.native
  def findMenuIndexByRef(ref: Ref[HTMLElement]): Double = js.native
  def getChildMenu(ref: Ref[HTMLElement]): Ref[HTMLElement] = js.native
  def getParentMenu(ref: Ref[HTMLElement]): Ref[HTMLElement] = js.native
  def removeMenuFromNesting(ref: Ref[HTMLElement]): Unit = js.native
}

