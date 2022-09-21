package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This Push API interface provides a way to receive notifications from third-party servers as well as request URLs for push notifications.
  * Available only in secure contexts.
  */
@js.native
trait PushManager extends StObject {
  
  def getSubscription(): Promise[PushSubscription | Null] = js.native
  
  def permissionState(): Promise[PermissionState] = js.native
  def permissionState(options: PushSubscriptionOptionsInit): Promise[PermissionState] = js.native
  
  def subscribe(): Promise[PushSubscription] = js.native
  def subscribe(options: PushSubscriptionOptionsInit): Promise[PushSubscription] = js.native
}
