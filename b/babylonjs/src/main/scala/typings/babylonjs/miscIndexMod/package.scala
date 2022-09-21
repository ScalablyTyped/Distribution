package typings.babylonjs.miscIndexMod

import typings.babylonjs.anon.BaseUrl
import typings.babylonjs.anon.CrossOrigin
import typings.babylonjs.anon.Match
import typings.babylonjs.baseTextureMod.BaseTexture
import typings.babylonjs.basisMod.TranscodeResult
import typings.babylonjs.cameraMod.Camera
import typings.babylonjs.coroutineMod.AsyncCoroutine
import typings.babylonjs.coroutineMod.Coroutine
import typings.babylonjs.coroutineMod.CoroutineScheduler
import typings.babylonjs.coroutineMod.CoroutineStep
import typings.babylonjs.engineMod.Engine
import typings.babylonjs.environmentTextureToolsMod.CreateEnvTextureOptions
import typings.babylonjs.environmentTextureToolsMod.EnvironmentTextureInfo
import typings.babylonjs.environmentTextureToolsMod.EnvironmentTextureInfoV2
import typings.babylonjs.fileRequestMod.IFileRequest
import typings.babylonjs.internalTextureMod.InternalTexture
import typings.babylonjs.iofflineproviderMod.IOfflineProvider
import typings.babylonjs.mathSizeMod.ISize
import typings.babylonjs.miscIndexMod.^
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.screenshotSizeMod.IScreenshotSize
import typings.babylonjs.sphericalPolynomialMod.SphericalPolynomial
import typings.babylonjs.textureMod.Texture
import typings.babylonjs.timerMod.ITimerOptions
import typings.babylonjs.typesMod.Nullable
import typings.std.AbortSignal
import typings.std.Blob
import typings.std.EventTarget
import typings.std.File
import typings.std.HTMLElement
import typings.std.HTMLImageElement
import typings.std.ImageBitmap
import typings.std.ImageBitmapOptions
import typings.std.ProgressEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def ApplyPostProcess(postProcessName: String, internalTexture: InternalTexture, scene: Scene): js.Promise[InternalTexture] = (^.asInstanceOf[js.Dynamic].applyDynamic("ApplyPostProcess")(postProcessName.asInstanceOf[js.Any], internalTexture.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[js.Promise[InternalTexture]]
inline def ApplyPostProcess(postProcessName: String, internalTexture: InternalTexture, scene: Scene, `type`: Double): js.Promise[InternalTexture] = (^.asInstanceOf[js.Dynamic].applyDynamic("ApplyPostProcess")(postProcessName.asInstanceOf[js.Any], internalTexture.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[InternalTexture]]
inline def ApplyPostProcess(
  postProcessName: String,
  internalTexture: InternalTexture,
  scene: Scene,
  `type`: Double,
  samplingMode: Double
): js.Promise[InternalTexture] = (^.asInstanceOf[js.Dynamic].applyDynamic("ApplyPostProcess")(postProcessName.asInstanceOf[js.Any], internalTexture.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[InternalTexture]]
inline def ApplyPostProcess(
  postProcessName: String,
  internalTexture: InternalTexture,
  scene: Scene,
  `type`: Double,
  samplingMode: Double,
  format: Double
): js.Promise[InternalTexture] = (^.asInstanceOf[js.Dynamic].applyDynamic("ApplyPostProcess")(postProcessName.asInstanceOf[js.Any], internalTexture.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[js.Promise[InternalTexture]]
inline def ApplyPostProcess(
  postProcessName: String,
  internalTexture: InternalTexture,
  scene: Scene,
  `type`: Double,
  samplingMode: Unit,
  format: Double
): js.Promise[InternalTexture] = (^.asInstanceOf[js.Dynamic].applyDynamic("ApplyPostProcess")(postProcessName.asInstanceOf[js.Any], internalTexture.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[js.Promise[InternalTexture]]
inline def ApplyPostProcess(
  postProcessName: String,
  internalTexture: InternalTexture,
  scene: Scene,
  `type`: Unit,
  samplingMode: Double
): js.Promise[InternalTexture] = (^.asInstanceOf[js.Dynamic].applyDynamic("ApplyPostProcess")(postProcessName.asInstanceOf[js.Any], internalTexture.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[InternalTexture]]
inline def ApplyPostProcess(
  postProcessName: String,
  internalTexture: InternalTexture,
  scene: Scene,
  `type`: Unit,
  samplingMode: Double,
  format: Double
): js.Promise[InternalTexture] = (^.asInstanceOf[js.Dynamic].applyDynamic("ApplyPostProcess")(postProcessName.asInstanceOf[js.Any], internalTexture.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[js.Promise[InternalTexture]]
inline def ApplyPostProcess(
  postProcessName: String,
  internalTexture: InternalTexture,
  scene: Scene,
  `type`: Unit,
  samplingMode: Unit,
  format: Double
): js.Promise[InternalTexture] = (^.asInstanceOf[js.Dynamic].applyDynamic("ApplyPostProcess")(postProcessName.asInstanceOf[js.Any], internalTexture.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[js.Promise[InternalTexture]]

inline def CreateEnvTextureAsync(texture: BaseTexture): js.Promise[js.typedarray.ArrayBuffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateEnvTextureAsync")(texture.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.typedarray.ArrayBuffer]]
inline def CreateEnvTextureAsync(texture: BaseTexture, options: CreateEnvTextureOptions): js.Promise[js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateEnvTextureAsync")(texture.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.ArrayBuffer]]

inline def CreateImageDataArrayBufferViews(data: js.typedarray.ArrayBufferView, info: EnvironmentTextureInfo): js.Array[js.Array[js.typedarray.ArrayBufferView]] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateImageDataArrayBufferViews")(data.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[js.typedarray.ArrayBufferView]]]

inline def CreateResizedCopy(texture: Texture, width: Double, height: Double): Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateResizedCopy")(texture.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Texture]
inline def CreateResizedCopy(texture: Texture, width: Double, height: Double, useBilinearMode: Boolean): Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateResizedCopy")(texture.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], useBilinearMode.asInstanceOf[js.Any])).asInstanceOf[Texture]

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
  enableStencilBuffer: js.UndefOr[Boolean]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotUsingRenderTarget")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], samples.asInstanceOf[js.Any], antialiasing.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], renderSprites.asInstanceOf[js.Any], enableStencilBuffer.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def CreateScreenshotUsingRenderTargetAsync(
  engine: Engine,
  camera: Camera,
  size: IScreenshotSize | Double,
  mimeType: js.UndefOr[String],
  samples: js.UndefOr[Double],
  antialiasing: js.UndefOr[Boolean],
  fileName: js.UndefOr[String],
  renderSprites: js.UndefOr[Boolean]
): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotUsingRenderTargetAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], samples.asInstanceOf[js.Any], antialiasing.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], renderSprites.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]

inline def CreateScreenshotWithResizeAsync(engine: Engine, camera: Camera, width: Double, height: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotWithResizeAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def CreateScreenshotWithResizeAsync(engine: Engine, camera: Camera, width: Double, height: Double, mimeType: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotWithResizeAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]

inline def Decode(buffer: js.typedarray.Uint16Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("Decode")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
inline def Decode(buffer: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("Decode")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]

inline def DecodeBase64ToBinary(base64Data: String): js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("DecodeBase64ToBinary")(base64Data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBuffer]

inline def DecodeBase64ToString(base64Data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("DecodeBase64ToString")(base64Data.asInstanceOf[js.Any]).asInstanceOf[String]

inline def DecodeBase64UrlToBinary(uri: String): js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("DecodeBase64UrlToBinary")(uri.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBuffer]

inline def DecodeBase64UrlToString(uri: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("DecodeBase64UrlToString")(uri.asInstanceOf[js.Any]).asInstanceOf[String]

inline def EncodeArrayBufferToBase64(buffer: js.typedarray.ArrayBuffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("EncodeArrayBufferToBase64")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
inline def EncodeArrayBufferToBase64(buffer: js.typedarray.ArrayBufferView): String = ^.asInstanceOf[js.Dynamic].applyDynamic("EncodeArrayBufferToBase64")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]

inline def EndsWith(str: String, suffix: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("EndsWith")(str.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def FromHalfFloat(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("FromHalfFloat")(value.asInstanceOf[js.Any]).asInstanceOf[Double]

inline def GenerateBase64StringFromPixelData(pixels: js.typedarray.ArrayBufferView, size: ISize): Nullable[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("GenerateBase64StringFromPixelData")(pixels.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Nullable[String]]
inline def GenerateBase64StringFromPixelData(pixels: js.typedarray.ArrayBufferView, size: ISize, invertY: Boolean): Nullable[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("GenerateBase64StringFromPixelData")(pixels.asInstanceOf[js.Any], size.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any])).asInstanceOf[Nullable[String]]

inline def GenerateBase64StringFromTexture(texture: BaseTexture): Nullable[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("GenerateBase64StringFromTexture")(texture.asInstanceOf[js.Any]).asInstanceOf[Nullable[String]]
inline def GenerateBase64StringFromTexture(texture: BaseTexture, faceIndex: Double): Nullable[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("GenerateBase64StringFromTexture")(texture.asInstanceOf[js.Any], faceIndex.asInstanceOf[js.Any])).asInstanceOf[Nullable[String]]
inline def GenerateBase64StringFromTexture(texture: BaseTexture, faceIndex: Double, level: Double): Nullable[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("GenerateBase64StringFromTexture")(texture.asInstanceOf[js.Any], faceIndex.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[Nullable[String]]
inline def GenerateBase64StringFromTexture(texture: BaseTexture, faceIndex: Unit, level: Double): Nullable[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("GenerateBase64StringFromTexture")(texture.asInstanceOf[js.Any], faceIndex.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[Nullable[String]]

inline def GenerateBase64StringFromTextureAsync(texture: BaseTexture): js.Promise[Nullable[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("GenerateBase64StringFromTextureAsync")(texture.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Nullable[String]]]
inline def GenerateBase64StringFromTextureAsync(texture: BaseTexture, faceIndex: Double): js.Promise[Nullable[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("GenerateBase64StringFromTextureAsync")(texture.asInstanceOf[js.Any], faceIndex.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Nullable[String]]]
inline def GenerateBase64StringFromTextureAsync(texture: BaseTexture, faceIndex: Double, level: Double): js.Promise[Nullable[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("GenerateBase64StringFromTextureAsync")(texture.asInstanceOf[js.Any], faceIndex.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Nullable[String]]]
inline def GenerateBase64StringFromTextureAsync(texture: BaseTexture, faceIndex: Unit, level: Double): js.Promise[Nullable[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("GenerateBase64StringFromTextureAsync")(texture.asInstanceOf[js.Any], faceIndex.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Nullable[String]]]

inline def GetClass(fqdn: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("GetClass")(fqdn.asInstanceOf[js.Any]).asInstanceOf[Any]

inline def GetDOMTextContent(element: HTMLElement): String = ^.asInstanceOf[js.Dynamic].applyDynamic("GetDOMTextContent")(element.asInstanceOf[js.Any]).asInstanceOf[String]

inline def GetEnvInfo(data: js.typedarray.ArrayBufferView): Nullable[EnvironmentTextureInfoV2] = ^.asInstanceOf[js.Dynamic].applyDynamic("GetEnvInfo")(data.asInstanceOf[js.Any]).asInstanceOf[Nullable[EnvironmentTextureInfoV2]]

inline def GetEnvironmentBRDFTexture(scene: Scene): BaseTexture = ^.asInstanceOf[js.Dynamic].applyDynamic("GetEnvironmentBRDFTexture")(scene.asInstanceOf[js.Any]).asInstanceOf[BaseTexture]

inline def GetInternalFormatFromBasisFormat(basisFormat: Double, engine: Engine): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("GetInternalFormatFromBasisFormat")(basisFormat.asInstanceOf[js.Any], engine.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def GetTGAHeader(data: js.typedarray.Uint8Array): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("GetTGAHeader")(data.asInstanceOf[js.Any]).asInstanceOf[Any]

inline def IsBase64DataUrl(uri: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsBase64DataUrl")(uri.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def IsDocumentAvailable(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsDocumentAvailable")().asInstanceOf[Boolean]

inline def IsFileURL(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsFileURL")().asInstanceOf[Boolean]

inline def IsNavigatorAvailable(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsNavigatorAvailable")().asInstanceOf[Boolean]

inline def IsWindowObjectExist(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsWindowObjectExist")().asInstanceOf[Boolean]

inline def LoadFile(
  fileOrUrl: File | String,
  onSuccess: js.Function3[
  /* data */ String | js.typedarray.ArrayBuffer, 
  /* responseURL */ js.UndefOr[String], 
  /* contentType */ js.UndefOr[Nullable[String]], 
  Unit
],
  onProgress: js.UndefOr[js.Function1[/* ev */ ProgressEvent[EventTarget], Unit]],
  offlineProvider: js.UndefOr[IOfflineProvider],
  useArrayBuffer: js.UndefOr[Boolean],
  onError: js.UndefOr[
  js.Function2[
    /* request */ js.UndefOr[typings.babylonjs.webRequestMod.WebRequest], 
    /* exception */ js.UndefOr[typings.babylonjs.fileToolsMod.LoadFileError], 
    Unit
  ]
],
  onOpened: js.UndefOr[js.Function1[/* request */ typings.babylonjs.webRequestMod.WebRequest, Unit]]
): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadFile")(fileOrUrl.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onOpened.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]

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
  input: js.typedarray.ArrayBufferView,
  onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
  onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit],
  offlineProvider: Nullable[IOfflineProvider]
): Nullable[HTMLImageElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadImage")(input.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any])).asInstanceOf[Nullable[HTMLImageElement]]
inline def LoadImage(
  input: js.typedarray.ArrayBufferView,
  onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
  onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit],
  offlineProvider: Nullable[IOfflineProvider],
  mimeType: String
): Nullable[HTMLImageElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadImage")(input.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[Nullable[HTMLImageElement]]
inline def LoadImage(
  input: js.typedarray.ArrayBufferView,
  onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
  onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit],
  offlineProvider: Nullable[IOfflineProvider],
  mimeType: String,
  imageBitmapOptions: ImageBitmapOptions
): Nullable[HTMLImageElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadImage")(input.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], imageBitmapOptions.asInstanceOf[js.Any])).asInstanceOf[Nullable[HTMLImageElement]]
inline def LoadImage(
  input: js.typedarray.ArrayBufferView,
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

inline def LoadTextureFromTranscodeResult(texture: InternalTexture, transcodeResult: TranscodeResult): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadTextureFromTranscodeResult")(texture.asInstanceOf[js.Any], transcodeResult.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def PadNumber(num: Double, length: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("PadNumber")(num.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[String]

inline def RandomGUID(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("RandomGUID")().asInstanceOf[String]

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
  onError: js.Function1[/* error */ typings.babylonjs.fileToolsMod.ReadFileError, Unit]
): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("ReadFile")(file.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
inline def ReadFile(
  file: File,
  onSuccess: js.Function1[/* data */ Any, Unit],
  onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Any],
  useArrayBuffer: Unit,
  onError: js.Function1[/* error */ typings.babylonjs.fileToolsMod.ReadFileError, Unit]
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
  onError: js.Function1[/* error */ typings.babylonjs.fileToolsMod.ReadFileError, Unit]
): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("ReadFile")(file.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
inline def ReadFile(
  file: File,
  onSuccess: js.Function1[/* data */ Any, Unit],
  onProgress: Unit,
  useArrayBuffer: Unit,
  onError: js.Function1[/* error */ typings.babylonjs.fileToolsMod.ReadFileError, Unit]
): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("ReadFile")(file.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]

inline def RegisterClass(className: String, `type`: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("RegisterClass")(className.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def RequestFile(
  url: String,
  onSuccess: js.UndefOr[
  js.Function2[
    /* data */ String | js.typedarray.ArrayBuffer, 
    /* request */ js.UndefOr[typings.babylonjs.webRequestMod.WebRequest], 
    Unit
  ]
],
  onProgress: js.UndefOr[js.Function1[/* event */ ProgressEvent[EventTarget], Unit]],
  offlineProvider: js.UndefOr[IOfflineProvider],
  useArrayBuffer: js.UndefOr[Boolean],
  onError: js.UndefOr[js.Function1[/* error */ typings.babylonjs.fileToolsMod.RequestFileError, Unit]],
  onOpened: js.UndefOr[js.Function1[/* request */ typings.babylonjs.webRequestMod.WebRequest, Unit]]
): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("RequestFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onOpened.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]

inline def SetCorsBehavior(url: String, element: CrossOrigin): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("SetCorsBehavior")(url.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def SetCorsBehavior(url: js.Array[String], element: CrossOrigin): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("SetCorsBehavior")(url.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def StartsWith(str: String, suffix: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("StartsWith")(str.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def TestBase64DataUrl(uri: String): Match = ^.asInstanceOf[js.Dynamic].applyDynamic("TestBase64DataUrl")(uri.asInstanceOf[js.Any]).asInstanceOf[Match]

inline def ToHalfFloat(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("ToHalfFloat")(value.asInstanceOf[js.Any]).asInstanceOf[Double]

inline def TranscodeAsync(
  data: js.typedarray.ArrayBufferView,
  config: typings.babylonjs.basisMod.BasisTranscodeConfiguration
): js.Promise[TranscodeResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("TranscodeAsync")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TranscodeResult]]
inline def TranscodeAsync(data: js.typedarray.ArrayBuffer, config: typings.babylonjs.basisMod.BasisTranscodeConfiguration): js.Promise[TranscodeResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("TranscodeAsync")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TranscodeResult]]

inline def UpdateRGBDAsync(
  internalTexture: InternalTexture,
  data: js.Array[js.Array[js.typedarray.ArrayBufferView]],
  sphericalPolynomial: Nullable[SphericalPolynomial],
  lodScale: Double,
  lodOffset: Double
): js.Promise[InternalTexture] = (^.asInstanceOf[js.Dynamic].applyDynamic("_UpdateRGBDAsync")(internalTexture.asInstanceOf[js.Any], data.asInstanceOf[js.Any], sphericalPolynomial.asInstanceOf[js.Any], lodScale.asInstanceOf[js.Any], lodOffset.asInstanceOf[js.Any])).asInstanceOf[js.Promise[InternalTexture]]

inline def UploadContent(texture: InternalTexture, data: js.typedarray.Uint8Array): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("UploadContent")(texture.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def UploadEnvLevelsAsync(texture: InternalTexture, data: js.typedarray.ArrayBufferView, info: EnvironmentTextureInfo): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("UploadEnvLevelsAsync")(texture.asInstanceOf[js.Any], data.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]

inline def UploadEnvSpherical(texture: InternalTexture, info: EnvironmentTextureInfo): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("UploadEnvSpherical")(texture.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def UploadLevelsAsync(texture: InternalTexture, imageData: js.Array[js.Array[js.typedarray.ArrayBufferView]]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("UploadLevelsAsync")(texture.asInstanceOf[js.Any], imageData.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def UploadLevelsAsync(
  texture: InternalTexture,
  imageData: js.Array[js.Array[js.typedarray.ArrayBufferView]],
  imageType: String
): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("UploadLevelsAsync")(texture.asInstanceOf[js.Any], imageData.asInstanceOf[js.Any], imageType.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]

inline def className(name: String): js.Function1[/* target */ js.Object, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("className")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* target */ js.Object, Unit]]
inline def className(name: String, module: String): js.Function1[/* target */ js.Object, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("className")(name.asInstanceOf[js.Any], module.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* target */ js.Object, Unit]]

inline def createYieldingScheduler[T](): js.Function3[
/* coroutine */ AsyncCoroutine[T], 
/* onStep */ js.Function1[/* stepResult */ CoroutineStep[T], Unit], 
/* onError */ js.Function1[/* stepError */ Any, Unit], 
Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("createYieldingScheduler")().asInstanceOf[js.Function3[
/* coroutine */ AsyncCoroutine[T], 
/* onStep */ js.Function1[/* stepResult */ CoroutineStep[T], Unit], 
/* onError */ js.Function1[/* stepError */ Any, Unit], 
Unit]]
inline def createYieldingScheduler[T](yieldAfterMS: Double): js.Function3[
/* coroutine */ AsyncCoroutine[T], 
/* onStep */ js.Function1[/* stepResult */ CoroutineStep[T], Unit], 
/* onError */ js.Function1[/* stepError */ Any, Unit], 
Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("createYieldingScheduler")(yieldAfterMS.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
/* coroutine */ AsyncCoroutine[T], 
/* onStep */ js.Function1[/* stepResult */ CoroutineStep[T], Unit], 
/* onError */ js.Function1[/* stepError */ Any, Unit], 
Unit]]

inline def expandToProperty(callback: String): js.Function2[/* target */ Any, /* propertyKey */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("expandToProperty")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String, Unit]]
inline def expandToProperty(callback: String, targetKey: Nullable[String]): js.Function2[/* target */ Any, /* propertyKey */ String, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("expandToProperty")(callback.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String, Unit]]

inline def injectLTSFileTools(
  DecodeBase64UrlToBinary: js.Function1[/* uri */ String, js.typedarray.ArrayBuffer],
  DecodeBase64UrlToString: js.Function1[/* uri */ String, String],
  FileToolsOptions: BaseUrl,
  IsBase64DataUrl: js.Function1[/* uri */ String, Boolean],
  IsFileURL: js.Function0[Boolean],
  LoadFile: js.Function7[
  /* fileOrUrl */ String | File, 
  /* onSuccess */ js.Function2[
    /* data */ String | js.typedarray.ArrayBuffer, 
    /* responseURL */ js.UndefOr[String], 
    Unit
  ], 
  /* onProgress */ js.UndefOr[js.Function1[/* ev */ ProgressEvent[EventTarget], Unit]], 
  /* offlineProvider */ js.UndefOr[IOfflineProvider], 
  /* useArrayBuffer */ js.UndefOr[Boolean], 
  /* onError */ js.UndefOr[
    js.Function2[
      /* request */ js.UndefOr[typings.babylonjs.webRequestMod.WebRequest], 
      /* exception */ js.UndefOr[typings.babylonjs.fileToolsMod.LoadFileError], 
      Unit
    ]
  ], 
  /* onOpened */ js.UndefOr[js.Function1[/* request */ typings.babylonjs.webRequestMod.WebRequest, Unit]], 
  IFileRequest
],
  LoadImage: js.Function6[
  /* input */ String | js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | Blob, 
  /* onLoad */ js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit], 
  /* onError */ js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit], 
  /* offlineProvider */ Nullable[IOfflineProvider], 
  /* mimeType */ js.UndefOr[String], 
  /* imageBitmapOptions */ js.UndefOr[ImageBitmapOptions], 
  Nullable[HTMLImageElement]
],
  ReadFile: js.Function5[
  /* file */ File, 
  /* onSuccess */ js.Function1[/* data */ Any, Unit], 
  /* onProgress */ js.UndefOr[js.Function1[/* ev */ ProgressEvent[EventTarget], Any]], 
  /* useArrayBuffer */ js.UndefOr[Boolean], 
  /* onError */ js.UndefOr[js.Function1[/* error */ typings.babylonjs.fileToolsMod.ReadFileError, Unit]], 
  IFileRequest
],
  RequestFile: js.Function7[
  /* url */ String, 
  /* onSuccess */ js.Function2[
    /* data */ String | js.typedarray.ArrayBuffer, 
    /* request */ js.UndefOr[typings.babylonjs.webRequestMod.WebRequest], 
    Unit
  ], 
  /* onProgress */ js.UndefOr[js.Function1[/* event */ ProgressEvent[EventTarget], Unit]], 
  /* offlineProvider */ js.UndefOr[IOfflineProvider], 
  /* useArrayBuffer */ js.UndefOr[Boolean], 
  /* onError */ js.UndefOr[js.Function1[/* error */ typings.babylonjs.fileToolsMod.RequestFileError, Unit]], 
  /* onOpened */ js.UndefOr[js.Function1[/* request */ typings.babylonjs.webRequestMod.WebRequest, Unit]], 
  IFileRequest
],
  SetCorsBehavior: js.Function2[/* url */ String | js.Array[String], /* element */ CrossOrigin, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_injectLTSFileTools")(DecodeBase64UrlToBinary.asInstanceOf[js.Any], DecodeBase64UrlToString.asInstanceOf[js.Any], FileToolsOptions.asInstanceOf[js.Any], IsBase64DataUrl.asInstanceOf[js.Any], IsFileURL.asInstanceOf[js.Any], LoadFile.asInstanceOf[js.Any], LoadImage.asInstanceOf[js.Any], ReadFile.asInstanceOf[js.Any], RequestFile.asInstanceOf[js.Any], SetCorsBehavior.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def inlineScheduler[T](
  coroutine: AsyncCoroutine[T],
  onStep: js.Function1[/* stepResult */ CoroutineStep[T], Unit],
  onError: js.Function1[/* stepError */ Any, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("inlineScheduler")(coroutine.asInstanceOf[js.Any], onStep.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def makeAsyncFunction[TParams /* <: js.Array[Any] */, TReturn](
  coroutineFactory: js.Function1[/* params */ TParams, AsyncCoroutine[TReturn]],
  scheduler: CoroutineScheduler[TReturn]
): js.Function1[/* params */ TParams, js.Promise[TReturn]] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeAsyncFunction")(coroutineFactory.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* params */ TParams, js.Promise[TReturn]]]
inline def makeAsyncFunction[TParams /* <: js.Array[Any] */, TReturn](
  coroutineFactory: js.Function1[/* params */ TParams, AsyncCoroutine[TReturn]],
  scheduler: CoroutineScheduler[TReturn],
  abortSignal: AbortSignal
): js.Function1[/* params */ TParams, js.Promise[TReturn]] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeAsyncFunction")(coroutineFactory.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any], abortSignal.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* params */ TParams, js.Promise[TReturn]]]

inline def makeSyncFunction[TParams /* <: js.Array[Any] */, TReturn](coroutineFactory: js.Function1[/* params */ TParams, Coroutine[TReturn]]): js.Function1[/* params */ TParams, TReturn] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeSyncFunction")(coroutineFactory.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* params */ TParams, TReturn]]
inline def makeSyncFunction[TParams /* <: js.Array[Any] */, TReturn](coroutineFactory: js.Function1[/* params */ TParams, Coroutine[TReturn]], abortSignal: AbortSignal): js.Function1[/* params */ TParams, TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeSyncFunction")(coroutineFactory.asInstanceOf[js.Any], abortSignal.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* params */ TParams, TReturn]]

inline def normalizeEnvInfo(info: EnvironmentTextureInfo): EnvironmentTextureInfoV2 = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeEnvInfo")(info.asInstanceOf[js.Any]).asInstanceOf[EnvironmentTextureInfoV2]

inline def runCoroutine[T](
  coroutine: AsyncCoroutine[T],
  scheduler: CoroutineScheduler[T],
  onSuccess: js.Function1[/* result */ T, Unit],
  onError: js.Function1[/* error */ Any, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("runCoroutine")(coroutine.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def runCoroutine[T](
  coroutine: AsyncCoroutine[T],
  scheduler: CoroutineScheduler[T],
  onSuccess: js.Function1[/* result */ T, Unit],
  onError: js.Function1[/* error */ Any, Unit],
  abortSignal: AbortSignal
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("runCoroutine")(coroutine.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], abortSignal.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def runCoroutineAsync[T](coroutine: AsyncCoroutine[T], scheduler: CoroutineScheduler[T]): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("runCoroutineAsync")(coroutine.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
inline def runCoroutineAsync[T](coroutine: AsyncCoroutine[T], scheduler: CoroutineScheduler[T], abortSignal: AbortSignal): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("runCoroutineAsync")(coroutine.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any], abortSignal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]

inline def runCoroutineSync[T](coroutine: Coroutine[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("runCoroutineSync")(coroutine.asInstanceOf[js.Any]).asInstanceOf[T]
inline def runCoroutineSync[T](coroutine: Coroutine[T], abortSignal: AbortSignal): T = (^.asInstanceOf[js.Dynamic].applyDynamic("runCoroutineSync")(coroutine.asInstanceOf[js.Any], abortSignal.asInstanceOf[js.Any])).asInstanceOf[T]

inline def serialize(): js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")().asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit]]
inline def serialize(sourceName: String): js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(sourceName.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit]]

inline def serializeAsCameraReference(): js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeAsCameraReference")().asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit]]
inline def serializeAsCameraReference(sourceName: String): js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeAsCameraReference")(sourceName.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit]]

inline def serializeAsColor3(): js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeAsColor3")().asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit]]
inline def serializeAsColor3(sourceName: String): js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeAsColor3")(sourceName.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit]]

inline def serializeAsColor4(): js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeAsColor4")().asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit]]
inline def serializeAsColor4(sourceName: String): js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeAsColor4")(sourceName.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit]]

inline def serializeAsColorCurves(): js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeAsColorCurves")().asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit]]
inline def serializeAsColorCurves(sourceName: String): js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeAsColorCurves")(sourceName.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit]]

inline def serializeAsFresnelParameters(): js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeAsFresnelParameters")().asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit]]
inline def serializeAsFresnelParameters(sourceName: String): js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeAsFresnelParameters")(sourceName.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit]]

inline def serializeAsImageProcessingConfiguration(): js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeAsImageProcessingConfiguration")().asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit]]
inline def serializeAsImageProcessingConfiguration(sourceName: String): js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeAsImageProcessingConfiguration")(sourceName.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit]]

inline def serializeAsMatrix(): js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeAsMatrix")().asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit]]
inline def serializeAsMatrix(sourceName: String): js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeAsMatrix")(sourceName.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit]]

inline def serializeAsMeshReference(): js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeAsMeshReference")().asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit]]
inline def serializeAsMeshReference(sourceName: String): js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeAsMeshReference")(sourceName.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit]]

inline def serializeAsQuaternion(): js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeAsQuaternion")().asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit]]
inline def serializeAsQuaternion(sourceName: String): js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeAsQuaternion")(sourceName.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit]]

inline def serializeAsTexture(): js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeAsTexture")().asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit]]
inline def serializeAsTexture(sourceName: String): js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeAsTexture")(sourceName.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit]]

inline def serializeAsVector2(): js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeAsVector2")().asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit]]
inline def serializeAsVector2(sourceName: String): js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeAsVector2")(sourceName.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit]]

inline def serializeAsVector3(): js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeAsVector3")().asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit]]
inline def serializeAsVector3(sourceName: String): js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeAsVector3")(sourceName.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String | js.Symbol, Unit]]

inline def setAndStartTimer(options: ITimerOptions[Any]): Nullable[typings.babylonjs.observableMod.Observer[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("setAndStartTimer")(options.asInstanceOf[js.Any]).asInstanceOf[Nullable[typings.babylonjs.observableMod.Observer[Any]]]
