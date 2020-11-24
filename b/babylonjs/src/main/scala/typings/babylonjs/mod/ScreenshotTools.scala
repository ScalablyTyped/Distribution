package typings.babylonjs.mod

import typings.babylonjs.screenshotSizeMod.IScreenshotSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "ScreenshotTools")
@js.native
class ScreenshotTools ()
  extends typings.babylonjs.legacyMod.ScreenshotTools
/* static members */
@JSImport("babylonjs", "ScreenshotTools")
@js.native
object ScreenshotTools extends js.Object {
  
  def CreateScreenshot(
    engine: typings.babylonjs.engineMod.Engine,
    camera: typings.babylonjs.cameraMod.Camera,
    size: Double
  ): Unit = js.native
  def CreateScreenshot(
    engine: typings.babylonjs.engineMod.Engine,
    camera: typings.babylonjs.cameraMod.Camera,
    size: Double,
    successCallback: js.UndefOr[scala.Nothing],
    mimeType: String
  ): Unit = js.native
  def CreateScreenshot(
    engine: typings.babylonjs.engineMod.Engine,
    camera: typings.babylonjs.cameraMod.Camera,
    size: Double,
    successCallback: js.Function1[/* data */ String, Unit]
  ): Unit = js.native
  def CreateScreenshot(
    engine: typings.babylonjs.engineMod.Engine,
    camera: typings.babylonjs.cameraMod.Camera,
    size: Double,
    successCallback: js.Function1[/* data */ String, Unit],
    mimeType: String
  ): Unit = js.native
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
  def CreateScreenshot(
    engine: typings.babylonjs.engineMod.Engine,
    camera: typings.babylonjs.cameraMod.Camera,
    size: IScreenshotSize
  ): Unit = js.native
  def CreateScreenshot(
    engine: typings.babylonjs.engineMod.Engine,
    camera: typings.babylonjs.cameraMod.Camera,
    size: IScreenshotSize,
    successCallback: js.UndefOr[scala.Nothing],
    mimeType: String
  ): Unit = js.native
  def CreateScreenshot(
    engine: typings.babylonjs.engineMod.Engine,
    camera: typings.babylonjs.cameraMod.Camera,
    size: IScreenshotSize,
    successCallback: js.Function1[/* data */ String, Unit]
  ): Unit = js.native
  def CreateScreenshot(
    engine: typings.babylonjs.engineMod.Engine,
    camera: typings.babylonjs.cameraMod.Camera,
    size: IScreenshotSize,
    successCallback: js.Function1[/* data */ String, Unit],
    mimeType: String
  ): Unit = js.native
  
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
  def CreateScreenshotAsync(
    engine: typings.babylonjs.engineMod.Engine,
    camera: typings.babylonjs.cameraMod.Camera,
    size: js.Any
  ): js.Promise[String] = js.native
  def CreateScreenshotAsync(
    engine: typings.babylonjs.engineMod.Engine,
    camera: typings.babylonjs.cameraMod.Camera,
    size: js.Any,
    mimeType: String
  ): js.Promise[String] = js.native
  
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
    * @param renderSprites Whether the sprites should be rendered or not (default: false)
    * @param enableStencilBuffer Whether the stencil buffer should be enabled or not (default: false)
    */
  def CreateScreenshotUsingRenderTarget(
    engine: typings.babylonjs.engineMod.Engine,
    camera: typings.babylonjs.cameraMod.Camera,
    size: IScreenshotSize | Double,
    successCallback: js.UndefOr[js.Function1[/* data */ String, Unit]],
    mimeType: js.UndefOr[String],
    samples: js.UndefOr[Double],
    antialiasing: js.UndefOr[Boolean],
    fileName: js.UndefOr[String],
    renderSprites: js.UndefOr[Boolean],
    enableStencilBuffer: js.UndefOr[Boolean]
  ): Unit = js.native
  
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
    * @param renderSprites Whether the sprites should be rendered or not (default: false)
    * @returns screenshot as a string of base64-encoded characters. This string can be assigned
    * to the src parameter of an <img> to display it
    */
  def CreateScreenshotUsingRenderTargetAsync(
    engine: typings.babylonjs.engineMod.Engine,
    camera: typings.babylonjs.cameraMod.Camera,
    size: js.Any
  ): js.Promise[String] = js.native
  def CreateScreenshotUsingRenderTargetAsync(
    engine: typings.babylonjs.engineMod.Engine,
    camera: typings.babylonjs.cameraMod.Camera,
    size: js.Any,
    mimeType: js.UndefOr[scala.Nothing],
    samples: js.UndefOr[scala.Nothing],
    antialiasing: js.UndefOr[scala.Nothing],
    fileName: js.UndefOr[scala.Nothing],
    renderSprites: Boolean
  ): js.Promise[String] = js.native
  def CreateScreenshotUsingRenderTargetAsync(
    engine: typings.babylonjs.engineMod.Engine,
    camera: typings.babylonjs.cameraMod.Camera,
    size: js.Any,
    mimeType: js.UndefOr[scala.Nothing],
    samples: js.UndefOr[scala.Nothing],
    antialiasing: js.UndefOr[scala.Nothing],
    fileName: String
  ): js.Promise[String] = js.native
  def CreateScreenshotUsingRenderTargetAsync(
    engine: typings.babylonjs.engineMod.Engine,
    camera: typings.babylonjs.cameraMod.Camera,
    size: js.Any,
    mimeType: js.UndefOr[scala.Nothing],
    samples: js.UndefOr[scala.Nothing],
    antialiasing: js.UndefOr[scala.Nothing],
    fileName: String,
    renderSprites: Boolean
  ): js.Promise[String] = js.native
  def CreateScreenshotUsingRenderTargetAsync(
    engine: typings.babylonjs.engineMod.Engine,
    camera: typings.babylonjs.cameraMod.Camera,
    size: js.Any,
    mimeType: js.UndefOr[scala.Nothing],
    samples: js.UndefOr[scala.Nothing],
    antialiasing: Boolean
  ): js.Promise[String] = js.native
  def CreateScreenshotUsingRenderTargetAsync(
    engine: typings.babylonjs.engineMod.Engine,
    camera: typings.babylonjs.cameraMod.Camera,
    size: js.Any,
    mimeType: js.UndefOr[scala.Nothing],
    samples: js.UndefOr[scala.Nothing],
    antialiasing: Boolean,
    fileName: js.UndefOr[scala.Nothing],
    renderSprites: Boolean
  ): js.Promise[String] = js.native
  def CreateScreenshotUsingRenderTargetAsync(
    engine: typings.babylonjs.engineMod.Engine,
    camera: typings.babylonjs.cameraMod.Camera,
    size: js.Any,
    mimeType: js.UndefOr[scala.Nothing],
    samples: js.UndefOr[scala.Nothing],
    antialiasing: Boolean,
    fileName: String
  ): js.Promise[String] = js.native
  def CreateScreenshotUsingRenderTargetAsync(
    engine: typings.babylonjs.engineMod.Engine,
    camera: typings.babylonjs.cameraMod.Camera,
    size: js.Any,
    mimeType: js.UndefOr[scala.Nothing],
    samples: js.UndefOr[scala.Nothing],
    antialiasing: Boolean,
    fileName: String,
    renderSprites: Boolean
  ): js.Promise[String] = js.native
  def CreateScreenshotUsingRenderTargetAsync(
    engine: typings.babylonjs.engineMod.Engine,
    camera: typings.babylonjs.cameraMod.Camera,
    size: js.Any,
    mimeType: js.UndefOr[scala.Nothing],
    samples: Double
  ): js.Promise[String] = js.native
  def CreateScreenshotUsingRenderTargetAsync(
    engine: typings.babylonjs.engineMod.Engine,
    camera: typings.babylonjs.cameraMod.Camera,
    size: js.Any,
    mimeType: js.UndefOr[scala.Nothing],
    samples: Double,
    antialiasing: js.UndefOr[scala.Nothing],
    fileName: js.UndefOr[scala.Nothing],
    renderSprites: Boolean
  ): js.Promise[String] = js.native
  def CreateScreenshotUsingRenderTargetAsync(
    engine: typings.babylonjs.engineMod.Engine,
    camera: typings.babylonjs.cameraMod.Camera,
    size: js.Any,
    mimeType: js.UndefOr[scala.Nothing],
    samples: Double,
    antialiasing: js.UndefOr[scala.Nothing],
    fileName: String
  ): js.Promise[String] = js.native
  def CreateScreenshotUsingRenderTargetAsync(
    engine: typings.babylonjs.engineMod.Engine,
    camera: typings.babylonjs.cameraMod.Camera,
    size: js.Any,
    mimeType: js.UndefOr[scala.Nothing],
    samples: Double,
    antialiasing: js.UndefOr[scala.Nothing],
    fileName: String,
    renderSprites: Boolean
  ): js.Promise[String] = js.native
  def CreateScreenshotUsingRenderTargetAsync(
    engine: typings.babylonjs.engineMod.Engine,
    camera: typings.babylonjs.cameraMod.Camera,
    size: js.Any,
    mimeType: js.UndefOr[scala.Nothing],
    samples: Double,
    antialiasing: Boolean
  ): js.Promise[String] = js.native
  def CreateScreenshotUsingRenderTargetAsync(
    engine: typings.babylonjs.engineMod.Engine,
    camera: typings.babylonjs.cameraMod.Camera,
    size: js.Any,
    mimeType: js.UndefOr[scala.Nothing],
    samples: Double,
    antialiasing: Boolean,
    fileName: js.UndefOr[scala.Nothing],
    renderSprites: Boolean
  ): js.Promise[String] = js.native
  def CreateScreenshotUsingRenderTargetAsync(
    engine: typings.babylonjs.engineMod.Engine,
    camera: typings.babylonjs.cameraMod.Camera,
    size: js.Any,
    mimeType: js.UndefOr[scala.Nothing],
    samples: Double,
    antialiasing: Boolean,
    fileName: String
  ): js.Promise[String] = js.native
  def CreateScreenshotUsingRenderTargetAsync(
    engine: typings.babylonjs.engineMod.Engine,
    camera: typings.babylonjs.cameraMod.Camera,
    size: js.Any,
    mimeType: js.UndefOr[scala.Nothing],
    samples: Double,
    antialiasing: Boolean,
    fileName: String,
    renderSprites: Boolean
  ): js.Promise[String] = js.native
  def CreateScreenshotUsingRenderTargetAsync(
    engine: typings.babylonjs.engineMod.Engine,
    camera: typings.babylonjs.cameraMod.Camera,
    size: js.Any,
    mimeType: String
  ): js.Promise[String] = js.native
  def CreateScreenshotUsingRenderTargetAsync(
    engine: typings.babylonjs.engineMod.Engine,
    camera: typings.babylonjs.cameraMod.Camera,
    size: js.Any,
    mimeType: String,
    samples: js.UndefOr[scala.Nothing],
    antialiasing: js.UndefOr[scala.Nothing],
    fileName: js.UndefOr[scala.Nothing],
    renderSprites: Boolean
  ): js.Promise[String] = js.native
  def CreateScreenshotUsingRenderTargetAsync(
    engine: typings.babylonjs.engineMod.Engine,
    camera: typings.babylonjs.cameraMod.Camera,
    size: js.Any,
    mimeType: String,
    samples: js.UndefOr[scala.Nothing],
    antialiasing: js.UndefOr[scala.Nothing],
    fileName: String
  ): js.Promise[String] = js.native
  def CreateScreenshotUsingRenderTargetAsync(
    engine: typings.babylonjs.engineMod.Engine,
    camera: typings.babylonjs.cameraMod.Camera,
    size: js.Any,
    mimeType: String,
    samples: js.UndefOr[scala.Nothing],
    antialiasing: js.UndefOr[scala.Nothing],
    fileName: String,
    renderSprites: Boolean
  ): js.Promise[String] = js.native
  def CreateScreenshotUsingRenderTargetAsync(
    engine: typings.babylonjs.engineMod.Engine,
    camera: typings.babylonjs.cameraMod.Camera,
    size: js.Any,
    mimeType: String,
    samples: js.UndefOr[scala.Nothing],
    antialiasing: Boolean
  ): js.Promise[String] = js.native
  def CreateScreenshotUsingRenderTargetAsync(
    engine: typings.babylonjs.engineMod.Engine,
    camera: typings.babylonjs.cameraMod.Camera,
    size: js.Any,
    mimeType: String,
    samples: js.UndefOr[scala.Nothing],
    antialiasing: Boolean,
    fileName: js.UndefOr[scala.Nothing],
    renderSprites: Boolean
  ): js.Promise[String] = js.native
  def CreateScreenshotUsingRenderTargetAsync(
    engine: typings.babylonjs.engineMod.Engine,
    camera: typings.babylonjs.cameraMod.Camera,
    size: js.Any,
    mimeType: String,
    samples: js.UndefOr[scala.Nothing],
    antialiasing: Boolean,
    fileName: String
  ): js.Promise[String] = js.native
  def CreateScreenshotUsingRenderTargetAsync(
    engine: typings.babylonjs.engineMod.Engine,
    camera: typings.babylonjs.cameraMod.Camera,
    size: js.Any,
    mimeType: String,
    samples: js.UndefOr[scala.Nothing],
    antialiasing: Boolean,
    fileName: String,
    renderSprites: Boolean
  ): js.Promise[String] = js.native
  def CreateScreenshotUsingRenderTargetAsync(
    engine: typings.babylonjs.engineMod.Engine,
    camera: typings.babylonjs.cameraMod.Camera,
    size: js.Any,
    mimeType: String,
    samples: Double
  ): js.Promise[String] = js.native
  def CreateScreenshotUsingRenderTargetAsync(
    engine: typings.babylonjs.engineMod.Engine,
    camera: typings.babylonjs.cameraMod.Camera,
    size: js.Any,
    mimeType: String,
    samples: Double,
    antialiasing: js.UndefOr[scala.Nothing],
    fileName: js.UndefOr[scala.Nothing],
    renderSprites: Boolean
  ): js.Promise[String] = js.native
  def CreateScreenshotUsingRenderTargetAsync(
    engine: typings.babylonjs.engineMod.Engine,
    camera: typings.babylonjs.cameraMod.Camera,
    size: js.Any,
    mimeType: String,
    samples: Double,
    antialiasing: js.UndefOr[scala.Nothing],
    fileName: String
  ): js.Promise[String] = js.native
  def CreateScreenshotUsingRenderTargetAsync(
    engine: typings.babylonjs.engineMod.Engine,
    camera: typings.babylonjs.cameraMod.Camera,
    size: js.Any,
    mimeType: String,
    samples: Double,
    antialiasing: js.UndefOr[scala.Nothing],
    fileName: String,
    renderSprites: Boolean
  ): js.Promise[String] = js.native
  def CreateScreenshotUsingRenderTargetAsync(
    engine: typings.babylonjs.engineMod.Engine,
    camera: typings.babylonjs.cameraMod.Camera,
    size: js.Any,
    mimeType: String,
    samples: Double,
    antialiasing: Boolean
  ): js.Promise[String] = js.native
  def CreateScreenshotUsingRenderTargetAsync(
    engine: typings.babylonjs.engineMod.Engine,
    camera: typings.babylonjs.cameraMod.Camera,
    size: js.Any,
    mimeType: String,
    samples: Double,
    antialiasing: Boolean,
    fileName: js.UndefOr[scala.Nothing],
    renderSprites: Boolean
  ): js.Promise[String] = js.native
  def CreateScreenshotUsingRenderTargetAsync(
    engine: typings.babylonjs.engineMod.Engine,
    camera: typings.babylonjs.cameraMod.Camera,
    size: js.Any,
    mimeType: String,
    samples: Double,
    antialiasing: Boolean,
    fileName: String
  ): js.Promise[String] = js.native
  def CreateScreenshotUsingRenderTargetAsync(
    engine: typings.babylonjs.engineMod.Engine,
    camera: typings.babylonjs.cameraMod.Camera,
    size: js.Any,
    mimeType: String,
    samples: Double,
    antialiasing: Boolean,
    fileName: String,
    renderSprites: Boolean
  ): js.Promise[String] = js.native
  
  /**
    * Gets height and width for screenshot size
    * @private
    */
  var _getScreenshotSize: js.Any = js.native
}
