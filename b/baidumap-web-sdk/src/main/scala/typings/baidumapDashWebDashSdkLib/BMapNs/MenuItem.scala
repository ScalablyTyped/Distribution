package typings
package baidumapDashWebDashSdkLib.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BMap.MenuItem")
@js.native
class MenuItem protected () extends js.Object {
  def this(text: java.lang.String, callback: js.Function1[/* point */ Point, scala.Unit]) = this()
  def this(text: java.lang.String, callback: js.Function1[/* point */ Point, scala.Unit], opts: MenuItemOptions) = this()
  def disable(): scala.Unit = js.native
  def enable(): scala.Unit = js.native
  def setIcon(iconUrl: java.lang.String): scala.Unit = js.native
  def setText(text: java.lang.String): scala.Unit = js.native
}

