package typings.chrome.global.chrome

import typings.chrome.chrome.permissions.Permissions
import typings.chrome.chrome.permissions.PermissionsAddedEvent
import typings.chrome.chrome.permissions.PermissionsRemovedEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  @JSGlobal("chrome.permissions.contains")
  @js.native
  def contains(permissions: Permissions, callback: js.Function1[/* result */ Boolean, Unit]): Unit = js.native
  
  @JSGlobal("chrome.permissions.getAll")
  @js.native
  def getAll(callback: js.Function1[/* permissions */ Permissions, Unit]): Unit = js.native
  
  @JSGlobal("chrome.permissions.onAdded")
  @js.native
  def onAdded: PermissionsAddedEvent = js.native
  @scala.inline
  def onAdded_=(x: PermissionsAddedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onAdded")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.permissions.onRemoved")
  @js.native
  def onRemoved: PermissionsRemovedEvent = js.native
  @scala.inline
  def onRemoved_=(x: PermissionsRemovedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onRemoved")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.permissions.remove")
  @js.native
  def remove(permissions: Permissions): Unit = js.native
  @JSGlobal("chrome.permissions.remove")
  @js.native
  def remove(permissions: Permissions, callback: js.Function1[/* removed */ Boolean, Unit]): Unit = js.native
  
  @JSGlobal("chrome.permissions.request")
  @js.native
  def request(permissions: Permissions): Unit = js.native
  @JSGlobal("chrome.permissions.request")
  @js.native
  def request(permissions: Permissions, callback: js.Function1[/* granted */ Boolean, Unit]): Unit = js.native
}
