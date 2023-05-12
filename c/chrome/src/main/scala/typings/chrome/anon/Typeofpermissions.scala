package typings.chrome.anon

import typings.chrome.chrome.permissions.Permissions
import typings.chrome.chrome.permissions.PermissionsAddedEvent
import typings.chrome.chrome.permissions.PermissionsRemovedEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofpermissions extends StObject {
  
  def contains(permissions: Permissions): js.Promise[Boolean] = js.native
  def contains(permissions: Permissions, callback: js.Function1[/* result */ Boolean, Unit]): Unit = js.native
  
  def getAll(): js.Promise[Permissions] = js.native
  def getAll(callback: js.Function1[/* permissions */ Permissions, Unit]): Unit = js.native
  
  var onAdded: PermissionsAddedEvent = js.native
  
  var onRemoved: PermissionsRemovedEvent = js.native
  
  def remove(permissions: Permissions): Unit = js.native
  def remove(permissions: Permissions, callback: js.Function1[/* removed */ Boolean, Unit]): Unit = js.native
  @JSName("remove")
  def remove_Promise(permissions: Permissions): js.Promise[Boolean] = js.native
  
  def request(permissions: Permissions): Unit = js.native
  def request(permissions: Permissions, callback: js.Function1[/* granted */ Boolean, Unit]): Unit = js.native
  @JSName("request")
  def request_Promise(permissions: Permissions): js.Promise[Boolean] = js.native
}
