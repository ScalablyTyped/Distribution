package typings.carlo.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait App extends js.Object {
  
  /**
    * Puppeteer browser object for testing.
    */
  def browserForTest(): js.Any = js.native
  
  def createWindow(): js.Promise[Window] = js.native
  def createWindow(options: WindowOptions): js.Promise[Window] = js.native
  
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
  @JSName("evaluate")
  var evaluate_Original: EvaluateFunction = js.native
  
  /**
    * Closes the browser window
    */
  def exit(): js.Promise[Unit] = js.native
  
  /**
    * The method adds a function called name on the pages' window object.
    * When called, the function executes carloFunction in Node.js and returns a Promise which resolves to the return value of carloFunction.
    * @param name
    * @param carloFunction
    */
  def exposeFunction(name: String, carloFunction: js.Function1[/* repeated */ js.Any, _]): js.Promise[Unit] = js.native
  
  /**
    * Shortcut to the main window's Window.load
    * @param uri
    * @param params
    */
  def load(uri: String, params: js.Any*): js.Promise[Unit] = js.native
  
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
  def on(name: AppEvent, callback: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  
  /**
    * Makes the content of the given folder available to the Chrome web app
    * @param folder Folder with web content to make available to Chrome
    * @param prefix Prefix of the URL path to serve from the given folder
    */
  def serveFolder(folder: String): Unit = js.native
  def serveFolder(folder: String, prefix: String): Unit = js.native
  
  /**
    * Handler function is called with every network request in this app.
    * It can abort, continue or fulfill each request.
    * Only single app-wide handler can be registered.
    * @param handler Network handler callback accepting the HttpRequest parameter.
    */
  def serveHandler(handler: js.Function1[/* request */ HttpRequest, Unit]): Unit = js.native
  
  /**
    * Fetches Carlo content from the specified origin instead of reading it from the file system, eg http://localhost:8080.
    * This mode can be used for the fast development mode available in web frameworks.
    * @param base Base to serve web content from.
    * @param prefix Prefix of the URL path to serve from the given folder.
    */
  def serveOrigin(base: String): Unit = js.native
  def serveOrigin(base: String, prefix: String): Unit = js.native
  
  def setIcon(image: String): Unit = js.native
  /**
    * Specifies image to be used as an app icon in the system dock.
    * This feature is only available in Chrome M72+. One can use 'canary' channel to see it in action before M72 hits stable.
    * @param image Either buffer containing PNG or a path to the PNG file on the file system.
    */
  def setIcon(image: Buffer): Unit = js.native
  
  /**
    * Returns all currently opened windows.
    * Running app guarantees to have at least one open window.
    */
  def windows(): js.Array[Window] = js.native
}
