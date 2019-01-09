package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CallbackContains extends js.Object {
  var onAdded: chromeLib.chromeNs.permissionsNs.PermissionsAddedEvent = js.native
  var onRemoved: chromeLib.chromeNs.permissionsNs.PermissionsRemovedEvent = js.native
  def contains(
    permissions: chromeLib.chromeNs.permissionsNs.Permissions,
    callback: js.Function1[/* result */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def getAll(callback: js.Function1[/* permissions */ chromeLib.chromeNs.permissionsNs.Permissions, scala.Unit]): scala.Unit = js.native
  def remove(permissions: chromeLib.chromeNs.permissionsNs.Permissions): scala.Unit = js.native
  def remove(
    permissions: chromeLib.chromeNs.permissionsNs.Permissions,
    callback: js.Function1[/* removed */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def request(permissions: chromeLib.chromeNs.permissionsNs.Permissions): scala.Unit = js.native
  def request(
    permissions: chromeLib.chromeNs.permissionsNs.Permissions,
    callback: js.Function1[/* granted */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
}

