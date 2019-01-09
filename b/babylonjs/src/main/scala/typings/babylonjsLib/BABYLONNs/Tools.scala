package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class containing a set of static utilities functions
  */
@JSGlobal("BABYLON.Tools")
@js.native
class Tools () extends js.Object

/**
  * Class containing a set of static utilities functions
  */
@JSGlobal("BABYLON.Tools")
@js.native
object Tools extends js.Object {
  /**
    * All logs
    */
  val AllLogLevel: scala.Double = js.native
  /**
    * Gets or sets the base URL to use to load assets
    */
  var BaseUrl: java.lang.String = js.native
  /**
    * Default behaviour for cors in the application.
    * It can be a string if the expected behavior is identical in the entire app.
    * Or a callback to be able to set it per url or on a group of them (in case of Video source for instance)
    */
  var CorsBehavior: java.lang.String | (js.Function1[/* url */ java.lang.String | js.Array[java.lang.String], java.lang.String]) = js.native
  /**
    * Only error logs
    */
  val ErrorLogLevel: scala.Double = js.native
  /**
    * Gets current log cache (list of logs)
    */
  val LogCache: java.lang.String = js.native
  /**
    * Sets the current log level (MessageLogLevel / WarningLogLevel / ErrorLogLevel)
    */
  var LogLevels: scala.Double = js.native
  /**
    * Only message logs
    */
  val MessageLogLevel: scala.Double = js.native
  /**
    * No log
    */
  val NoneLogLevel: scala.Double = js.native
  /**
    * Gets either window.performance.now() if supported or Date.now() else
    */
  val Now: scala.Double = js.native
  /**
    * Log performance to the console
    */
  val PerformanceConsoleLogLevel: scala.Double = js.native
  /**
    * Sets the current performance log level
    */
  var PerformanceLogLevel: scala.Double = js.native
  /**
    * No performance log
    */
  val PerformanceNoneLogLevel: scala.Double = js.native
  /**
    * Use user marks to log performance
    */
  val PerformanceUserMarkLogLevel: scala.Double = js.native
  /**
    * Use this object to register external classes like custom textures or material
    * to allow the laoders to instantiate them
    */
  var RegisteredExternalClasses: org.scalablytyped.runtime.StringDictionary[js.Object] = js.native
  /**
    * Gets or sets a global variable indicating if fallback texture must be used when a texture cannot be loaded
    * @ignorenaming
    */
  var UseFallbackTexture: scala.Boolean = js.native
  /**
    * Only warning logs
    */
  val WarningLogLevel: scala.Double = js.native
  var _AddLogEntry: js.Any = js.native
  var _EndPerformanceConsole: js.Any = js.native
  var _EndPerformanceCounterDisabled: js.Any = js.native
  var _EndUserMark: js.Any = js.native
  var _ErrorDisabled: js.Any = js.native
  var _ErrorEnabled: js.Any = js.native
  var _FormatMessage: js.Any = js.native
  var _LogCache: js.Any = js.native
  var _LogDisabled: js.Any = js.native
  var _LogEnabled: js.Any = js.native
  var _StartPerformanceConsole: js.Any = js.native
  var _StartPerformanceCounterDisabled: js.Any = js.native
  var _StartUserMark: js.Any = js.native
  var _WarnDisabled: js.Any = js.native
  var _WarnEnabled: js.Any = js.native
  var _performance: js.Any = js.native
  var _tmpFloatArray: js.Any = js.native
  /**
    * Gets a value indicating the number of loading errors
    * @ignorenaming
    */
  var errorsCount: scala.Double = js.native
  /**
    * Texture content used if a texture cannot loaded
    * @ignorenaming
    */
  var fallbackTexture: java.lang.String = js.native
  /**
    * Find the next highest power of two.
    * @param x Number to start search from.
    * @return Next highest power of two.
    */
  def CeilingPOT(x: scala.Double): scala.Double = js.native
  /**
    * Checks if a given vector is inside a specific range
    * @param v defines the vector to test
    * @param min defines the minimum range
    * @param max defines the maximum range
    */
  def CheckExtends(
    v: babylonjsLib.BABYLONNs.Vector3,
    min: babylonjsLib.BABYLONNs.Vector3,
    max: babylonjsLib.BABYLONNs.Vector3
  ): scala.Unit = js.native
  /**
    * Removes unwanted characters from an url
    * @param url defines the url to clean
    * @returns the cleaned url
    */
  def CleanUrl(url: java.lang.String): java.lang.String = js.native
  /**
    * Clears the log cache
    */
  def ClearLogCache(): scala.Unit = js.native
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
  def CreateScreenshot(engine: babylonjsLib.BABYLONNs.Engine, camera: babylonjsLib.BABYLONNs.Camera, size: js.Any): scala.Unit = js.native
  def CreateScreenshot(
    engine: babylonjsLib.BABYLONNs.Engine,
    camera: babylonjsLib.BABYLONNs.Camera,
    size: js.Any,
    successCallback: js.Function1[/* data */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def CreateScreenshot(
    engine: babylonjsLib.BABYLONNs.Engine,
    camera: babylonjsLib.BABYLONNs.Camera,
    size: js.Any,
    successCallback: js.Function1[/* data */ java.lang.String, scala.Unit],
    mimeType: java.lang.String
  ): scala.Unit = js.native
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
  def CreateScreenshotUsingRenderTarget(engine: babylonjsLib.BABYLONNs.Engine, camera: babylonjsLib.BABYLONNs.Camera, size: js.Any): scala.Unit = js.native
  def CreateScreenshotUsingRenderTarget(
    engine: babylonjsLib.BABYLONNs.Engine,
    camera: babylonjsLib.BABYLONNs.Camera,
    size: js.Any,
    successCallback: js.Function1[/* data */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def CreateScreenshotUsingRenderTarget(
    engine: babylonjsLib.BABYLONNs.Engine,
    camera: babylonjsLib.BABYLONNs.Camera,
    size: js.Any,
    successCallback: js.Function1[/* data */ java.lang.String, scala.Unit],
    mimeType: java.lang.String
  ): scala.Unit = js.native
  def CreateScreenshotUsingRenderTarget(
    engine: babylonjsLib.BABYLONNs.Engine,
    camera: babylonjsLib.BABYLONNs.Camera,
    size: js.Any,
    successCallback: js.Function1[/* data */ java.lang.String, scala.Unit],
    mimeType: java.lang.String,
    samples: scala.Double
  ): scala.Unit = js.native
  def CreateScreenshotUsingRenderTarget(
    engine: babylonjsLib.BABYLONNs.Engine,
    camera: babylonjsLib.BABYLONNs.Camera,
    size: js.Any,
    successCallback: js.Function1[/* data */ java.lang.String, scala.Unit],
    mimeType: java.lang.String,
    samples: scala.Double,
    antialiasing: scala.Boolean
  ): scala.Unit = js.native
  def CreateScreenshotUsingRenderTarget(
    engine: babylonjsLib.BABYLONNs.Engine,
    camera: babylonjsLib.BABYLONNs.Camera,
    size: js.Any,
    successCallback: js.Function1[/* data */ java.lang.String, scala.Unit],
    mimeType: java.lang.String,
    samples: scala.Double,
    antialiasing: scala.Boolean,
    fileName: java.lang.String
  ): scala.Unit = js.native
  /**
    * Decode the given base64 uri.
    * @param uri The uri to decode
    * @return The decoded base64 data.
    */
  def DecodeBase64(uri: java.lang.String): stdLib.ArrayBuffer = js.native
  /**
    * Tries to copy an object by duplicating every property
    * @param source defines the source object
    * @param destination defines the target object
    * @param doNotCopyList defines a list of properties to avoid
    * @param mustCopyList defines a list of properties to copy (even if they start with _)
    */
  def DeepCopy(source: js.Any, destination: js.Any): scala.Unit = js.native
  def DeepCopy(source: js.Any, destination: js.Any, doNotCopyList: js.Array[java.lang.String]): scala.Unit = js.native
  def DeepCopy(
    source: js.Any,
    destination: js.Any,
    doNotCopyList: js.Array[java.lang.String],
    mustCopyList: js.Array[java.lang.String]
  ): scala.Unit = js.native
  /**
    * Gets or sets the retry strategy to apply when an error happens while loading an asset
    */
  def DefaultRetryStrategy(url: java.lang.String, request: stdLib.XMLHttpRequest, retryIndex: scala.Double): scala.Double = js.native
  /**
    * Returns a promise that resolves after the given amount of time.
    * @param delay Number of milliseconds to delay
    * @returns Promise that resolves after the given amount of time
    */
  def DelayAsync(delay: scala.Double): js.Promise[scala.Unit] = js.native
  /**
    * Downloads a blob in the browser
    * @param blob defines the blob to download
    * @param fileName defines the name of the downloaded file
    */
  def Download(blob: stdLib.Blob, fileName: java.lang.String): scala.Unit = js.native
  /**
    * Dumps the current bound framebuffer
    * @param width defines the rendering width
    * @param height defines the rendering height
    * @param engine defines the hosting engine
    * @param successCallback defines the callback triggered once the data are available
    * @param mimeType defines the mime type of the result
    * @param fileName defines the filename to download. If present, the result will automatically be downloaded
    */
  def DumpFramebuffer(width: scala.Double, height: scala.Double, engine: babylonjsLib.BABYLONNs.Engine): scala.Unit = js.native
  def DumpFramebuffer(
    width: scala.Double,
    height: scala.Double,
    engine: babylonjsLib.BABYLONNs.Engine,
    successCallback: js.Function1[/* data */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def DumpFramebuffer(
    width: scala.Double,
    height: scala.Double,
    engine: babylonjsLib.BABYLONNs.Engine,
    successCallback: js.Function1[/* data */ java.lang.String, scala.Unit],
    mimeType: java.lang.String
  ): scala.Unit = js.native
  def DumpFramebuffer(
    width: scala.Double,
    height: scala.Double,
    engine: babylonjsLib.BABYLONNs.Engine,
    successCallback: js.Function1[/* data */ java.lang.String, scala.Unit],
    mimeType: java.lang.String,
    fileName: java.lang.String
  ): scala.Unit = js.native
  /**
    * Encode a buffer to a base64 string
    * @param buffer defines the buffer to encode
    * @returns the encoded string
    */
  def EncodeArrayBufferTobase64(buffer: stdLib.ArrayBuffer): java.lang.String = js.native
  /**
    * Encodes the canvas data to base 64 or automatically download the result if filename is defined
    * @param successCallback defines the callback triggered once the data are available
    * @param mimeType defines the mime type of the result
    * @param fileName defines he filename to download. If present, the result will automatically be downloaded
    */
  def EncodeScreenshotCanvasData(): scala.Unit = js.native
  def EncodeScreenshotCanvasData(successCallback: js.Function1[/* data */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def EncodeScreenshotCanvasData(successCallback: js.Function1[/* data */ java.lang.String, scala.Unit], mimeType: java.lang.String): scala.Unit = js.native
  def EncodeScreenshotCanvasData(
    successCallback: js.Function1[/* data */ java.lang.String, scala.Unit],
    mimeType: java.lang.String,
    fileName: java.lang.String
  ): scala.Unit = js.native
  /**
    * Ends a specific performance coutner
    */
  def EndPerformanceCounter(counterName: java.lang.String): scala.Unit = js.native
  def EndPerformanceCounter(counterName: java.lang.String, condition: scala.Boolean): scala.Unit = js.native
  /**
    * Write an error message to the console
    */
  def Error(message: java.lang.String): scala.Unit = js.native
  /**
    * Asks the browser to exit fullscreen mode
    */
  def ExitFullscreen(): scala.Unit = js.native
  /**
    * Extracts minimum and maximum values from a list of positions
    * @param positions defines the positions to use
    * @param start defines the start index in the positions array
    * @param count defines the number of positions to handle
    * @param bias defines bias value to add to the result
    * @param stride defines the stride size to use (distance between two positions in the positions array)
    * @return minimum and maximum values
    */
  def ExtractMinAndMax(positions: babylonjsLib.BABYLONNs.FloatArray, start: scala.Double, count: scala.Double): babylonjsLib.Anon_Maximum = js.native
  def ExtractMinAndMax(
    positions: babylonjsLib.BABYLONNs.FloatArray,
    start: scala.Double,
    count: scala.Double,
    bias: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Vector2]
  ): babylonjsLib.Anon_Maximum = js.native
  def ExtractMinAndMax(
    positions: babylonjsLib.BABYLONNs.FloatArray,
    start: scala.Double,
    count: scala.Double,
    bias: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Vector2],
    stride: scala.Double
  ): babylonjsLib.Anon_Maximum = js.native
  /**
    * Extracts minimum and maximum values from a list of indexed positions
    * @param positions defines the positions to use
    * @param indices defines the indices to the positions
    * @param indexStart defines the start index
    * @param indexCount defines the end index
    * @param bias defines bias value to add to the result
    * @return minimum and maximum values
    */
  def ExtractMinAndMaxIndexed(
    positions: babylonjsLib.BABYLONNs.FloatArray,
    indices: babylonjsLib.BABYLONNs.IndicesArray,
    indexStart: scala.Double,
    indexCount: scala.Double
  ): babylonjsLib.Anon_Maximum = js.native
  def ExtractMinAndMaxIndexed(
    positions: babylonjsLib.BABYLONNs.FloatArray,
    indices: babylonjsLib.BABYLONNs.IndicesArray,
    indexStart: scala.Double,
    indexCount: scala.Double,
    bias: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Vector2]
  ): babylonjsLib.Anon_Maximum = js.native
  /**
    * Read the content of a byte array at a specified coordinates (taking in account wrapping)
    * @param u defines the coordinate on X axis
    * @param v defines the coordinate on Y axis
    * @param width defines the width of the source data
    * @param height defines the height of the source data
    * @param pixels defines the source byte array
    * @param color defines the output color
    */
  def FetchToRef(
    u: scala.Double,
    v: scala.Double,
    width: scala.Double,
    height: scala.Double,
    pixels: stdLib.Uint8Array,
    color: babylonjsLib.BABYLONNs.Color4
  ): scala.Unit = js.native
  /**
    * Creates a data url from a given string content
    * @param content defines the content to convert
    * @returns the new data url link
    */
  def FileAsURL(content: java.lang.String): java.lang.String = js.native
  /**
    * Gets the first element of an array satisfying a given predicate
    * @param array defines the array to browse
    * @param predicate defines the predicate to use
    * @returns null if not found or the element
    */
  def First[T](array: js.Array[T], predicate: js.Function1[/* item */ T, scala.Boolean]): babylonjsLib.BABYLONNs.Nullable[T] = js.native
  /**
    * Returns the nearest 32-bit single precision float representation of a Number
    * @param value A Number.  If the parameter is of a different type, it will get converted
    * to a number or to NaN if it cannot be converted
    * @returns number
    */
  def FloatRound(value: scala.Double): scala.Double = js.native
  /**
    * Find the next lowest power of two.
    * @param x Number to start search from.
    * @return Next lowest power of two.
    */
  def FloorPOT(x: scala.Double): scala.Double = js.native
  /**
    * Format the given number to a specific decimal format
    * @param value defines the number to format
    * @param decimals defines the number of decimals to use
    * @returns the formatted string
    */
  def Format(value: scala.Double): java.lang.String = js.native
  def Format(value: scala.Double, decimals: scala.Double): java.lang.String = js.native
  /**
    * This method will return the name of the class used to create the instance of the given object.
    * It will works only on Javascript basic data types (number, string, ...) and instance of class declared with the @className decorator.
    * @param object the object to get the class name from
    * @param isType defines if the object is actually a type
    * @returns the name of the class, will be "object" for a custom data type not using the @className decorator
    */
  def GetClassName(`object`: js.Any): java.lang.String = js.native
  def GetClassName(`object`: js.Any, isType: scala.Boolean): java.lang.String = js.native
  /**
    * Gets the current gradient from an array of IValueGradient
    * @param ratio defines the current ratio to get
    * @param gradients defines the array of IValueGradient
    * @param updateFunc defines the callback function used to get the final value from the selected gradients
    */
  def GetCurrentGradient(
    ratio: scala.Double,
    gradients: js.Array[babylonjsLib.BABYLONNs.IValueGradient],
    updateFunc: js.Function3[
      /* current */ babylonjsLib.BABYLONNs.IValueGradient, 
      /* next */ babylonjsLib.BABYLONNs.IValueGradient, 
      /* scale */ scala.Double, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Extracts text content from a DOM element hierarchy
    * @param element defines the root element
    * @returns a string
    */
  def GetDOMTextContent(element: stdLib.HTMLElement): java.lang.String = js.native
  /**
    * Get the closest exponent of two
    * @param value defines the value to approximate
    * @param max defines the maximum value to return
    * @param mode defines how to define the closest value
    * @returns closest exponent of two of the given value
    */
  def GetExponentOfTwo(value: scala.Double, max: scala.Double): scala.Double = js.native
  def GetExponentOfTwo(value: scala.Double, max: scala.Double, mode: scala.Double): scala.Double = js.native
  /**
    * Extracts the filename from a path
    * @param path defines the path to use
    * @returns the filename
    */
  def GetFilename(path: java.lang.String): java.lang.String = js.native
  /**
    * Extracts the "folder" part of a path (everything before the filename).
    * @param uri The URI to extract the info from
    * @param returnUnchangedIfNoSlash Do not touch the URI if no slashes are present
    * @returns The "folder" part of the path
    */
  def GetFolderPath(uri: java.lang.String): java.lang.String = js.native
  def GetFolderPath(uri: java.lang.String, returnUnchangedIfNoSlash: scala.Boolean): java.lang.String = js.native
  /**
    * Gets the pointer prefix to use
    * @returns "pointer" if touch is enabled. Else returns "mouse"
    */
  def GetPointerPrefix(): java.lang.String = js.native
  /**
    * Tries to instantiate a new object from a given class name
    * @param className defines the class name to instantiate
    * @returns the new object or null if the system was not able to do the instantiation
    */
  def Instantiate(className: java.lang.String): js.Any = js.native
  /**
    * Test if the given uri is a base64 string
    * @param uri The uri to test
    * @return True if the uri is a base64 string or false otherwise
    */
  def IsBase64(uri: java.lang.String): scala.Boolean = js.native
  /**
    * Gets a boolean indicating if the given object has no own property
    * @param obj defines the object to test
    * @returns true if object has no own property
    */
  def IsEmpty(obj: js.Any): scala.Boolean = js.native
  /**
    * Function indicating if a number is an exponent of 2
    * @param value defines the value to test
    * @returns true if the value is an exponent of 2
    */
  def IsExponentOfTwo(value: scala.Double): scala.Boolean = js.native
  /**
    * Checks if the loaded document was accessed via `file:`-Protocol.
    * @returns boolean
    */
  def IsFileURL(): scala.Boolean = js.native
  /**
    * Checks if the window object exists
    * @returns true if the window object exists
    */
  def IsWindowObjectExist(): scala.Boolean = js.native
  /**
    * Loads a file
    * @param url url string, ArrayBuffer, or Blob to load
    * @param onSuccess callback called when the file successfully loads
    * @param onProgress callback called while file is loading (if the server supports this mode)
    * @param database  database for caching
    * @param useArrayBuffer defines a boolean indicating that date must be returned as ArrayBuffer
    * @param onError callback called when the file fails to load
    * @returns a file request object
    */
  def LoadFile(
    url: java.lang.String,
    onSuccess: js.Function2[
      /* data */ java.lang.String | stdLib.ArrayBuffer, 
      /* responseURL */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ): babylonjsLib.BABYLONNs.IFileRequest = js.native
  def LoadFile(
    url: java.lang.String,
    onSuccess: js.Function2[
      /* data */ java.lang.String | stdLib.ArrayBuffer, 
      /* responseURL */ js.UndefOr[java.lang.String], 
      scala.Unit
    ],
    onProgress: js.Function1[/* data */ js.Any, scala.Unit]
  ): babylonjsLib.BABYLONNs.IFileRequest = js.native
  def LoadFile(
    url: java.lang.String,
    onSuccess: js.Function2[
      /* data */ java.lang.String | stdLib.ArrayBuffer, 
      /* responseURL */ js.UndefOr[java.lang.String], 
      scala.Unit
    ],
    onProgress: js.Function1[/* data */ js.Any, scala.Unit],
    database: babylonjsLib.BABYLONNs.Database
  ): babylonjsLib.BABYLONNs.IFileRequest = js.native
  def LoadFile(
    url: java.lang.String,
    onSuccess: js.Function2[
      /* data */ java.lang.String | stdLib.ArrayBuffer, 
      /* responseURL */ js.UndefOr[java.lang.String], 
      scala.Unit
    ],
    onProgress: js.Function1[/* data */ js.Any, scala.Unit],
    database: babylonjsLib.BABYLONNs.Database,
    useArrayBuffer: scala.Boolean
  ): babylonjsLib.BABYLONNs.IFileRequest = js.native
  def LoadFile(
    url: java.lang.String,
    onSuccess: js.Function2[
      /* data */ java.lang.String | stdLib.ArrayBuffer, 
      /* responseURL */ js.UndefOr[java.lang.String], 
      scala.Unit
    ],
    onProgress: js.Function1[/* data */ js.Any, scala.Unit],
    database: babylonjsLib.BABYLONNs.Database,
    useArrayBuffer: scala.Boolean,
    onError: js.Function2[
      /* request */ js.UndefOr[stdLib.XMLHttpRequest], 
      /* exception */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ): babylonjsLib.BABYLONNs.IFileRequest = js.native
  /**
    * Loads an image as an HTMLImageElement.
    * @param input url string, ArrayBuffer, or Blob to load
    * @param onLoad callback called when the image successfully loads
    * @param onError callback called when the image fails to load
    * @param database database for caching
    * @returns the HTMLImageElement of the loaded image
    */
  def LoadImage(
    input: java.lang.String,
    onLoad: js.Function1[/* img */ stdLib.HTMLImageElement, scala.Unit],
    onError: js.Function2[
      /* message */ js.UndefOr[java.lang.String], 
      /* exception */ js.UndefOr[js.Any], 
      scala.Unit
    ],
    database: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Database]
  ): stdLib.HTMLImageElement = js.native
  def LoadImage(
    input: stdLib.ArrayBuffer,
    onLoad: js.Function1[/* img */ stdLib.HTMLImageElement, scala.Unit],
    onError: js.Function2[
      /* message */ js.UndefOr[java.lang.String], 
      /* exception */ js.UndefOr[js.Any], 
      scala.Unit
    ],
    database: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Database]
  ): stdLib.HTMLImageElement = js.native
  def LoadImage(
    input: stdLib.Blob,
    onLoad: js.Function1[/* img */ stdLib.HTMLImageElement, scala.Unit],
    onError: js.Function2[
      /* message */ js.UndefOr[java.lang.String], 
      /* exception */ js.UndefOr[js.Any], 
      scala.Unit
    ],
    database: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Database]
  ): stdLib.HTMLImageElement = js.native
  /**
    * Load a script (identified by an url). When the url returns, the
    * content of this file is added into a new script element, attached to the DOM (body element)
    * @param scriptUrl defines the url of the script to laod
    * @param onSuccess defines the callback called when the script is loaded
    * @param onError defines the callback to call if an error occurs
    */
  def LoadScript(scriptUrl: java.lang.String, onSuccess: js.Function0[scala.Unit]): scala.Unit = js.native
  def LoadScript(
    scriptUrl: java.lang.String,
    onSuccess: js.Function0[scala.Unit],
    onError: js.Function2[
      /* message */ js.UndefOr[java.lang.String], 
      /* exception */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Log a message to the console
    */
  def Log(message: java.lang.String): scala.Unit = js.native
  /**
    * Returns an array if obj is not an array
    * @param obj defines the object to evaluate as an array
    * @param allowsNullUndefined defines a boolean indicating if obj is allowed to be null or undefined
    * @returns either obj directly if obj is an array or a new array containing obj
    */
  def MakeArray(obj: js.Any): babylonjsLib.BABYLONNs.Nullable[js.Array[_]] = js.native
  def MakeArray(obj: js.Any, allowsNullUndefined: scala.Boolean): babylonjsLib.BABYLONNs.Nullable[js.Array[_]] = js.native
  /**
    * Interpolates between a and b via alpha
    * @param a The lower value (returned when alpha = 0)
    * @param b The upper value (returned when alpha = 1)
    * @param alpha The interpolation-factor
    * @return The mixed value
    */
  def Mix(a: scala.Double, b: scala.Double, alpha: scala.Double): scala.Double = js.native
  /**
    * Find the nearest power of two.
    * @param x Number to start search from.
    * @return Next nearest power of two.
    */
  def NearestPOT(x: scala.Double): scala.Double = js.native
  /**
    * Callback called when a new log is added
    */
  def OnNewCacheEntry(entry: java.lang.String): scala.Unit = js.native
  /**
    * Gets or sets a function used to pre-process url before using them to load assets
    */
  def PreprocessUrl(url: java.lang.String): java.lang.String = js.native
  /**
    * Queue a new function into the requested animation frame pool (ie. this function will be executed byt the browser for the next frame)
    * @param func - the function to be called
    * @param requester - the object that will request the next frame. Falls back to window.
    * @returns frame number
    */
  def QueueNewFrame(func: js.Function0[scala.Unit]): scala.Double = js.native
  def QueueNewFrame(func: js.Function0[scala.Unit], requester: js.Any): scala.Double = js.native
  /**
    * Implementation from http://stackoverflow.com/questions/105034/how-to-create-a-guid-uuid-in-javascript/2117523#answer-2117523
    * Be aware Math.random() could cause collisions, but:
    * "All but 6 of the 128 bits of the ID are randomly generated, which means that for any two ids, there's a 1 in 2^^122 (or 5.3x10^^36) chance they'll collide"
    * @returns a pseudo random id
    */
  def RandomId(): java.lang.String = js.native
  /**
    * Loads a file
    * @param fileToLoad defines the file to load
    * @param callback defines the callback to call when data is loaded
    * @param progressCallBack defines the callback to call during loading process
    * @param useArrayBuffer defines a boolean indicating that data must be returned as an ArrayBuffer
    * @returns a file request object
    */
  def ReadFile(fileToLoad: stdLib.File, callback: js.Function1[/* data */ js.Any, scala.Unit]): babylonjsLib.BABYLONNs.IFileRequest = js.native
  def ReadFile(
    fileToLoad: stdLib.File,
    callback: js.Function1[/* data */ js.Any, scala.Unit],
    progressCallBack: js.Function1[/* ev */ stdLib.ProgressEvent, _]
  ): babylonjsLib.BABYLONNs.IFileRequest = js.native
  def ReadFile(
    fileToLoad: stdLib.File,
    callback: js.Function1[/* data */ js.Any, scala.Unit],
    progressCallBack: js.Function1[/* ev */ stdLib.ProgressEvent, _],
    useArrayBuffer: scala.Boolean
  ): babylonjsLib.BABYLONNs.IFileRequest = js.native
  /**
    * Loads a file from a blob
    * @param fileToLoad defines the blob to use
    * @param callback defines the callback to call when data is loaded
    * @param progressCallback defines the callback to call during loading process
    * @returns a file request object
    */
  def ReadFileAsDataURL(
    fileToLoad: stdLib.Blob,
    callback: js.Function1[/* data */ js.Any, scala.Unit],
    progressCallback: js.Function1[/* ev */ stdLib.ProgressEvent, _]
  ): babylonjsLib.BABYLONNs.IFileRequest = js.native
  /**
    * Function used to register events at window level
    * @param events defines the events to register
    */
  def RegisterTopRootEvents(events: js.Array[babylonjsLib.Anon_E]): scala.Unit = js.native
  /**
    * Ask the browser to promote the current element to fullscreen rendering mode
    * @param element defines the DOM element to promote
    */
  def RequestFullscreen(element: stdLib.HTMLElement): scala.Unit = js.native
  /**
    * Sets the cors behavior on a dom element. This will add the required Tools.CorsBehavior to the element.
    * @param url define the url we are trying
    * @param element define the dom element where to configure the cors policy
    */
  def SetCorsBehavior(url: java.lang.String, element: babylonjsLib.Anon_CrossOrigin): scala.Unit = js.native
  def SetCorsBehavior(url: js.Array[java.lang.String], element: babylonjsLib.Anon_CrossOrigin): scala.Unit = js.native
  /**
    * Polyfill for setImmediate
    * @param action defines the action to execute after the current execution block
    */
  def SetImmediate(action: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * Provides a slice function that will work even on IE
    * @param data defines the array to slice
    * @param start defines the start of the data (optional)
    * @param end defines the end of the data (optional)
    * @returns the new sliced array
    */
  def Slice[T](data: T): T = js.native
  def Slice[T](data: T, start: scala.Double): T = js.native
  def Slice[T](data: T, start: scala.Double, end: scala.Double): T = js.native
  /**
    * Starts a performance counter
    */
  def StartPerformanceCounter(counterName: java.lang.String): scala.Unit = js.native
  def StartPerformanceCounter(counterName: java.lang.String, condition: scala.Boolean): scala.Unit = js.native
  /**
    * Converts the canvas data to blob.
    * This acts as a polyfill for browsers not supporting the to blob function.
    * @param canvas Defines the canvas to extract the data from
    * @param successCallback Defines the callback triggered once the data are available
    * @param mimeType Defines the mime type of the result
    */
  def ToBlob(
    canvas: babylonjsLib.HTMLCanvasElement,
    successCallback: js.Function1[/* blob */ babylonjsLib.BABYLONNs.Nullable[stdLib.Blob], scala.Unit]
  ): scala.Unit = js.native
  def ToBlob(
    canvas: babylonjsLib.HTMLCanvasElement,
    successCallback: js.Function1[/* blob */ babylonjsLib.BABYLONNs.Nullable[stdLib.Blob], scala.Unit],
    mimeType: java.lang.String
  ): scala.Unit = js.native
  /**
    * Convert an angle in radians to degrees
    * @param angle defines the angle to convert
    * @returns the angle in degrees
    */
  def ToDegrees(angle: scala.Double): scala.Double = js.native
  /**
    * Convert an angle in degrees to radians
    * @param angle defines the angle to convert
    * @returns the angle in radians
    */
  def ToRadians(angle: scala.Double): scala.Double = js.native
  /**
    * Function used to unregister events from window level
    * @param events defines the events to unregister
    */
  def UnregisterTopRootEvents(events: js.Array[babylonjsLib.Anon_E]): scala.Unit = js.native
  /**
    * Validates if xhr data is correct
    * @param xhr defines the request to validate
    * @param dataType defines the expected data type
    * @returns true if data is correct
    */
  def ValidateXHRData(xhr: stdLib.XMLHttpRequest): scala.Boolean = js.native
  def ValidateXHRData(xhr: stdLib.XMLHttpRequest, dataType: scala.Double): scala.Boolean = js.native
  /**
    * Write a warning message to the console
    */
  def Warn(message: java.lang.String): scala.Unit = js.native
  /**
    * This method will return the name of the full name of the class, including its owning module (if any).
    * It will works only on Javascript basic data types (number, string, ...) and instance of class declared with the @className decorator or implementing a method getClassName():string (in which case the module won't be specified).
    * @param object the object to get the class name from
    * @param isType defines if the object is actually a type
    * @return a string that can have two forms: "moduleName.className" if module was specified when the class' Name was registered or "className" if there was not module specified.
    * @ignorenaming
    */
  def getFullClassName(`object`: js.Any): babylonjsLib.BABYLONNs.Nullable[java.lang.String] = js.native
  def getFullClassName(`object`: js.Any, isType: scala.Boolean): babylonjsLib.BABYLONNs.Nullable[java.lang.String] = js.native
}

