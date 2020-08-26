package typings.carlo.mod

import typings.carlo.anon.Height
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
  def bringToFront(): js.Promise[Unit] = js.native
  /**
    * Closes this window.
    */
  def close(): js.Promise[Unit] = js.native
  def evaluate(
    pageFunction: String,
    args: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Serializable */ js.Any)*
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Serializable */ _
  ] = js.native
  def evaluate(
    pageFunction: js.Function1[/* repeated */ js.Any, _],
    args: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Serializable */ js.Any)*
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Serializable */ _
  ] = js.native
  /**
    * @param name Name of the function on the window object.
    * @param carloFunction Callback function which will be called in Carlo's context.
    */
  def exposeFunction(name: String, carloFunction: js.Function1[/* repeated */ js.Any, _]): js.Promise[Unit] = js.native
  /**
    * Turns the window into the full screen mode. Behavior is platform specific.
    */
  def fullscreen(): js.Promise[Unit] = js.native
  /**
    * Navigates the corresponding web page to the given uri,
    * makes given params available in web page via carlo.loadParams()
    * Resolves upon DOMContentLoaded event in the web page.
    * @param uri Path to the resource relative to the folder passed into serveFolder()
    * @param params Optional parameters to pass to the web application.
    */
  def load(uri: String): js.Promise[Unit] = js.native
  def load(uri: String, params: js.Any): js.Promise[Unit] = js.native
  /**
    * Maximizes the window. Behavior is platform-specific.
    */
  def maximize(): js.Promise[Unit] = js.native
  /**
    * Minimizes the window. Behavior is platform-specific.
    */
  def minimize(): js.Promise[Unit] = js.native
  /**
    * 'close' - Emitted when the window closes.
    * @param name 'close'
    */
  def on(name: AppEvent, callback: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  /**
    * Returns Puppeteer page object for testing.
    */
  def pageForTest(): js.Any = js.native
  /**
    * Returns the options.paramsForReuse value passed into the carlo.launch.
    */
  def paramsForReuse(): js.Any = js.native
  /**
    * Same as App.serveFolder(folder[, prefix]), but only applies to current window.
    * @param folder Folder with web content to make available to Chrome.
    * @param prefix Prefix of the URL path to serve from the given folder.
    */
  def serveFolder(folder: String): Unit = js.native
  def serveFolder(folder: String, prefix: String): Unit = js.native
  /**
    * Same as App.serveHandler(handler), but only applies to the current window requests.
    * Only single window-level handler can be installed in window.
    * @param handle Network handler callback accepting the HttpRequest parameter.
    */
  def serveHandler(handle: js.Function1[/* request */ HttpRequest, Unit]): Unit = js.native
  /**
    * Same as App.serveOrigin(base[, prefix]), but only applies to current window.
    * @param base Base to serve web content from.
    * @param prefix Prefix of the URL path to serve from the given folder.
    */
  def serveOrigin(base: String): js.Promise[Unit] = js.native
  def serveOrigin(base: String, prefix: String): js.Promise[Unit] = js.native
  /**
    * Sets window bounds. Parameters top, left, width and height are all optional.
    * Dimension or the offset is only applied when specified.
    * @param bounds Window bounds
    */
  def setBounds(bounds: Height): js.Promise[Unit] = js.native
}

