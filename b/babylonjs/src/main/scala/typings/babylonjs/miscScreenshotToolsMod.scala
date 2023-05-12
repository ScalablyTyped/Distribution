package typings.babylonjs

import typings.babylonjs.camerasCameraMod.Camera
import typings.babylonjs.enginesEngineMod.Engine
import typings.babylonjs.miscInterfacesScreenshotSizeMod.IScreenshotSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object miscScreenshotToolsMod {
  
  @JSImport("babylonjs/Misc/screenshotTools", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  inline def CreateScreenshot(
    engine: Engine,
    camera: Camera,
    size: Double,
    successCallback: js.Function1[/* data */ String, Unit],
    mimeType: String,
    forceDownload: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshot")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], forceDownload.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def CreateScreenshot(
    engine: Engine,
    camera: Camera,
    size: Double,
    successCallback: js.Function1[/* data */ String, Unit],
    mimeType: Unit,
    forceDownload: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshot")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], forceDownload.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def CreateScreenshot(engine: Engine, camera: Camera, size: Double, successCallback: Unit, mimeType: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshot")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def CreateScreenshot(
    engine: Engine,
    camera: Camera,
    size: Double,
    successCallback: Unit,
    mimeType: String,
    forceDownload: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshot")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], forceDownload.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def CreateScreenshot(
    engine: Engine,
    camera: Camera,
    size: Double,
    successCallback: Unit,
    mimeType: Unit,
    forceDownload: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshot")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], forceDownload.asInstanceOf[js.Any])).asInstanceOf[Unit]
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
  inline def CreateScreenshot(
    engine: Engine,
    camera: Camera,
    size: IScreenshotSize,
    successCallback: js.Function1[/* data */ String, Unit],
    mimeType: String,
    forceDownload: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshot")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], forceDownload.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def CreateScreenshot(
    engine: Engine,
    camera: Camera,
    size: IScreenshotSize,
    successCallback: js.Function1[/* data */ String, Unit],
    mimeType: Unit,
    forceDownload: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshot")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], forceDownload.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def CreateScreenshot(engine: Engine, camera: Camera, size: IScreenshotSize, successCallback: Unit, mimeType: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshot")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def CreateScreenshot(
    engine: Engine,
    camera: Camera,
    size: IScreenshotSize,
    successCallback: Unit,
    mimeType: String,
    forceDownload: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshot")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], forceDownload.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def CreateScreenshot(
    engine: Engine,
    camera: Camera,
    size: IScreenshotSize,
    successCallback: Unit,
    mimeType: Unit,
    forceDownload: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshot")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], forceDownload.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def CreateScreenshotAsync(engine: Engine, camera: Camera, size: Double): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def CreateScreenshotAsync(engine: Engine, camera: Camera, size: Double, mimeType: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def CreateScreenshotAsync(engine: Engine, camera: Camera, size: IScreenshotSize): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def CreateScreenshotAsync(engine: Engine, camera: Camera, size: IScreenshotSize, mimeType: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def CreateScreenshotUsingRenderTarget(
    engine: Engine,
    camera: Camera,
    size: IScreenshotSize | Double,
    successCallback: js.UndefOr[js.Function1[/* data */ String, Unit]],
    mimeType: js.UndefOr[String],
    samples: js.UndefOr[Double],
    antialiasing: js.UndefOr[Boolean],
    fileName: js.UndefOr[String],
    renderSprites: js.UndefOr[Boolean],
    enableStencilBuffer: js.UndefOr[Boolean],
    useLayerMask: js.UndefOr[Boolean]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotUsingRenderTarget")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], samples.asInstanceOf[js.Any], antialiasing.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], renderSprites.asInstanceOf[js.Any], enableStencilBuffer.asInstanceOf[js.Any], useLayerMask.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def CreateScreenshotUsingRenderTargetAsync(
    engine: Engine,
    camera: Camera,
    size: IScreenshotSize | Double,
    mimeType: js.UndefOr[String],
    samples: js.UndefOr[Double],
    antialiasing: js.UndefOr[Boolean],
    fileName: js.UndefOr[String],
    renderSprites: js.UndefOr[Boolean],
    enableStencilBuffer: js.UndefOr[Boolean],
    useLayerMask: js.UndefOr[Boolean]
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotUsingRenderTargetAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], samples.asInstanceOf[js.Any], antialiasing.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], renderSprites.asInstanceOf[js.Any], enableStencilBuffer.asInstanceOf[js.Any], useLayerMask.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def CreateScreenshotWithResizeAsync(engine: Engine, camera: Camera, width: Double, height: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotWithResizeAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def CreateScreenshotWithResizeAsync(engine: Engine, camera: Camera, width: Double, height: Double, mimeType: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotWithResizeAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  object ScreenshotTools {
    
    @JSImport("babylonjs/Misc/screenshotTools", "ScreenshotTools")
    @js.native
    val ^ : js.Any = js.native
    
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
      * @param forceDownload force the system to download the image even if a successCallback is provided
      */
    @JSImport("babylonjs/Misc/screenshotTools", "ScreenshotTools.CreateScreenshot")
    @js.native
    def CreateScreenshot: js.Function6[
        /* engine */ Engine, 
        /* camera */ Camera, 
        /* size */ IScreenshotSize | Double, 
        /* successCallback */ js.UndefOr[js.Function1[/* data */ String, Unit]], 
        /* mimeType */ js.UndefOr[String], 
        /* forceDownload */ js.UndefOr[Boolean], 
        Unit
      ] = js.native
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
    inline def CreateScreenshot(
      engine: Engine,
      camera: Camera,
      size: Double,
      successCallback: js.Function1[/* data */ String, Unit],
      mimeType: String,
      forceDownload: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshot")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], forceDownload.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def CreateScreenshot(
      engine: Engine,
      camera: Camera,
      size: Double,
      successCallback: js.Function1[/* data */ String, Unit],
      mimeType: Unit,
      forceDownload: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshot")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], forceDownload.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def CreateScreenshot(engine: Engine, camera: Camera, size: Double, successCallback: Unit, mimeType: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshot")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def CreateScreenshot(
      engine: Engine,
      camera: Camera,
      size: Double,
      successCallback: Unit,
      mimeType: String,
      forceDownload: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshot")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], forceDownload.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def CreateScreenshot(
      engine: Engine,
      camera: Camera,
      size: Double,
      successCallback: Unit,
      mimeType: Unit,
      forceDownload: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshot")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], forceDownload.asInstanceOf[js.Any])).asInstanceOf[Unit]
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
      * @param forceDownload force the system to download the image even if a successCallback is provided
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
    inline def CreateScreenshot(
      engine: Engine,
      camera: Camera,
      size: IScreenshotSize,
      successCallback: js.Function1[/* data */ String, Unit],
      mimeType: String,
      forceDownload: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshot")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], forceDownload.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def CreateScreenshot(
      engine: Engine,
      camera: Camera,
      size: IScreenshotSize,
      successCallback: js.Function1[/* data */ String, Unit],
      mimeType: Unit,
      forceDownload: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshot")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], forceDownload.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def CreateScreenshot(engine: Engine, camera: Camera, size: IScreenshotSize, successCallback: Unit, mimeType: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshot")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def CreateScreenshot(
      engine: Engine,
      camera: Camera,
      size: IScreenshotSize,
      successCallback: Unit,
      mimeType: String,
      forceDownload: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshot")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], forceDownload.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def CreateScreenshot(
      engine: Engine,
      camera: Camera,
      size: IScreenshotSize,
      successCallback: Unit,
      mimeType: Unit,
      forceDownload: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshot")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], forceDownload.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
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
    @JSImport("babylonjs/Misc/screenshotTools", "ScreenshotTools.CreateScreenshotAsync")
    @js.native
    def CreateScreenshotAsync: js.Function4[
        /* engine */ Engine, 
        /* camera */ Camera, 
        /* size */ IScreenshotSize | Double, 
        /* mimeType */ js.UndefOr[String], 
        js.Promise[String]
      ] = js.native
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
    inline def CreateScreenshotAsync_=(
      x: js.Function4[
          /* engine */ Engine, 
          /* camera */ Camera, 
          /* size */ IScreenshotSize | Double, 
          /* mimeType */ js.UndefOr[String], 
          js.Promise[String]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateScreenshotAsync")(x.asInstanceOf[js.Any])
    
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
      * @param renderSprites Whether the sprites should be rendered or not (default: false)
      * @param enableStencilBuffer Whether the stencil buffer should be enabled or not (default: false)
      */
    @JSImport("babylonjs/Misc/screenshotTools", "ScreenshotTools.CreateScreenshotUsingRenderTarget")
    @js.native
    def CreateScreenshotUsingRenderTarget: js.Function11[
        /* engine */ Engine, 
        /* camera */ Camera, 
        /* size */ IScreenshotSize | Double, 
        /* successCallback */ js.UndefOr[js.Function1[/* data */ String, Unit]], 
        /* mimeType */ js.UndefOr[String], 
        /* samples */ js.UndefOr[Double], 
        /* antialiasing */ js.UndefOr[Boolean], 
        /* fileName */ js.UndefOr[String], 
        /* renderSprites */ js.UndefOr[Boolean], 
        /* enableStencilBuffer */ js.UndefOr[Boolean], 
        /* useLayerMask */ js.UndefOr[Boolean], 
        Unit
      ] = js.native
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
      * @param renderSprites Whether the sprites should be rendered or not (default: false)
      * @param enableStencilBuffer Whether the stencil buffer should be enabled or not (default: false)
      */
    inline def CreateScreenshotUsingRenderTarget(
      engine: Engine,
      camera: Camera,
      size: IScreenshotSize | Double,
      successCallback: js.UndefOr[js.Function1[/* data */ String, Unit]],
      mimeType: js.UndefOr[String],
      samples: js.UndefOr[Double],
      antialiasing: js.UndefOr[Boolean],
      fileName: js.UndefOr[String],
      renderSprites: js.UndefOr[Boolean],
      enableStencilBuffer: js.UndefOr[Boolean],
      useLayerMask: js.UndefOr[Boolean]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotUsingRenderTarget")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], samples.asInstanceOf[js.Any], antialiasing.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], renderSprites.asInstanceOf[js.Any], enableStencilBuffer.asInstanceOf[js.Any], useLayerMask.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
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
      * @param renderSprites Whether the sprites should be rendered or not (default: false)
      * @returns screenshot as a string of base64-encoded characters. This string can be assigned
      * to the src parameter of an <img> to display it
      */
    @JSImport("babylonjs/Misc/screenshotTools", "ScreenshotTools.CreateScreenshotUsingRenderTargetAsync")
    @js.native
    def CreateScreenshotUsingRenderTargetAsync: js.Function10[
        /* engine */ Engine, 
        /* camera */ Camera, 
        /* size */ IScreenshotSize | Double, 
        /* mimeType */ js.UndefOr[String], 
        /* samples */ js.UndefOr[Double], 
        /* antialiasing */ js.UndefOr[Boolean], 
        /* fileName */ js.UndefOr[String], 
        /* renderSprites */ js.UndefOr[Boolean], 
        /* enableStencilBuffer */ js.UndefOr[Boolean], 
        /* useLayerMask */ js.UndefOr[Boolean], 
        js.Promise[String]
      ] = js.native
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
      * @param renderSprites Whether the sprites should be rendered or not (default: false)
      * @returns screenshot as a string of base64-encoded characters. This string can be assigned
      * to the src parameter of an <img> to display it
      */
    inline def CreateScreenshotUsingRenderTargetAsync(
      engine: Engine,
      camera: Camera,
      size: IScreenshotSize | Double,
      mimeType: js.UndefOr[String],
      samples: js.UndefOr[Double],
      antialiasing: js.UndefOr[Boolean],
      fileName: js.UndefOr[String],
      renderSprites: js.UndefOr[Boolean],
      enableStencilBuffer: js.UndefOr[Boolean],
      useLayerMask: js.UndefOr[Boolean]
    ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotUsingRenderTargetAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], samples.asInstanceOf[js.Any], antialiasing.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], renderSprites.asInstanceOf[js.Any], enableStencilBuffer.asInstanceOf[js.Any], useLayerMask.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def CreateScreenshotUsingRenderTargetAsync_=(
      x: js.Function10[
          /* engine */ Engine, 
          /* camera */ Camera, 
          /* size */ IScreenshotSize | Double, 
          /* mimeType */ js.UndefOr[String], 
          /* samples */ js.UndefOr[Double], 
          /* antialiasing */ js.UndefOr[Boolean], 
          /* fileName */ js.UndefOr[String], 
          /* renderSprites */ js.UndefOr[Boolean], 
          /* enableStencilBuffer */ js.UndefOr[Boolean], 
          /* useLayerMask */ js.UndefOr[Boolean], 
          js.Promise[String]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateScreenshotUsingRenderTargetAsync")(x.asInstanceOf[js.Any])
    
    inline def CreateScreenshotUsingRenderTarget_=(
      x: js.Function11[
          /* engine */ Engine, 
          /* camera */ Camera, 
          /* size */ IScreenshotSize | Double, 
          /* successCallback */ js.UndefOr[js.Function1[/* data */ String, Unit]], 
          /* mimeType */ js.UndefOr[String], 
          /* samples */ js.UndefOr[Double], 
          /* antialiasing */ js.UndefOr[Boolean], 
          /* fileName */ js.UndefOr[String], 
          /* renderSprites */ js.UndefOr[Boolean], 
          /* enableStencilBuffer */ js.UndefOr[Boolean], 
          /* useLayerMask */ js.UndefOr[Boolean], 
          Unit
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateScreenshotUsingRenderTarget")(x.asInstanceOf[js.Any])
    
    /**
      * Captures a screenshot of the current rendering for a specific size. This will render the entire canvas but will generate a blink (due to canvas resize)
      * @see https://doc.babylonjs.com/features/featuresDeepDive/scene/renderToPNG
      * @param engine defines the rendering engine
      * @param camera defines the source camera
      * @param width defines the expected width
      * @param height defines the expected height
      * @param mimeType defines the MIME type of the screenshot image (default: image/png).
      * Check your browser for supported MIME types
      * @returns screenshot as a string of base64-encoded characters. This string can be assigned
      * to the src parameter of an <img> to display it
      */
    @JSImport("babylonjs/Misc/screenshotTools", "ScreenshotTools.CreateScreenshotWithResizeAsync")
    @js.native
    def CreateScreenshotWithResizeAsync: js.Function5[
        /* engine */ Engine, 
        /* camera */ Camera, 
        /* width */ Double, 
        /* height */ Double, 
        /* mimeType */ js.UndefOr[String], 
        js.Promise[Unit]
      ] = js.native
    /**
      * Captures a screenshot of the current rendering for a specific size. This will render the entire canvas but will generate a blink (due to canvas resize)
      * @see https://doc.babylonjs.com/features/featuresDeepDive/scene/renderToPNG
      * @param engine defines the rendering engine
      * @param camera defines the source camera
      * @param width defines the expected width
      * @param height defines the expected height
      * @param mimeType defines the MIME type of the screenshot image (default: image/png).
      * Check your browser for supported MIME types
      * @returns screenshot as a string of base64-encoded characters. This string can be assigned
      * to the src parameter of an <img> to display it
      */
    inline def CreateScreenshotWithResizeAsync(engine: Engine, camera: Camera, width: Double, height: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotWithResizeAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def CreateScreenshotWithResizeAsync(engine: Engine, camera: Camera, width: Double, height: Double, mimeType: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotWithResizeAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def CreateScreenshotWithResizeAsync_=(
      x: js.Function5[
          /* engine */ Engine, 
          /* camera */ Camera, 
          /* width */ Double, 
          /* height */ Double, 
          /* mimeType */ js.UndefOr[String], 
          js.Promise[Unit]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateScreenshotWithResizeAsync")(x.asInstanceOf[js.Any])
    
    inline def CreateScreenshot_=(
      x: js.Function6[
          /* engine */ Engine, 
          /* camera */ Camera, 
          /* size */ IScreenshotSize | Double, 
          /* successCallback */ js.UndefOr[js.Function1[/* data */ String, Unit]], 
          /* mimeType */ js.UndefOr[String], 
          /* forceDownload */ js.UndefOr[Boolean], 
          Unit
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateScreenshot")(x.asInstanceOf[js.Any])
  }
}
