package typings.babylonjs

import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.anon.CrossOrigin
import typings.babylonjs.anon.Handler
import typings.babylonjs.camerasCameraMod.Camera
import typings.babylonjs.enginesEngineMod.Engine
import typings.babylonjs.mathsMathDotlikeMod.IColor4Like
import typings.babylonjs.miscFileRequestMod.IFileRequest
import typings.babylonjs.miscFileToolsMod.ReadFileError
import typings.babylonjs.miscInterfacesScreenshotSizeMod.IScreenshotSize
import typings.babylonjs.miscWebRequestMod.WebRequest
import typings.babylonjs.offlineIofflineproviderMod.IOfflineProvider
import typings.babylonjs.typesMod.Nullable
import typings.std.Blob
import typings.std.EventTarget
import typings.std.File
import typings.std.HTMLElement
import typings.std.HTMLImageElement
import typings.std.IArguments
import typings.std.ImageBitmap
import typings.std.ImageBitmapOptions
import typings.std.ProgressEvent
import typings.std.ReferrerPolicy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object miscToolsMod {
  
  @JSImport("babylonjs/Misc/tools", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs/Misc/tools", "AsyncLoop")
  @js.native
  open class AsyncLoop protected () extends StObject {
    /**
      * Constructor.
      * @param iterations the number of iterations.
      * @param func the function to run each iteration
      * @param successCallback the callback that will be called upon successful execution
      * @param offset starting offset.
      */
    def this(
      /**
      * Defines the number of iterations for the loop
      */
    iterations: Double,
      func: js.Function1[/* asyncLoop */ AsyncLoop, Unit],
      successCallback: js.Function0[Unit]
    ) = this()
    def this(
      /**
      * Defines the number of iterations for the loop
      */
    iterations: Double,
      func: js.Function1[/* asyncLoop */ AsyncLoop, Unit],
      successCallback: js.Function0[Unit],
      offset: Double
    ) = this()
    
    /* private */ var _done: Any = js.native
    
    /* private */ var _fn: Any = js.native
    
    /* private */ var _successCallback: Any = js.native
    
    /**
      * Break the loop and run the success callback.
      */
    def breakLoop(): Unit = js.native
    
    /**
      * Execute the next iteration. Must be called after the last iteration was finished.
      */
    def executeNext(): Unit = js.native
    
    /**
      * Defines the current index of the loop.
      */
    var index: Double = js.native
    
    /**
      * Defines the number of iterations for the loop
      */
    var iterations: Double = js.native
  }
  /* static members */
  object AsyncLoop {
    
    @JSImport("babylonjs/Misc/tools", "AsyncLoop")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create and run an async loop.
      * @param iterations the number of iterations.
      * @param fn the function to run each iteration
      * @param successCallback the callback that will be called upon successful execution
      * @param offset starting offset.
      * @returns the created async loop object
      */
    inline def Run(
      iterations: Double,
      fn: js.Function1[/* asyncLoop */ this.type, Unit],
      successCallback: js.Function0[Unit]
    ): AsyncLoop = (^.asInstanceOf[js.Dynamic].applyDynamic("Run")(iterations.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any])).asInstanceOf[AsyncLoop]
    inline def Run(
      iterations: Double,
      fn: js.Function1[/* asyncLoop */ this.type, Unit],
      successCallback: js.Function0[Unit],
      offset: Double
    ): AsyncLoop = (^.asInstanceOf[js.Dynamic].applyDynamic("Run")(iterations.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[AsyncLoop]
    
    /**
      * A for-loop that will run a given number of iterations synchronous and the rest async.
      * @param iterations total number of iterations
      * @param syncedIterations number of synchronous iterations in each async iteration.
      * @param fn the function to call each iteration.
      * @param callback a success call back that will be called when iterating stops.
      * @param breakFunction a break condition (optional)
      * @param timeout timeout settings for the setTimeout function. default - 0.
      * @returns the created async loop object
      */
    inline def SyncAsyncForLoop(
      iterations: Double,
      syncedIterations: Double,
      fn: js.Function1[/* iteration */ Double, Unit],
      callback: js.Function0[Unit]
    ): AsyncLoop = (^.asInstanceOf[js.Dynamic].applyDynamic("SyncAsyncForLoop")(iterations.asInstanceOf[js.Any], syncedIterations.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[AsyncLoop]
    inline def SyncAsyncForLoop(
      iterations: Double,
      syncedIterations: Double,
      fn: js.Function1[/* iteration */ Double, Unit],
      callback: js.Function0[Unit],
      breakFunction: js.Function0[Boolean]
    ): AsyncLoop = (^.asInstanceOf[js.Dynamic].applyDynamic("SyncAsyncForLoop")(iterations.asInstanceOf[js.Any], syncedIterations.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], breakFunction.asInstanceOf[js.Any])).asInstanceOf[AsyncLoop]
    inline def SyncAsyncForLoop(
      iterations: Double,
      syncedIterations: Double,
      fn: js.Function1[/* iteration */ Double, Unit],
      callback: js.Function0[Unit],
      breakFunction: js.Function0[Boolean],
      timeout: Double
    ): AsyncLoop = (^.asInstanceOf[js.Dynamic].applyDynamic("SyncAsyncForLoop")(iterations.asInstanceOf[js.Any], syncedIterations.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], breakFunction.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[AsyncLoop]
    inline def SyncAsyncForLoop(
      iterations: Double,
      syncedIterations: Double,
      fn: js.Function1[/* iteration */ Double, Unit],
      callback: js.Function0[Unit],
      breakFunction: Unit,
      timeout: Double
    ): AsyncLoop = (^.asInstanceOf[js.Dynamic].applyDynamic("SyncAsyncForLoop")(iterations.asInstanceOf[js.Any], syncedIterations.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], breakFunction.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[AsyncLoop]
  }
  
  @JSImport("babylonjs/Misc/tools", "Tools")
  @js.native
  open class Tools () extends StObject
  /* static members */
  object Tools {
    
    @JSImport("babylonjs/Misc/tools", "Tools")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * All logs
      */
    @JSImport("babylonjs/Misc/tools", "Tools.AllLogLevel")
    @js.native
    val AllLogLevel: Double = js.native
    
    /**
      * Will return the right value of the noPreventDefault variable
      * Needed to keep backwards compatibility to the old API.
      *
      * @param args arguments passed to the attachControl function
      * @returns the correct value for noPreventDefault
      */
    inline def BackCompatCameraNoPreventDefault(args: IArguments): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("BackCompatCameraNoPreventDefault")(args.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Removes unwanted characters from an url
      * @param url defines the url to clean
      * @returns the cleaned url
      */
    inline def CleanUrl(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("CleanUrl")(url.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Clears the log cache
      */
    inline def ClearLogCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ClearLogCache")().asInstanceOf[Unit]
    
    inline def CreateScreenshot(engine: Engine, camera: Camera, size: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshot")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def CreateScreenshot(
      engine: Engine,
      camera: Camera,
      size: Double,
      successCallback: js.Function1[/* data */ String, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshot")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def CreateScreenshot(
      engine: Engine,
      camera: Camera,
      size: Double,
      successCallback: js.Function1[/* data */ String, Unit],
      mimeType: String
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshot")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def CreateScreenshot(engine: Engine, camera: Camera, size: Double, successCallback: Unit, mimeType: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshot")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /**
      * Captures a screenshot of the current rendering
      * @see https://doc.babylonjs.com/features/featuresDeepDive/scene/renderToPNG
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
    inline def CreateScreenshot(engine: Engine, camera: Camera, size: IScreenshotSize): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshot")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def CreateScreenshot(
      engine: Engine,
      camera: Camera,
      size: IScreenshotSize,
      successCallback: js.Function1[/* data */ String, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshot")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def CreateScreenshot(
      engine: Engine,
      camera: Camera,
      size: IScreenshotSize,
      successCallback: js.Function1[/* data */ String, Unit],
      mimeType: String
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshot")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def CreateScreenshot(engine: Engine, camera: Camera, size: IScreenshotSize, successCallback: Unit, mimeType: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshot")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def CreateScreenshotAsync(engine: Engine, camera: Camera, size: Double): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def CreateScreenshotAsync(engine: Engine, camera: Camera, size: Double, mimeType: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    /**
      * Captures a screenshot of the current rendering
      * @see https://doc.babylonjs.com/features/featuresDeepDive/scene/renderToPNG
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
    inline def CreateScreenshotAsync(engine: Engine, camera: Camera, size: IScreenshotSize): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def CreateScreenshotAsync(engine: Engine, camera: Camera, size: IScreenshotSize, mimeType: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    
    /**
      * Generates an image screenshot from the specified camera.
      * @see https://doc.babylonjs.com/features/featuresDeepDive/scene/renderToPNG
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
    inline def CreateScreenshotUsingRenderTarget(
      engine: Engine,
      camera: Camera,
      size: IScreenshotSize | Double,
      successCallback: js.UndefOr[js.Function1[/* data */ String, Unit]],
      mimeType: js.UndefOr[String],
      samples: js.UndefOr[Double],
      antialiasing: js.UndefOr[Boolean],
      fileName: js.UndefOr[String]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotUsingRenderTarget")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], samples.asInstanceOf[js.Any], antialiasing.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def CreateScreenshotUsingRenderTargetAsync(engine: Engine, camera: Camera, size: Double): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotUsingRenderTargetAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def CreateScreenshotUsingRenderTargetAsync(engine: Engine, camera: Camera, size: Double, mimeType: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotUsingRenderTargetAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def CreateScreenshotUsingRenderTargetAsync(engine: Engine, camera: Camera, size: Double, mimeType: String, samples: Double): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotUsingRenderTargetAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], samples.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def CreateScreenshotUsingRenderTargetAsync(
      engine: Engine,
      camera: Camera,
      size: Double,
      mimeType: String,
      samples: Double,
      antialiasing: Boolean
    ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotUsingRenderTargetAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], samples.asInstanceOf[js.Any], antialiasing.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def CreateScreenshotUsingRenderTargetAsync(
      engine: Engine,
      camera: Camera,
      size: Double,
      mimeType: String,
      samples: Double,
      antialiasing: Boolean,
      fileName: String
    ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotUsingRenderTargetAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], samples.asInstanceOf[js.Any], antialiasing.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def CreateScreenshotUsingRenderTargetAsync(
      engine: Engine,
      camera: Camera,
      size: Double,
      mimeType: String,
      samples: Double,
      antialiasing: Unit,
      fileName: String
    ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotUsingRenderTargetAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], samples.asInstanceOf[js.Any], antialiasing.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def CreateScreenshotUsingRenderTargetAsync(
      engine: Engine,
      camera: Camera,
      size: Double,
      mimeType: String,
      samples: Unit,
      antialiasing: Boolean
    ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotUsingRenderTargetAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], samples.asInstanceOf[js.Any], antialiasing.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def CreateScreenshotUsingRenderTargetAsync(
      engine: Engine,
      camera: Camera,
      size: Double,
      mimeType: String,
      samples: Unit,
      antialiasing: Boolean,
      fileName: String
    ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotUsingRenderTargetAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], samples.asInstanceOf[js.Any], antialiasing.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def CreateScreenshotUsingRenderTargetAsync(
      engine: Engine,
      camera: Camera,
      size: Double,
      mimeType: String,
      samples: Unit,
      antialiasing: Unit,
      fileName: String
    ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotUsingRenderTargetAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], samples.asInstanceOf[js.Any], antialiasing.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def CreateScreenshotUsingRenderTargetAsync(engine: Engine, camera: Camera, size: Double, mimeType: Unit, samples: Double): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotUsingRenderTargetAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], samples.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def CreateScreenshotUsingRenderTargetAsync(
      engine: Engine,
      camera: Camera,
      size: Double,
      mimeType: Unit,
      samples: Double,
      antialiasing: Boolean
    ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotUsingRenderTargetAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], samples.asInstanceOf[js.Any], antialiasing.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def CreateScreenshotUsingRenderTargetAsync(
      engine: Engine,
      camera: Camera,
      size: Double,
      mimeType: Unit,
      samples: Double,
      antialiasing: Boolean,
      fileName: String
    ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotUsingRenderTargetAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], samples.asInstanceOf[js.Any], antialiasing.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def CreateScreenshotUsingRenderTargetAsync(
      engine: Engine,
      camera: Camera,
      size: Double,
      mimeType: Unit,
      samples: Double,
      antialiasing: Unit,
      fileName: String
    ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotUsingRenderTargetAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], samples.asInstanceOf[js.Any], antialiasing.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def CreateScreenshotUsingRenderTargetAsync(engine: Engine, camera: Camera, size: Double, mimeType: Unit, samples: Unit, antialiasing: Boolean): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotUsingRenderTargetAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], samples.asInstanceOf[js.Any], antialiasing.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def CreateScreenshotUsingRenderTargetAsync(
      engine: Engine,
      camera: Camera,
      size: Double,
      mimeType: Unit,
      samples: Unit,
      antialiasing: Boolean,
      fileName: String
    ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotUsingRenderTargetAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], samples.asInstanceOf[js.Any], antialiasing.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def CreateScreenshotUsingRenderTargetAsync(
      engine: Engine,
      camera: Camera,
      size: Double,
      mimeType: Unit,
      samples: Unit,
      antialiasing: Unit,
      fileName: String
    ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotUsingRenderTargetAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], samples.asInstanceOf[js.Any], antialiasing.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    /**
      * Generates an image screenshot from the specified camera.
      * @see https://doc.babylonjs.com/features/featuresDeepDive/scene/renderToPNG
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
    inline def CreateScreenshotUsingRenderTargetAsync(engine: Engine, camera: Camera, size: IScreenshotSize): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotUsingRenderTargetAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def CreateScreenshotUsingRenderTargetAsync(engine: Engine, camera: Camera, size: IScreenshotSize, mimeType: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotUsingRenderTargetAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def CreateScreenshotUsingRenderTargetAsync(engine: Engine, camera: Camera, size: IScreenshotSize, mimeType: String, samples: Double): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotUsingRenderTargetAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], samples.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def CreateScreenshotUsingRenderTargetAsync(
      engine: Engine,
      camera: Camera,
      size: IScreenshotSize,
      mimeType: String,
      samples: Double,
      antialiasing: Boolean
    ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotUsingRenderTargetAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], samples.asInstanceOf[js.Any], antialiasing.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def CreateScreenshotUsingRenderTargetAsync(
      engine: Engine,
      camera: Camera,
      size: IScreenshotSize,
      mimeType: String,
      samples: Double,
      antialiasing: Boolean,
      fileName: String
    ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotUsingRenderTargetAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], samples.asInstanceOf[js.Any], antialiasing.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def CreateScreenshotUsingRenderTargetAsync(
      engine: Engine,
      camera: Camera,
      size: IScreenshotSize,
      mimeType: String,
      samples: Double,
      antialiasing: Unit,
      fileName: String
    ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotUsingRenderTargetAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], samples.asInstanceOf[js.Any], antialiasing.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def CreateScreenshotUsingRenderTargetAsync(
      engine: Engine,
      camera: Camera,
      size: IScreenshotSize,
      mimeType: String,
      samples: Unit,
      antialiasing: Boolean
    ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotUsingRenderTargetAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], samples.asInstanceOf[js.Any], antialiasing.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def CreateScreenshotUsingRenderTargetAsync(
      engine: Engine,
      camera: Camera,
      size: IScreenshotSize,
      mimeType: String,
      samples: Unit,
      antialiasing: Boolean,
      fileName: String
    ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotUsingRenderTargetAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], samples.asInstanceOf[js.Any], antialiasing.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def CreateScreenshotUsingRenderTargetAsync(
      engine: Engine,
      camera: Camera,
      size: IScreenshotSize,
      mimeType: String,
      samples: Unit,
      antialiasing: Unit,
      fileName: String
    ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotUsingRenderTargetAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], samples.asInstanceOf[js.Any], antialiasing.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def CreateScreenshotUsingRenderTargetAsync(engine: Engine, camera: Camera, size: IScreenshotSize, mimeType: Unit, samples: Double): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotUsingRenderTargetAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], samples.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def CreateScreenshotUsingRenderTargetAsync(
      engine: Engine,
      camera: Camera,
      size: IScreenshotSize,
      mimeType: Unit,
      samples: Double,
      antialiasing: Boolean
    ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotUsingRenderTargetAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], samples.asInstanceOf[js.Any], antialiasing.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def CreateScreenshotUsingRenderTargetAsync(
      engine: Engine,
      camera: Camera,
      size: IScreenshotSize,
      mimeType: Unit,
      samples: Double,
      antialiasing: Boolean,
      fileName: String
    ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotUsingRenderTargetAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], samples.asInstanceOf[js.Any], antialiasing.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def CreateScreenshotUsingRenderTargetAsync(
      engine: Engine,
      camera: Camera,
      size: IScreenshotSize,
      mimeType: Unit,
      samples: Double,
      antialiasing: Unit,
      fileName: String
    ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotUsingRenderTargetAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], samples.asInstanceOf[js.Any], antialiasing.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def CreateScreenshotUsingRenderTargetAsync(
      engine: Engine,
      camera: Camera,
      size: IScreenshotSize,
      mimeType: Unit,
      samples: Unit,
      antialiasing: Boolean
    ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotUsingRenderTargetAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], samples.asInstanceOf[js.Any], antialiasing.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def CreateScreenshotUsingRenderTargetAsync(
      engine: Engine,
      camera: Camera,
      size: IScreenshotSize,
      mimeType: Unit,
      samples: Unit,
      antialiasing: Boolean,
      fileName: String
    ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotUsingRenderTargetAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], samples.asInstanceOf[js.Any], antialiasing.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def CreateScreenshotUsingRenderTargetAsync(
      engine: Engine,
      camera: Camera,
      size: IScreenshotSize,
      mimeType: Unit,
      samples: Unit,
      antialiasing: Unit,
      fileName: String
    ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotUsingRenderTargetAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], samples.asInstanceOf[js.Any], antialiasing.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    
    /**
      * Custom HTTP Request Headers to be sent with XMLHttpRequests
      * i.e. when loading files, where the server/service expects an Authorization header
      */
    @JSImport("babylonjs/Misc/tools", "Tools.CustomRequestHeaders")
    @js.native
    def CustomRequestHeaders: StringDictionary[String] = js.native
    inline def CustomRequestHeaders_=(x: StringDictionary[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CustomRequestHeaders")(x.asInstanceOf[js.Any])
    
    /**
      * Decode the given base64 uri.
      * @deprecated Please use FileTools.DecodeBase64UrlToBinary instead.
      * @param uri The uri to decode
      * @returns The decoded base64 data.
      */
    inline def DecodeBase64(uri: String): js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("DecodeBase64")(uri.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBuffer]
    
    /**
      * Tries to copy an object by duplicating every property
      * @param source defines the source object
      * @param destination defines the target object
      * @param doNotCopyList defines a list of properties to avoid
      * @param mustCopyList defines a list of properties to copy (even if they start with _)
      */
    inline def DeepCopy(source: Any, destination: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("DeepCopy")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def DeepCopy(source: Any, destination: Any, doNotCopyList: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("DeepCopy")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], doNotCopyList.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def DeepCopy(source: Any, destination: Any, doNotCopyList: js.Array[String], mustCopyList: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("DeepCopy")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], doNotCopyList.asInstanceOf[js.Any], mustCopyList.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def DeepCopy(source: Any, destination: Any, doNotCopyList: Unit, mustCopyList: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("DeepCopy")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], doNotCopyList.asInstanceOf[js.Any], mustCopyList.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Returns a promise that resolves after the given amount of time.
      * @param delay Number of milliseconds to delay
      * @returns Promise that resolves after the given amount of time
      */
    inline def DelayAsync(delay: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("DelayAsync")(delay.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    /**
      * Downloads a blob in the browser
      * @param blob defines the blob to download
      * @param fileName defines the name of the downloaded file
      */
    inline def Download(blob: Blob, fileName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Download")(blob.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Download a Blob object
      * @param blob the Blob object
      * @param fileName the file name to download
      * @returns
      */
    inline def DownloadBlob(blob: Blob): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("DownloadBlob")(blob.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def DownloadBlob(blob: Blob, fileName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("DownloadBlob")(blob.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Dumps an array buffer
      * @param width defines the rendering width
      * @param height defines the rendering height
      * @param data the data array
      * @param successCallback defines the callback triggered once the data are available
      * @param mimeType defines the mime type of the result
      * @param fileName defines the filename to download. If present, the result will automatically be downloaded
      * @param invertY true to invert the picture in the Y dimension
      * @param toArrayBuffer true to convert the data to an ArrayBuffer (encoded as `mimeType`) instead of a base64 string
      * @param quality defines the quality of the result
      */
    inline def DumpData(
      width: Double,
      height: Double,
      data: js.typedarray.ArrayBufferView,
      successCallback: js.UndefOr[js.Function1[/* data */ String | js.typedarray.ArrayBuffer, Unit]],
      mimeType: js.UndefOr[String],
      fileName: js.UndefOr[String],
      invertY: js.UndefOr[Boolean],
      toArrayBuffer: js.UndefOr[Boolean],
      quality: js.UndefOr[Double]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpData")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], data.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], toArrayBuffer.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Dumps an array buffer
      * @param width defines the rendering width
      * @param height defines the rendering height
      * @param data the data array
      * @param mimeType defines the mime type of the result
      * @param fileName defines the filename to download. If present, the result will automatically be downloaded
      * @param invertY true to invert the picture in the Y dimension
      * @param toArrayBuffer true to convert the data to an ArrayBuffer (encoded as `mimeType`) instead of a base64 string
      * @param quality defines the quality of the result
      * @returns a promise that resolve to the final data
      */
    inline def DumpDataAsync(width: Double, height: Double, data: js.typedarray.ArrayBufferView): js.Promise[String | js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpDataAsync")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | js.typedarray.ArrayBuffer]]
    inline def DumpDataAsync(width: Double, height: Double, data: js.typedarray.ArrayBufferView, mimeType: String): js.Promise[String | js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpDataAsync")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], data.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | js.typedarray.ArrayBuffer]]
    inline def DumpDataAsync(
      width: Double,
      height: Double,
      data: js.typedarray.ArrayBufferView,
      mimeType: String,
      fileName: String
    ): js.Promise[String | js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpDataAsync")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], data.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | js.typedarray.ArrayBuffer]]
    inline def DumpDataAsync(
      width: Double,
      height: Double,
      data: js.typedarray.ArrayBufferView,
      mimeType: String,
      fileName: String,
      invertY: Boolean
    ): js.Promise[String | js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpDataAsync")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], data.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | js.typedarray.ArrayBuffer]]
    inline def DumpDataAsync(
      width: Double,
      height: Double,
      data: js.typedarray.ArrayBufferView,
      mimeType: String,
      fileName: String,
      invertY: Boolean,
      toArrayBuffer: Boolean
    ): js.Promise[String | js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpDataAsync")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], data.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], toArrayBuffer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | js.typedarray.ArrayBuffer]]
    inline def DumpDataAsync(
      width: Double,
      height: Double,
      data: js.typedarray.ArrayBufferView,
      mimeType: String,
      fileName: String,
      invertY: Boolean,
      toArrayBuffer: Boolean,
      quality: Double
    ): js.Promise[String | js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpDataAsync")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], data.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], toArrayBuffer.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | js.typedarray.ArrayBuffer]]
    inline def DumpDataAsync(
      width: Double,
      height: Double,
      data: js.typedarray.ArrayBufferView,
      mimeType: String,
      fileName: String,
      invertY: Boolean,
      toArrayBuffer: Unit,
      quality: Double
    ): js.Promise[String | js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpDataAsync")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], data.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], toArrayBuffer.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | js.typedarray.ArrayBuffer]]
    inline def DumpDataAsync(
      width: Double,
      height: Double,
      data: js.typedarray.ArrayBufferView,
      mimeType: String,
      fileName: String,
      invertY: Unit,
      toArrayBuffer: Boolean
    ): js.Promise[String | js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpDataAsync")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], data.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], toArrayBuffer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | js.typedarray.ArrayBuffer]]
    inline def DumpDataAsync(
      width: Double,
      height: Double,
      data: js.typedarray.ArrayBufferView,
      mimeType: String,
      fileName: String,
      invertY: Unit,
      toArrayBuffer: Boolean,
      quality: Double
    ): js.Promise[String | js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpDataAsync")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], data.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], toArrayBuffer.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | js.typedarray.ArrayBuffer]]
    inline def DumpDataAsync(
      width: Double,
      height: Double,
      data: js.typedarray.ArrayBufferView,
      mimeType: String,
      fileName: String,
      invertY: Unit,
      toArrayBuffer: Unit,
      quality: Double
    ): js.Promise[String | js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpDataAsync")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], data.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], toArrayBuffer.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | js.typedarray.ArrayBuffer]]
    inline def DumpDataAsync(
      width: Double,
      height: Double,
      data: js.typedarray.ArrayBufferView,
      mimeType: String,
      fileName: Unit,
      invertY: Boolean
    ): js.Promise[String | js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpDataAsync")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], data.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | js.typedarray.ArrayBuffer]]
    inline def DumpDataAsync(
      width: Double,
      height: Double,
      data: js.typedarray.ArrayBufferView,
      mimeType: String,
      fileName: Unit,
      invertY: Boolean,
      toArrayBuffer: Boolean
    ): js.Promise[String | js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpDataAsync")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], data.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], toArrayBuffer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | js.typedarray.ArrayBuffer]]
    inline def DumpDataAsync(
      width: Double,
      height: Double,
      data: js.typedarray.ArrayBufferView,
      mimeType: String,
      fileName: Unit,
      invertY: Boolean,
      toArrayBuffer: Boolean,
      quality: Double
    ): js.Promise[String | js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpDataAsync")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], data.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], toArrayBuffer.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | js.typedarray.ArrayBuffer]]
    inline def DumpDataAsync(
      width: Double,
      height: Double,
      data: js.typedarray.ArrayBufferView,
      mimeType: String,
      fileName: Unit,
      invertY: Boolean,
      toArrayBuffer: Unit,
      quality: Double
    ): js.Promise[String | js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpDataAsync")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], data.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], toArrayBuffer.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | js.typedarray.ArrayBuffer]]
    inline def DumpDataAsync(
      width: Double,
      height: Double,
      data: js.typedarray.ArrayBufferView,
      mimeType: String,
      fileName: Unit,
      invertY: Unit,
      toArrayBuffer: Boolean
    ): js.Promise[String | js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpDataAsync")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], data.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], toArrayBuffer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | js.typedarray.ArrayBuffer]]
    inline def DumpDataAsync(
      width: Double,
      height: Double,
      data: js.typedarray.ArrayBufferView,
      mimeType: String,
      fileName: Unit,
      invertY: Unit,
      toArrayBuffer: Boolean,
      quality: Double
    ): js.Promise[String | js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpDataAsync")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], data.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], toArrayBuffer.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | js.typedarray.ArrayBuffer]]
    inline def DumpDataAsync(
      width: Double,
      height: Double,
      data: js.typedarray.ArrayBufferView,
      mimeType: String,
      fileName: Unit,
      invertY: Unit,
      toArrayBuffer: Unit,
      quality: Double
    ): js.Promise[String | js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpDataAsync")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], data.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], toArrayBuffer.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | js.typedarray.ArrayBuffer]]
    inline def DumpDataAsync(
      width: Double,
      height: Double,
      data: js.typedarray.ArrayBufferView,
      mimeType: Unit,
      fileName: String
    ): js.Promise[String | js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpDataAsync")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], data.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | js.typedarray.ArrayBuffer]]
    inline def DumpDataAsync(
      width: Double,
      height: Double,
      data: js.typedarray.ArrayBufferView,
      mimeType: Unit,
      fileName: String,
      invertY: Boolean
    ): js.Promise[String | js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpDataAsync")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], data.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | js.typedarray.ArrayBuffer]]
    inline def DumpDataAsync(
      width: Double,
      height: Double,
      data: js.typedarray.ArrayBufferView,
      mimeType: Unit,
      fileName: String,
      invertY: Boolean,
      toArrayBuffer: Boolean
    ): js.Promise[String | js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpDataAsync")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], data.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], toArrayBuffer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | js.typedarray.ArrayBuffer]]
    inline def DumpDataAsync(
      width: Double,
      height: Double,
      data: js.typedarray.ArrayBufferView,
      mimeType: Unit,
      fileName: String,
      invertY: Boolean,
      toArrayBuffer: Boolean,
      quality: Double
    ): js.Promise[String | js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpDataAsync")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], data.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], toArrayBuffer.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | js.typedarray.ArrayBuffer]]
    inline def DumpDataAsync(
      width: Double,
      height: Double,
      data: js.typedarray.ArrayBufferView,
      mimeType: Unit,
      fileName: String,
      invertY: Boolean,
      toArrayBuffer: Unit,
      quality: Double
    ): js.Promise[String | js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpDataAsync")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], data.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], toArrayBuffer.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | js.typedarray.ArrayBuffer]]
    inline def DumpDataAsync(
      width: Double,
      height: Double,
      data: js.typedarray.ArrayBufferView,
      mimeType: Unit,
      fileName: String,
      invertY: Unit,
      toArrayBuffer: Boolean
    ): js.Promise[String | js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpDataAsync")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], data.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], toArrayBuffer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | js.typedarray.ArrayBuffer]]
    inline def DumpDataAsync(
      width: Double,
      height: Double,
      data: js.typedarray.ArrayBufferView,
      mimeType: Unit,
      fileName: String,
      invertY: Unit,
      toArrayBuffer: Boolean,
      quality: Double
    ): js.Promise[String | js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpDataAsync")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], data.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], toArrayBuffer.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | js.typedarray.ArrayBuffer]]
    inline def DumpDataAsync(
      width: Double,
      height: Double,
      data: js.typedarray.ArrayBufferView,
      mimeType: Unit,
      fileName: String,
      invertY: Unit,
      toArrayBuffer: Unit,
      quality: Double
    ): js.Promise[String | js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpDataAsync")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], data.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], toArrayBuffer.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | js.typedarray.ArrayBuffer]]
    inline def DumpDataAsync(
      width: Double,
      height: Double,
      data: js.typedarray.ArrayBufferView,
      mimeType: Unit,
      fileName: Unit,
      invertY: Boolean
    ): js.Promise[String | js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpDataAsync")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], data.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | js.typedarray.ArrayBuffer]]
    inline def DumpDataAsync(
      width: Double,
      height: Double,
      data: js.typedarray.ArrayBufferView,
      mimeType: Unit,
      fileName: Unit,
      invertY: Boolean,
      toArrayBuffer: Boolean
    ): js.Promise[String | js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpDataAsync")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], data.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], toArrayBuffer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | js.typedarray.ArrayBuffer]]
    inline def DumpDataAsync(
      width: Double,
      height: Double,
      data: js.typedarray.ArrayBufferView,
      mimeType: Unit,
      fileName: Unit,
      invertY: Boolean,
      toArrayBuffer: Boolean,
      quality: Double
    ): js.Promise[String | js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpDataAsync")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], data.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], toArrayBuffer.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | js.typedarray.ArrayBuffer]]
    inline def DumpDataAsync(
      width: Double,
      height: Double,
      data: js.typedarray.ArrayBufferView,
      mimeType: Unit,
      fileName: Unit,
      invertY: Boolean,
      toArrayBuffer: Unit,
      quality: Double
    ): js.Promise[String | js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpDataAsync")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], data.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], toArrayBuffer.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | js.typedarray.ArrayBuffer]]
    inline def DumpDataAsync(
      width: Double,
      height: Double,
      data: js.typedarray.ArrayBufferView,
      mimeType: Unit,
      fileName: Unit,
      invertY: Unit,
      toArrayBuffer: Boolean
    ): js.Promise[String | js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpDataAsync")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], data.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], toArrayBuffer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | js.typedarray.ArrayBuffer]]
    inline def DumpDataAsync(
      width: Double,
      height: Double,
      data: js.typedarray.ArrayBufferView,
      mimeType: Unit,
      fileName: Unit,
      invertY: Unit,
      toArrayBuffer: Boolean,
      quality: Double
    ): js.Promise[String | js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpDataAsync")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], data.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], toArrayBuffer.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | js.typedarray.ArrayBuffer]]
    inline def DumpDataAsync(
      width: Double,
      height: Double,
      data: js.typedarray.ArrayBufferView,
      mimeType: Unit,
      fileName: Unit,
      invertY: Unit,
      toArrayBuffer: Unit,
      quality: Double
    ): js.Promise[String | js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpDataAsync")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], data.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], toArrayBuffer.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | js.typedarray.ArrayBuffer]]
    
    /**
      * Dumps the current bound framebuffer
      * @param width defines the rendering width
      * @param height defines the rendering height
      * @param engine defines the hosting engine
      * @param successCallback defines the callback triggered once the data are available
      * @param mimeType defines the mime type of the result
      * @param fileName defines the filename to download. If present, the result will automatically be downloaded
      * @returns a void promise
      */
    inline def DumpFramebuffer(width: Double, height: Double, engine: Engine): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpFramebuffer")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], engine.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def DumpFramebuffer(
      width: Double,
      height: Double,
      engine: Engine,
      successCallback: js.Function1[/* data */ String, Unit]
    ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpFramebuffer")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], engine.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def DumpFramebuffer(
      width: Double,
      height: Double,
      engine: Engine,
      successCallback: js.Function1[/* data */ String, Unit],
      mimeType: String
    ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpFramebuffer")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], engine.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def DumpFramebuffer(
      width: Double,
      height: Double,
      engine: Engine,
      successCallback: js.Function1[/* data */ String, Unit],
      mimeType: String,
      fileName: String
    ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpFramebuffer")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], engine.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def DumpFramebuffer(
      width: Double,
      height: Double,
      engine: Engine,
      successCallback: js.Function1[/* data */ String, Unit],
      mimeType: Unit,
      fileName: String
    ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpFramebuffer")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], engine.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def DumpFramebuffer(width: Double, height: Double, engine: Engine, successCallback: Unit, mimeType: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpFramebuffer")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], engine.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def DumpFramebuffer(
      width: Double,
      height: Double,
      engine: Engine,
      successCallback: Unit,
      mimeType: String,
      fileName: String
    ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpFramebuffer")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], engine.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def DumpFramebuffer(
      width: Double,
      height: Double,
      engine: Engine,
      successCallback: Unit,
      mimeType: Unit,
      fileName: String
    ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpFramebuffer")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], engine.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    /**
      * Encodes the canvas data to base 64, or automatically downloads the result if `fileName` is defined.
      * @param canvas The canvas to get the data from, which can be an offscreen canvas.
      * @param successCallback The callback which is triggered once the data is available. If `fileName` is defined, the callback will be invoked after the download occurs, and the `data` argument will be an empty string.
      * @param mimeType The mime type of the result.
      * @param fileName The name of the file to download. If defined, the result will automatically be downloaded. If not defined, and `successCallback` is also not defined, the result will automatically be downloaded with an auto-generated file name.
      * @param quality The quality of the result. See {@link https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/toBlob | HTMLCanvasElement.toBlob()}'s `quality` parameter.
      */
    inline def EncodeScreenshotCanvasData(canvas: HTMLCanvasElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("EncodeScreenshotCanvasData")(canvas.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def EncodeScreenshotCanvasData(canvas: HTMLCanvasElement, successCallback: js.Function1[/* data */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("EncodeScreenshotCanvasData")(canvas.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def EncodeScreenshotCanvasData(
      canvas: HTMLCanvasElement,
      successCallback: js.Function1[/* data */ String, Unit],
      mimeType: String
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("EncodeScreenshotCanvasData")(canvas.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def EncodeScreenshotCanvasData(
      canvas: HTMLCanvasElement,
      successCallback: js.Function1[/* data */ String, Unit],
      mimeType: String,
      fileName: String
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("EncodeScreenshotCanvasData")(canvas.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def EncodeScreenshotCanvasData(
      canvas: HTMLCanvasElement,
      successCallback: js.Function1[/* data */ String, Unit],
      mimeType: String,
      fileName: String,
      quality: Double
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("EncodeScreenshotCanvasData")(canvas.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def EncodeScreenshotCanvasData(
      canvas: HTMLCanvasElement,
      successCallback: js.Function1[/* data */ String, Unit],
      mimeType: String,
      fileName: Unit,
      quality: Double
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("EncodeScreenshotCanvasData")(canvas.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def EncodeScreenshotCanvasData(
      canvas: HTMLCanvasElement,
      successCallback: js.Function1[/* data */ String, Unit],
      mimeType: Unit,
      fileName: String
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("EncodeScreenshotCanvasData")(canvas.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def EncodeScreenshotCanvasData(
      canvas: HTMLCanvasElement,
      successCallback: js.Function1[/* data */ String, Unit],
      mimeType: Unit,
      fileName: String,
      quality: Double
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("EncodeScreenshotCanvasData")(canvas.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def EncodeScreenshotCanvasData(
      canvas: HTMLCanvasElement,
      successCallback: js.Function1[/* data */ String, Unit],
      mimeType: Unit,
      fileName: Unit,
      quality: Double
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("EncodeScreenshotCanvasData")(canvas.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def EncodeScreenshotCanvasData(canvas: HTMLCanvasElement, successCallback: Unit, mimeType: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("EncodeScreenshotCanvasData")(canvas.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def EncodeScreenshotCanvasData(canvas: HTMLCanvasElement, successCallback: Unit, mimeType: String, fileName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("EncodeScreenshotCanvasData")(canvas.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def EncodeScreenshotCanvasData(
      canvas: HTMLCanvasElement,
      successCallback: Unit,
      mimeType: String,
      fileName: String,
      quality: Double
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("EncodeScreenshotCanvasData")(canvas.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def EncodeScreenshotCanvasData(
      canvas: HTMLCanvasElement,
      successCallback: Unit,
      mimeType: String,
      fileName: Unit,
      quality: Double
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("EncodeScreenshotCanvasData")(canvas.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def EncodeScreenshotCanvasData(canvas: HTMLCanvasElement, successCallback: Unit, mimeType: Unit, fileName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("EncodeScreenshotCanvasData")(canvas.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def EncodeScreenshotCanvasData(
      canvas: HTMLCanvasElement,
      successCallback: Unit,
      mimeType: Unit,
      fileName: String,
      quality: Double
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("EncodeScreenshotCanvasData")(canvas.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def EncodeScreenshotCanvasData(canvas: HTMLCanvasElement, successCallback: Unit, mimeType: Unit, fileName: Unit, quality: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("EncodeScreenshotCanvasData")(canvas.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def EncodeScreenshotCanvasData(canvas: OffscreenCanvas): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("EncodeScreenshotCanvasData")(canvas.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def EncodeScreenshotCanvasData(canvas: OffscreenCanvas, successCallback: js.Function1[/* data */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("EncodeScreenshotCanvasData")(canvas.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def EncodeScreenshotCanvasData(canvas: OffscreenCanvas, successCallback: js.Function1[/* data */ String, Unit], mimeType: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("EncodeScreenshotCanvasData")(canvas.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def EncodeScreenshotCanvasData(
      canvas: OffscreenCanvas,
      successCallback: js.Function1[/* data */ String, Unit],
      mimeType: String,
      fileName: String
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("EncodeScreenshotCanvasData")(canvas.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def EncodeScreenshotCanvasData(
      canvas: OffscreenCanvas,
      successCallback: js.Function1[/* data */ String, Unit],
      mimeType: String,
      fileName: String,
      quality: Double
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("EncodeScreenshotCanvasData")(canvas.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def EncodeScreenshotCanvasData(
      canvas: OffscreenCanvas,
      successCallback: js.Function1[/* data */ String, Unit],
      mimeType: String,
      fileName: Unit,
      quality: Double
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("EncodeScreenshotCanvasData")(canvas.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def EncodeScreenshotCanvasData(
      canvas: OffscreenCanvas,
      successCallback: js.Function1[/* data */ String, Unit],
      mimeType: Unit,
      fileName: String
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("EncodeScreenshotCanvasData")(canvas.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def EncodeScreenshotCanvasData(
      canvas: OffscreenCanvas,
      successCallback: js.Function1[/* data */ String, Unit],
      mimeType: Unit,
      fileName: String,
      quality: Double
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("EncodeScreenshotCanvasData")(canvas.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def EncodeScreenshotCanvasData(
      canvas: OffscreenCanvas,
      successCallback: js.Function1[/* data */ String, Unit],
      mimeType: Unit,
      fileName: Unit,
      quality: Double
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("EncodeScreenshotCanvasData")(canvas.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def EncodeScreenshotCanvasData(canvas: OffscreenCanvas, successCallback: Unit, mimeType: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("EncodeScreenshotCanvasData")(canvas.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def EncodeScreenshotCanvasData(canvas: OffscreenCanvas, successCallback: Unit, mimeType: String, fileName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("EncodeScreenshotCanvasData")(canvas.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def EncodeScreenshotCanvasData(
      canvas: OffscreenCanvas,
      successCallback: Unit,
      mimeType: String,
      fileName: String,
      quality: Double
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("EncodeScreenshotCanvasData")(canvas.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def EncodeScreenshotCanvasData(canvas: OffscreenCanvas, successCallback: Unit, mimeType: String, fileName: Unit, quality: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("EncodeScreenshotCanvasData")(canvas.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def EncodeScreenshotCanvasData(canvas: OffscreenCanvas, successCallback: Unit, mimeType: Unit, fileName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("EncodeScreenshotCanvasData")(canvas.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def EncodeScreenshotCanvasData(canvas: OffscreenCanvas, successCallback: Unit, mimeType: Unit, fileName: String, quality: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("EncodeScreenshotCanvasData")(canvas.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def EncodeScreenshotCanvasData(canvas: OffscreenCanvas, successCallback: Unit, mimeType: Unit, fileName: Unit, quality: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("EncodeScreenshotCanvasData")(canvas.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Ends a specific performance counter
      */
    inline def EndPerformanceCounter(counterName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("EndPerformanceCounter")(counterName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def EndPerformanceCounter(counterName: String, condition: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("EndPerformanceCounter")(counterName.asInstanceOf[js.Any], condition.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Write an error message to the console
      * @param message defines the message to log
      */
    inline def Error(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Error")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Only error logs
      */
    @JSImport("babylonjs/Misc/tools", "Tools.ErrorLogLevel")
    @js.native
    val ErrorLogLevel: Double = js.native
    
    /**
      * Read the content of a byte array at a specified coordinates (taking in account wrapping)
      * @param u defines the coordinate on X axis
      * @param v defines the coordinate on Y axis
      * @param width defines the width of the source data
      * @param height defines the height of the source data
      * @param pixels defines the source byte array
      * @param color defines the output color
      */
    inline def FetchToRef(
      u: Double,
      v: Double,
      width: Double,
      height: Double,
      pixels: js.typedarray.Uint8Array,
      color: IColor4Like
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("FetchToRef")(u.asInstanceOf[js.Any], v.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], pixels.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Creates a data url from a given string content
      * @param content defines the content to convert
      * @returns the new data url link
      */
    inline def FileAsURL(content: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("FileAsURL")(content.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Gets the first element of an array satisfying a given predicate
      * @param array defines the array to browse
      * @param predicate defines the predicate to use
      * @returns null if not found or the element
      */
    inline def First[T](array: js.Array[T], predicate: js.Function1[/* item */ T, Boolean]): Nullable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("First")(array.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[Nullable[T]]
    
    /**
      * Returns the nearest 32-bit single precision float representation of a Number
      * @param value A Number.  If the parameter is of a different type, it will get converted
      * to a number or to NaN if it cannot be converted
      * @returns number
      */
    inline def FloatRound(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("FloatRound")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Format the given number to a specific decimal format
      * @param value defines the number to format
      * @param decimals defines the number of decimals to use
      * @returns the formatted string
      */
    inline def Format(value: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("Format")(value.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def Format(value: Double, decimals: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("Format")(value.asInstanceOf[js.Any], decimals.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def GetAbsoluteUrl(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("GetAbsoluteUrl")(url.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * This method will return the name of the class used to create the instance of the given object.
      * It will works only on Javascript basic data types (number, string, ...) and instance of class declared with the @className decorator.
      * @param object the object to get the class name from
      * @param isType defines if the object is actually a type
      * @returns the name of the class, will be "object" for a custom data type not using the @className decorator
      */
    inline def GetClassName(`object`: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("GetClassName")(`object`.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def GetClassName(`object`: Any, isType: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("GetClassName")(`object`.asInstanceOf[js.Any], isType.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      * Extracts text content from a DOM element hierarchy
      * Back Compat only, please use GetDOMTextContent instead.
      */
    @JSImport("babylonjs/Misc/tools", "Tools.GetDOMTextContent")
    @js.native
    def GetDOMTextContent: js.Function1[/* element */ HTMLElement, String] = js.native
    /**
      * Extracts text content from a DOM element hierarchy
      * Back Compat only, please use GetDOMTextContent instead.
      */
    inline def GetDOMTextContent(element: HTMLElement): String = ^.asInstanceOf[js.Dynamic].applyDynamic("GetDOMTextContent")(element.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def GetDOMTextContent_=(x: js.Function1[/* element */ HTMLElement, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GetDOMTextContent")(x.asInstanceOf[js.Any])
    
    /**
      * Extracts the filename from a path
      * @param path defines the path to use
      * @returns the filename
      */
    inline def GetFilename(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("GetFilename")(path.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Extracts the "folder" part of a path (everything before the filename).
      * @param uri The URI to extract the info from
      * @param returnUnchangedIfNoSlash Do not touch the URI if no slashes are present
      * @returns The "folder" part of the path
      */
    inline def GetFolderPath(uri: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("GetFolderPath")(uri.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def GetFolderPath(uri: String, returnUnchangedIfNoSlash: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("GetFolderPath")(uri.asInstanceOf[js.Any], returnUnchangedIfNoSlash.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      * Gets the pointer prefix to use
      * @param engine defines the engine we are finding the prefix for
      * @returns "pointer" if touch is enabled. Else returns "mouse"
      */
    inline def GetPointerPrefix(engine: Engine): String = ^.asInstanceOf[js.Dynamic].applyDynamic("GetPointerPrefix")(engine.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Tries to instantiate a new object from a given class name
      * @param className defines the class name to instantiate
      * @returns the new object or null if the system was not able to do the instantiation
      */
    inline def Instantiate(className: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("Instantiate")(className.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /**
      * Test if the given uri is a base64 string
      * @deprecated Please use FileTools.IsBase64DataUrl instead.
      * @param uri The uri to test
      * @returns True if the uri is a base64 string or false otherwise
      */
    inline def IsBase64(uri: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsBase64")(uri.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Gets a boolean indicating if the given object has no own property
      * @param obj defines the object to test
      * @returns true if object has no own property
      */
    inline def IsEmpty(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsEmpty")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Function indicating if a number is an exponent of 2
      * @param value defines the value to test
      * @returns true if the value is an exponent of 2
      */
    inline def IsExponentOfTwo(value: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsExponentOfTwo")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Utility function to detect if the current user agent is Safari
      * @returns whether or not the current user agent is safari
      */
    inline def IsSafari(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsSafari")().asInstanceOf[Boolean]
    
    /**
      * Checks if the window object exists
      * Back Compat only, please use IsWindowObjectExist instead.
      */
    inline def IsWindowObjectExist(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsWindowObjectExist")().asInstanceOf[Boolean]
    /**
      * Checks if the window object exists
      * Back Compat only, please use IsWindowObjectExist instead.
      */
    @JSImport("babylonjs/Misc/tools", "Tools.IsWindowObjectExist")
    @js.native
    def IsWindowObjectExist_FTools: js.Function0[Boolean] = js.native
    
    inline def IsWindowObjectExist_FTools_=(x: js.Function0[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IsWindowObjectExist")(x.asInstanceOf[js.Any])
    
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
    inline def LoadFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ]
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def LoadFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ],
      onProgress: js.Function1[/* data */ Any, Unit]
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def LoadFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ],
      onProgress: js.Function1[/* data */ Any, Unit],
      offlineProvider: Unit,
      useArrayBuffer: Boolean
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def LoadFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ],
      onProgress: js.Function1[/* data */ Any, Unit],
      offlineProvider: Unit,
      useArrayBuffer: Boolean,
      onError: js.Function2[/* request */ js.UndefOr[WebRequest], /* exception */ js.UndefOr[Any], Unit]
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def LoadFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ],
      onProgress: js.Function1[/* data */ Any, Unit],
      offlineProvider: Unit,
      useArrayBuffer: Unit,
      onError: js.Function2[/* request */ js.UndefOr[WebRequest], /* exception */ js.UndefOr[Any], Unit]
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def LoadFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ],
      onProgress: js.Function1[/* data */ Any, Unit],
      offlineProvider: IOfflineProvider
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def LoadFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ],
      onProgress: js.Function1[/* data */ Any, Unit],
      offlineProvider: IOfflineProvider,
      useArrayBuffer: Boolean
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def LoadFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ],
      onProgress: js.Function1[/* data */ Any, Unit],
      offlineProvider: IOfflineProvider,
      useArrayBuffer: Boolean,
      onError: js.Function2[/* request */ js.UndefOr[WebRequest], /* exception */ js.UndefOr[Any], Unit]
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def LoadFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ],
      onProgress: js.Function1[/* data */ Any, Unit],
      offlineProvider: IOfflineProvider,
      useArrayBuffer: Unit,
      onError: js.Function2[/* request */ js.UndefOr[WebRequest], /* exception */ js.UndefOr[Any], Unit]
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def LoadFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ],
      onProgress: Unit,
      offlineProvider: Unit,
      useArrayBuffer: Boolean
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def LoadFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ],
      onProgress: Unit,
      offlineProvider: Unit,
      useArrayBuffer: Boolean,
      onError: js.Function2[/* request */ js.UndefOr[WebRequest], /* exception */ js.UndefOr[Any], Unit]
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def LoadFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ],
      onProgress: Unit,
      offlineProvider: Unit,
      useArrayBuffer: Unit,
      onError: js.Function2[/* request */ js.UndefOr[WebRequest], /* exception */ js.UndefOr[Any], Unit]
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def LoadFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ],
      onProgress: Unit,
      offlineProvider: IOfflineProvider
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def LoadFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ],
      onProgress: Unit,
      offlineProvider: IOfflineProvider,
      useArrayBuffer: Boolean
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def LoadFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ],
      onProgress: Unit,
      offlineProvider: IOfflineProvider,
      useArrayBuffer: Boolean,
      onError: js.Function2[/* request */ js.UndefOr[WebRequest], /* exception */ js.UndefOr[Any], Unit]
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def LoadFile(
      url: String,
      onSuccess: js.Function2[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* responseURL */ js.UndefOr[String], 
          Unit
        ],
      onProgress: Unit,
      offlineProvider: IOfflineProvider,
      useArrayBuffer: Unit,
      onError: js.Function2[/* request */ js.UndefOr[WebRequest], /* exception */ js.UndefOr[Any], Unit]
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    
    /**
      * Loads a file from a url
      * @param url the file url to load
      * @param useArrayBuffer defines a boolean indicating that date must be returned as ArrayBuffer
      * @returns a promise containing an ArrayBuffer corresponding to the loaded file
      */
    inline def LoadFileAsync(url: String): js.Promise[js.typedarray.ArrayBuffer | String] = ^.asInstanceOf[js.Dynamic].applyDynamic("LoadFileAsync")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.typedarray.ArrayBuffer | String]]
    inline def LoadFileAsync(url: String, useArrayBuffer: Boolean): js.Promise[js.typedarray.ArrayBuffer | String] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadFileAsync")(url.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.ArrayBuffer | String]]
    
    /**
      * Loads an image as an HTMLImageElement.
      * @param input url string, ArrayBuffer, or Blob to load
      * @param onLoad callback called when the image successfully loads
      * @param onError callback called when the image fails to load
      * @param offlineProvider offline provider for caching
      * @param mimeType optional mime type
      * @param imageBitmapOptions optional the options to use when creating an ImageBitmap
      * @returns the HTMLImageElement of the loaded image
      */
    inline def LoadImage(
      input: String,
      onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
      onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit],
      offlineProvider: Nullable[IOfflineProvider]
    ): Nullable[HTMLImageElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadImage")(input.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any])).asInstanceOf[Nullable[HTMLImageElement]]
    inline def LoadImage(
      input: String,
      onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
      onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit],
      offlineProvider: Nullable[IOfflineProvider],
      mimeType: String
    ): Nullable[HTMLImageElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadImage")(input.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[Nullable[HTMLImageElement]]
    inline def LoadImage(
      input: String,
      onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
      onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit],
      offlineProvider: Nullable[IOfflineProvider],
      mimeType: String,
      imageBitmapOptions: ImageBitmapOptions
    ): Nullable[HTMLImageElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadImage")(input.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], imageBitmapOptions.asInstanceOf[js.Any])).asInstanceOf[Nullable[HTMLImageElement]]
    inline def LoadImage(
      input: String,
      onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
      onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit],
      offlineProvider: Nullable[IOfflineProvider],
      mimeType: Unit,
      imageBitmapOptions: ImageBitmapOptions
    ): Nullable[HTMLImageElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadImage")(input.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], imageBitmapOptions.asInstanceOf[js.Any])).asInstanceOf[Nullable[HTMLImageElement]]
    inline def LoadImage(
      input: js.typedarray.ArrayBuffer,
      onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
      onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit],
      offlineProvider: Nullable[IOfflineProvider]
    ): Nullable[HTMLImageElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadImage")(input.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any])).asInstanceOf[Nullable[HTMLImageElement]]
    inline def LoadImage(
      input: js.typedarray.ArrayBuffer,
      onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
      onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit],
      offlineProvider: Nullable[IOfflineProvider],
      mimeType: String
    ): Nullable[HTMLImageElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadImage")(input.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[Nullable[HTMLImageElement]]
    inline def LoadImage(
      input: js.typedarray.ArrayBuffer,
      onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
      onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit],
      offlineProvider: Nullable[IOfflineProvider],
      mimeType: String,
      imageBitmapOptions: ImageBitmapOptions
    ): Nullable[HTMLImageElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadImage")(input.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], imageBitmapOptions.asInstanceOf[js.Any])).asInstanceOf[Nullable[HTMLImageElement]]
    inline def LoadImage(
      input: js.typedarray.ArrayBuffer,
      onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
      onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit],
      offlineProvider: Nullable[IOfflineProvider],
      mimeType: Unit,
      imageBitmapOptions: ImageBitmapOptions
    ): Nullable[HTMLImageElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadImage")(input.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], imageBitmapOptions.asInstanceOf[js.Any])).asInstanceOf[Nullable[HTMLImageElement]]
    inline def LoadImage(
      input: Blob,
      onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
      onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit],
      offlineProvider: Nullable[IOfflineProvider]
    ): Nullable[HTMLImageElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadImage")(input.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any])).asInstanceOf[Nullable[HTMLImageElement]]
    inline def LoadImage(
      input: Blob,
      onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
      onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit],
      offlineProvider: Nullable[IOfflineProvider],
      mimeType: String
    ): Nullable[HTMLImageElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadImage")(input.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[Nullable[HTMLImageElement]]
    inline def LoadImage(
      input: Blob,
      onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
      onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit],
      offlineProvider: Nullable[IOfflineProvider],
      mimeType: String,
      imageBitmapOptions: ImageBitmapOptions
    ): Nullable[HTMLImageElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadImage")(input.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], imageBitmapOptions.asInstanceOf[js.Any])).asInstanceOf[Nullable[HTMLImageElement]]
    inline def LoadImage(
      input: Blob,
      onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
      onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit],
      offlineProvider: Nullable[IOfflineProvider],
      mimeType: Unit,
      imageBitmapOptions: ImageBitmapOptions
    ): Nullable[HTMLImageElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadImage")(input.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], imageBitmapOptions.asInstanceOf[js.Any])).asInstanceOf[Nullable[HTMLImageElement]]
    
    /**
      * Load a script (identified by an url). When the url returns, the
      * content of this file is added into a new script element, attached to the DOM (body element)
      * @param scriptUrl defines the url of the script to laod
      * @param onSuccess defines the callback called when the script is loaded
      * @param onError defines the callback to call if an error occurs
      * @param scriptId defines the id of the script element
      */
    inline def LoadScript(scriptUrl: String, onSuccess: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadScript")(scriptUrl.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def LoadScript(
      scriptUrl: String,
      onSuccess: js.Function0[Unit],
      onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadScript")(scriptUrl.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def LoadScript(
      scriptUrl: String,
      onSuccess: js.Function0[Unit],
      onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit],
      scriptId: String
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadScript")(scriptUrl.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], scriptId.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def LoadScript(scriptUrl: String, onSuccess: js.Function0[Unit], onError: Unit, scriptId: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadScript")(scriptUrl.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], scriptId.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Load an asynchronous script (identified by an url). When the url returns, the
      * content of this file is added into a new script element, attached to the DOM (body element)
      * @param scriptUrl defines the url of the script to laod
      * @returns a promise request object
      */
    inline def LoadScriptAsync(scriptUrl: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("LoadScriptAsync")(scriptUrl.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    /**
      * Log a message to the console
      * @param message defines the message to log
      */
    inline def Log(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Log")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Returns an array if obj is not an array
      * @param obj defines the object to evaluate as an array
      * @param allowsNullUndefined defines a boolean indicating if obj is allowed to be null or undefined
      * @returns either obj directly if obj is an array or a new array containing obj
      */
    inline def MakeArray(obj: Any): Nullable[js.Array[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("MakeArray")(obj.asInstanceOf[js.Any]).asInstanceOf[Nullable[js.Array[Any]]]
    inline def MakeArray(obj: Any, allowsNullUndefined: Boolean): Nullable[js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("MakeArray")(obj.asInstanceOf[js.Any], allowsNullUndefined.asInstanceOf[js.Any])).asInstanceOf[Nullable[js.Array[Any]]]
    
    /**
      * Only message logs
      */
    @JSImport("babylonjs/Misc/tools", "Tools.MessageLogLevel")
    @js.native
    val MessageLogLevel: Double = js.native
    
    /**
      * Interpolates between a and b via alpha
      * @param a The lower value (returned when alpha = 0)
      * @param b The upper value (returned when alpha = 1)
      * @param alpha The interpolation-factor
      * @returns The mixed value
      */
    inline def Mix(a: Double, b: Double, alpha: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("Mix")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * No log
      */
    @JSImport("babylonjs/Misc/tools", "Tools.NoneLogLevel")
    @js.native
    val NoneLogLevel: Double = js.native
    
    /**
      * Callback called when a new log is added
      */
    inline def OnNewCacheEntry(entry: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("OnNewCacheEntry")(entry.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Log performance to the console
      */
    @JSImport("babylonjs/Misc/tools", "Tools.PerformanceConsoleLogLevel")
    @js.native
    val PerformanceConsoleLogLevel: Double = js.native
    
    /**
      * No performance log
      */
    @JSImport("babylonjs/Misc/tools", "Tools.PerformanceNoneLogLevel")
    @js.native
    val PerformanceNoneLogLevel: Double = js.native
    
    /**
      * Use user marks to log performance
      */
    @JSImport("babylonjs/Misc/tools", "Tools.PerformanceUserMarkLogLevel")
    @js.native
    val PerformanceUserMarkLogLevel: Double = js.native
    
    /**
      * Implementation from http://stackoverflow.com/questions/105034/how-to-create-a-guid-uuid-in-javascript/2117523#answer-2117523
      * Be aware Math.random() could cause collisions, but:
      * "All but 6 of the 128 bits of the ID are randomly generated, which means that for any two ids, there's a 1 in 2^^122 (or 5.3x10^^36) chance they'll collide"
      * @returns a pseudo random id
      */
    inline def RandomId(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("RandomId")().asInstanceOf[String]
    
    /**
      * Reads a file from a File object
      * @param file defines the file to load
      * @param onSuccess defines the callback to call when data is loaded
      * @param onProgress defines the callback to call during loading process
      * @param useArrayBuffer defines a boolean indicating that data must be returned as an ArrayBuffer
      * @param onError defines the callback to call when an error occurs
      * @returns a file request object
      */
    inline def ReadFile(file: File, onSuccess: js.Function1[/* data */ Any, Unit]): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("ReadFile")(file.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def ReadFile(
      file: File,
      onSuccess: js.Function1[/* data */ Any, Unit],
      onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Any]
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("ReadFile")(file.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def ReadFile(
      file: File,
      onSuccess: js.Function1[/* data */ Any, Unit],
      onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Any],
      useArrayBuffer: Boolean
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("ReadFile")(file.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def ReadFile(
      file: File,
      onSuccess: js.Function1[/* data */ Any, Unit],
      onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Any],
      useArrayBuffer: Boolean,
      onError: js.Function1[/* error */ ReadFileError, Unit]
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("ReadFile")(file.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def ReadFile(
      file: File,
      onSuccess: js.Function1[/* data */ Any, Unit],
      onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Any],
      useArrayBuffer: Unit,
      onError: js.Function1[/* error */ ReadFileError, Unit]
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("ReadFile")(file.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def ReadFile(
      file: File,
      onSuccess: js.Function1[/* data */ Any, Unit],
      onProgress: Unit,
      useArrayBuffer: Boolean
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("ReadFile")(file.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def ReadFile(
      file: File,
      onSuccess: js.Function1[/* data */ Any, Unit],
      onProgress: Unit,
      useArrayBuffer: Boolean,
      onError: js.Function1[/* error */ ReadFileError, Unit]
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("ReadFile")(file.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    inline def ReadFile(
      file: File,
      onSuccess: js.Function1[/* data */ Any, Unit],
      onProgress: Unit,
      useArrayBuffer: Unit,
      onError: js.Function1[/* error */ ReadFileError, Unit]
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("ReadFile")(file.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    
    /**
      * Loads a file from a blob
      * @param fileToLoad defines the blob to use
      * @param callback defines the callback to call when data is loaded
      * @param progressCallback defines the callback to call during loading process
      * @returns a file request object
      */
    inline def ReadFileAsDataURL(
      fileToLoad: Blob,
      callback: js.Function1[/* data */ Any, Unit],
      progressCallback: js.Function1[/* ev */ ProgressEvent[EventTarget], Any]
    ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("ReadFileAsDataURL")(fileToLoad.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], progressCallback.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
    
    /**
      * Function used to register events at window level
      * @param windowElement defines the Window object to use
      * @param events defines the events to register
      */
    inline def RegisterTopRootEvents(windowElement: Window, events: js.Array[Handler]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("RegisterTopRootEvents")(windowElement.asInstanceOf[js.Any], events.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Sets the cors behavior on a dom element. This will add the required Tools.CorsBehavior to the element.
      * @param url define the url we are trying
      * @param element define the dom element where to configure the cors policy
      * @param element.crossOrigin
      */
    inline def SetCorsBehavior(url: String, element: CrossOrigin): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("SetCorsBehavior")(url.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def SetCorsBehavior(url: js.Array[String], element: CrossOrigin): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("SetCorsBehavior")(url.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Polyfill for setImmediate
      * @param action defines the action to execute after the current execution block
      */
    inline def SetImmediate(action: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("SetImmediate")(action.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Sets the referrerPolicy behavior on a dom element.
      * @param referrerPolicy define the referrer policy to use
      * @param element define the dom element where to configure the referrer policy
      * @param element.referrerPolicy
      */
    inline def SetReferrerPolicyBehavior(referrerPolicy: Nullable[ReferrerPolicy], element: typings.babylonjs.anon.ReferrerPolicy): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("SetReferrerPolicyBehavior")(referrerPolicy.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Smooth angle changes (kind of low-pass filter), in particular for device orientation "shaking"
      * Use trigonometric functions to avoid discontinuity (0/360, -180/180)
      * @param previousAngle defines last angle value, in degrees
      * @param newAngle defines new angle value, in degrees
      * @param smoothFactor defines smoothing sensitivity; min 0: no smoothing, max 1: new data ignored
      * @returns the angle in degrees
      */
    inline def SmoothAngleChange(previousAngle: Double, newAngle: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("SmoothAngleChange")(previousAngle.asInstanceOf[js.Any], newAngle.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def SmoothAngleChange(previousAngle: Double, newAngle: Double, smoothFactor: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("SmoothAngleChange")(previousAngle.asInstanceOf[js.Any], newAngle.asInstanceOf[js.Any], smoothFactor.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Starts a performance counter
      */
    inline def StartPerformanceCounter(counterName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("StartPerformanceCounter")(counterName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def StartPerformanceCounter(counterName: String, condition: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("StartPerformanceCounter")(counterName.asInstanceOf[js.Any], condition.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Converts the canvas data to blob.
      * This acts as a polyfill for browsers not supporting the to blob function.
      * @param canvas Defines the canvas to extract the data from (can be an offscreen canvas)
      * @param successCallback Defines the callback triggered once the data are available
      * @param mimeType Defines the mime type of the result
      * @param quality defines the quality of the result
      */
    inline def ToBlob(canvas: HTMLCanvasElement, successCallback: js.Function1[/* blob */ Nullable[Blob], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ToBlob")(canvas.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def ToBlob(
      canvas: HTMLCanvasElement,
      successCallback: js.Function1[/* blob */ Nullable[Blob], Unit],
      mimeType: String
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ToBlob")(canvas.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def ToBlob(
      canvas: HTMLCanvasElement,
      successCallback: js.Function1[/* blob */ Nullable[Blob], Unit],
      mimeType: String,
      quality: Double
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ToBlob")(canvas.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def ToBlob(
      canvas: HTMLCanvasElement,
      successCallback: js.Function1[/* blob */ Nullable[Blob], Unit],
      mimeType: Unit,
      quality: Double
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ToBlob")(canvas.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def ToBlob(canvas: OffscreenCanvas, successCallback: js.Function1[/* blob */ Nullable[Blob], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ToBlob")(canvas.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def ToBlob(
      canvas: OffscreenCanvas,
      successCallback: js.Function1[/* blob */ Nullable[Blob], Unit],
      mimeType: String
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ToBlob")(canvas.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def ToBlob(
      canvas: OffscreenCanvas,
      successCallback: js.Function1[/* blob */ Nullable[Blob], Unit],
      mimeType: String,
      quality: Double
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ToBlob")(canvas.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def ToBlob(
      canvas: OffscreenCanvas,
      successCallback: js.Function1[/* blob */ Nullable[Blob], Unit],
      mimeType: Unit,
      quality: Double
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ToBlob")(canvas.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Convert an angle in radians to degrees
      * @param angle defines the angle to convert
      * @returns the angle in degrees
      */
    inline def ToDegrees(angle: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("ToDegrees")(angle.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Convert an angle in degrees to radians
      * @param angle defines the angle to convert
      * @returns the angle in radians
      */
    inline def ToRadians(angle: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("ToRadians")(angle.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Function used to unregister events from window level
      * @param windowElement defines the Window object to use
      * @param events defines the events to unregister
      */
    inline def UnregisterTopRootEvents(windowElement: Window, events: js.Array[Handler]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("UnregisterTopRootEvents")(windowElement.asInstanceOf[js.Any], events.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Enable/Disable Custom HTTP Request Headers globally.
      * default = false
      * @see CustomRequestHeaders
      */
    @JSImport("babylonjs/Misc/tools", "Tools.UseCustomRequestHeaders")
    @js.native
    def UseCustomRequestHeaders: Boolean = js.native
    inline def UseCustomRequestHeaders_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UseCustomRequestHeaders")(x.asInstanceOf[js.Any])
    
    /**
      * Write a warning message to the console
      * @param message defines the message to log
      */
    inline def Warn(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Warn")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Only warning logs
      */
    @JSImport("babylonjs/Misc/tools", "Tools.WarningLogLevel")
    @js.native
    val WarningLogLevel: Double = js.native
    
    @JSImport("babylonjs/Misc/tools", "Tools._EndPerformanceConsole")
    @js.native
    def _EndPerformanceConsole: Any = js.native
    inline def _EndPerformanceConsole_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_EndPerformanceConsole")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/tools", "Tools._EndPerformanceCounterDisabled")
    @js.native
    def _EndPerformanceCounterDisabled: Any = js.native
    inline def _EndPerformanceCounterDisabled_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_EndPerformanceCounterDisabled")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/tools", "Tools._EndUserMark")
    @js.native
    def _EndUserMark: Any = js.native
    inline def _EndUserMark_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_EndUserMark")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/tools", "Tools._IsOffScreenCanvas")
    @js.native
    def _IsOffScreenCanvas: Any = js.native
    inline def _IsOffScreenCanvas_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_IsOffScreenCanvas")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/tools", "Tools._Performance")
    @js.native
    def _Performance: Any = js.native
    inline def _Performance_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Performance")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/tools", "Tools._StartPerformanceConsole")
    @js.native
    def _StartPerformanceConsole: Any = js.native
    inline def _StartPerformanceConsole_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_StartPerformanceConsole")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/tools", "Tools._StartPerformanceCounterDisabled")
    @js.native
    def _StartPerformanceCounterDisabled: Any = js.native
    inline def _StartPerformanceCounterDisabled_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_StartPerformanceCounterDisabled")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/tools", "Tools._StartUserMark")
    @js.native
    def _StartUserMark: Any = js.native
    inline def _StartUserMark_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_StartUserMark")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/tools", "Tools._TmpFloatArray")
    @js.native
    def _TmpFloatArray: Any = js.native
    inline def _TmpFloatArray_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TmpFloatArray")(x.asInstanceOf[js.Any])
    
    /**
      * This method will return the name of the full name of the class, including its owning module (if any).
      * It will works only on Javascript basic data types (number, string, ...) and instance of class declared with the @className decorator or implementing a method getClassName():string (in which case the module won't be specified).
      * @param object the object to get the class name from
      * @param isType defines if the object is actually a type
      * @returns a string that can have two forms: "moduleName.className" if module was specified when the class' Name was registered or "className" if there was not module specified.
      * @ignorenaming
      */
    inline def getFullClassName(`object`: Any): Nullable[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFullClassName")(`object`.asInstanceOf[js.Any]).asInstanceOf[Nullable[String]]
    inline def getFullClassName(`object`: Any, isType: Boolean): Nullable[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFullClassName")(`object`.asInstanceOf[js.Any], isType.asInstanceOf[js.Any])).asInstanceOf[Nullable[String]]
  }
  
  inline def className(name: String): js.Function1[/* target */ js.Object, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("className")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* target */ js.Object, Unit]]
  inline def className(name: String, module: String): js.Function1[/* target */ js.Object, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("className")(name.asInstanceOf[js.Any], module.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* target */ js.Object, Unit]]
}
