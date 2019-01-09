package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CallbackContains extends js.Object {
  /** Fired when the app acquires new permissions. */
  val onAdded: chromeDashAppsLib.chromeNs.permissionsNs.PermissionEvent = js.native
  /** Fired when access to permissions has been removed from the app. */
  val onRemoved: chromeDashAppsLib.chromeNs.permissionsNs.PermissionEvent = js.native
  /**
    * Checks if the app has the specified permissions.
    * @param callback Parameter *result*: True if the app has the specified permissions.
    */
  def contains(
    permissions: chromeDashAppsLib.chromeNs.permissionsNs.Permissions,
    callback: js.Function1[/* result */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Gets the app's current set of permissions.
    * @param callback Parameter *permissions*: The app's active permissions.
    */
  def getAll(
    callback: js.Function1[/* permissions */ chromeDashAppsLib.chromeNs.permissionsNs.Permissions, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Removes access to the specified permissions. If there are any problems removing the permissions, runtime.lastError will be set.
    * @param [callback] Parameter *removed*: True if the permissions were removed.
    */
  def remove(permissions: chromeDashAppsLib.chromeNs.permissionsNs.Permissions): scala.Unit = js.native
  def remove(
    permissions: chromeDashAppsLib.chromeNs.permissionsNs.Permissions,
    callback: js.Function1[/* removed */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Requests access to the specified permissions.
    * These permissions must be defined in the optional_permissions field of the manifest.
    * If there are any problems requesting the permissions, runtime.lastError will be set.
    * @param [callback] Parameter *granted*: True if the user granted the specified permissions.
    */
  def request(permissions: chromeDashAppsLib.chromeNs.permissionsNs.Permissions): scala.Unit = js.native
  def request(
    permissions: chromeDashAppsLib.chromeNs.permissionsNs.Permissions,
    callback: js.Function1[/* granted */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
}

