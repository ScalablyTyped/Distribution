package typings
package chromeLib.chromeNs.contextMenusNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.contextMenus")
@js.native
object ^ extends js.Object {
  var ACTION_MENU_TOP_LEVEL_LIMIT: scala.Double = js.native
  var onClicked: MenuClickedEvent = js.native
  def create(createProperties: CreateProperties): scala.Unit = js.native
  def create(createProperties: CreateProperties, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def remove(menuItemId: java.lang.String): scala.Unit = js.native
  def remove(menuItemId: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def remove(menuItemId: scala.Double): scala.Unit = js.native
  def remove(menuItemId: scala.Double, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def removeAll(): scala.Unit = js.native
  def removeAll(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def update(id: java.lang.String, updateProperties: UpdateProperties): scala.Unit = js.native
  def update(id: java.lang.String, updateProperties: UpdateProperties, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def update(id: scala.Double, updateProperties: UpdateProperties): scala.Unit = js.native
  def update(id: scala.Double, updateProperties: UpdateProperties, callback: js.Function0[scala.Unit]): scala.Unit = js.native
}

