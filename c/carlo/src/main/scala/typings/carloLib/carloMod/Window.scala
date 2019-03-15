package typings
package carloLib.carloMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Window extends js.Object {
  @JSName("evaluate")
  var evaluate_Original: EvaluateFunction = js.native
  /**
    * Returns window bounds
    */
  def bounds(): js.Promise[Bounds] = js.native
  /**
    * Brings this window to front.
    */
  def bringToFront(): js.Promise[scala.Unit] = js.native
  /**
    * Closes this window.
    */
  def close(): js.Promise[scala.Unit] = js.native
  def evaluate(pageFunction: java.lang.String, args: puppeteerLib.puppeteerMod.Serializable*): js.Promise[puppeteerLib.puppeteerMod.Serializable] = js.native
  def evaluate(
    pageFunction: js.Function1[/* repeated */ js.Any, _],
    args: puppeteerLib.puppeteerMod.Serializable*
  ): js.Promise[puppeteerLib.puppeteerMod.Serializable] = js.native
  /**
    * @param name Name of the function on the window object.
    * @param carloFunction Callback function which will be called in Carlo's context.
    */
  def exposeFunction(name: java.lang.String, carloFunction: js.Function1[/* repeated */ js.Any, _]): js.Promise[scala.Unit] = js.native
  /**
    * Turns the window into the full screen mode. Behavior is platform specific.
    */
  def fullscreen(): js.Promise[scala.Unit] = js.native
  /**
    * Navigates the corresponding web page to the given uri,
    * makes given params available in web page via carlo.loadParams()
    * Resolves upon DOMContentLoaded event in the web page.
    * @param uri Path to the resource relative to the folder passed into serveFolder()
    * @param params Optional parameters to pass to the web application.
    */
  def load(uri: java.lang.String): js.Promise[scala.Unit] = js.native
  def load(uri: java.lang.String, params: js.Any): js.Promise[scala.Unit] = js.native
  /**
    * Maximizes the window. Behavior is platform-specific.
    */
  def maximize(): js.Promise[scala.Unit] = js.native
  /**
    * Minimizes the window. Behavior is platform-specific.
    */
  def minimize(): js.Promise[scala.Unit] = js.native
  /**
    * 'close' - Emitted when the window closes.
    * @param name 'close'
    */
  def on(name: AppEvent, callback: js.Function1[/* repeated */ js.Any, scala.Unit]): scala.Unit = js.native
  /**
    * Returns Puppeteer page object for testing.
    */
  def pageForTest(): puppeteerLib.puppeteerMod.Page = js.native
  /**
    * Returns the options.paramsForReuse value passed into the carlo.launch.
    */
  def paramsForReuse(): js.Any = js.native
  /**
    * Same as App.serveFolder(folder[, prefix]), but only applies to current window.
    * @param folder Folder with web content to make available to Chrome.
    * @param prefix Prefix of the URL path to serve from the given folder.
    */
  def serveFolder(folder: java.lang.String): scala.Unit = js.native
  def serveFolder(folder: java.lang.String, prefix: java.lang.String): scala.Unit = js.native
  /**
    * Same as App.serveHandler(handler), but only applies to the current window requests.
    * Only single window-level handler can be installed in window.
    * @param handle Network handler callback accepting the HttpRequest parameter.
    */
  def serveHandler(handle: js.Function1[/* request */ HttpRequest, scala.Unit]): scala.Unit = js.native
  /**
    * Same as App.serveOrigin(base[, prefix]), but only applies to current window.
    * @param base Base to serve web content from.
    * @param prefix Prefix of the URL path to serve from the given folder.
    */
  def serveOrigin(base: java.lang.String): js.Promise[scala.Unit] = js.native
  def serveOrigin(base: java.lang.String, prefix: java.lang.String): js.Promise[scala.Unit] = js.native
  /**
    * Sets window bounds. Parameters top, left, width and height are all optional.
    * Dimension or the offset is only applied when specified.
    * @param bounds Window bounds
    */
  def setBounds(bounds: carloLib.Anon_Height): js.Promise[scala.Unit] = js.native
}

