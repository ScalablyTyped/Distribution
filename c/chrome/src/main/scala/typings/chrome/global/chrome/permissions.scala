package typings.chrome.global.chrome

import typings.chrome.chrome.permissions.Permissions
import typings.chrome.chrome.permissions.PermissionsAddedEvent
import typings.chrome.chrome.permissions.PermissionsRemovedEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Permissions
////////////////////
/**
  * Use the chrome.permissions API to request declared optional permissions at run time rather than install time, so users understand why the permissions are needed and grant only those that are necessary.
  * @since Chrome 16.
  */
object permissions {
  
  @JSGlobal("chrome.permissions")
  @js.native
  val ^ : js.Any = js.native
  
  inline def contains(permissions: Permissions, callback: js.Function1[/* result */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(permissions.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getAll(callback: js.Function1[/* permissions */ Permissions, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getAll")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSGlobal("chrome.permissions.onAdded")
  @js.native
  def onAdded: PermissionsAddedEvent = js.native
  inline def onAdded_=(x: PermissionsAddedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onAdded")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.permissions.onRemoved")
  @js.native
  def onRemoved: PermissionsRemovedEvent = js.native
  inline def onRemoved_=(x: PermissionsRemovedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onRemoved")(x.asInstanceOf[js.Any])
  
  inline def remove(permissions: Permissions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(permissions.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def remove(permissions: Permissions, callback: js.Function1[/* removed */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(permissions.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def request(permissions: Permissions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("request")(permissions.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def request(permissions: Permissions, callback: js.Function1[/* granted */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(permissions.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
