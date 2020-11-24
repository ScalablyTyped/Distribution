package typings.bmapgl.global.BMapGL

import typings.bmapgl.BMapGL.MenuItemOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BMapGL.MenuItem")
@js.native
class MenuItem protected ()
  extends typings.bmapgl.BMapGL.MenuItem {
  def this(text: String, callback: js.Function1[/* point */ typings.bmapgl.BMapGL.Point, Unit]) = this()
  def this(
    text: String,
    callback: js.Function1[/* point */ typings.bmapgl.BMapGL.Point, Unit],
    opts: MenuItemOptions
  ) = this()
}
