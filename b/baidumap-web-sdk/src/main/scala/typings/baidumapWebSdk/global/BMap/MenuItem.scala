package typings.baidumapWebSdk.global.BMap

import typings.baidumapWebSdk.BMap.MenuItemOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BMap.MenuItem")
@js.native
class MenuItem protected ()
  extends typings.baidumapWebSdk.BMap.MenuItem {
  def this(text: String, callback: js.Function1[/* point */ typings.baidumapWebSdk.BMap.Point, Unit]) = this()
  def this(
    text: String,
    callback: js.Function1[/* point */ typings.baidumapWebSdk.BMap.Point, Unit],
    opts: MenuItemOptions
  ) = this()
}

