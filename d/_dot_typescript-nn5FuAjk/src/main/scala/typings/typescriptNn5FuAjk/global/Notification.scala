package typings.typescriptNn5FuAjk.global

import typings.typescriptNn5FuAjk.NotificationOptions
import typings.typescriptNn5FuAjk.NotificationPermission
import typings.typescriptNn5FuAjk.NotificationPermissionCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Notification")
@js.native
open class Notification protected ()
  extends StObject
     with typings.typescriptNn5FuAjk.Notification {
  def this(title: java.lang.String) = this()
  def this(title: java.lang.String, options: NotificationOptions) = this()
}
object Notification {
  
  @JSGlobal("Notification")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("Notification.permission")
  @js.native
  val permission: NotificationPermission = js.native
  
  inline def requestPermission(): typings.typescriptNn5FuAjk.Promise[NotificationPermission] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestPermission")().asInstanceOf[typings.typescriptNn5FuAjk.Promise[NotificationPermission]]
  inline def requestPermission(deprecatedCallback: NotificationPermissionCallback): typings.typescriptNn5FuAjk.Promise[NotificationPermission] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestPermission")(deprecatedCallback.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptNn5FuAjk.Promise[NotificationPermission]]
}
