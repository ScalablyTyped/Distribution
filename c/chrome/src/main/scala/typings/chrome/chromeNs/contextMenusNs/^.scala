package typings.chrome.chromeNs.contextMenusNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.contextMenus")
@js.native
object ^ extends js.Object {
  var ACTION_MENU_TOP_LEVEL_LIMIT: Double = js.native
  var onClicked: MenuClickedEvent = js.native
  def create(createProperties: CreateProperties): Unit = js.native
  def create(createProperties: CreateProperties, callback: js.Function0[Unit]): Unit = js.native
  def remove(menuItemId: String): Unit = js.native
  def remove(menuItemId: String, callback: js.Function0[Unit]): Unit = js.native
  def remove(menuItemId: Double): Unit = js.native
  def remove(menuItemId: Double, callback: js.Function0[Unit]): Unit = js.native
  def removeAll(): Unit = js.native
  def removeAll(callback: js.Function0[Unit]): Unit = js.native
  def update(id: String, updateProperties: UpdateProperties): Unit = js.native
  def update(id: String, updateProperties: UpdateProperties, callback: js.Function0[Unit]): Unit = js.native
  def update(id: Double, updateProperties: UpdateProperties): Unit = js.native
  def update(id: Double, updateProperties: UpdateProperties, callback: js.Function0[Unit]): Unit = js.native
}

