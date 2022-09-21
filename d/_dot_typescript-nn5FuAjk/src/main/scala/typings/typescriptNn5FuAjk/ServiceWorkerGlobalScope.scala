package typings.typescriptNn5FuAjk

import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.activate
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.fetch
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.install
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.message
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.messageerror
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.notificationclick
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.notificationclose
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.push
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This ServiceWorker API interface represents the global execution context of a service worker. */
@js.native
trait ServiceWorkerGlobalScope
  extends StObject
     with WorkerGlobalScope {
  
  @JSName("addEventListener")
  def addEventListener_activate(`type`: activate, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ExtendableEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_activate(
    `type`: activate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ExtendableEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_activate(
    `type`: activate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ExtendableEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fetch(`type`: fetch, listener: js.ThisFunction1[/* this */ this.type, /* ev */ FetchEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fetch(
    `type`: fetch,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ FetchEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fetch(
    `type`: fetch,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ FetchEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_install(`type`: install, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ExtendableEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_install(
    `type`: install,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ExtendableEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_install(
    `type`: install,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ExtendableEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ExtendableMessageEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ExtendableMessageEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ExtendableMessageEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_messageerror(
    `type`: messageerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_messageerror(
    `type`: messageerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_messageerror(
    `type`: messageerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_notificationclick(
    `type`: notificationclick,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ NotificationEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_notificationclick(
    `type`: notificationclick,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ NotificationEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_notificationclick(
    `type`: notificationclick,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ NotificationEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_notificationclose(
    `type`: notificationclose,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ NotificationEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_notificationclose(
    `type`: notificationclose,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ NotificationEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_notificationclose(
    `type`: notificationclose,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ NotificationEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_push(`type`: push, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PushEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_push(
    `type`: push,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PushEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_push(
    `type`: push,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PushEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  val clients: Clients = js.native
  
  var onactivate: (js.ThisFunction1[/* this */ this.type, /* ev */ ExtendableEvent, Any]) | Null = js.native
  
  var onfetch: (js.ThisFunction1[/* this */ this.type, /* ev */ FetchEvent, Any]) | Null = js.native
  
  var oninstall: (js.ThisFunction1[/* this */ this.type, /* ev */ ExtendableEvent, Any]) | Null = js.native
  
  var onmessage: (js.ThisFunction1[/* this */ this.type, /* ev */ ExtendableMessageEvent, Any]) | Null = js.native
  
  var onmessageerror: (js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any]) | Null = js.native
  
  var onnotificationclick: (js.ThisFunction1[/* this */ this.type, /* ev */ NotificationEvent, Any]) | Null = js.native
  
  var onnotificationclose: (js.ThisFunction1[/* this */ this.type, /* ev */ NotificationEvent, Any]) | Null = js.native
  
  var onpush: (js.ThisFunction1[/* this */ this.type, /* ev */ PushEvent, Any]) | Null = js.native
  
  val registration: ServiceWorkerRegistration = js.native
  
  @JSName("removeEventListener")
  def removeEventListener_activate(`type`: activate, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ExtendableEvent, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_activate(
    `type`: activate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ExtendableEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_activate(
    `type`: activate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ExtendableEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_fetch(`type`: fetch, listener: js.ThisFunction1[/* this */ this.type, /* ev */ FetchEvent, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_fetch(
    `type`: fetch,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ FetchEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_fetch(
    `type`: fetch,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ FetchEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_install(`type`: install, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ExtendableEvent, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_install(
    `type`: install,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ExtendableEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_install(
    `type`: install,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ExtendableEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ExtendableMessageEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ExtendableMessageEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ExtendableMessageEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_messageerror(
    `type`: messageerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_messageerror(
    `type`: messageerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_messageerror(
    `type`: messageerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_notificationclick(
    `type`: notificationclick,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ NotificationEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_notificationclick(
    `type`: notificationclick,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ NotificationEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_notificationclick(
    `type`: notificationclick,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ NotificationEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_notificationclose(
    `type`: notificationclose,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ NotificationEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_notificationclose(
    `type`: notificationclose,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ NotificationEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_notificationclose(
    `type`: notificationclose,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ NotificationEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_push(`type`: push, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PushEvent, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_push(
    `type`: push,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PushEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_push(
    `type`: push,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PushEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  
  def skipWaiting(): Promise[Unit] = js.native
}
