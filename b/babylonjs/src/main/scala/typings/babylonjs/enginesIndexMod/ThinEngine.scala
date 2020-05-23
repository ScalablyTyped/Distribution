package typings.babylonjs.enginesIndexMod

import typings.babylonjs.HTMLCanvasElement
import typings.babylonjs.ImageBitmap
import typings.babylonjs.WebGLRenderingContext
import typings.babylonjs.anon.Capture
import typings.babylonjs.anon.CaptureConstraint
import typings.babylonjs.fileRequestMod.IFileRequest
import typings.babylonjs.fileToolsMod.LoadFileError
import typings.babylonjs.internalTextureLoaderMod.IInternalTextureLoader
import typings.babylonjs.iofflineproviderMod.IOfflineProvider
import typings.babylonjs.thinEngineMod.EngineOptions
import typings.babylonjs.typesMod.Nullable
import typings.babylonjs.webRequestMod.WebRequest
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import typings.std.Blob
import typings.std.EventTarget
import typings.std.HTMLImageElement
import typings.std.ProgressEvent
import typings.std.WebGL2RenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Engines/index", "ThinEngine")
@js.native
class ThinEngine protected ()
  extends typings.babylonjs.thinEngineMod.ThinEngine {
  /**
    * Creates a new engine
    * @param canvasOrContext defines the canvas or WebGL context to use for rendering. If you provide a WebGL context, Babylon.js will not hook events on the canvas (like pointers, keyboards, etc...) so no event observables will be available. This is mostly used when Babylon.js is used as a plugin on a system which alreay used the WebGL context
    * @param antialias defines enable antialiasing (default: false)
    * @param options defines further options to be sent to the getContext() function
    * @param adaptToDeviceRatio defines whether to adapt to the device's viewport characteristics (default: false)
    */
  def this(canvasOrContext: Nullable[HTMLCanvasElement | WebGLRenderingContext | WebGL2RenderingContext]) = this()
  def this(
    canvasOrContext: Nullable[HTMLCanvasElement | WebGLRenderingContext | WebGL2RenderingContext],
    antialias: Boolean
  ) = this()
  def this(
    canvasOrContext: Nullable[HTMLCanvasElement | WebGLRenderingContext | WebGL2RenderingContext],
    antialias: Boolean,
    options: EngineOptions
  ) = this()
  def this(
    canvasOrContext: Nullable[HTMLCanvasElement | WebGLRenderingContext | WebGL2RenderingContext],
    antialias: Boolean,
    options: EngineOptions,
    adaptToDeviceRatio: Boolean
  ) = this()
}

/* static members */
@JSImport("babylonjs/Engines/index", "ThinEngine")
@js.native
object ThinEngine extends js.Object {
  /**
    * Gets or sets the epsilon value used by collision engine
    */
  var CollisionsEpsilon: Double = js.native
  /** Use this array to turn off some WebGL2 features on known buggy browsers version */
  var ExceptionList: js.Array[Capture | CaptureConstraint] = js.native
  /** @hidden */
  var _TextureLoaders: js.Array[IInternalTextureLoader] = js.native
  var _isSupported: js.Any = js.native
  /**
    * Find the next highest power of two.
    * @param x Number to start search from.
    * @return Next highest power of two.
    */
  def CeilingPOT(x: Double): Double = js.native
  /**
    * Find the next lowest power of two.
    * @param x Number to start search from.
    * @return Next lowest power of two.
    */
  def FloorPOT(x: Double): Double = js.native
  /**
    * Get the closest exponent of two
    * @param value defines the value to approximate
    * @param max defines the maximum value to return
    * @param mode defines how to define the closest value
    * @returns closest exponent of two of the given value
    */
  def GetExponentOfTwo(value: Double, max: Double): Double = js.native
  def GetExponentOfTwo(value: Double, max: Double, mode: Double): Double = js.native
  /**
    * Find the nearest power of two.
    * @param x Number to start search from.
    * @return Next nearest power of two.
    */
  def NearestPOT(x: Double): Double = js.native
  /**
    * Returns the current npm package of the sdk
    */
  def NpmPackage: String = js.native
  /**
    * Queue a new function into the requested animation frame pool (ie. this function will be executed byt the browser for the next frame)
    * @param func - the function to be called
    * @param requester - the object that will request the next frame. Falls back to window.
    * @returns frame number
    */
  def QueueNewFrame(func: js.Function0[Unit]): Double = js.native
  def QueueNewFrame(func: js.Function0[Unit], requester: js.Any): Double = js.native
  /**
    * Gets or sets the relative url used to load shaders if using the engine in non-minified mode
    */
  def ShadersRepository: String = js.native
  def ShadersRepository(value: String): js.Any = js.native
  /**
    * Returns the current version of the framework
    */
  def Version: String = js.native
  /* protected */ def _ConcatenateShader(source: String, defines: Nullable[String]): String = js.native
  /* protected */ def _ConcatenateShader(source: String, defines: Nullable[String], shaderVersion: String): String = js.native
  /**
    * Loads a file from a url
    * @param url url to load
    * @param onSuccess callback called when the file successfully loads
    * @param onProgress callback called while file is loading (if the server supports this mode)
    * @param offlineProvider defines the offline provider for caching
    * @param useArrayBuffer defines a boolean indicating that date must be returned as ArrayBuffer
    * @param onError callback called when the file fails to load
    * @returns a file request object
    * @hidden
    */
  def _FileToolsLoadFile(
    url: String,
    onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit]
  ): IFileRequest = js.native
  def _FileToolsLoadFile(
    url: String,
    onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
    onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Unit]
  ): IFileRequest = js.native
  def _FileToolsLoadFile(
    url: String,
    onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
    onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Unit],
    offlineProvider: IOfflineProvider
  ): IFileRequest = js.native
  def _FileToolsLoadFile(
    url: String,
    onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
    onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Unit],
    offlineProvider: IOfflineProvider,
    useArrayBuffer: Boolean
  ): IFileRequest = js.native
  def _FileToolsLoadFile(
    url: String,
    onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
    onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Unit],
    offlineProvider: IOfflineProvider,
    useArrayBuffer: Boolean,
    onError: js.Function2[
      /* request */ js.UndefOr[WebRequest], 
      /* exception */ js.UndefOr[LoadFileError], 
      Unit
    ]
  ): IFileRequest = js.native
  /**
    * Loads an image as an HTMLImageElement.
    * @param input url string, ArrayBuffer, or Blob to load
    * @param onLoad callback called when the image successfully loads
    * @param onError callback called when the image fails to load
    * @param offlineProvider offline provider for caching
    * @param mimeType optional mime type
    * @returns the HTMLImageElement of the loaded image
    * @hidden
    */
  def _FileToolsLoadImage(
    input: String,
    onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit],
    offlineProvider: Nullable[IOfflineProvider]
  ): Nullable[HTMLImageElement] = js.native
  def _FileToolsLoadImage(
    input: String,
    onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit],
    offlineProvider: Nullable[IOfflineProvider],
    mimeType: String
  ): Nullable[HTMLImageElement] = js.native
  def _FileToolsLoadImage(
    input: ArrayBufferView,
    onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit],
    offlineProvider: Nullable[IOfflineProvider]
  ): Nullable[HTMLImageElement] = js.native
  def _FileToolsLoadImage(
    input: ArrayBufferView,
    onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit],
    offlineProvider: Nullable[IOfflineProvider],
    mimeType: String
  ): Nullable[HTMLImageElement] = js.native
  def _FileToolsLoadImage(
    input: ArrayBuffer,
    onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit],
    offlineProvider: Nullable[IOfflineProvider]
  ): Nullable[HTMLImageElement] = js.native
  def _FileToolsLoadImage(
    input: ArrayBuffer,
    onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit],
    offlineProvider: Nullable[IOfflineProvider],
    mimeType: String
  ): Nullable[HTMLImageElement] = js.native
  def _FileToolsLoadImage(
    input: Blob,
    onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit],
    offlineProvider: Nullable[IOfflineProvider]
  ): Nullable[HTMLImageElement] = js.native
  def _FileToolsLoadImage(
    input: Blob,
    onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit],
    offlineProvider: Nullable[IOfflineProvider],
    mimeType: String
  ): Nullable[HTMLImageElement] = js.native
  /**
    * Gets a boolean indicating if the engine can be instanciated (ie. if a webGL context can be found)
    * @returns true if the engine can be created
    * @ignorenaming
    */
  def isSupported(): Boolean = js.native
}

