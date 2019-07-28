package typings.baidumapDashWebDashSdk.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BMap.MenuItem")
@js.native
class MenuItem protected () extends js.Object {
  def this(text: String, callback: js.Function1[/* point */ Point, Unit]) = this()
  def this(text: String, callback: js.Function1[/* point */ Point, Unit], opts: MenuItemOptions) = this()
  def disable(): Unit = js.native
  def enable(): Unit = js.native
  def setIcon(iconUrl: String): Unit = js.native
  def setText(text: String): Unit = js.native
}

