package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceWorkerGlobalScopeEventMap
  extends StObject
     with WorkerGlobalScopeEventMap {
  
  var activate: ExtendableEvent
  
  var fetch: FetchEvent
  
  var install: ExtendableEvent
  
  var message: ExtendableMessageEvent
  
  var messageerror: MessageEvent[Any]
  
  var notificationclick: NotificationEvent
  
  var notificationclose: NotificationEvent
  
  var push: PushEvent
}
object ServiceWorkerGlobalScopeEventMap {
  
  inline def apply(
    activate: ExtendableEvent,
    error: ErrorEvent,
    fetch: FetchEvent,
    install: ExtendableEvent,
    languagechange: Event,
    message: ExtendableMessageEvent,
    messageerror: MessageEvent[Any],
    notificationclick: NotificationEvent,
    notificationclose: NotificationEvent,
    offline: Event,
    online: Event,
    push: PushEvent,
    rejectionhandled: PromiseRejectionEvent,
    unhandledrejection: PromiseRejectionEvent
  ): ServiceWorkerGlobalScopeEventMap = {
    val __obj = js.Dynamic.literal(activate = activate.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], fetch = fetch.asInstanceOf[js.Any], install = install.asInstanceOf[js.Any], languagechange = languagechange.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], messageerror = messageerror.asInstanceOf[js.Any], notificationclick = notificationclick.asInstanceOf[js.Any], notificationclose = notificationclose.asInstanceOf[js.Any], offline = offline.asInstanceOf[js.Any], online = online.asInstanceOf[js.Any], push = push.asInstanceOf[js.Any], rejectionhandled = rejectionhandled.asInstanceOf[js.Any], unhandledrejection = unhandledrejection.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceWorkerGlobalScopeEventMap]
  }
  
  extension [Self <: ServiceWorkerGlobalScopeEventMap](x: Self) {
    
    inline def setActivate(value: ExtendableEvent): Self = StObject.set(x, "activate", value.asInstanceOf[js.Any])
    
    inline def setFetch(value: FetchEvent): Self = StObject.set(x, "fetch", value.asInstanceOf[js.Any])
    
    inline def setInstall(value: ExtendableEvent): Self = StObject.set(x, "install", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: ExtendableMessageEvent): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageerror(value: MessageEvent[Any]): Self = StObject.set(x, "messageerror", value.asInstanceOf[js.Any])
    
    inline def setNotificationclick(value: NotificationEvent): Self = StObject.set(x, "notificationclick", value.asInstanceOf[js.Any])
    
    inline def setNotificationclose(value: NotificationEvent): Self = StObject.set(x, "notificationclose", value.asInstanceOf[js.Any])
    
    inline def setPush(value: PushEvent): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
  }
}
