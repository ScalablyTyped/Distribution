package typings.cordovaPluginInappbrowser

import typings.cordovaPluginInappbrowser.anon.Code
import typings.cordovaPluginInappbrowser.anon.File
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The object returned from a call to window.open.
  * NOTE: The InAppBrowser window behaves like a standard web browser, and can't access Cordova APIs.
  */
@js.native
trait InAppBrowser extends Window {
  /**
    * Adds a listener for an event from the InAppBrowser.
    * @param type      any custom event that might occur.
    * @param callback  the function that executes when the event fires. The function is
    *                  passed an InAppBrowserEvent object as a parameter.
    */
  def addEventListener(`type`: String, callback: InAppBrowserEventListenerOrEventListenerObject): Unit = js.native
  // addEventListener overloads
  /**
    * Adds a listener for an event from the InAppBrowser.
    * @param type      loadstart: event fires when the InAppBrowser starts to load a URL.
    *                  loadstop: event fires when the InAppBrowser finishes loading a URL.
    *                  loaderror: event fires when the InAppBrowser encounters an error when loading a URL.
    *                  exit: event fires when the InAppBrowser window is closed.
    * @param callback  the function that executes when the event fires. The function is
    *                  passed an InAppBrowserEvent object as a parameter.
    */
  def addEventListener(`type`: channel, callback: InAppBrowserEventListenerOrEventListenerObject): Unit = js.native
  /** Closes the InAppBrowser window. */
  def close(): Unit = js.native
  /**
    * Injects JavaScript code into the InAppBrowser window.
    * @param script    Details of the script to run, specifying either a file or code key.
    * @param callback  The function that executes after the JavaScript code is injected.
    *                  If the injected script is of type code, the callback executes with
    *                  a single parameter, which is the return value of the script, wrapped in an Array.
    *                  For multi-line scripts, this is the return value of the last statement,
    *                  or the last expression evaluated.
    */
  def executeScript(script: Code, callback: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  def executeScript(script: File, callback: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  /** Hides the InAppBrowser window. Calling this has no effect if the InAppBrowser was already hidden. */
  def hide(): Unit = js.native
  /**
    * Injects CSS into the InAppBrowser window.
    * @param css       Details of the script to run, specifying either a file or code key.
    * @param callback  The function that executes after the CSS is injected.
    */
  def insertCSS(css: Code, callback: js.Function0[Unit]): Unit = js.native
  def insertCSS(css: File, callback: js.Function0[Unit]): Unit = js.native
  def onexit(`type`: InAppBrowserEvent): Unit = js.native
  def onloaderror(`type`: InAppBrowserEvent): Unit = js.native
  def onloadstart(`type`: Event): Unit = js.native
  def onloadstop(`type`: InAppBrowserEvent): Unit = js.native
  // removeEventListener overloads
  /**
    * Removes a listener for an event from the InAppBrowser.
    * @param type      The event to stop listening for.
    *                  loadstart: event fires when the InAppBrowser starts to load a URL.
    *                  loadstop: event fires when the InAppBrowser finishes loading a URL.
    *                  loaderror: event fires when the InAppBrowser encounters an error when loading a URL.
    *                  exit: event fires when the InAppBrowser window is closed.
    * @param callback  the function that executes when the event fires. The function is
    *                  passed an InAppBrowserEvent object as a parameter.
    */
  def removeEventListener(`type`: channel, callback: InAppBrowserEventListenerOrEventListenerObject): Unit = js.native
  /**
    * Displays an InAppBrowser window that was opened hidden. Calling this has no effect
    * if the InAppBrowser was already visible.
    */
  def show(): Unit = js.native
}

