package typings.babylonjs.BABYLON

import typings.babylonjs.babylonjsStrings.abort
import typings.babylonjs.babylonjsStrings.error
import typings.babylonjs.babylonjsStrings.load
import typings.babylonjs.babylonjsStrings.loadend
import typings.babylonjs.babylonjsStrings.loadstart
import typings.babylonjs.babylonjsStrings.progress
import typings.babylonjs.babylonjsStrings.readystatechange
import typings.babylonjs.babylonjsStrings.timeout
import typings.std.AddEventListenerOptions
import typings.std.Document
import typings.std.Event
import typings.std.EventListenerOptions
import typings.std.EventTarget
import typings.std.ProgressEvent
import typings.std.XMLHttpRequest
import typings.std.XMLHttpRequestBodyInit
import typings.std.XMLHttpRequestEventTarget
import typings.std.XMLHttpRequestResponseType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebRequest
  extends StObject
     with IWebRequest {
  
  /* private */ var _injectCustomRequestHeaders: Any = js.native
  
  /* private */ var _requestURL: Any = js.native
  
  /* private */ var _shouldSkipRequestModifications: Any = js.native
  
  /* private */ val _xhr: Any = js.native
  
  /**
    * Cancels any network activity
    */
  def abort(): Unit = js.native
  
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent[XMLHttpRequestEventTarget], Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent[XMLHttpRequestEventTarget], Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent[XMLHttpRequestEventTarget], Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent[XMLHttpRequestEventTarget], Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent[XMLHttpRequestEventTarget], Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent[XMLHttpRequestEventTarget], Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(
    `type`: load,
    listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent[XMLHttpRequestEventTarget], Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(
    `type`: load,
    listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent[XMLHttpRequestEventTarget], Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(
    `type`: load,
    listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent[XMLHttpRequestEventTarget], Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadend(
    `type`: loadend,
    listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent[XMLHttpRequestEventTarget], Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadend(
    `type`: loadend,
    listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent[XMLHttpRequestEventTarget], Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadend(
    `type`: loadend,
    listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent[XMLHttpRequestEventTarget], Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstart(
    `type`: loadstart,
    listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent[XMLHttpRequestEventTarget], Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstart(
    `type`: loadstart,
    listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent[XMLHttpRequestEventTarget], Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstart(
    `type`: loadstart,
    listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent[XMLHttpRequestEventTarget], Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(
    `type`: progress,
    listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent[XMLHttpRequestEventTarget], Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(
    `type`: progress,
    listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent[XMLHttpRequestEventTarget], Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(
    `type`: progress,
    listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent[XMLHttpRequestEventTarget], Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  /** @internal */
  @JSName("addEventListener")
  def addEventListener_readystatechange(
    `type`: readystatechange,
    listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readystatechange(
    `type`: readystatechange,
    listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readystatechange(
    `type`: readystatechange,
    listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timeout(
    `type`: timeout,
    listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent[XMLHttpRequestEventTarget], Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timeout(
    `type`: timeout,
    listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent[XMLHttpRequestEventTarget], Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timeout(
    `type`: timeout,
    listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent[XMLHttpRequestEventTarget], Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /**
    * Get the string containing the text of a particular header's value.
    * @param name The name of the header
    * @returns The string containing the text of the given header name
    */
  def getResponseHeader(name: String): Nullable[String] = js.native
  
  /**
    * Gets or sets a function to be called when loading progress changes
    */
  def onprogress: (js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent[EventTarget], Any]) | Null = js.native
  def onprogress_=(
    value: (js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent[EventTarget], Any]) | Null
  ): Unit = js.native
  
  /**
    * Sets the request method, request URL
    * @param method defines the method to use (GET, POST, etc..)
    * @param url defines the url to connect with
    */
  def open(method: String, url: String): Unit = js.native
  
  /**
    * Returns client's state
    */
  def readyState: Double = js.native
  
  @JSName("removeEventListener")
  def removeEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent[XMLHttpRequestEventTarget], Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent[XMLHttpRequestEventTarget], Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent[XMLHttpRequestEventTarget], Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent[XMLHttpRequestEventTarget], Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent[XMLHttpRequestEventTarget], Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent[XMLHttpRequestEventTarget], Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_load(
    `type`: load,
    listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent[XMLHttpRequestEventTarget], Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_load(
    `type`: load,
    listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent[XMLHttpRequestEventTarget], Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_load(
    `type`: load,
    listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent[XMLHttpRequestEventTarget], Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadend(
    `type`: loadend,
    listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent[XMLHttpRequestEventTarget], Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadend(
    `type`: loadend,
    listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent[XMLHttpRequestEventTarget], Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadend(
    `type`: loadend,
    listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent[XMLHttpRequestEventTarget], Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadstart(
    `type`: loadstart,
    listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent[XMLHttpRequestEventTarget], Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadstart(
    `type`: loadstart,
    listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent[XMLHttpRequestEventTarget], Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadstart(
    `type`: loadstart,
    listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent[XMLHttpRequestEventTarget], Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_progress(
    `type`: progress,
    listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent[XMLHttpRequestEventTarget], Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_progress(
    `type`: progress,
    listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent[XMLHttpRequestEventTarget], Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_progress(
    `type`: progress,
    listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent[XMLHttpRequestEventTarget], Any],
    options: EventListenerOptions
  ): Unit = js.native
  /** @internal */
  @JSName("removeEventListener")
  def removeEventListener_readystatechange(
    `type`: readystatechange,
    listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_readystatechange(
    `type`: readystatechange,
    listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_readystatechange(
    `type`: readystatechange,
    listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_timeout(
    `type`: timeout,
    listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent[XMLHttpRequestEventTarget], Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_timeout(
    `type`: timeout,
    listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent[XMLHttpRequestEventTarget], Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_timeout(
    `type`: timeout,
    listener: js.ThisFunction1[/* this */ XMLHttpRequest, /* ev */ ProgressEvent[XMLHttpRequestEventTarget], Any],
    options: EventListenerOptions
  ): Unit = js.native
  
  /**
    * Returns client's response
    */
  def response: Any = js.native
  
  /**
    * Returns client's response as text
    */
  def responseText: String = js.native
  
  /**
    * Gets or sets the expected response type
    */
  def responseType: XMLHttpRequestResponseType = js.native
  def responseType_=(value: XMLHttpRequestResponseType): Unit = js.native
  
  /**
    * Returns client's response url
    */
  @JSName("responseURL")
  def responseURL_MWebRequest: String = js.native
  
  /**
    * Initiates the request. The optional argument provides the request body. The argument is ignored if request method is GET or HEAD
    * @param body defines an optional request body
    */
  def send(): Unit = js.native
  def send(body: Document): Unit = js.native
  def send(body: XMLHttpRequestBodyInit): Unit = js.native
  
  /**
    * Sets the value of a request header.
    * @param name The name of the header whose value is to be set
    * @param value The value to set as the body of the header
    */
  def setRequestHeader(name: String, value: String): Unit = js.native
  
  /**
    * Returns client's status as a text
    */
  @JSName("statusText")
  def statusText_MWebRequest: String = js.native
  
  /**
    * Returns client's status
    */
  @JSName("status")
  def status_MWebRequest: Double = js.native
  
  /**
    * Gets or sets the timeout value in milliseconds
    */
  def timeout: Double = js.native
  def timeout_=(value: Double): Unit = js.native
}
