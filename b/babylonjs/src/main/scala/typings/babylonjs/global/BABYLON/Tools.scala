package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.IColor4Like
import typings.babylonjs.BABYLON.IFileRequest
import typings.babylonjs.BABYLON.IOfflineProvider
import typings.babylonjs.BABYLON.IScreenshotSize
import typings.babylonjs.BABYLON.Nullable
import typings.babylonjs.HTMLCanvasElement
import typings.babylonjs.ImageBitmap
import typings.babylonjs.Window
import typings.babylonjs.anon.CrossOrigin
import typings.babylonjs.anon.HandlerName
import typings.std.ArrayBuffer
import typings.std.Blob
import typings.std.EventTarget
import typings.std.File
import typings.std.HTMLImageElement
import typings.std.IArguments
import typings.std.ProgressEvent
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.Tools")
@js.native
class Tools ()
  extends StObject
     with typings.babylonjs.BABYLON.Tools
/* static members */
object Tools {
  
  @JSGlobal("BABYLON.Tools")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * All logs
    */
  @JSGlobal("BABYLON.Tools.AllLogLevel")
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
  
  inline def CreateScreenshot(engine: typings.babylonjs.BABYLON.Engine, camera: typings.babylonjs.BABYLON.Camera, size: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshot")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def CreateScreenshot(
    engine: typings.babylonjs.BABYLON.Engine,
    camera: typings.babylonjs.BABYLON.Camera,
    size: Double,
    successCallback: js.Function1[/* data */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshot")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def CreateScreenshot(
    engine: typings.babylonjs.BABYLON.Engine,
    camera: typings.babylonjs.BABYLON.Camera,
    size: Double,
    successCallback: js.Function1[/* data */ String, Unit],
    mimeType: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshot")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def CreateScreenshot(
    engine: typings.babylonjs.BABYLON.Engine,
    camera: typings.babylonjs.BABYLON.Camera,
    size: Double,
    successCallback: Unit,
    mimeType: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshot")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
    * Captures a screenshot of the current rendering
    * @see https://doc.babylonjs.com/how_to/render_scene_on_a_png
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
  inline def CreateScreenshot(
    engine: typings.babylonjs.BABYLON.Engine,
    camera: typings.babylonjs.BABYLON.Camera,
    size: IScreenshotSize
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshot")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def CreateScreenshot(
    engine: typings.babylonjs.BABYLON.Engine,
    camera: typings.babylonjs.BABYLON.Camera,
    size: IScreenshotSize,
    successCallback: js.Function1[/* data */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshot")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def CreateScreenshot(
    engine: typings.babylonjs.BABYLON.Engine,
    camera: typings.babylonjs.BABYLON.Camera,
    size: IScreenshotSize,
    successCallback: js.Function1[/* data */ String, Unit],
    mimeType: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshot")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def CreateScreenshot(
    engine: typings.babylonjs.BABYLON.Engine,
    camera: typings.babylonjs.BABYLON.Camera,
    size: IScreenshotSize,
    successCallback: Unit,
    mimeType: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshot")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def CreateScreenshotAsync(engine: typings.babylonjs.BABYLON.Engine, camera: typings.babylonjs.BABYLON.Camera, size: Double): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def CreateScreenshotAsync(
    engine: typings.babylonjs.BABYLON.Engine,
    camera: typings.babylonjs.BABYLON.Camera,
    size: Double,
    mimeType: String
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  /**
    * Captures a screenshot of the current rendering
    * @see https://doc.babylonjs.com/how_to/render_scene_on_a_png
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
  inline def CreateScreenshotAsync(
    engine: typings.babylonjs.BABYLON.Engine,
    camera: typings.babylonjs.BABYLON.Camera,
    size: IScreenshotSize
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def CreateScreenshotAsync(
    engine: typings.babylonjs.BABYLON.Engine,
    camera: typings.babylonjs.BABYLON.Camera,
    size: IScreenshotSize,
    mimeType: String
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  /**
    * Generates an image screenshot from the specified camera.
    * @see https://doc.babylonjs.com/how_to/render_scene_on_a_png
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
    engine: typings.babylonjs.BABYLON.Engine,
    camera: typings.babylonjs.BABYLON.Camera,
    size: IScreenshotSize | Double,
    successCallback: js.UndefOr[js.Function1[/* data */ String, Unit]],
    mimeType: js.UndefOr[String],
    samples: js.UndefOr[Double],
    antialiasing: js.UndefOr[Boolean],
    fileName: js.UndefOr[String]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotUsingRenderTarget")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], samples.asInstanceOf[js.Any], antialiasing.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def CreateScreenshotUsingRenderTargetAsync(engine: typings.babylonjs.BABYLON.Engine, camera: typings.babylonjs.BABYLON.Camera, size: Double): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotUsingRenderTargetAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def CreateScreenshotUsingRenderTargetAsync(
    engine: typings.babylonjs.BABYLON.Engine,
    camera: typings.babylonjs.BABYLON.Camera,
    size: Double,
    mimeType: String
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotUsingRenderTargetAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def CreateScreenshotUsingRenderTargetAsync(
    engine: typings.babylonjs.BABYLON.Engine,
    camera: typings.babylonjs.BABYLON.Camera,
    size: Double,
    mimeType: String,
    samples: Double
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotUsingRenderTargetAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], samples.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def CreateScreenshotUsingRenderTargetAsync(
    engine: typings.babylonjs.BABYLON.Engine,
    camera: typings.babylonjs.BABYLON.Camera,
    size: Double,
    mimeType: String,
    samples: Double,
    antialiasing: Boolean
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotUsingRenderTargetAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], samples.asInstanceOf[js.Any], antialiasing.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def CreateScreenshotUsingRenderTargetAsync(
    engine: typings.babylonjs.BABYLON.Engine,
    camera: typings.babylonjs.BABYLON.Camera,
    size: Double,
    mimeType: String,
    samples: Double,
    antialiasing: Boolean,
    fileName: String
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotUsingRenderTargetAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], samples.asInstanceOf[js.Any], antialiasing.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def CreateScreenshotUsingRenderTargetAsync(
    engine: typings.babylonjs.BABYLON.Engine,
    camera: typings.babylonjs.BABYLON.Camera,
    size: Double,
    mimeType: String,
    samples: Double,
    antialiasing: Unit,
    fileName: String
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotUsingRenderTargetAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], samples.asInstanceOf[js.Any], antialiasing.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def CreateScreenshotUsingRenderTargetAsync(
    engine: typings.babylonjs.BABYLON.Engine,
    camera: typings.babylonjs.BABYLON.Camera,
    size: Double,
    mimeType: String,
    samples: Unit,
    antialiasing: Boolean
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotUsingRenderTargetAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], samples.asInstanceOf[js.Any], antialiasing.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def CreateScreenshotUsingRenderTargetAsync(
    engine: typings.babylonjs.BABYLON.Engine,
    camera: typings.babylonjs.BABYLON.Camera,
    size: Double,
    mimeType: String,
    samples: Unit,
    antialiasing: Boolean,
    fileName: String
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotUsingRenderTargetAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], samples.asInstanceOf[js.Any], antialiasing.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def CreateScreenshotUsingRenderTargetAsync(
    engine: typings.babylonjs.BABYLON.Engine,
    camera: typings.babylonjs.BABYLON.Camera,
    size: Double,
    mimeType: String,
    samples: Unit,
    antialiasing: Unit,
    fileName: String
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotUsingRenderTargetAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], samples.asInstanceOf[js.Any], antialiasing.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def CreateScreenshotUsingRenderTargetAsync(
    engine: typings.babylonjs.BABYLON.Engine,
    camera: typings.babylonjs.BABYLON.Camera,
    size: Double,
    mimeType: Unit,
    samples: Double
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotUsingRenderTargetAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], samples.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def CreateScreenshotUsingRenderTargetAsync(
    engine: typings.babylonjs.BABYLON.Engine,
    camera: typings.babylonjs.BABYLON.Camera,
    size: Double,
    mimeType: Unit,
    samples: Double,
    antialiasing: Boolean
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotUsingRenderTargetAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], samples.asInstanceOf[js.Any], antialiasing.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def CreateScreenshotUsingRenderTargetAsync(
    engine: typings.babylonjs.BABYLON.Engine,
    camera: typings.babylonjs.BABYLON.Camera,
    size: Double,
    mimeType: Unit,
    samples: Double,
    antialiasing: Boolean,
    fileName: String
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotUsingRenderTargetAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], samples.asInstanceOf[js.Any], antialiasing.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def CreateScreenshotUsingRenderTargetAsync(
    engine: typings.babylonjs.BABYLON.Engine,
    camera: typings.babylonjs.BABYLON.Camera,
    size: Double,
    mimeType: Unit,
    samples: Double,
    antialiasing: Unit,
    fileName: String
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotUsingRenderTargetAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], samples.asInstanceOf[js.Any], antialiasing.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def CreateScreenshotUsingRenderTargetAsync(
    engine: typings.babylonjs.BABYLON.Engine,
    camera: typings.babylonjs.BABYLON.Camera,
    size: Double,
    mimeType: Unit,
    samples: Unit,
    antialiasing: Boolean
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotUsingRenderTargetAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], samples.asInstanceOf[js.Any], antialiasing.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def CreateScreenshotUsingRenderTargetAsync(
    engine: typings.babylonjs.BABYLON.Engine,
    camera: typings.babylonjs.BABYLON.Camera,
    size: Double,
    mimeType: Unit,
    samples: Unit,
    antialiasing: Boolean,
    fileName: String
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotUsingRenderTargetAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], samples.asInstanceOf[js.Any], antialiasing.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def CreateScreenshotUsingRenderTargetAsync(
    engine: typings.babylonjs.BABYLON.Engine,
    camera: typings.babylonjs.BABYLON.Camera,
    size: Double,
    mimeType: Unit,
    samples: Unit,
    antialiasing: Unit,
    fileName: String
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotUsingRenderTargetAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], samples.asInstanceOf[js.Any], antialiasing.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  /**
    * Generates an image screenshot from the specified camera.
    * @see https://doc.babylonjs.com/how_to/render_scene_on_a_png
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
  inline def CreateScreenshotUsingRenderTargetAsync(
    engine: typings.babylonjs.BABYLON.Engine,
    camera: typings.babylonjs.BABYLON.Camera,
    size: IScreenshotSize
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotUsingRenderTargetAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def CreateScreenshotUsingRenderTargetAsync(
    engine: typings.babylonjs.BABYLON.Engine,
    camera: typings.babylonjs.BABYLON.Camera,
    size: IScreenshotSize,
    mimeType: String
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotUsingRenderTargetAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def CreateScreenshotUsingRenderTargetAsync(
    engine: typings.babylonjs.BABYLON.Engine,
    camera: typings.babylonjs.BABYLON.Camera,
    size: IScreenshotSize,
    mimeType: String,
    samples: Double
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotUsingRenderTargetAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], samples.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def CreateScreenshotUsingRenderTargetAsync(
    engine: typings.babylonjs.BABYLON.Engine,
    camera: typings.babylonjs.BABYLON.Camera,
    size: IScreenshotSize,
    mimeType: String,
    samples: Double,
    antialiasing: Boolean
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotUsingRenderTargetAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], samples.asInstanceOf[js.Any], antialiasing.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def CreateScreenshotUsingRenderTargetAsync(
    engine: typings.babylonjs.BABYLON.Engine,
    camera: typings.babylonjs.BABYLON.Camera,
    size: IScreenshotSize,
    mimeType: String,
    samples: Double,
    antialiasing: Boolean,
    fileName: String
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotUsingRenderTargetAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], samples.asInstanceOf[js.Any], antialiasing.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def CreateScreenshotUsingRenderTargetAsync(
    engine: typings.babylonjs.BABYLON.Engine,
    camera: typings.babylonjs.BABYLON.Camera,
    size: IScreenshotSize,
    mimeType: String,
    samples: Double,
    antialiasing: Unit,
    fileName: String
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotUsingRenderTargetAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], samples.asInstanceOf[js.Any], antialiasing.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def CreateScreenshotUsingRenderTargetAsync(
    engine: typings.babylonjs.BABYLON.Engine,
    camera: typings.babylonjs.BABYLON.Camera,
    size: IScreenshotSize,
    mimeType: String,
    samples: Unit,
    antialiasing: Boolean
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotUsingRenderTargetAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], samples.asInstanceOf[js.Any], antialiasing.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def CreateScreenshotUsingRenderTargetAsync(
    engine: typings.babylonjs.BABYLON.Engine,
    camera: typings.babylonjs.BABYLON.Camera,
    size: IScreenshotSize,
    mimeType: String,
    samples: Unit,
    antialiasing: Boolean,
    fileName: String
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotUsingRenderTargetAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], samples.asInstanceOf[js.Any], antialiasing.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def CreateScreenshotUsingRenderTargetAsync(
    engine: typings.babylonjs.BABYLON.Engine,
    camera: typings.babylonjs.BABYLON.Camera,
    size: IScreenshotSize,
    mimeType: String,
    samples: Unit,
    antialiasing: Unit,
    fileName: String
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotUsingRenderTargetAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], samples.asInstanceOf[js.Any], antialiasing.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def CreateScreenshotUsingRenderTargetAsync(
    engine: typings.babylonjs.BABYLON.Engine,
    camera: typings.babylonjs.BABYLON.Camera,
    size: IScreenshotSize,
    mimeType: Unit,
    samples: Double
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotUsingRenderTargetAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], samples.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def CreateScreenshotUsingRenderTargetAsync(
    engine: typings.babylonjs.BABYLON.Engine,
    camera: typings.babylonjs.BABYLON.Camera,
    size: IScreenshotSize,
    mimeType: Unit,
    samples: Double,
    antialiasing: Boolean
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotUsingRenderTargetAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], samples.asInstanceOf[js.Any], antialiasing.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def CreateScreenshotUsingRenderTargetAsync(
    engine: typings.babylonjs.BABYLON.Engine,
    camera: typings.babylonjs.BABYLON.Camera,
    size: IScreenshotSize,
    mimeType: Unit,
    samples: Double,
    antialiasing: Boolean,
    fileName: String
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotUsingRenderTargetAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], samples.asInstanceOf[js.Any], antialiasing.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def CreateScreenshotUsingRenderTargetAsync(
    engine: typings.babylonjs.BABYLON.Engine,
    camera: typings.babylonjs.BABYLON.Camera,
    size: IScreenshotSize,
    mimeType: Unit,
    samples: Double,
    antialiasing: Unit,
    fileName: String
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotUsingRenderTargetAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], samples.asInstanceOf[js.Any], antialiasing.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def CreateScreenshotUsingRenderTargetAsync(
    engine: typings.babylonjs.BABYLON.Engine,
    camera: typings.babylonjs.BABYLON.Camera,
    size: IScreenshotSize,
    mimeType: Unit,
    samples: Unit,
    antialiasing: Boolean
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotUsingRenderTargetAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], samples.asInstanceOf[js.Any], antialiasing.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def CreateScreenshotUsingRenderTargetAsync(
    engine: typings.babylonjs.BABYLON.Engine,
    camera: typings.babylonjs.BABYLON.Camera,
    size: IScreenshotSize,
    mimeType: Unit,
    samples: Unit,
    antialiasing: Boolean,
    fileName: String
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotUsingRenderTargetAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], samples.asInstanceOf[js.Any], antialiasing.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def CreateScreenshotUsingRenderTargetAsync(
    engine: typings.babylonjs.BABYLON.Engine,
    camera: typings.babylonjs.BABYLON.Camera,
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
  @JSGlobal("BABYLON.Tools.CustomRequestHeaders")
  @js.native
  def CustomRequestHeaders: org.scalablytyped.runtime.StringDictionary[String] = js.native
  inline def CustomRequestHeaders_=(x: org.scalablytyped.runtime.StringDictionary[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CustomRequestHeaders")(x.asInstanceOf[js.Any])
  
  /**
    * Decode the given base64 uri.
    * @param uri The uri to decode
    * @return The decoded base64 data.
    */
  inline def DecodeBase64(uri: String): ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("DecodeBase64")(uri.asInstanceOf[js.Any]).asInstanceOf[ArrayBuffer]
  
  /**
    * Tries to copy an object by duplicating every property
    * @param source defines the source object
    * @param destination defines the target object
    * @param doNotCopyList defines a list of properties to avoid
    * @param mustCopyList defines a list of properties to copy (even if they start with _)
    */
  inline def DeepCopy(source: js.Any, destination: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("DeepCopy")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def DeepCopy(source: js.Any, destination: js.Any, doNotCopyList: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("DeepCopy")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], doNotCopyList.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def DeepCopy(
    source: js.Any,
    destination: js.Any,
    doNotCopyList: js.Array[String],
    mustCopyList: js.Array[String]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("DeepCopy")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], doNotCopyList.asInstanceOf[js.Any], mustCopyList.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def DeepCopy(source: js.Any, destination: js.Any, doNotCopyList: Unit, mustCopyList: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("DeepCopy")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], doNotCopyList.asInstanceOf[js.Any], mustCopyList.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
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
    * Dumps the current bound framebuffer
    * @param width defines the rendering width
    * @param height defines the rendering height
    * @param engine defines the hosting engine
    * @param successCallback defines the callback triggered once the data are available
    * @param mimeType defines the mime type of the result
    * @param fileName defines the filename to download. If present, the result will automatically be downloaded
    */
  inline def DumpFramebuffer(width: Double, height: Double, engine: typings.babylonjs.BABYLON.Engine): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpFramebuffer")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], engine.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def DumpFramebuffer(
    width: Double,
    height: Double,
    engine: typings.babylonjs.BABYLON.Engine,
    successCallback: js.Function1[/* data */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpFramebuffer")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], engine.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def DumpFramebuffer(
    width: Double,
    height: Double,
    engine: typings.babylonjs.BABYLON.Engine,
    successCallback: js.Function1[/* data */ String, Unit],
    mimeType: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpFramebuffer")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], engine.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def DumpFramebuffer(
    width: Double,
    height: Double,
    engine: typings.babylonjs.BABYLON.Engine,
    successCallback: js.Function1[/* data */ String, Unit],
    mimeType: String,
    fileName: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpFramebuffer")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], engine.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def DumpFramebuffer(
    width: Double,
    height: Double,
    engine: typings.babylonjs.BABYLON.Engine,
    successCallback: js.Function1[/* data */ String, Unit],
    mimeType: Unit,
    fileName: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpFramebuffer")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], engine.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def DumpFramebuffer(
    width: Double,
    height: Double,
    engine: typings.babylonjs.BABYLON.Engine,
    successCallback: Unit,
    mimeType: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpFramebuffer")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], engine.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def DumpFramebuffer(
    width: Double,
    height: Double,
    engine: typings.babylonjs.BABYLON.Engine,
    successCallback: Unit,
    mimeType: String,
    fileName: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpFramebuffer")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], engine.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def DumpFramebuffer(
    width: Double,
    height: Double,
    engine: typings.babylonjs.BABYLON.Engine,
    successCallback: Unit,
    mimeType: Unit,
    fileName: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpFramebuffer")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], engine.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Encodes the canvas data to base 64 or automatically download the result if filename is defined
    * @param successCallback defines the callback triggered once the data are available
    * @param mimeType defines the mime type of the result
    * @param fileName defines he filename to download. If present, the result will automatically be downloaded
    */
  inline def EncodeScreenshotCanvasData(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("EncodeScreenshotCanvasData")().asInstanceOf[Unit]
  inline def EncodeScreenshotCanvasData(successCallback: js.Function1[/* data */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("EncodeScreenshotCanvasData")(successCallback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def EncodeScreenshotCanvasData(successCallback: js.Function1[/* data */ String, Unit], mimeType: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("EncodeScreenshotCanvasData")(successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def EncodeScreenshotCanvasData(successCallback: js.Function1[/* data */ String, Unit], mimeType: String, fileName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("EncodeScreenshotCanvasData")(successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def EncodeScreenshotCanvasData(successCallback: js.Function1[/* data */ String, Unit], mimeType: Unit, fileName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("EncodeScreenshotCanvasData")(successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def EncodeScreenshotCanvasData(successCallback: Unit, mimeType: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("EncodeScreenshotCanvasData")(successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def EncodeScreenshotCanvasData(successCallback: Unit, mimeType: String, fileName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("EncodeScreenshotCanvasData")(successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def EncodeScreenshotCanvasData(successCallback: Unit, mimeType: Unit, fileName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("EncodeScreenshotCanvasData")(successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Ends a specific performance coutner
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
  @JSGlobal("BABYLON.Tools.ErrorLogLevel")
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
  inline def FetchToRef(u: Double, v: Double, width: Double, height: Double, pixels: Uint8Array, color: IColor4Like): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("FetchToRef")(u.asInstanceOf[js.Any], v.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], pixels.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
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
  
  /**
    * Gets the absolute url.
    * @param url the input url
    * @return the absolute url
    */
  inline def GetAbsoluteUrl(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("GetAbsoluteUrl")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * This method will return the name of the class used to create the instance of the given object.
    * It will works only on Javascript basic data types (number, string, ...) and instance of class declared with the @className decorator.
    * @param object the object to get the class name from
    * @param isType defines if the object is actually a type
    * @returns the name of the class, will be "object" for a custom data type not using the @className decorator
    */
  inline def GetClassName(`object`: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("GetClassName")(`object`.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def GetClassName(`object`: js.Any, isType: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("GetClassName")(`object`.asInstanceOf[js.Any], isType.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Extracts text content from a DOM element hierarchy
    * Back Compat only, please use DomManagement.GetDOMTextContent instead.
    */
  @JSGlobal("BABYLON.Tools.GetDOMTextContent")
  @js.native
  def GetDOMTextContent: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DomManagement.GetDOMTextContent */ js.Any = js.native
  inline def GetDOMTextContent_=(
    x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DomManagement.GetDOMTextContent */ js.Any
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GetDOMTextContent")(x.asInstanceOf[js.Any])
  
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
  inline def GetPointerPrefix(engine: typings.babylonjs.BABYLON.Engine): String = ^.asInstanceOf[js.Dynamic].applyDynamic("GetPointerPrefix")(engine.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Tries to instantiate a new object from a given class name
    * @param className defines the class name to instantiate
    * @returns the new object or null if the system was not able to do the instantiation
    */
  inline def Instantiate(className: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("Instantiate")(className.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /**
    * Test if the given uri is a base64 string
    * @param uri The uri to test
    * @return True if the uri is a base64 string or false otherwise
    */
  inline def IsBase64(uri: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsBase64")(uri.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Gets a boolean indicating if the given object has no own property
    * @param obj defines the object to test
    * @returns true if object has no own property
    */
  inline def IsEmpty(obj: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsEmpty")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
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
    * Back Compat only, please use DomManagement.IsWindowObjectExist instead.
    */
  @JSGlobal("BABYLON.Tools.IsWindowObjectExist")
  @js.native
  def IsWindowObjectExist: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DomManagement.IsWindowObjectExist */ js.Any = js.native
  inline def IsWindowObjectExist_=(
    x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DomManagement.IsWindowObjectExist */ js.Any
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IsWindowObjectExist")(x.asInstanceOf[js.Any])
  
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
    onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit]
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  inline def LoadFile(
    url: String,
    onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
    onProgress: js.Function1[/* data */ js.Any, Unit]
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  inline def LoadFile(
    url: String,
    onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
    onProgress: js.Function1[/* data */ js.Any, Unit],
    offlineProvider: Unit,
    useArrayBuffer: Boolean
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  inline def LoadFile(
    url: String,
    onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
    onProgress: js.Function1[/* data */ js.Any, Unit],
    offlineProvider: Unit,
    useArrayBuffer: Boolean,
    onError: js.Function2[
      /* request */ js.UndefOr[typings.babylonjs.BABYLON.WebRequest], 
      /* exception */ js.UndefOr[js.Any], 
      Unit
    ]
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  inline def LoadFile(
    url: String,
    onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
    onProgress: js.Function1[/* data */ js.Any, Unit],
    offlineProvider: Unit,
    useArrayBuffer: Unit,
    onError: js.Function2[
      /* request */ js.UndefOr[typings.babylonjs.BABYLON.WebRequest], 
      /* exception */ js.UndefOr[js.Any], 
      Unit
    ]
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  inline def LoadFile(
    url: String,
    onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
    onProgress: js.Function1[/* data */ js.Any, Unit],
    offlineProvider: IOfflineProvider
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  inline def LoadFile(
    url: String,
    onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
    onProgress: js.Function1[/* data */ js.Any, Unit],
    offlineProvider: IOfflineProvider,
    useArrayBuffer: Boolean
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  inline def LoadFile(
    url: String,
    onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
    onProgress: js.Function1[/* data */ js.Any, Unit],
    offlineProvider: IOfflineProvider,
    useArrayBuffer: Boolean,
    onError: js.Function2[
      /* request */ js.UndefOr[typings.babylonjs.BABYLON.WebRequest], 
      /* exception */ js.UndefOr[js.Any], 
      Unit
    ]
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  inline def LoadFile(
    url: String,
    onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
    onProgress: js.Function1[/* data */ js.Any, Unit],
    offlineProvider: IOfflineProvider,
    useArrayBuffer: Unit,
    onError: js.Function2[
      /* request */ js.UndefOr[typings.babylonjs.BABYLON.WebRequest], 
      /* exception */ js.UndefOr[js.Any], 
      Unit
    ]
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  inline def LoadFile(
    url: String,
    onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
    onProgress: Unit,
    offlineProvider: Unit,
    useArrayBuffer: Boolean
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  inline def LoadFile(
    url: String,
    onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
    onProgress: Unit,
    offlineProvider: Unit,
    useArrayBuffer: Boolean,
    onError: js.Function2[
      /* request */ js.UndefOr[typings.babylonjs.BABYLON.WebRequest], 
      /* exception */ js.UndefOr[js.Any], 
      Unit
    ]
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  inline def LoadFile(
    url: String,
    onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
    onProgress: Unit,
    offlineProvider: Unit,
    useArrayBuffer: Unit,
    onError: js.Function2[
      /* request */ js.UndefOr[typings.babylonjs.BABYLON.WebRequest], 
      /* exception */ js.UndefOr[js.Any], 
      Unit
    ]
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  inline def LoadFile(
    url: String,
    onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
    onProgress: Unit,
    offlineProvider: IOfflineProvider
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  inline def LoadFile(
    url: String,
    onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
    onProgress: Unit,
    offlineProvider: IOfflineProvider,
    useArrayBuffer: Boolean
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  inline def LoadFile(
    url: String,
    onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
    onProgress: Unit,
    offlineProvider: IOfflineProvider,
    useArrayBuffer: Boolean,
    onError: js.Function2[
      /* request */ js.UndefOr[typings.babylonjs.BABYLON.WebRequest], 
      /* exception */ js.UndefOr[js.Any], 
      Unit
    ]
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  inline def LoadFile(
    url: String,
    onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
    onProgress: Unit,
    offlineProvider: IOfflineProvider,
    useArrayBuffer: Unit,
    onError: js.Function2[
      /* request */ js.UndefOr[typings.babylonjs.BABYLON.WebRequest], 
      /* exception */ js.UndefOr[js.Any], 
      Unit
    ]
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  
  /**
    * Loads a file from a url
    * @param url the file url to load
    * @param useArrayBuffer defines a boolean indicating that date must be returned as ArrayBuffer
    * @returns a promise containing an ArrayBuffer corresponding to the loaded file
    */
  inline def LoadFileAsync(url: String): js.Promise[ArrayBuffer | String] = ^.asInstanceOf[js.Dynamic].applyDynamic("LoadFileAsync")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ArrayBuffer | String]]
  inline def LoadFileAsync(url: String, useArrayBuffer: Boolean): js.Promise[ArrayBuffer | String] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadFileAsync")(url.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ArrayBuffer | String]]
  
  /**
    * Loads an image as an HTMLImageElement.
    * @param input url string, ArrayBuffer, or Blob to load
    * @param onLoad callback called when the image successfully loads
    * @param onError callback called when the image fails to load
    * @param offlineProvider offline provider for caching
    * @param mimeType optional mime type
    * @returns the HTMLImageElement of the loaded image
    */
  inline def LoadImage(
    input: String,
    onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit],
    offlineProvider: Nullable[IOfflineProvider]
  ): Nullable[HTMLImageElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadImage")(input.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any])).asInstanceOf[Nullable[HTMLImageElement]]
  inline def LoadImage(
    input: String,
    onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit],
    offlineProvider: Nullable[IOfflineProvider],
    mimeType: String
  ): Nullable[HTMLImageElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadImage")(input.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[Nullable[HTMLImageElement]]
  inline def LoadImage(
    input: ArrayBuffer,
    onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit],
    offlineProvider: Nullable[IOfflineProvider]
  ): Nullable[HTMLImageElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadImage")(input.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any])).asInstanceOf[Nullable[HTMLImageElement]]
  inline def LoadImage(
    input: ArrayBuffer,
    onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit],
    offlineProvider: Nullable[IOfflineProvider],
    mimeType: String
  ): Nullable[HTMLImageElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadImage")(input.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[Nullable[HTMLImageElement]]
  inline def LoadImage(
    input: Blob,
    onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit],
    offlineProvider: Nullable[IOfflineProvider]
  ): Nullable[HTMLImageElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadImage")(input.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any])).asInstanceOf[Nullable[HTMLImageElement]]
  inline def LoadImage(
    input: Blob,
    onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit],
    offlineProvider: Nullable[IOfflineProvider],
    mimeType: String
  ): Nullable[HTMLImageElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadImage")(input.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[Nullable[HTMLImageElement]]
  
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
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadScript")(scriptUrl.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def LoadScript(
    scriptUrl: String,
    onSuccess: js.Function0[Unit],
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit],
    scriptId: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadScript")(scriptUrl.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], scriptId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def LoadScript(scriptUrl: String, onSuccess: js.Function0[Unit], onError: Unit, scriptId: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadScript")(scriptUrl.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], scriptId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Load an asynchronous script (identified by an url). When the url returns, the
    * content of this file is added into a new script element, attached to the DOM (body element)
    * @param scriptUrl defines the url of the script to laod
    * @param scriptId defines the id of the script element
    * @returns a promise request object
    */
  inline def LoadScriptAsync(scriptUrl: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("LoadScriptAsync")(scriptUrl.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def LoadScriptAsync(scriptUrl: String, scriptId: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadScriptAsync")(scriptUrl.asInstanceOf[js.Any], scriptId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
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
  inline def MakeArray(obj: js.Any): Nullable[js.Array[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("MakeArray")(obj.asInstanceOf[js.Any]).asInstanceOf[Nullable[js.Array[js.Any]]]
  inline def MakeArray(obj: js.Any, allowsNullUndefined: Boolean): Nullable[js.Array[js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("MakeArray")(obj.asInstanceOf[js.Any], allowsNullUndefined.asInstanceOf[js.Any])).asInstanceOf[Nullable[js.Array[js.Any]]]
  
  /**
    * Only message logs
    */
  @JSGlobal("BABYLON.Tools.MessageLogLevel")
  @js.native
  val MessageLogLevel: Double = js.native
  
  /**
    * Interpolates between a and b via alpha
    * @param a The lower value (returned when alpha = 0)
    * @param b The upper value (returned when alpha = 1)
    * @param alpha The interpolation-factor
    * @return The mixed value
    */
  inline def Mix(a: Double, b: Double, alpha: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("Mix")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * No log
    */
  @JSGlobal("BABYLON.Tools.NoneLogLevel")
  @js.native
  val NoneLogLevel: Double = js.native
  
  /**
    * Callback called when a new log is added
    */
  inline def OnNewCacheEntry(entry: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("OnNewCacheEntry")(entry.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Log performance to the console
    */
  @JSGlobal("BABYLON.Tools.PerformanceConsoleLogLevel")
  @js.native
  val PerformanceConsoleLogLevel: Double = js.native
  
  /**
    * No performance log
    */
  @JSGlobal("BABYLON.Tools.PerformanceNoneLogLevel")
  @js.native
  val PerformanceNoneLogLevel: Double = js.native
  
  /**
    * Use user marks to log performance
    */
  @JSGlobal("BABYLON.Tools.PerformanceUserMarkLogLevel")
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
  inline def ReadFile(file: File, onSuccess: js.Function1[/* data */ js.Any, Unit]): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("ReadFile")(file.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  inline def ReadFile(
    file: File,
    onSuccess: js.Function1[/* data */ js.Any, Unit],
    onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], js.Any]
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("ReadFile")(file.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  inline def ReadFile(
    file: File,
    onSuccess: js.Function1[/* data */ js.Any, Unit],
    onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], js.Any],
    useArrayBuffer: Boolean
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("ReadFile")(file.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  inline def ReadFile(
    file: File,
    onSuccess: js.Function1[/* data */ js.Any, Unit],
    onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], js.Any],
    useArrayBuffer: Boolean,
    onError: js.Function1[/* error */ typings.babylonjs.BABYLON.ReadFileError, Unit]
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("ReadFile")(file.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  inline def ReadFile(
    file: File,
    onSuccess: js.Function1[/* data */ js.Any, Unit],
    onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], js.Any],
    useArrayBuffer: Unit,
    onError: js.Function1[/* error */ typings.babylonjs.BABYLON.ReadFileError, Unit]
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("ReadFile")(file.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  inline def ReadFile(
    file: File,
    onSuccess: js.Function1[/* data */ js.Any, Unit],
    onProgress: Unit,
    useArrayBuffer: Boolean
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("ReadFile")(file.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  inline def ReadFile(
    file: File,
    onSuccess: js.Function1[/* data */ js.Any, Unit],
    onProgress: Unit,
    useArrayBuffer: Boolean,
    onError: js.Function1[/* error */ typings.babylonjs.BABYLON.ReadFileError, Unit]
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("ReadFile")(file.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  inline def ReadFile(
    file: File,
    onSuccess: js.Function1[/* data */ js.Any, Unit],
    onProgress: Unit,
    useArrayBuffer: Unit,
    onError: js.Function1[/* error */ typings.babylonjs.BABYLON.ReadFileError, Unit]
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
    callback: js.Function1[/* data */ js.Any, Unit],
    progressCallback: js.Function1[/* ev */ ProgressEvent[EventTarget], js.Any]
  ): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("ReadFileAsDataURL")(fileToLoad.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], progressCallback.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
  
  /**
    * Function used to register events at window level
    * @param windowElement defines the Window object to use
    * @param events defines the events to register
    */
  inline def RegisterTopRootEvents(windowElement: Window, events: js.Array[HandlerName]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("RegisterTopRootEvents")(windowElement.asInstanceOf[js.Any], events.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Sets the cors behavior on a dom element. This will add the required Tools.CorsBehavior to the element.
    * @param url define the url we are trying
    * @param element define the dom element where to configure the cors policy
    */
  inline def SetCorsBehavior(url: String, element: CrossOrigin): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("SetCorsBehavior")(url.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def SetCorsBehavior(url: js.Array[String], element: CrossOrigin): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("SetCorsBehavior")(url.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Polyfill for setImmediate
    * @param action defines the action to execute after the current execution block
    */
  inline def SetImmediate(action: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("SetImmediate")(action.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Provides a slice function that will work even on IE
    * @param data defines the array to slice
    * @param start defines the start of the data (optional)
    * @param end defines the end of the data (optional)
    * @returns the new sliced array
    */
  inline def Slice[T](data: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("Slice")(data.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def Slice[T](data: T, start: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("Slice")(data.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def Slice[T](data: T, start: Double, end: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("Slice")(data.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def Slice[T](data: T, start: Unit, end: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("Slice")(data.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * Provides a slice function that will work even on IE
    * The difference between this and Slice is that this will force-convert to array
    * @param data defines the array to slice
    * @param start defines the start of the data (optional)
    * @param end defines the end of the data (optional)
    * @returns the new sliced array
    */
  inline def SliceToArray[T, P](data: T): js.Array[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("SliceToArray")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[P]]
  inline def SliceToArray[T, P](data: T, start: Double): js.Array[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("SliceToArray")(data.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[js.Array[P]]
  inline def SliceToArray[T, P](data: T, start: Double, end: Double): js.Array[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("SliceToArray")(data.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.Array[P]]
  inline def SliceToArray[T, P](data: T, start: Unit, end: Double): js.Array[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("SliceToArray")(data.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.Array[P]]
  
  /**
    * Starts a performance counter
    */
  inline def StartPerformanceCounter(counterName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("StartPerformanceCounter")(counterName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def StartPerformanceCounter(counterName: String, condition: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("StartPerformanceCounter")(counterName.asInstanceOf[js.Any], condition.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Converts the canvas data to blob.
    * This acts as a polyfill for browsers not supporting the to blob function.
    * @param canvas Defines the canvas to extract the data from
    * @param successCallback Defines the callback triggered once the data are available
    * @param mimeType Defines the mime type of the result
    */
  inline def ToBlob(canvas: HTMLCanvasElement, successCallback: js.Function1[/* blob */ Nullable[Blob], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ToBlob")(canvas.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ToBlob(
    canvas: HTMLCanvasElement,
    successCallback: js.Function1[/* blob */ Nullable[Blob], Unit],
    mimeType: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ToBlob")(canvas.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
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
  inline def UnregisterTopRootEvents(windowElement: Window, events: js.Array[HandlerName]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("UnregisterTopRootEvents")(windowElement.asInstanceOf[js.Any], events.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Enable/Disable Custom HTTP Request Headers globally.
    * default = false
    * @see CustomRequestHeaders
    */
  @JSGlobal("BABYLON.Tools.UseCustomRequestHeaders")
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
  @JSGlobal("BABYLON.Tools.WarningLogLevel")
  @js.native
  val WarningLogLevel: Double = js.native
  
  @JSGlobal("BABYLON.Tools._EndPerformanceConsole")
  @js.native
  def _EndPerformanceConsole: js.Any = js.native
  inline def _EndPerformanceConsole_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_EndPerformanceConsole")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.Tools._EndPerformanceCounterDisabled")
  @js.native
  def _EndPerformanceCounterDisabled: js.Any = js.native
  inline def _EndPerformanceCounterDisabled_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_EndPerformanceCounterDisabled")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.Tools._EndUserMark")
  @js.native
  def _EndUserMark: js.Any = js.native
  inline def _EndUserMark_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_EndUserMark")(x.asInstanceOf[js.Any])
  
  /**
    * @ignore
    */
  @JSGlobal("BABYLON.Tools._ScreenshotCanvas")
  @js.native
  def _ScreenshotCanvas: HTMLCanvasElement = js.native
  inline def _ScreenshotCanvas_=(x: HTMLCanvasElement): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ScreenshotCanvas")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.Tools._StartPerformanceConsole")
  @js.native
  def _StartPerformanceConsole: js.Any = js.native
  inline def _StartPerformanceConsole_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_StartPerformanceConsole")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.Tools._StartPerformanceCounterDisabled")
  @js.native
  def _StartPerformanceCounterDisabled: js.Any = js.native
  inline def _StartPerformanceCounterDisabled_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_StartPerformanceCounterDisabled")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.Tools._StartUserMark")
  @js.native
  def _StartUserMark: js.Any = js.native
  inline def _StartUserMark_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_StartUserMark")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.Tools._performance")
  @js.native
  def _performance: js.Any = js.native
  inline def _performance_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_performance")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.Tools._tmpFloatArray")
  @js.native
  def _tmpFloatArray: js.Any = js.native
  inline def _tmpFloatArray_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_tmpFloatArray")(x.asInstanceOf[js.Any])
  
  /**
    * This method will return the name of the full name of the class, including its owning module (if any).
    * It will works only on Javascript basic data types (number, string, ...) and instance of class declared with the @className decorator or implementing a method getClassName():string (in which case the module won't be specified).
    * @param object the object to get the class name from
    * @param isType defines if the object is actually a type
    * @return a string that can have two forms: "moduleName.className" if module was specified when the class' Name was registered or "className" if there was not module specified.
    * @ignorenaming
    */
  inline def getFullClassName(`object`: js.Any): Nullable[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFullClassName")(`object`.asInstanceOf[js.Any]).asInstanceOf[Nullable[String]]
  inline def getFullClassName(`object`: js.Any, isType: Boolean): Nullable[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFullClassName")(`object`.asInstanceOf[js.Any], isType.asInstanceOf[js.Any])).asInstanceOf[Nullable[String]]
}
