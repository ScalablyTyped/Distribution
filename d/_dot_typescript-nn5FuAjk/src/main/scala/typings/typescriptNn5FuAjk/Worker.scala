package typings.typescriptNn5FuAjk

import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.message
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.messageerror
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This Web Workers API interface represents a background task that can be easily created and can send messages back to its creator. Creating a worker is as simple as calling the Worker() constructor and specifying a script to be run in the worker thread. */
@js.native
trait Worker
  extends StObject
     with EventTarget
     with AbstractWorker {
  
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(
    `type`: java.lang.String,
    callback: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(`type`: message, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any],
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
  
  var onmessage: (js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any]) | Null = js.native
  
  var onmessageerror: (js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any]) | Null = js.native
  
  def postMessage(message: Any): Unit = js.native
  def postMessage(message: Any, options: StructuredSerializeOptions): Unit = js.native
  /** Clones message and transmits it to worker's global environment. transfer can be passed as a list of objects that are to be transferred rather than cloned. */
  def postMessage(message: Any, transfer: Array[Transferable]): Unit = js.native
  
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    callback: EventListenerOrEventListenerObject,
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(`type`: message, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any],
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
  
  /** Aborts worker's associated global environment. */
  def terminate(): Unit = js.native
}
