package typings
package carloLib.carloMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait App extends js.Object {
  @JSName("evaluate")
  var evaluate_Original: EvaluateFunction = js.native
  /**
    * Puppeteer browser object for testing.
    */
  def browserForTest(): puppeteerLib.puppeteerMod.Browser = js.native
  def createWindow(): js.Promise[Window] = js.native
  def createWindow(options: WindowOptions): js.Promise[Window] = js.native
  def evaluate(pageFunction: java.lang.String, args: puppeteerLib.puppeteerMod.Serializable*): js.Promise[puppeteerLib.puppeteerMod.Serializable] = js.native
  def evaluate(
    pageFunction: js.Function1[/* repeated */ js.Any, _],
    args: puppeteerLib.puppeteerMod.Serializable*
  ): js.Promise[puppeteerLib.puppeteerMod.Serializable] = js.native
  /**
    * Closes the browser window
    */
  def exit(): js.Promise[scala.Unit] = js.native
  /**
    * The method adds a function called name on the pages' window object.
    * When called, the function executes carloFunction in Node.js and returns a Promise which resolves to the return value of carloFunction.
    * @param name
    * @param carloFunction
    */
  def exposeFunction(name: java.lang.String, carloFunction: js.Function1[/* repeated */ js.Any, _]): js.Promise[scala.Unit] = js.native
  /**
    * Shortcut to the main window's Window.load
    * @param uri
    * @param params
    */
  def load(uri: java.lang.String, params: js.Any*): js.Promise[scala.Unit] = js.native
  /**
    * Running app guarantees to have main window.
    * If current main window closes, a next open window becomes the main one.
    */
  def mainWindow(): Window = js.native
  /**
    * 'exit' - Emitted when the last window closes.
    * 'window' - Emitted when the new window opens.
    * @param name 'exit' or 'window'
    * @param callback
    */
  def on(name: AppEvent, callback: js.Function1[/* repeated */ js.Any, scala.Unit]): scala.Unit = js.native
  /**
    * Makes the content of the given folder available to the Chrome web app
    * @param folder Folder with web content to make available to Chrome
    * @param prefix Prefix of the URL path to serve from the given folder
    */
  def serveFolder(folder: java.lang.String): scala.Unit = js.native
  def serveFolder(folder: java.lang.String, prefix: java.lang.String): scala.Unit = js.native
  /**
    * Handler function is called with every network request in this app.
    * It can abort, continue or fulfill each request.
    * Only single app-wide handler can be registered.
    * @param handler Network handler callback accepting the HttpRequest parameter.
    */
  def serveHandler(handler: js.Function1[/* request */ HttpRequest, scala.Unit]): scala.Unit = js.native
  /**
    * Fetches Carlo content from the specified origin instead of reading it from the file system, eg http://localhost:8080.
    * This mode can be used for the fast development mode available in web frameworks.
    * @param base Base to serve web content from.
    * @param prefix Prefix of the URL path to serve from the given folder.
    */
  def serveOrigin(base: java.lang.String): scala.Unit = js.native
  def serveOrigin(base: java.lang.String, prefix: java.lang.String): scala.Unit = js.native
  def setIcon(image: java.lang.String): scala.Unit = js.native
  /**
    * Specifies image to be used as an app icon in the system dock.
    * This feature is only available in Chrome M72+. One can use 'canary' channel to see it in action before M72 hits stable.
    * @param image Either buffer containing PNG or a path to the PNG file on the file system.
    */
  def setIcon(image: nodeLib.Buffer): scala.Unit = js.native
  /**
    * Returns all currently opened windows.
    * Running app guarantees to have at least one open window.
    */
  def windows(): js.Array[Window] = js.native
}

