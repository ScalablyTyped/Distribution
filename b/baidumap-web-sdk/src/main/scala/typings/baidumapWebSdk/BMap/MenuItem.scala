package typings.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuItem extends js.Object {
  def disable(): Unit
  def enable(): Unit
  def setIcon(iconUrl: String): Unit
  def setText(text: String): Unit
}

object MenuItem {
  @scala.inline
  def apply(disable: () => Unit, enable: () => Unit, setIcon: String => Unit, setText: String => Unit): MenuItem = {
    val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), setIcon = js.Any.fromFunction1(setIcon), setText = js.Any.fromFunction1(setText))
    __obj.asInstanceOf[MenuItem]
  }
}

