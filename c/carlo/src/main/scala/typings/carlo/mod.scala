package typings.carlo

import typings.carlo.anon.Body
import typings.carlo.anon.Height
import typings.carlo.anon.Path
import typings.carlo.carloStrings.close
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("carlo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def enterTestMode(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enterTestMode")().asInstanceOf[Unit]
  
  @scala.inline
  def fileInfo(file: js.Any): js.Promise[Path] = ^.asInstanceOf[js.Dynamic].applyDynamic("fileInfo")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Path]]
  
  @scala.inline
  def launch(): js.Promise[App] = ^.asInstanceOf[js.Dynamic].applyDynamic("launch")().asInstanceOf[js.Promise[App]]
  @scala.inline
  def launch(options: LaunchOptions): js.Promise[App] = ^.asInstanceOf[js.Dynamic].applyDynamic("launch")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[App]]
  
  @scala.inline
  def loadParams(): js.Promise[js.Array[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadParams")().asInstanceOf[js.Promise[js.Array[js.Any]]]
  
  @js.native
  trait App extends StObject {
    
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
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Serializable */ js.Any
      ] = js.native
    def evaluate(
      pageFunction: js.Function1[/* repeated */ js.Any, js.Any],
      args: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Serializable */ js.Any)*
    ): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Serializable */ js.Any
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
    def exposeFunction(name: String, carloFunction: js.Function1[/* repeated */ js.Any, js.Any]): js.Promise[Unit] = js.native
    
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
  
  /* Rewritten from type alias, can be one of: 
    - typings.carlo.carloStrings.exit
    - typings.carlo.carloStrings.window
  */
  trait AppEvent extends StObject
  object AppEvent {
    
    @scala.inline
    def exit: typings.carlo.carloStrings.exit = "exit".asInstanceOf[typings.carlo.carloStrings.exit]
    
    @scala.inline
    def window: typings.carlo.carloStrings.window = "window".asInstanceOf[typings.carlo.carloStrings.window]
  }
  
  trait Bounds extends StObject {
    
    /**
      * Height in pixels.
      */
    var height: Double
    
    /**
      * Left offset in pixels.
      */
    var left: Double
    
    /**
      * Top offset in pixels.
      */
    var top: Double
    
    /**
      * Width in pixels.
      */
    var width: Double
  }
  object Bounds {
    
    @scala.inline
    def apply(height: Double, left: Double, top: Double, width: Double): Bounds = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bounds]
    }
    
    @scala.inline
    implicit class BoundsMutableBuilder[Self <: Bounds] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  type Channel = String
  
  @js.native
  trait EvaluateFunction extends StObject {
    
    def apply(
      pageFunction: String,
      args: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Serializable */ js.Any)*
    ): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Serializable */ js.Any
      ] = js.native
    def apply(
      pageFunction: js.Function1[/* repeated */ js.Any, js.Any],
      args: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Serializable */ js.Any)*
    ): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Serializable */ js.Any
      ] = js.native
  }
  
  trait HttpRequest extends StObject {
    
    /**
      * Aborts request.
      * If request is a navigation request, navigation is aborted as well.
      */
    def abort(): js.Promise[Unit]
    
    /**
      * Proceeds with the default behavior for this request.
      * Either serves it from the filesystem or defers to the browser.
      */
    def continue(): js.Promise[Unit]
    
    /**
      * Marks the request as failed.
      * If request is a navigation request, navigation is still committed, but to a location that fails to be fetched.
      */
    def fail(): js.Promise[Unit]
    
    /**
      * Fulfills the network request with the given data. 'Content-Length' header is generated in case it is not listed in the headers.
      */
    def fulfill(options: Body): js.Promise[Unit]
    
    /**
      * Network request headers
      */
    def headers(): js.Object
    
    /**
      * HTTP method of this network request (GET, POST, etc.)
      */
    def method(): String
    
    /**
      * Network request URL
      */
    def url(): String
  }
  object HttpRequest {
    
    @scala.inline
    def apply(
      abort: () => js.Promise[Unit],
      continue: () => js.Promise[Unit],
      fail: () => js.Promise[Unit],
      fulfill: Body => js.Promise[Unit],
      headers: () => js.Object,
      method: () => String,
      url: () => String
    ): HttpRequest = {
      val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), continue = js.Any.fromFunction0(continue), fail = js.Any.fromFunction0(fail), fulfill = js.Any.fromFunction1(fulfill), headers = js.Any.fromFunction0(headers), method = js.Any.fromFunction0(method), url = js.Any.fromFunction0(url))
      __obj.asInstanceOf[HttpRequest]
    }
    
    @scala.inline
    implicit class HttpRequestMutableBuilder[Self <: HttpRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbort(value: () => js.Promise[Unit]): Self = StObject.set(x, "abort", js.Any.fromFunction0(value))
      
      @scala.inline
      def setContinue(value: () => js.Promise[Unit]): Self = StObject.set(x, "continue", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFail(value: () => js.Promise[Unit]): Self = StObject.set(x, "fail", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFulfill(value: Body => js.Promise[Unit]): Self = StObject.set(x, "fulfill", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHeaders(value: () => js.Object): Self = StObject.set(x, "headers", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMethod(value: () => String): Self = StObject.set(x, "method", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUrl(value: () => String): Self = StObject.set(x, "url", js.Any.fromFunction0(value))
    }
  }
  
  trait LaunchOptions
    extends StObject
       with WindowOptions {
    
    /**
      * Additional arguments to pass to the browser instance.
      */
    var args: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Browser to be used, defaults to ['stable']
      */
    var channel: js.UndefOr[js.Array[Channel]] = js.undefined
    
    /**
      * Path to a Chromium or Chrome executable to run instead of the automatically located Chrome.
      * If executablePath is a relative path, then it is resolved relative to current working directory.
      * Carlo is only guaranteed to work with the latest Chrome stable version.
      */
    var executablePath: js.UndefOr[String] = js.undefined
    
    /**
      * Application icon to be used in the system dock.
      * Either buffer containing PNG or a path to the PNG file on the file system.
      * This feature is only available in Chrome M72+.
      * One can use 'canary' channel to see it in action before M72 hits stable.
      */
    var icon: js.UndefOr[Buffer | String] = js.undefined
    
    /**
      * Optional parameters to share between Carlo instances.
      */
    var paramsForReuse: js.UndefOr[js.Any] = js.undefined
    
    /**
      * Application title
      */
    var title: js.UndefOr[String] = js.undefined
    
    /**
      *  Path to a User Data Directory. This folder is created upon the first app launch and contains user settings and Web storage data. Defaults to '.profile'.
      */
    var userDataDir: js.UndefOr[String] = js.undefined
  }
  object LaunchOptions {
    
    @scala.inline
    def apply(): LaunchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LaunchOptions]
    }
    
    @scala.inline
    implicit class LaunchOptionsMutableBuilder[Self <: LaunchOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      @scala.inline
      def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      @scala.inline
      def setChannel(value: js.Array[Channel]): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
      
      @scala.inline
      def setChannelVarargs(value: Channel*): Self = StObject.set(x, "channel", js.Array(value :_*))
      
      @scala.inline
      def setExecutablePath(value: String): Self = StObject.set(x, "executablePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecutablePathUndefined: Self = StObject.set(x, "executablePath", js.undefined)
      
      @scala.inline
      def setIcon(value: Buffer | String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setParamsForReuse(value: js.Any): Self = StObject.set(x, "paramsForReuse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsForReuseUndefined: Self = StObject.set(x, "paramsForReuse", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setUserDataDir(value: String): Self = StObject.set(x, "userDataDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserDataDirUndefined: Self = StObject.set(x, "userDataDir", js.undefined)
    }
  }
  
  @js.native
  trait Window extends StObject {
    
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
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Serializable */ js.Any
      ] = js.native
    def evaluate(
      pageFunction: js.Function1[/* repeated */ js.Any, js.Any],
      args: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Serializable */ js.Any)*
    ): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Serializable */ js.Any
      ] = js.native
    @JSName("evaluate")
    var evaluate_Original: EvaluateFunction = js.native
    
    /**
      * @param name Name of the function on the window object.
      * @param carloFunction Callback function which will be called in Carlo's context.
      */
    def exposeFunction(name: String, carloFunction: js.Function1[/* repeated */ js.Any, js.Any]): js.Promise[Unit] = js.native
    
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
  
  type WindowEvent = close
  
  trait WindowOptions extends StObject {
    
    /**
      * Background color using hex notation, defaults to '#ffffff'.
      */
    var bgcolor: js.UndefOr[String] = js.undefined
    
    /**
      * App window height in pixels.
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /**
      * App window left offset in pixels.
      */
    var left: js.UndefOr[Double] = js.undefined
    
    /**
      * App window top offset in pixels.
      */
    var top: js.UndefOr[Double] = js.undefined
    
    /**
      * App window width in pixels.
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object WindowOptions {
    
    @scala.inline
    def apply(): WindowOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WindowOptions]
    }
    
    @scala.inline
    implicit class WindowOptionsMutableBuilder[Self <: WindowOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBgcolor(value: String): Self = StObject.set(x, "bgcolor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBgcolorUndefined: Self = StObject.set(x, "bgcolor", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
