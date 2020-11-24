package typings.chrome.global.chrome

import typings.chrome.chrome.permissions.Permissions
import typings.chrome.chrome.permissions.PermissionsAddedEvent
import typings.chrome.chrome.permissions.PermissionsRemovedEvent
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
@JSGlobal("chrome.permissions")
@js.native
object permissions extends js.Object {
  
  def contains(permissions: Permissions, callback: js.Function1[/* result */ Boolean, Unit]): Unit = js.native
  
  def getAll(callback: js.Function1[/* permissions */ Permissions, Unit]): Unit = js.native
  
  var onAdded: PermissionsAddedEvent = js.native
  
  var onRemoved: PermissionsRemovedEvent = js.native
  
  def remove(permissions: Permissions): Unit = js.native
  def remove(permissions: Permissions, callback: js.Function1[/* removed */ Boolean, Unit]): Unit = js.native
  
  def request(permissions: Permissions): Unit = js.native
  def request(permissions: Permissions, callback: js.Function1[/* granted */ Boolean, Unit]): Unit = js.native
}
