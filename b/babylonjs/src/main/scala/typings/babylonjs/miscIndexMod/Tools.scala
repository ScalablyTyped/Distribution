package typings.babylonjs.miscIndexMod

import typings.babylonjs.AnonCrossOrigin
import typings.babylonjs.AnonHandler
import typings.babylonjs.HTMLCanvasElement
import typings.babylonjs.ImageBitmap
import typings.babylonjs.Window
import typings.babylonjs.cameraMod.Camera
import typings.babylonjs.engineMod.Engine
import typings.babylonjs.fileRequestMod.IFileRequest
import typings.babylonjs.iofflineproviderMod.IOfflineProvider
import typings.babylonjs.screenshotSizeMod.IScreenshotSize
import typings.babylonjs.toolsMod.IColor4Like
import typings.babylonjs.typesMod.Nullable
import typings.std.ArrayBuffer
import typings.std.Blob
import typings.std.EventTarget
import typings.std.File
import typings.std.HTMLImageElement
import typings.std.ProgressEvent
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Misc/index", "Tools")
@js.native
class Tools ()
  extends typings.babylonjs.toolsMod.Tools

/* static members */
@JSImport("babylonjs/Misc/index", "Tools")
@js.native
object Tools extends js.Object {
  /**
    * All logs
    */
  val AllLogLevel: Double = js.native
  /**
    * Default behaviour for cors in the application.
    * It can be a string if the expected behavior is identical in the entire app.
    * Or a callback to be able to set it per url or on a group of them (in case of Video source for instance)
    */
  var CorsBehavior: String | (js.Function1[/* url */ String | js.Array[String], String]) = js.native
  /**
    * Custom HTTP Request Headers to be sent with XMLHttpRequests
    * i.e. when loading files, where the server/service expects an Authorization header
    */
  var CustomRequestHeaders: org.scalablytyped.runtime.StringDictionary[String] = js.native
  /**
    * Only error logs
    */
  val ErrorLogLevel: Double = js.native
  /**
    * Extracts text content from a DOM element hierarchy
    * Back Compat only, please use DomManagement.GetDOMTextContent instead.
    */
  var GetDOMTextContent: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DomManagement.GetDOMTextContent */ js.Any = js.native
  /**
    * Checks if the window object exists
    * Back Compat only, please use DomManagement.IsWindowObjectExist instead.
    */
  var IsWindowObjectExist: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DomManagement.IsWindowObjectExist */ js.Any = js.native
  /**
    * Only message logs
    */
  val MessageLogLevel: Double = js.native
  /**
    * No log
    */
  val NoneLogLevel: Double = js.native
  /**
    * Log performance to the console
    */
  val PerformanceConsoleLogLevel: Double = js.native
  /**
    * No performance log
    */
  val PerformanceNoneLogLevel: Double = js.native
  /**
    * Use user marks to log performance
    */
  val PerformanceUserMarkLogLevel: Double = js.native
  /**
    * Enable/Disable Custom HTTP Request Headers globally.
    * default = false
    * @see CustomRequestHeaders
    */
  var UseCustomRequestHeaders: Boolean = js.native
  /**
    * Only warning logs
    */
  val WarningLogLevel: Double = js.native
  var _EndPerformanceConsole: js.Any = js.native
  var _EndPerformanceCounterDisabled: js.Any = js.native
  var _EndUserMark: js.Any = js.native
  /**
    * @ignore
    */
  var _ScreenshotCanvas: HTMLCanvasElement = js.native
  var _StartPerformanceConsole: js.Any = js.native
  var _StartPerformanceCounterDisabled: js.Any = js.native
  var _StartUserMark: js.Any = js.native
  var _performance: js.Any = js.native
  var _tmpFloatArray: js.Any = js.native
  /**
    * Gets or sets the base URL to use to load assets
    */
  def BaseUrl: String = js.native
  def BaseUrl(value: String): js.Any = js.native
  /**
    * Removes unwanted characters from an url
    * @param url defines the url to clean
    * @returns the cleaned url
    */
  def CleanUrl(url: String): String = js.native
  /**
    * Clears the log cache
    */
  def ClearLogCache(): Unit = js.native
  def CreateScreenshot(engine: Engine, camera: Camera, size: Double): Unit = js.native
  def CreateScreenshot(
    engine: Engine,
    camera: Camera,
    size: Double,
    successCallback: js.Function1[/* data */ String, Unit]
  ): Unit = js.native
  def CreateScreenshot(
    engine: Engine,
    camera: Camera,
    size: Double,
    successCallback: js.Function1[/* data */ String, Unit],
    mimeType: String
  ): Unit = js.native
  /**
    * Captures a screenshot of the current rendering
    * @see http://doc.babylonjs.com/how_to/render_scene_on_a_png
    * @param engine defines the rendering engine
    * @param camera defines the source camera
    * @param size This parameter can be set to a single number or to an object with the
    * following (optional) properties: precision, width, height. If a single number is passed,
    * it will be used for both width and height. If an object is passed, the screenshot size
    * will be derived from the parameters. The precision property is a multiplier allowing
    * rendering at a higher or lower resolution
    * @param successCallback defines the callback receives a single parameter which contains the
    * screenshot as a string of base64-encoded characters. This string can be assigned to the
    * src parameter of an <img> to display it
    * @param mimeType defines the MIME type of the screenshot image (default: image/png).
    * Check your browser for supported MIME types
    */
  def CreateScreenshot(engine: Engine, camera: Camera, size: IScreenshotSize): Unit = js.native
  def CreateScreenshot(
    engine: Engine,
    camera: Camera,
    size: IScreenshotSize,
    successCallback: js.Function1[/* data */ String, Unit]
  ): Unit = js.native
  def CreateScreenshot(
    engine: Engine,
    camera: Camera,
    size: IScreenshotSize,
    successCallback: js.Function1[/* data */ String, Unit],
    mimeType: String
  ): Unit = js.native
  def CreateScreenshotAsync(engine: Engine, camera: Camera, size: Double): js.Promise[String] = js.native
  def CreateScreenshotAsync(engine: Engine, camera: Camera, size: Double, mimeType: String): js.Promise[String] = js.native
  /**
    * Captures a screenshot of the current rendering
    * @see http://doc.babylonjs.com/how_to/render_scene_on_a_png
    * @param engine defines the rendering engine
    * @param camera defines the source camera
    * @param size This parameter can be set to a single number or to an object with the
    * following (optional) properties: precision, width, height. If a single number is passed,
    * it will be used for both width and height. If an object is passed, the screenshot size
    * will be derived from the parameters. The precision property is a multiplier allowing
    * rendering at a higher or lower resolution
    * @param mimeType defines the MIME type of the screenshot image (default: image/png).
    * Check your browser for supported MIME types
    * @returns screenshot as a string of base64-encoded characters. This string can be assigned
    * to the src parameter of an <img> to display it
    */
  def CreateScreenshotAsync(engine: Engine, camera: Camera, size: IScreenshotSize): js.Promise[String] = js.native
  def CreateScreenshotAsync(engine: Engine, camera: Camera, size: IScreenshotSize, mimeType: String): js.Promise[String] = js.native
  def CreateScreenshotUsingRenderTarget(engine: Engine, camera: Camera, size: Double): Unit = js.native
  def CreateScreenshotUsingRenderTarget(
    engine: Engine,
    camera: Camera,
    size: Double,
    successCallback: js.Function1[/* data */ String, Unit]
  ): Unit = js.native
  def CreateScreenshotUsingRenderTarget(
    engine: Engine,
    camera: Camera,
    size: Double,
    successCallback: js.Function1[/* data */ String, Unit],
    mimeType: String
  ): Unit = js.native
  def CreateScreenshotUsingRenderTarget(
    engine: Engine,
    camera: Camera,
    size: Double,
    successCallback: js.Function1[/* data */ String, Unit],
    mimeType: String,
    samples: Double
  ): Unit = js.native
  def CreateScreenshotUsingRenderTarget(
    engine: Engine,
    camera: Camera,
    size: Double,
    successCallback: js.Function1[/* data */ String, Unit],
    mimeType: String,
    samples: Double,
    antialiasing: Boolean
  ): Unit = js.native
  def CreateScreenshotUsingRenderTarget(
    engine: Engine,
    camera: Camera,
    size: Double,
    successCallback: js.Function1[/* data */ String, Unit],
    mimeType: String,
    samples: Double,
    antialiasing: Boolean,
    fileName: String
  ): Unit = js.native
  /**
    * Generates an image screenshot from the specified camera.
    * @see http://doc.babylonjs.com/how_to/render_scene_on_a_png
    * @param engine The engine to use for rendering
    * @param camera The camera to use for rendering
    * @param size This parameter can be set to a single number or to an object with the
    * following (optional) properties: precision, width, height. If a single number is passed,
    * it will be used for both width and height. If an object is passed, the screenshot size
    * will be derived from the parameters. The precision property is a multiplier allowing
    * rendering at a higher or lower resolution
    * @param successCallback The callback receives a single parameter which contains the
    * screenshot as a string of base64-encoded characters. This string can be assigned to the
    * src parameter of an <img> to display it
    * @param mimeType The MIME type of the screenshot image (default: image/png).
    * Check your browser for supported MIME types
    * @param samples Texture samples (default: 1)
    * @param antialiasing Whether antialiasing should be turned on or not (default: false)
    * @param fileName A name for for the downloaded file.
    */
  def CreateScreenshotUsingRenderTarget(engine: Engine, camera: Camera, size: IScreenshotSize): Unit = js.native
  def CreateScreenshotUsingRenderTarget(
    engine: Engine,
    camera: Camera,
    size: IScreenshotSize,
    successCallback: js.Function1[/* data */ String, Unit]
  ): Unit = js.native
  def CreateScreenshotUsingRenderTarget(
    engine: Engine,
    camera: Camera,
    size: IScreenshotSize,
    successCallback: js.Function1[/* data */ String, Unit],
    mimeType: String
  ): Unit = js.native
  def CreateScreenshotUsingRenderTarget(
    engine: Engine,
    camera: Camera,
    size: IScreenshotSize,
    successCallback: js.Function1[/* data */ String, Unit],
    mimeType: String,
    samples: Double
  ): Unit = js.native
  def CreateScreenshotUsingRenderTarget(
    engine: Engine,
    camera: Camera,
    size: IScreenshotSize,
    successCallback: js.Function1[/* data */ String, Unit],
    mimeType: String,
    samples: Double,
    antialiasing: Boolean
  ): Unit = js.native
  def CreateScreenshotUsingRenderTarget(
    engine: Engine,
    camera: Camera,
    size: IScreenshotSize,
    successCallback: js.Function1[/* data */ String, Unit],
    mimeType: String,
    samples: Double,
    antialiasing: Boolean,
    fileName: String
  ): Unit = js.native
  def CreateScreenshotUsingRenderTargetAsync(engine: Engine, camera: Camera, size: Double): js.Promise[String] = js.native
  def CreateScreenshotUsingRenderTargetAsync(engine: Engine, camera: Camera, size: Double, mimeType: String): js.Promise[String] = js.native
  def CreateScreenshotUsingRenderTargetAsync(engine: Engine, camera: Camera, size: Double, mimeType: String, samples: Double): js.Promise[String] = js.native
  def CreateScreenshotUsingRenderTargetAsync(
    engine: Engine,
    camera: Camera,
    size: Double,
    mimeType: String,
    samples: Double,
    antialiasing: Boolean
  ): js.Promise[String] = js.native
  def CreateScreenshotUsingRenderTargetAsync(
    engine: Engine,
    camera: Camera,
    size: Double,
    mimeType: String,
    samples: Double,
    antialiasing: Boolean,
    fileName: String
  ): js.Promise[String] = js.native
  /**
    * Generates an image screenshot from the specified camera.
    * @see http://doc.babylonjs.com/how_to/render_scene_on_a_png
    * @param engine The engine to use for rendering
    * @param camera The camera to use for rendering
    * @param size This parameter can be set to a single number or to an object with the
    * following (optional) properties: precision, width, height. If a single number is passed,
    * it will be used for both width and height. If an object is passed, the screenshot size
    * will be derived from the parameters. The precision property is a multiplier allowing
    * rendering at a higher or lower resolution
    * @param mimeType The MIME type of the screenshot image (default: image/png).
    * Check your browser for supported MIME types
    * @param samples Texture samples (default: 1)
    * @param antialiasing Whether antialiasing should be turned on or not (default: false)
    * @param fileName A name for for the downloaded file.
    * @returns screenshot as a string of base64-encoded characters. This string can be assigned
    * to the src parameter of an <img> to display it
    */
  def CreateScreenshotUsingRenderTargetAsync(engine: Engine, camera: Camera, size: IScreenshotSize): js.Promise[String] = js.native
  def CreateScreenshotUsingRenderTargetAsync(engine: Engine, camera: Camera, size: IScreenshotSize, mimeType: String): js.Promise[String] = js.native
  def CreateScreenshotUsingRenderTargetAsync(engine: Engine, camera: Camera, size: IScreenshotSize, mimeType: String, samples: Double): js.Promise[String] = js.native
  def CreateScreenshotUsingRenderTargetAsync(
    engine: Engine,
    camera: Camera,
    size: IScreenshotSize,
    mimeType: String,
    samples: Double,
    antialiasing: Boolean
  ): js.Promise[String] = js.native
  def CreateScreenshotUsingRenderTargetAsync(
    engine: Engine,
    camera: Camera,
    size: IScreenshotSize,
    mimeType: String,
    samples: Double,
    antialiasing: Boolean,
    fileName: String
  ): js.Promise[String] = js.native
  /**
    * Decode the given base64 uri.
    * @param uri The uri to decode
    * @return The decoded base64 data.
    */
  def DecodeBase64(uri: String): ArrayBuffer = js.native
  /**
    * Tries to copy an object by duplicating every property
    * @param source defines the source object
    * @param destination defines the target object
    * @param doNotCopyList defines a list of properties to avoid
    * @param mustCopyList defines a list of properties to copy (even if they start with _)
    */
  def DeepCopy(source: js.Any, destination: js.Any): Unit = js.native
  def DeepCopy(source: js.Any, destination: js.Any, doNotCopyList: js.Array[String]): Unit = js.native
  def DeepCopy(
    source: js.Any,
    destination: js.Any,
    doNotCopyList: js.Array[String],
    mustCopyList: js.Array[String]
  ): Unit = js.native
  /**
    * Gets or sets the retry strategy to apply when an error happens while loading an asset
    */
  def DefaultRetryStrategy: js.Function3[
    /* url */ String, 
    /* request */ typings.babylonjs.webRequestMod.WebRequest, 
    /* retryIndex */ Double, 
    Double
  ] = js.native
  def DefaultRetryStrategy(
    strategy: js.Function3[
      /* url */ String, 
      /* request */ typings.babylonjs.webRequestMod.WebRequest, 
      /* retryIndex */ Double, 
      Double
    ]
  ): js.Any = js.native
  /**
    * Returns a promise that resolves after the given amount of time.
    * @param delay Number of milliseconds to delay
    * @returns Promise that resolves after the given amount of time
    */
  def DelayAsync(delay: Double): js.Promise[Unit] = js.native
  /**
    * Downloads a blob in the browser
    * @param blob defines the blob to download
    * @param fileName defines the name of the downloaded file
    */
  def Download(blob: Blob, fileName: String): Unit = js.native
  /**
    * Dumps the current bound framebuffer
    * @param width defines the rendering width
    * @param height defines the rendering height
    * @param engine defines the hosting engine
    * @param successCallback defines the callback triggered once the data are available
    * @param mimeType defines the mime type of the result
    * @param fileName defines the filename to download. If present, the result will automatically be downloaded
    */
  def DumpFramebuffer(width: Double, height: Double, engine: Engine): Unit = js.native
  def DumpFramebuffer(
    width: Double,
    height: Double,
    engine: Engine,
    successCallback: js.Function1[/* data */ String, Unit]
  ): Unit = js.native
  def DumpFramebuffer(
    width: Double,
    height: Double,
    engine: Engine,
    successCallback: js.Function1[/* data */ String, Unit],
    mimeType: String
  ): Unit = js.native
  def DumpFramebuffer(
    width: Double,
    height: Double,
    engine: Engine,
    successCallback: js.Function1[/* data */ String, Unit],
    mimeType: String,
    fileName: String
  ): Unit = js.native
  /**
    * Encodes the canvas data to base 64 or automatically download the result if filename is defined
    * @param successCallback defines the callback triggered once the data are available
    * @param mimeType defines the mime type of the result
    * @param fileName defines he filename to download. If present, the result will automatically be downloaded
    */
  def EncodeScreenshotCanvasData(): Unit = js.native
  def EncodeScreenshotCanvasData(successCallback: js.Function1[/* data */ String, Unit]): Unit = js.native
  def EncodeScreenshotCanvasData(successCallback: js.Function1[/* data */ String, Unit], mimeType: String): Unit = js.native
  def EncodeScreenshotCanvasData(successCallback: js.Function1[/* data */ String, Unit], mimeType: String, fileName: String): Unit = js.native
  /**
    * Ends a specific performance coutner
    */
  def EndPerformanceCounter(counterName: String): Unit = js.native
  def EndPerformanceCounter(counterName: String, condition: Boolean): Unit = js.native
  /**
    * Write an error message to the console
    * @param message defines the message to log
    */
  def Error(message: String): Unit = js.native
  /**
    * Read the content of a byte array at a specified coordinates (taking in account wrapping)
    * @param u defines the coordinate on X axis
    * @param v defines the coordinate on Y axis
    * @param width defines the width of the source data
    * @param height defines the height of the source data
    * @param pixels defines the source byte array
    * @param color defines the output color
    */
  def FetchToRef(u: Double, v: Double, width: Double, height: Double, pixels: Uint8Array, color: IColor4Like): Unit = js.native
  /**
    * Creates a data url from a given string content
    * @param content defines the content to convert
    * @returns the new data url link
    */
  def FileAsURL(content: String): String = js.native
  /**
    * Gets the first element of an array satisfying a given predicate
    * @param array defines the array to browse
    * @param predicate defines the predicate to use
    * @returns null if not found or the element
    */
  def First[T](array: js.Array[T], predicate: js.Function1[/* item */ T, Boolean]): Nullable[T] = js.native
  /**
    * Returns the nearest 32-bit single precision float representation of a Number
    * @param value A Number.  If the parameter is of a different type, it will get converted
    * to a number or to NaN if it cannot be converted
    * @returns number
    */
  def FloatRound(value: Double): Double = js.native
  /**
    * Format the given number to a specific decimal format
    * @param value defines the number to format
    * @param decimals defines the number of decimals to use
    * @returns the formatted string
    */
  def Format(value: Double): String = js.native
  def Format(value: Double, decimals: Double): String = js.native
  /**
    * Gets the absolute url.
    * @param url the input url
    * @return the absolute url
    */
  def GetAbsoluteUrl(url: String): String = js.native
  /**
    * This method will return the name of the class used to create the instance of the given object.
    * It will works only on Javascript basic data types (number, string, ...) and instance of class declared with the @className decorator.
    * @param object the object to get the class name from
    * @param isType defines if the object is actually a type
    * @returns the name of the class, will be "object" for a custom data type not using the @className decorator
    */
  def GetClassName(`object`: js.Any): String = js.native
  def GetClassName(`object`: js.Any, isType: Boolean): String = js.native
  /**
    * Extracts the filename from a path
    * @param path defines the path to use
    * @returns the filename
    */
  def GetFilename(path: String): String = js.native
  /**
    * Extracts the "folder" part of a path (everything before the filename).
    * @param uri The URI to extract the info from
    * @param returnUnchangedIfNoSlash Do not touch the URI if no slashes are present
    * @returns The "folder" part of the path
    */
  def GetFolderPath(uri: String): String = js.native
  def GetFolderPath(uri: String, returnUnchangedIfNoSlash: Boolean): String = js.native
  /**
    * Gets the pointer prefix to use
    * @returns "pointer" if touch is enabled. Else returns "mouse"
    */
  def GetPointerPrefix(): String = js.native
  /**
    * Tries to instantiate a new object from a given class name
    * @param className defines the class name to instantiate
    * @returns the new object or null if the system was not able to do the instantiation
    */
  def Instantiate(className: String): js.Any = js.native
  /**
    * Test if the given uri is a base64 string
    * @param uri The uri to test
    * @return True if the uri is a base64 string or false otherwise
    */
  def IsBase64(uri: String): Boolean = js.native
  /**
    * Gets a boolean indicating if the given object has no own property
    * @param obj defines the object to test
    * @returns true if object has no own property
    */
  def IsEmpty(obj: js.Any): Boolean = js.native
  /**
    * Function indicating if a number is an exponent of 2
    * @param value defines the value to test
    * @returns true if the value is an exponent of 2
    */
  def IsExponentOfTwo(value: Double): Boolean = js.native
  /**
    * Utility function to detect if the current user agent is Safari
    * @returns whether or not the current user agent is safari
    */
  def IsSafari(): Boolean = js.native
  /**
    * Loads a file from a url
    * @param url url string, ArrayBuffer, or Blob to load
    * @param onSuccess callback called when the file successfully loads
    * @param onProgress callback called while file is loading (if the server supports this mode)
    * @param offlineProvider defines the offline provider for caching
    * @param useArrayBuffer defines a boolean indicating that date must be returned as ArrayBuffer
    * @param onError callback called when the file fails to load
    * @returns a file request object
    */
  def LoadFile(
    url: String,
    onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit]
  ): IFileRequest = js.native
  def LoadFile(
    url: String,
    onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
    onProgress: js.Function1[/* data */ js.Any, Unit]
  ): IFileRequest = js.native
  def LoadFile(
    url: String,
    onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
    onProgress: js.Function1[/* data */ js.Any, Unit],
    offlineProvider: IOfflineProvider
  ): IFileRequest = js.native
  def LoadFile(
    url: String,
    onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
    onProgress: js.Function1[/* data */ js.Any, Unit],
    offlineProvider: IOfflineProvider,
    useArrayBuffer: Boolean
  ): IFileRequest = js.native
  def LoadFile(
    url: String,
    onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
    onProgress: js.Function1[/* data */ js.Any, Unit],
    offlineProvider: IOfflineProvider,
    useArrayBuffer: Boolean,
    onError: js.Function2[
      /* request */ js.UndefOr[typings.babylonjs.webRequestMod.WebRequest], 
      /* exception */ js.UndefOr[js.Any], 
      Unit
    ]
  ): IFileRequest = js.native
  /**
    * Loads a file from a url
    * @param url the file url to load
    * @param useArrayBuffer defines a boolean indicating that date must be returned as ArrayBuffer
    * @returns a promise containing an ArrayBuffer corresponding to the loaded file
    */
  def LoadFileAsync(url: String): js.Promise[ArrayBuffer | String] = js.native
  def LoadFileAsync(url: String, useArrayBuffer: Boolean): js.Promise[ArrayBuffer | String] = js.native
  /**
    * Loads an image as an HTMLImageElement.
    * @param input url string, ArrayBuffer, or Blob to load
    * @param onLoad callback called when the image successfully loads
    * @param onError callback called when the image fails to load
    * @param offlineProvider offline provider for caching
    * @param mimeType optional mime type
    * @returns the HTMLImageElement of the loaded image
    */
  def LoadImage(
    input: String,
    onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit],
    offlineProvider: Nullable[IOfflineProvider]
  ): Nullable[HTMLImageElement] = js.native
  def LoadImage(
    input: String,
    onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit],
    offlineProvider: Nullable[IOfflineProvider],
    mimeType: String
  ): Nullable[HTMLImageElement] = js.native
  def LoadImage(
    input: ArrayBuffer,
    onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit],
    offlineProvider: Nullable[IOfflineProvider]
  ): Nullable[HTMLImageElement] = js.native
  def LoadImage(
    input: ArrayBuffer,
    onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit],
    offlineProvider: Nullable[IOfflineProvider],
    mimeType: String
  ): Nullable[HTMLImageElement] = js.native
  def LoadImage(
    input: Blob,
    onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit],
    offlineProvider: Nullable[IOfflineProvider]
  ): Nullable[HTMLImageElement] = js.native
  def LoadImage(
    input: Blob,
    onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit],
    offlineProvider: Nullable[IOfflineProvider],
    mimeType: String
  ): Nullable[HTMLImageElement] = js.native
  /**
    * Load a script (identified by an url). When the url returns, the
    * content of this file is added into a new script element, attached to the DOM (body element)
    * @param scriptUrl defines the url of the script to laod
    * @param onSuccess defines the callback called when the script is loaded
    * @param onError defines the callback to call if an error occurs
    * @param scriptId defines the id of the script element
    */
  def LoadScript(scriptUrl: String, onSuccess: js.Function0[Unit]): Unit = js.native
  def LoadScript(
    scriptUrl: String,
    onSuccess: js.Function0[Unit],
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit]
  ): Unit = js.native
  def LoadScript(
    scriptUrl: String,
    onSuccess: js.Function0[Unit],
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit],
    scriptId: String
  ): Unit = js.native
  /**
    * Load an asynchronous script (identified by an url). When the url returns, the
    * content of this file is added into a new script element, attached to the DOM (body element)
    * @param scriptUrl defines the url of the script to laod
    * @param scriptId defines the id of the script element
    * @returns a promise request object
    */
  def LoadScriptAsync(scriptUrl: String): js.Promise[Unit] = js.native
  def LoadScriptAsync(scriptUrl: String, scriptId: String): js.Promise[Unit] = js.native
  /**
    * Log a message to the console
    * @param message defines the message to log
    */
  def Log(message: String): Unit = js.native
  /**
    * Gets current log cache (list of logs)
    */
  def LogCache: String = js.native
  /**
    * Sets the current log level (MessageLogLevel / WarningLogLevel / ErrorLogLevel)
    */
  def LogLevels(level: Double): js.Any = js.native
  /**
    * Returns an array if obj is not an array
    * @param obj defines the object to evaluate as an array
    * @param allowsNullUndefined defines a boolean indicating if obj is allowed to be null or undefined
    * @returns either obj directly if obj is an array or a new array containing obj
    */
  def MakeArray(obj: js.Any): Nullable[js.Array[_]] = js.native
  def MakeArray(obj: js.Any, allowsNullUndefined: Boolean): Nullable[js.Array[_]] = js.native
  /**
    * Interpolates between a and b via alpha
    * @param a The lower value (returned when alpha = 0)
    * @param b The upper value (returned when alpha = 1)
    * @param alpha The interpolation-factor
    * @return The mixed value
    */
  def Mix(a: Double, b: Double, alpha: Double): Double = js.native
  /**
    * Gets either window.performance.now() if supported or Date.now() else
    */
  def Now: Double = js.native
  /**
    * Callback called when a new log is added
    */
  def OnNewCacheEntry(entry: String): Unit = js.native
  /**
    * Sets the current performance log level
    */
  def PerformanceLogLevel(level: Double): js.Any = js.native
  /**
    * Gets or sets a function used to pre-process url before using them to load assets
    */
  def PreprocessUrl: js.Function1[/* url */ String, String] = js.native
  def PreprocessUrl(processor: js.Function1[/* url */ String, String]): js.Any = js.native
  /**
    * Implementation from http://stackoverflow.com/questions/105034/how-to-create-a-guid-uuid-in-javascript/2117523#answer-2117523
    * Be aware Math.random() could cause collisions, but:
    * "All but 6 of the 128 bits of the ID are randomly generated, which means that for any two ids, there's a 1 in 2^^122 (or 5.3x10^^36) chance they'll collide"
    * @returns a pseudo random id
    */
  def RandomId(): String = js.native
  /**
    * Reads a file from a File object
    * @param file defines the file to load
    * @param onSuccess defines the callback to call when data is loaded
    * @param onProgress defines the callback to call during loading process
    * @param useArrayBuffer defines a boolean indicating that data must be returned as an ArrayBuffer
    * @param onError defines the callback to call when an error occurs
    * @returns a file request object
    */
  def ReadFile(file: File, onSuccess: js.Function1[/* data */ js.Any, Unit]): IFileRequest = js.native
  def ReadFile(
    file: File,
    onSuccess: js.Function1[/* data */ js.Any, Unit],
    onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], _]
  ): IFileRequest = js.native
  def ReadFile(
    file: File,
    onSuccess: js.Function1[/* data */ js.Any, Unit],
    onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], _],
    useArrayBuffer: Boolean
  ): IFileRequest = js.native
  def ReadFile(
    file: File,
    onSuccess: js.Function1[/* data */ js.Any, Unit],
    onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], _],
    useArrayBuffer: Boolean,
    onError: js.Function1[/* error */ typings.babylonjs.fileToolsMod.ReadFileError, Unit]
  ): IFileRequest = js.native
  /**
    * Loads a file from a blob
    * @param fileToLoad defines the blob to use
    * @param callback defines the callback to call when data is loaded
    * @param progressCallback defines the callback to call during loading process
    * @returns a file request object
    */
  def ReadFileAsDataURL(
    fileToLoad: Blob,
    callback: js.Function1[/* data */ js.Any, Unit],
    progressCallback: js.Function1[/* ev */ ProgressEvent[EventTarget], _]
  ): IFileRequest = js.native
  /**
    * Function used to register events at window level
    * @param windowElement defines the Window object to use
    * @param events defines the events to register
    */
  def RegisterTopRootEvents(windowElement: Window, events: js.Array[AnonHandler]): Unit = js.native
  /**
    * Use this object to register external classes like custom textures or material
    * to allow the laoders to instantiate them
    */
  def RegisteredExternalClasses: org.scalablytyped.runtime.StringDictionary[js.Object] = js.native
  def RegisteredExternalClasses(classes: org.scalablytyped.runtime.StringDictionary[js.Object]): js.Any = js.native
  /**
    * Sets the cors behavior on a dom element. This will add the required Tools.CorsBehavior to the element.
    * @param url define the url we are trying
    * @param element define the dom element where to configure the cors policy
    */
  def SetCorsBehavior(url: String, element: AnonCrossOrigin): Unit = js.native
  def SetCorsBehavior(url: js.Array[String], element: AnonCrossOrigin): Unit = js.native
  /**
    * Polyfill for setImmediate
    * @param action defines the action to execute after the current execution block
    */
  def SetImmediate(action: js.Function0[Unit]): Unit = js.native
  /**
    * Provides a slice function that will work even on IE
    * @param data defines the array to slice
    * @param start defines the start of the data (optional)
    * @param end defines the end of the data (optional)
    * @returns the new sliced array
    */
  def Slice[T](data: T): T = js.native
  def Slice[T](data: T, start: Double): T = js.native
  def Slice[T](data: T, start: Double, end: Double): T = js.native
  /**
    * Starts a performance counter
    */
  def StartPerformanceCounter(counterName: String): Unit = js.native
  def StartPerformanceCounter(counterName: String, condition: Boolean): Unit = js.native
  /**
    * Converts the canvas data to blob.
    * This acts as a polyfill for browsers not supporting the to blob function.
    * @param canvas Defines the canvas to extract the data from
    * @param successCallback Defines the callback triggered once the data are available
    * @param mimeType Defines the mime type of the result
    */
  def ToBlob(canvas: HTMLCanvasElement, successCallback: js.Function1[/* blob */ Nullable[Blob], Unit]): Unit = js.native
  def ToBlob(
    canvas: HTMLCanvasElement,
    successCallback: js.Function1[/* blob */ Nullable[Blob], Unit],
    mimeType: String
  ): Unit = js.native
  /**
    * Convert an angle in radians to degrees
    * @param angle defines the angle to convert
    * @returns the angle in degrees
    */
  def ToDegrees(angle: Double): Double = js.native
  /**
    * Convert an angle in degrees to radians
    * @param angle defines the angle to convert
    * @returns the angle in radians
    */
  def ToRadians(angle: Double): Double = js.native
  /**
    * Function used to unregister events from window level
    * @param windowElement defines the Window object to use
    * @param events defines the events to unregister
    */
  def UnregisterTopRootEvents(windowElement: Window, events: js.Array[AnonHandler]): Unit = js.native
  /**
    * Gets or sets a global variable indicating if fallback texture must be used when a texture cannot be loaded
    * @ignorenaming
    */
  def UseFallbackTexture: Boolean = js.native
  def UseFallbackTexture(value: Boolean): js.Any = js.native
  /**
    * Write a warning message to the console
    * @param message defines the message to log
    */
  def Warn(message: String): Unit = js.native
  /**
    * Gets a value indicating the number of loading errors
    * @ignorenaming
    */
  def errorsCount: Double = js.native
  /**
    * Texture content used if a texture cannot loaded
    * @ignorenaming
    */
  def fallbackTexture: String = js.native
  def fallbackTexture(value: String): js.Any = js.native
  /**
    * This method will return the name of the full name of the class, including its owning module (if any).
    * It will works only on Javascript basic data types (number, string, ...) and instance of class declared with the @className decorator or implementing a method getClassName():string (in which case the module won't be specified).
    * @param object the object to get the class name from
    * @param isType defines if the object is actually a type
    * @return a string that can have two forms: "moduleName.className" if module was specified when the class' Name was registered or "className" if there was not module specified.
    * @ignorenaming
    */
  def getFullClassName(`object`: js.Any): Nullable[String] = js.native
  def getFullClassName(`object`: js.Any, isType: Boolean): Nullable[String] = js.native
}

