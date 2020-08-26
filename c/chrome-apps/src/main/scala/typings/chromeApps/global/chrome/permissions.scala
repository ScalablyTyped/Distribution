package typings.chromeApps.global.chrome

import typings.chromeApps.chrome.permissions.PermissionEvent
import typings.chromeApps.chrome.permissions.Permissions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
// #region chrome.permissions
/////////////////
// Permissions //
/////////////////
/**
  * Use the chrome.permissions API to request declared optional permissions at run time rather than install time,
  * so users understand why the permissions are needed and grant only those that are necessary.
  * @since Chrome 16.
  */
@JSGlobal("chrome.permissions")
@js.native
object permissions extends js.Object {
  /** Fired when the app acquires new permissions. */
  val onAdded: PermissionEvent = js.native
  /** Fired when access to permissions has been removed from the app. */
  val onRemoved: PermissionEvent = js.native
  /**
    * Checks if the app has the specified permissions.
    * @param callback Parameter *result*: True if the app has the specified permissions.
    */
  def contains(permissions: Permissions, callback: js.Function1[/* result */ Boolean, Unit]): Unit = js.native
  /**
    * Gets the app's current set of permissions.
    * @param callback Parameter *permissions*: The app's active permissions.
    */
  def getAll(callback: js.Function1[/* permissions */ Permissions, Unit]): Unit = js.native
  /**
    * Removes access to the specified permissions. If there are any problems removing the permissions, runtime.lastError will be set.
    * @param [callback] Parameter *removed*: True if the permissions were removed.
    */
  def remove(permissions: Permissions): Unit = js.native
  def remove(permissions: Permissions, callback: js.Function1[/* removed */ Boolean, Unit]): Unit = js.native
  /**
    * Requests access to the specified permissions.
    * These permissions must be defined in the optional_permissions field of the manifest.
    * If there are any problems requesting the permissions, runtime.lastError will be set.
    * @param [callback] Parameter *granted*: True if the user granted the specified permissions.
    */
  def request(permissions: Permissions): Unit = js.native
  def request(permissions: Permissions, callback: js.Function1[/* granted */ Boolean, Unit]): Unit = js.native
}

