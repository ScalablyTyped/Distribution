package typings.chromeApps.global.chrome

import typings.chromeApps.chrome.permissions.PermissionEvent
import typings.chromeApps.chrome.permissions.Permissions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  
  @JSGlobal("chrome.permissions")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Checks if the app has the specified permissions.
    * @param callback Parameter *result*: True if the app has the specified permissions.
    */
  @scala.inline
  def contains(permissions: Permissions, callback: js.Function1[/* result */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(permissions.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Gets the app's current set of permissions.
    * @param callback Parameter *permissions*: The app's active permissions.
    */
  @scala.inline
  def getAll(callback: js.Function1[/* permissions */ Permissions, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getAll")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
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
  @scala.inline
  def remove(permissions: Permissions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(permissions.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def remove(permissions: Permissions, callback: js.Function1[/* removed */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(permissions.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Requests access to the specified permissions.
    * These permissions must be defined in the optional_permissions field of the manifest.
    * If there are any problems requesting the permissions, runtime.lastError will be set.
    * @param [callback] Parameter *granted*: True if the user granted the specified permissions.
    */
  @scala.inline
  def request(permissions: Permissions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("request")(permissions.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def request(permissions: Permissions, callback: js.Function1[/* granted */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(permissions.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
