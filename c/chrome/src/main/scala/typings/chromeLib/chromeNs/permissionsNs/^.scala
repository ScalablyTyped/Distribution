package typings
package chromeLib.chromeNs.permissionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.permissions")
@js.native
object ^ extends js.Object {
  var onAdded: PermissionsAddedEvent = js.native
  var onRemoved: PermissionsRemovedEvent = js.native
  def contains(permissions: Permissions, callback: js.Function1[/* result */ scala.Boolean, scala.Unit]): scala.Unit = js.native
  def getAll(callback: js.Function1[/* permissions */ Permissions, scala.Unit]): scala.Unit = js.native
  def remove(permissions: Permissions): scala.Unit = js.native
  def remove(permissions: Permissions, callback: js.Function1[/* removed */ scala.Boolean, scala.Unit]): scala.Unit = js.native
  def request(permissions: Permissions): scala.Unit = js.native
  def request(permissions: Permissions, callback: js.Function1[/* granted */ scala.Boolean, scala.Unit]): scala.Unit = js.native
}

