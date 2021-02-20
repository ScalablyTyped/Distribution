package typings.chromeApps.global.chrome

import typings.chromeApps.chrome.permissions.PermissionEvent
import typings.chromeApps.chrome.permissions.Permissions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
object permissions {
  
  /**
    * Checks if the app has the specified permissions.
    * @param callback Parameter *result*: True if the app has the specified permissions.
    */
  @JSGlobal("chrome.permissions.contains")
  @js.native
  def contains(permissions: Permissions, callback: js.Function1[/* result */ Boolean, Unit]): Unit = js.native
  
  /**
    * Gets the app's current set of permissions.
    * @param callback Parameter *permissions*: The app's active permissions.
    */
  @JSGlobal("chrome.permissions.getAll")
  @js.native
  def getAll(callback: js.Function1[/* permissions */ Permissions, Unit]): Unit = js.native
  
  /** Fired when the app acquires new permissions. */
  @JSGlobal("chrome.permissions.onAdded")
  @js.native
  val onAdded: PermissionEvent = js.native
  
  /** Fired when access to permissions has been removed from the app. */
  @JSGlobal("chrome.permissions.onRemoved")
  @js.native
  val onRemoved: PermissionEvent = js.native
  
  /**
    * Removes access to the specified permissions. If there are any problems removing the permissions, runtime.lastError will be set.
    * @param [callback] Parameter *removed*: True if the permissions were removed.
    */
  @JSGlobal("chrome.permissions.remove")
  @js.native
  def remove(permissions: Permissions): Unit = js.native
  @JSGlobal("chrome.permissions.remove")
  @js.native
  def remove(permissions: Permissions, callback: js.Function1[/* removed */ Boolean, Unit]): Unit = js.native
  
  /**
    * Requests access to the specified permissions.
    * These permissions must be defined in the optional_permissions field of the manifest.
    * If there are any problems requesting the permissions, runtime.lastError will be set.
    * @param [callback] Parameter *granted*: True if the user granted the specified permissions.
    */
  @JSGlobal("chrome.permissions.request")
  @js.native
  def request(permissions: Permissions): Unit = js.native
  @JSGlobal("chrome.permissions.request")
  @js.native
  def request(permissions: Permissions, callback: js.Function1[/* granted */ Boolean, Unit]): Unit = js.native
}
