package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.AsyncCoroutine
import typings.babylonjs.BABYLON.Coroutine
import typings.babylonjs.BABYLON.CoroutineScheduler
import typings.babylonjs.BABYLON.CoroutineStep
import typings.babylonjs.BABYLON.CreateEnvTextureOptions
import typings.babylonjs.BABYLON.EnvironmentTextureInfo
import typings.babylonjs.BABYLON.EnvironmentTextureInfoV2
import typings.babylonjs.BABYLON.FloatArray
import typings.babylonjs.BABYLON.GoldbergCreationOption
import typings.babylonjs.BABYLON.GoldbergVertexDataOption
import typings.babylonjs.BABYLON.ICreateCapsuleOptions
import typings.babylonjs.BABYLON.IEditablePropertyOption
import typings.babylonjs.BABYLON.IFileRequest
import typings.babylonjs.BABYLON.INative
import typings.babylonjs.BABYLON.IOfflineProvider
import typings.babylonjs.BABYLON.IScreenshotSize
import typings.babylonjs.BABYLON.ISize
import typings.babylonjs.BABYLON.ITimerOptions
import typings.babylonjs.BABYLON.IndicesArray
import typings.babylonjs.BABYLON.Nullable
import typings.babylonjs.BABYLON.ObserveCallback
import typings.babylonjs.BABYLON.PluginMaterialFactory
import typings.babylonjs.anon.AlignHorizontalAlignVertical
import typings.babylonjs.anon.AlignVerticalBackUVs
import typings.babylonjs.anon.ArcBackUVs
import typings.babylonjs.anon.BackUVsDiameter
import typings.babylonjs.anon.BackUVsFrontUVs
import typings.babylonjs.anon.BaseUrl
import typings.babylonjs.anon.BufferHeight
import typings.babylonjs.anon.CaptureUVS
import typings.babylonjs.anon.Closed
import typings.babylonjs.anon.ColorFilter
import typings.babylonjs.anon.ColorsLines
import typings.babylonjs.anon.CrossOrigin
import typings.babylonjs.anon.DepthFaceColors
import typings.babylonjs.anon.Diameter
import typings.babylonjs.anon.DiameterFrontUVs
import typings.babylonjs.anon.DiameterTop
import typings.babylonjs.anon.DiameterZ
import typings.babylonjs.anon.Enclose
import typings.babylonjs.anon.FirstNormal
import typings.babylonjs.anon.FrontUVsHeight
import typings.babylonjs.anon.GapSize
import typings.babylonjs.anon.HeightPattern
import typings.babylonjs.anon.M
import typings.babylonjs.anon.Match
import typings.babylonjs.anon.Minimum
import typings.babylonjs.anon.Offset
import typings.babylonjs.anon.PathArray
import typings.babylonjs.anon.Points
import typings.babylonjs.anon.Precision
import typings.babylonjs.anon.RadialSegments
import typings.babylonjs.anon.RadiusFunction
import typings.babylonjs.anon.RadiusY
import typings.babylonjs.anon.RadiusZ
import typings.babylonjs.anon.RibbonCloseArray
import typings.babylonjs.anon.Shape
import typings.babylonjs.anon.SizeX
import typings.babylonjs.anon.SizeY
import typings.babylonjs.anon.Slice
import typings.babylonjs.anon.SourcePlane
import typings.babylonjs.anon.Subdivisions
import typings.babylonjs.anon.SubdivisionsX
import typings.babylonjs.anon.TileWidth
import typings.babylonjs.anon.TopBaseAt
import typings.babylonjs.anon.Tube
import typings.babylonjs.anon.UseVertexAlpha
import typings.babylonjs.anon.Wrap
import typings.babylonjs.anon.Xmax
import typings.babylonjs.global.BABYLON.^
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


inline def AcquireNativeObjectAsync(): js.Promise[INative] = ^.asInstanceOf[js.Dynamic].applyDynamic("AcquireNativeObjectAsync")().asInstanceOf[js.Promise[INative]]

inline def ApplyPostProcess(
  postProcessName: String,
  internalTexture: typings.babylonjs.BABYLON.InternalTexture,
  scene: typings.babylonjs.BABYLON.Scene
): js.Promise[typings.babylonjs.BABYLON.InternalTexture] = (^.asInstanceOf[js.Dynamic].applyDynamic("ApplyPostProcess")(postProcessName.asInstanceOf[js.Any], internalTexture.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babylonjs.BABYLON.InternalTexture]]
inline def ApplyPostProcess(
  postProcessName: String,
  internalTexture: typings.babylonjs.BABYLON.InternalTexture,
  scene: typings.babylonjs.BABYLON.Scene,
  `type`: Double
): js.Promise[typings.babylonjs.BABYLON.InternalTexture] = (^.asInstanceOf[js.Dynamic].applyDynamic("ApplyPostProcess")(postProcessName.asInstanceOf[js.Any], internalTexture.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babylonjs.BABYLON.InternalTexture]]
inline def ApplyPostProcess(
  postProcessName: String,
  internalTexture: typings.babylonjs.BABYLON.InternalTexture,
  scene: typings.babylonjs.BABYLON.Scene,
  `type`: Double,
  samplingMode: Double
): js.Promise[typings.babylonjs.BABYLON.InternalTexture] = (^.asInstanceOf[js.Dynamic].applyDynamic("ApplyPostProcess")(postProcessName.asInstanceOf[js.Any], internalTexture.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babylonjs.BABYLON.InternalTexture]]
inline def ApplyPostProcess(
  postProcessName: String,
  internalTexture: typings.babylonjs.BABYLON.InternalTexture,
  scene: typings.babylonjs.BABYLON.Scene,
  `type`: Double,
  samplingMode: Double,
  format: Double
): js.Promise[typings.babylonjs.BABYLON.InternalTexture] = (^.asInstanceOf[js.Dynamic].applyDynamic("ApplyPostProcess")(postProcessName.asInstanceOf[js.Any], internalTexture.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babylonjs.BABYLON.InternalTexture]]
inline def ApplyPostProcess(
  postProcessName: String,
  internalTexture: typings.babylonjs.BABYLON.InternalTexture,
  scene: typings.babylonjs.BABYLON.Scene,
  `type`: Double,
  samplingMode: Unit,
  format: Double
): js.Promise[typings.babylonjs.BABYLON.InternalTexture] = (^.asInstanceOf[js.Dynamic].applyDynamic("ApplyPostProcess")(postProcessName.asInstanceOf[js.Any], internalTexture.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babylonjs.BABYLON.InternalTexture]]
inline def ApplyPostProcess(
  postProcessName: String,
  internalTexture: typings.babylonjs.BABYLON.InternalTexture,
  scene: typings.babylonjs.BABYLON.Scene,
  `type`: Unit,
  samplingMode: Double
): js.Promise[typings.babylonjs.BABYLON.InternalTexture] = (^.asInstanceOf[js.Dynamic].applyDynamic("ApplyPostProcess")(postProcessName.asInstanceOf[js.Any], internalTexture.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babylonjs.BABYLON.InternalTexture]]
inline def ApplyPostProcess(
  postProcessName: String,
  internalTexture: typings.babylonjs.BABYLON.InternalTexture,
  scene: typings.babylonjs.BABYLON.Scene,
  `type`: Unit,
  samplingMode: Double,
  format: Double
): js.Promise[typings.babylonjs.BABYLON.InternalTexture] = (^.asInstanceOf[js.Dynamic].applyDynamic("ApplyPostProcess")(postProcessName.asInstanceOf[js.Any], internalTexture.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babylonjs.BABYLON.InternalTexture]]
inline def ApplyPostProcess(
  postProcessName: String,
  internalTexture: typings.babylonjs.BABYLON.InternalTexture,
  scene: typings.babylonjs.BABYLON.Scene,
  `type`: Unit,
  samplingMode: Unit,
  format: Double
): js.Promise[typings.babylonjs.BABYLON.InternalTexture] = (^.asInstanceOf[js.Dynamic].applyDynamic("ApplyPostProcess")(postProcessName.asInstanceOf[js.Any], internalTexture.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], samplingMode.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babylonjs.BABYLON.InternalTexture]]

inline def BabylonLoaderRegistered: Boolean = ^.asInstanceOf[js.Dynamic].selectDynamic("_BabylonLoaderRegistered").asInstanceOf[Boolean]
inline def BabylonLoaderRegistered_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_BabylonLoaderRegistered")(x.asInstanceOf[js.Any])

inline def CreateBox(name: String): typings.babylonjs.BABYLON.Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateBox")(name.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
inline def CreateBox(name: String, options: Unit, scene: Nullable[typings.babylonjs.BABYLON.Scene]): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateBox")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
inline def CreateBox(name: String, options: Wrap): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateBox")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
inline def CreateBox(name: String, options: Wrap, scene: Nullable[typings.babylonjs.BABYLON.Scene]): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateBox")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]

inline def CreateBoxVertexData(options: TopBaseAt): typings.babylonjs.BABYLON.VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateBoxVertexData")(options.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.BABYLON.VertexData]

inline def CreateCapsule(name: String): typings.babylonjs.BABYLON.Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateCapsule")(name.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
inline def CreateCapsule(name: String, options: Unit, scene: Nullable[typings.babylonjs.BABYLON.Scene]): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateCapsule")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
inline def CreateCapsule(name: String, options: ICreateCapsuleOptions): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateCapsule")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
inline def CreateCapsule(name: String, options: ICreateCapsuleOptions, scene: Nullable[typings.babylonjs.BABYLON.Scene]): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateCapsule")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]

inline def CreateCapsuleVertexData(): typings.babylonjs.BABYLON.VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateCapsuleVertexData")().asInstanceOf[typings.babylonjs.BABYLON.VertexData]
inline def CreateCapsuleVertexData(options: ICreateCapsuleOptions): typings.babylonjs.BABYLON.VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateCapsuleVertexData")(options.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.BABYLON.VertexData]

inline def CreateCylinder(name: String): typings.babylonjs.BABYLON.Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateCylinder")(name.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
inline def CreateCylinder(name: String, options: Unit, scene: Nullable[typings.babylonjs.BABYLON.Scene]): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateCylinder")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
inline def CreateCylinder(name: String, options: Enclose): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateCylinder")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
inline def CreateCylinder(name: String, options: Enclose, scene: Nullable[typings.babylonjs.BABYLON.Scene]): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateCylinder")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]

inline def CreateCylinderVertexData(options: DiameterTop): typings.babylonjs.BABYLON.VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateCylinderVertexData")(options.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.BABYLON.VertexData]

inline def CreateDashedLines(name: String, options: UseVertexAlpha): typings.babylonjs.BABYLON.LinesMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDashedLines")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.LinesMesh]
inline def CreateDashedLines(name: String, options: UseVertexAlpha, scene: Nullable[typings.babylonjs.BABYLON.Scene]): typings.babylonjs.BABYLON.LinesMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDashedLines")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.LinesMesh]

inline def CreateDashedLinesVertexData(options: GapSize): typings.babylonjs.BABYLON.VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateDashedLinesVertexData")(options.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.BABYLON.VertexData]

inline def CreateDecal(name: String, sourceMesh: typings.babylonjs.BABYLON.AbstractMesh, options: CaptureUVS): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDecal")(name.asInstanceOf[js.Any], sourceMesh.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]

inline def CreateDisc(name: String): typings.babylonjs.BABYLON.Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateDisc")(name.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
inline def CreateDisc(name: String, options: Unit, scene: Nullable[typings.babylonjs.BABYLON.Scene]): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDisc")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
inline def CreateDisc(name: String, options: BackUVsFrontUVs): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDisc")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
inline def CreateDisc(name: String, options: BackUVsFrontUVs, scene: Nullable[typings.babylonjs.BABYLON.Scene]): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDisc")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]

inline def CreateDiscVertexData(options: ArcBackUVs): typings.babylonjs.BABYLON.VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateDiscVertexData")(options.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.BABYLON.VertexData]

inline def CreateEnvTextureAsync(texture: typings.babylonjs.BABYLON.BaseTexture): js.Promise[js.typedarray.ArrayBuffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateEnvTextureAsync")(texture.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.typedarray.ArrayBuffer]]
inline def CreateEnvTextureAsync(texture: typings.babylonjs.BABYLON.BaseTexture, options: CreateEnvTextureOptions): js.Promise[js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateEnvTextureAsync")(texture.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.ArrayBuffer]]

inline def CreateGeodesic(name: String, options: M): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGeodesic")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
inline def CreateGeodesic(name: String, options: M, scene: Nullable[typings.babylonjs.BABYLON.Scene]): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGeodesic")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]

inline def CreateGoldberg(name: String, options: GoldbergCreationOption): typings.babylonjs.BABYLON.GoldbergMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGoldberg")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.GoldbergMesh]
inline def CreateGoldberg(name: String, options: GoldbergCreationOption, scene: Nullable[typings.babylonjs.BABYLON.Scene]): typings.babylonjs.BABYLON.GoldbergMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGoldberg")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.GoldbergMesh]

inline def CreateGoldbergVertexData(options: GoldbergVertexDataOption, goldbergData: typings.babylonjs.BABYLON.PolyhedronData): typings.babylonjs.BABYLON.VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGoldbergVertexData")(options.asInstanceOf[js.Any], goldbergData.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.VertexData]

inline def CreateGround(name: String): typings.babylonjs.BABYLON.GroundMesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateGround")(name.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.BABYLON.GroundMesh]
inline def CreateGround(name: String, options: Unit, scene: typings.babylonjs.BABYLON.Scene): typings.babylonjs.BABYLON.GroundMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGround")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.GroundMesh]
inline def CreateGround(name: String, options: Subdivisions): typings.babylonjs.BABYLON.GroundMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGround")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.GroundMesh]
inline def CreateGround(name: String, options: Subdivisions, scene: typings.babylonjs.BABYLON.Scene): typings.babylonjs.BABYLON.GroundMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGround")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.GroundMesh]

inline def CreateGroundFromHeightMap(name: String, url: String): typings.babylonjs.BABYLON.GroundMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGroundFromHeightMap")(name.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.GroundMesh]
inline def CreateGroundFromHeightMap(name: String, url: String, options: Unit, scene: Nullable[typings.babylonjs.BABYLON.Scene]): typings.babylonjs.BABYLON.GroundMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGroundFromHeightMap")(name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.GroundMesh]
inline def CreateGroundFromHeightMap(name: String, url: String, options: ColorFilter): typings.babylonjs.BABYLON.GroundMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGroundFromHeightMap")(name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.GroundMesh]
inline def CreateGroundFromHeightMap(name: String, url: String, options: ColorFilter, scene: Nullable[typings.babylonjs.BABYLON.Scene]): typings.babylonjs.BABYLON.GroundMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGroundFromHeightMap")(name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.GroundMesh]

inline def CreateGroundFromHeightMapVertexData(options: BufferHeight): typings.babylonjs.BABYLON.VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateGroundFromHeightMapVertexData")(options.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.BABYLON.VertexData]

inline def CreateGroundVertexData(options: SubdivisionsX): typings.babylonjs.BABYLON.VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateGroundVertexData")(options.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.BABYLON.VertexData]

inline def CreateHemisphere(name: String): typings.babylonjs.BABYLON.Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateHemisphere")(name.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
inline def CreateHemisphere(name: String, options: Unit, scene: typings.babylonjs.BABYLON.Scene): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateHemisphere")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
inline def CreateHemisphere(name: String, options: Diameter): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateHemisphere")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
inline def CreateHemisphere(name: String, options: Diameter, scene: typings.babylonjs.BABYLON.Scene): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateHemisphere")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]

inline def CreateIcoSphere(name: String): typings.babylonjs.BABYLON.Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateIcoSphere")(name.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
inline def CreateIcoSphere(name: String, options: Unit, scene: Nullable[typings.babylonjs.BABYLON.Scene]): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateIcoSphere")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
inline def CreateIcoSphere(name: String, options: RadiusZ): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateIcoSphere")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
inline def CreateIcoSphere(name: String, options: RadiusZ, scene: Nullable[typings.babylonjs.BABYLON.Scene]): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateIcoSphere")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]

inline def CreateIcoSphereVertexData(options: RadiusY): typings.babylonjs.BABYLON.VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateIcoSphereVertexData")(options.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.BABYLON.VertexData]

inline def CreateImageDataArrayBufferViews(data: js.typedarray.ArrayBufferView, info: EnvironmentTextureInfo): js.Array[js.Array[js.typedarray.ArrayBufferView]] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateImageDataArrayBufferViews")(data.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[js.typedarray.ArrayBufferView]]]

inline def CreateLathe(name: String, options: Closed): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateLathe")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
inline def CreateLathe(name: String, options: Closed, scene: Nullable[typings.babylonjs.BABYLON.Scene]): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateLathe")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]

inline def CreateLineSystem(
  name: String,
  options: typings.babylonjs.anon.Material,
  scene: Nullable[typings.babylonjs.BABYLON.Scene]
): typings.babylonjs.BABYLON.LinesMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateLineSystem")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.LinesMesh]

inline def CreateLineSystemVertexData(options: ColorsLines): typings.babylonjs.BABYLON.VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateLineSystemVertexData")(options.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.BABYLON.VertexData]

inline def CreateLines(name: String, options: Points): typings.babylonjs.BABYLON.LinesMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateLines")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.LinesMesh]
inline def CreateLines(name: String, options: Points, scene: Nullable[typings.babylonjs.BABYLON.Scene]): typings.babylonjs.BABYLON.LinesMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateLines")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.LinesMesh]

inline def CreatePlane(name: String): typings.babylonjs.BABYLON.Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreatePlane")(name.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
inline def CreatePlane(name: String, options: Unit, scene: Nullable[typings.babylonjs.BABYLON.Scene]): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePlane")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
inline def CreatePlane(name: String, options: SourcePlane): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePlane")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
inline def CreatePlane(name: String, options: SourcePlane, scene: Nullable[typings.babylonjs.BABYLON.Scene]): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePlane")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]

inline def CreatePlaneVertexData(options: FrontUVsHeight): typings.babylonjs.BABYLON.VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreatePlaneVertexData")(options.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.BABYLON.VertexData]

inline def CreatePolygon(name: String, options: Shape): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygon")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
inline def CreatePolygon(name: String, options: Shape, scene: Unit, earcutInjection: Any): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygon")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], earcutInjection.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
inline def CreatePolygon(name: String, options: Shape, scene: Nullable[typings.babylonjs.BABYLON.Scene]): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygon")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
inline def CreatePolygon(
  name: String,
  options: Shape,
  scene: Nullable[typings.babylonjs.BABYLON.Scene],
  earcutInjection: Any
): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygon")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], earcutInjection.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]

inline def CreatePolygonVertexData(polygon: typings.babylonjs.BABYLON.Mesh, sideOrientation: Double): typings.babylonjs.BABYLON.VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.VertexData]
inline def CreatePolygonVertexData(
  polygon: typings.babylonjs.BABYLON.Mesh,
  sideOrientation: Double,
  fUV: js.Array[typings.babylonjs.BABYLON.Vector4]
): typings.babylonjs.BABYLON.VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.VertexData]
inline def CreatePolygonVertexData(
  polygon: typings.babylonjs.BABYLON.Mesh,
  sideOrientation: Double,
  fUV: js.Array[typings.babylonjs.BABYLON.Vector4],
  fColors: js.Array[typings.babylonjs.BABYLON.Color4]
): typings.babylonjs.BABYLON.VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.VertexData]
inline def CreatePolygonVertexData(
  polygon: typings.babylonjs.BABYLON.Mesh,
  sideOrientation: Double,
  fUV: js.Array[typings.babylonjs.BABYLON.Vector4],
  fColors: js.Array[typings.babylonjs.BABYLON.Color4],
  frontUVs: Unit,
  backUVs: Unit,
  wrp: Boolean
): typings.babylonjs.BABYLON.VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any], wrp.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.VertexData]
inline def CreatePolygonVertexData(
  polygon: typings.babylonjs.BABYLON.Mesh,
  sideOrientation: Double,
  fUV: js.Array[typings.babylonjs.BABYLON.Vector4],
  fColors: js.Array[typings.babylonjs.BABYLON.Color4],
  frontUVs: Unit,
  backUVs: typings.babylonjs.BABYLON.Vector4
): typings.babylonjs.BABYLON.VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.VertexData]
inline def CreatePolygonVertexData(
  polygon: typings.babylonjs.BABYLON.Mesh,
  sideOrientation: Double,
  fUV: js.Array[typings.babylonjs.BABYLON.Vector4],
  fColors: js.Array[typings.babylonjs.BABYLON.Color4],
  frontUVs: Unit,
  backUVs: typings.babylonjs.BABYLON.Vector4,
  wrp: Boolean
): typings.babylonjs.BABYLON.VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any], wrp.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.VertexData]
inline def CreatePolygonVertexData(
  polygon: typings.babylonjs.BABYLON.Mesh,
  sideOrientation: Double,
  fUV: js.Array[typings.babylonjs.BABYLON.Vector4],
  fColors: js.Array[typings.babylonjs.BABYLON.Color4],
  frontUVs: typings.babylonjs.BABYLON.Vector4
): typings.babylonjs.BABYLON.VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.VertexData]
inline def CreatePolygonVertexData(
  polygon: typings.babylonjs.BABYLON.Mesh,
  sideOrientation: Double,
  fUV: js.Array[typings.babylonjs.BABYLON.Vector4],
  fColors: js.Array[typings.babylonjs.BABYLON.Color4],
  frontUVs: typings.babylonjs.BABYLON.Vector4,
  backUVs: Unit,
  wrp: Boolean
): typings.babylonjs.BABYLON.VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any], wrp.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.VertexData]
inline def CreatePolygonVertexData(
  polygon: typings.babylonjs.BABYLON.Mesh,
  sideOrientation: Double,
  fUV: js.Array[typings.babylonjs.BABYLON.Vector4],
  fColors: js.Array[typings.babylonjs.BABYLON.Color4],
  frontUVs: typings.babylonjs.BABYLON.Vector4,
  backUVs: typings.babylonjs.BABYLON.Vector4
): typings.babylonjs.BABYLON.VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.VertexData]
inline def CreatePolygonVertexData(
  polygon: typings.babylonjs.BABYLON.Mesh,
  sideOrientation: Double,
  fUV: js.Array[typings.babylonjs.BABYLON.Vector4],
  fColors: js.Array[typings.babylonjs.BABYLON.Color4],
  frontUVs: typings.babylonjs.BABYLON.Vector4,
  backUVs: typings.babylonjs.BABYLON.Vector4,
  wrp: Boolean
): typings.babylonjs.BABYLON.VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any], wrp.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.VertexData]
inline def CreatePolygonVertexData(
  polygon: typings.babylonjs.BABYLON.Mesh,
  sideOrientation: Double,
  fUV: js.Array[typings.babylonjs.BABYLON.Vector4],
  fColors: Unit,
  frontUVs: Unit,
  backUVs: Unit,
  wrp: Boolean
): typings.babylonjs.BABYLON.VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any], wrp.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.VertexData]
inline def CreatePolygonVertexData(
  polygon: typings.babylonjs.BABYLON.Mesh,
  sideOrientation: Double,
  fUV: js.Array[typings.babylonjs.BABYLON.Vector4],
  fColors: Unit,
  frontUVs: Unit,
  backUVs: typings.babylonjs.BABYLON.Vector4
): typings.babylonjs.BABYLON.VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.VertexData]
inline def CreatePolygonVertexData(
  polygon: typings.babylonjs.BABYLON.Mesh,
  sideOrientation: Double,
  fUV: js.Array[typings.babylonjs.BABYLON.Vector4],
  fColors: Unit,
  frontUVs: Unit,
  backUVs: typings.babylonjs.BABYLON.Vector4,
  wrp: Boolean
): typings.babylonjs.BABYLON.VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any], wrp.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.VertexData]
inline def CreatePolygonVertexData(
  polygon: typings.babylonjs.BABYLON.Mesh,
  sideOrientation: Double,
  fUV: js.Array[typings.babylonjs.BABYLON.Vector4],
  fColors: Unit,
  frontUVs: typings.babylonjs.BABYLON.Vector4
): typings.babylonjs.BABYLON.VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.VertexData]
inline def CreatePolygonVertexData(
  polygon: typings.babylonjs.BABYLON.Mesh,
  sideOrientation: Double,
  fUV: js.Array[typings.babylonjs.BABYLON.Vector4],
  fColors: Unit,
  frontUVs: typings.babylonjs.BABYLON.Vector4,
  backUVs: Unit,
  wrp: Boolean
): typings.babylonjs.BABYLON.VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any], wrp.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.VertexData]
inline def CreatePolygonVertexData(
  polygon: typings.babylonjs.BABYLON.Mesh,
  sideOrientation: Double,
  fUV: js.Array[typings.babylonjs.BABYLON.Vector4],
  fColors: Unit,
  frontUVs: typings.babylonjs.BABYLON.Vector4,
  backUVs: typings.babylonjs.BABYLON.Vector4
): typings.babylonjs.BABYLON.VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.VertexData]
inline def CreatePolygonVertexData(
  polygon: typings.babylonjs.BABYLON.Mesh,
  sideOrientation: Double,
  fUV: js.Array[typings.babylonjs.BABYLON.Vector4],
  fColors: Unit,
  frontUVs: typings.babylonjs.BABYLON.Vector4,
  backUVs: typings.babylonjs.BABYLON.Vector4,
  wrp: Boolean
): typings.babylonjs.BABYLON.VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any], wrp.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.VertexData]
inline def CreatePolygonVertexData(
  polygon: typings.babylonjs.BABYLON.Mesh,
  sideOrientation: Double,
  fUV: Unit,
  fColors: js.Array[typings.babylonjs.BABYLON.Color4]
): typings.babylonjs.BABYLON.VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.VertexData]
inline def CreatePolygonVertexData(
  polygon: typings.babylonjs.BABYLON.Mesh,
  sideOrientation: Double,
  fUV: Unit,
  fColors: js.Array[typings.babylonjs.BABYLON.Color4],
  frontUVs: Unit,
  backUVs: Unit,
  wrp: Boolean
): typings.babylonjs.BABYLON.VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any], wrp.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.VertexData]
inline def CreatePolygonVertexData(
  polygon: typings.babylonjs.BABYLON.Mesh,
  sideOrientation: Double,
  fUV: Unit,
  fColors: js.Array[typings.babylonjs.BABYLON.Color4],
  frontUVs: Unit,
  backUVs: typings.babylonjs.BABYLON.Vector4
): typings.babylonjs.BABYLON.VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.VertexData]
inline def CreatePolygonVertexData(
  polygon: typings.babylonjs.BABYLON.Mesh,
  sideOrientation: Double,
  fUV: Unit,
  fColors: js.Array[typings.babylonjs.BABYLON.Color4],
  frontUVs: Unit,
  backUVs: typings.babylonjs.BABYLON.Vector4,
  wrp: Boolean
): typings.babylonjs.BABYLON.VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any], wrp.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.VertexData]
inline def CreatePolygonVertexData(
  polygon: typings.babylonjs.BABYLON.Mesh,
  sideOrientation: Double,
  fUV: Unit,
  fColors: js.Array[typings.babylonjs.BABYLON.Color4],
  frontUVs: typings.babylonjs.BABYLON.Vector4
): typings.babylonjs.BABYLON.VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.VertexData]
inline def CreatePolygonVertexData(
  polygon: typings.babylonjs.BABYLON.Mesh,
  sideOrientation: Double,
  fUV: Unit,
  fColors: js.Array[typings.babylonjs.BABYLON.Color4],
  frontUVs: typings.babylonjs.BABYLON.Vector4,
  backUVs: Unit,
  wrp: Boolean
): typings.babylonjs.BABYLON.VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any], wrp.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.VertexData]
inline def CreatePolygonVertexData(
  polygon: typings.babylonjs.BABYLON.Mesh,
  sideOrientation: Double,
  fUV: Unit,
  fColors: js.Array[typings.babylonjs.BABYLON.Color4],
  frontUVs: typings.babylonjs.BABYLON.Vector4,
  backUVs: typings.babylonjs.BABYLON.Vector4
): typings.babylonjs.BABYLON.VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.VertexData]
inline def CreatePolygonVertexData(
  polygon: typings.babylonjs.BABYLON.Mesh,
  sideOrientation: Double,
  fUV: Unit,
  fColors: js.Array[typings.babylonjs.BABYLON.Color4],
  frontUVs: typings.babylonjs.BABYLON.Vector4,
  backUVs: typings.babylonjs.BABYLON.Vector4,
  wrp: Boolean
): typings.babylonjs.BABYLON.VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any], wrp.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.VertexData]
inline def CreatePolygonVertexData(
  polygon: typings.babylonjs.BABYLON.Mesh,
  sideOrientation: Double,
  fUV: Unit,
  fColors: Unit,
  frontUVs: Unit,
  backUVs: Unit,
  wrp: Boolean
): typings.babylonjs.BABYLON.VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any], wrp.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.VertexData]
inline def CreatePolygonVertexData(
  polygon: typings.babylonjs.BABYLON.Mesh,
  sideOrientation: Double,
  fUV: Unit,
  fColors: Unit,
  frontUVs: Unit,
  backUVs: typings.babylonjs.BABYLON.Vector4
): typings.babylonjs.BABYLON.VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.VertexData]
inline def CreatePolygonVertexData(
  polygon: typings.babylonjs.BABYLON.Mesh,
  sideOrientation: Double,
  fUV: Unit,
  fColors: Unit,
  frontUVs: Unit,
  backUVs: typings.babylonjs.BABYLON.Vector4,
  wrp: Boolean
): typings.babylonjs.BABYLON.VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any], wrp.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.VertexData]
inline def CreatePolygonVertexData(
  polygon: typings.babylonjs.BABYLON.Mesh,
  sideOrientation: Double,
  fUV: Unit,
  fColors: Unit,
  frontUVs: typings.babylonjs.BABYLON.Vector4
): typings.babylonjs.BABYLON.VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.VertexData]
inline def CreatePolygonVertexData(
  polygon: typings.babylonjs.BABYLON.Mesh,
  sideOrientation: Double,
  fUV: Unit,
  fColors: Unit,
  frontUVs: typings.babylonjs.BABYLON.Vector4,
  backUVs: Unit,
  wrp: Boolean
): typings.babylonjs.BABYLON.VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any], wrp.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.VertexData]
inline def CreatePolygonVertexData(
  polygon: typings.babylonjs.BABYLON.Mesh,
  sideOrientation: Double,
  fUV: Unit,
  fColors: Unit,
  frontUVs: typings.babylonjs.BABYLON.Vector4,
  backUVs: typings.babylonjs.BABYLON.Vector4
): typings.babylonjs.BABYLON.VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.VertexData]
inline def CreatePolygonVertexData(
  polygon: typings.babylonjs.BABYLON.Mesh,
  sideOrientation: Double,
  fUV: Unit,
  fColors: Unit,
  frontUVs: typings.babylonjs.BABYLON.Vector4,
  backUVs: typings.babylonjs.BABYLON.Vector4,
  wrp: Boolean
): typings.babylonjs.BABYLON.VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any], wrp.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.VertexData]

inline def CreatePolyhedron(name: String): typings.babylonjs.BABYLON.Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolyhedron")(name.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
inline def CreatePolyhedron(name: String, options: Unit, scene: Nullable[typings.babylonjs.BABYLON.Scene]): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolyhedron")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
inline def CreatePolyhedron(name: String, options: SizeY): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolyhedron")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
inline def CreatePolyhedron(name: String, options: SizeY, scene: Nullable[typings.babylonjs.BABYLON.Scene]): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolyhedron")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]

inline def CreatePolyhedronVertexData(options: SizeX): typings.babylonjs.BABYLON.VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolyhedronVertexData")(options.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.BABYLON.VertexData]

inline def CreateResizedCopy(texture: typings.babylonjs.BABYLON.Texture, width: Double, height: Double): typings.babylonjs.BABYLON.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateResizedCopy")(texture.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Texture]
inline def CreateResizedCopy(
  texture: typings.babylonjs.BABYLON.Texture,
  width: Double,
  height: Double,
  useBilinearMode: Boolean
): typings.babylonjs.BABYLON.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateResizedCopy")(texture.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], useBilinearMode.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Texture]

inline def CreateRibbon(name: String, options: PathArray): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRibbon")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
inline def CreateRibbon(name: String, options: PathArray, scene: Nullable[typings.babylonjs.BABYLON.Scene]): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRibbon")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]

inline def CreateRibbonVertexData(options: Offset): typings.babylonjs.BABYLON.VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateRibbonVertexData")(options.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.BABYLON.VertexData]

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
  successCallback: js.Function1[/* data */ String, Unit],
  mimeType: String,
  forceDownload: Boolean
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshot")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], forceDownload.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def CreateScreenshot(
  engine: typings.babylonjs.BABYLON.Engine,
  camera: typings.babylonjs.BABYLON.Camera,
  size: Double,
  successCallback: js.Function1[/* data */ String, Unit],
  mimeType: Unit,
  forceDownload: Boolean
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshot")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], forceDownload.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def CreateScreenshot(
  engine: typings.babylonjs.BABYLON.Engine,
  camera: typings.babylonjs.BABYLON.Camera,
  size: Double,
  successCallback: Unit,
  mimeType: String
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshot")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def CreateScreenshot(
  engine: typings.babylonjs.BABYLON.Engine,
  camera: typings.babylonjs.BABYLON.Camera,
  size: Double,
  successCallback: Unit,
  mimeType: String,
  forceDownload: Boolean
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshot")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], forceDownload.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def CreateScreenshot(
  engine: typings.babylonjs.BABYLON.Engine,
  camera: typings.babylonjs.BABYLON.Camera,
  size: Double,
  successCallback: Unit,
  mimeType: Unit,
  forceDownload: Boolean
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshot")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], forceDownload.asInstanceOf[js.Any])).asInstanceOf[Unit]
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
  successCallback: js.Function1[/* data */ String, Unit],
  mimeType: String,
  forceDownload: Boolean
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshot")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], forceDownload.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def CreateScreenshot(
  engine: typings.babylonjs.BABYLON.Engine,
  camera: typings.babylonjs.BABYLON.Camera,
  size: IScreenshotSize,
  successCallback: js.Function1[/* data */ String, Unit],
  mimeType: Unit,
  forceDownload: Boolean
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshot")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], forceDownload.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def CreateScreenshot(
  engine: typings.babylonjs.BABYLON.Engine,
  camera: typings.babylonjs.BABYLON.Camera,
  size: IScreenshotSize,
  successCallback: Unit,
  mimeType: String
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshot")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def CreateScreenshot(
  engine: typings.babylonjs.BABYLON.Engine,
  camera: typings.babylonjs.BABYLON.Camera,
  size: IScreenshotSize,
  successCallback: Unit,
  mimeType: String,
  forceDownload: Boolean
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshot")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], forceDownload.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def CreateScreenshot(
  engine: typings.babylonjs.BABYLON.Engine,
  camera: typings.babylonjs.BABYLON.Camera,
  size: IScreenshotSize,
  successCallback: Unit,
  mimeType: Unit,
  forceDownload: Boolean
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshot")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], forceDownload.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def CreateScreenshotAsync(engine: typings.babylonjs.BABYLON.Engine, camera: typings.babylonjs.BABYLON.Camera, size: Double): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
inline def CreateScreenshotAsync(
  engine: typings.babylonjs.BABYLON.Engine,
  camera: typings.babylonjs.BABYLON.Camera,
  size: Double,
  mimeType: String
): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
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

inline def CreateScreenshotUsingRenderTarget(
  engine: typings.babylonjs.BABYLON.Engine,
  camera: typings.babylonjs.BABYLON.Camera,
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
  engine: typings.babylonjs.BABYLON.Engine,
  camera: typings.babylonjs.BABYLON.Camera,
  size: IScreenshotSize | Double,
  mimeType: js.UndefOr[String],
  samples: js.UndefOr[Double],
  antialiasing: js.UndefOr[Boolean],
  fileName: js.UndefOr[String],
  renderSprites: js.UndefOr[Boolean]
): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotUsingRenderTargetAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], samples.asInstanceOf[js.Any], antialiasing.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], renderSprites.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]

inline def CreateScreenshotWithResizeAsync(
  engine: typings.babylonjs.BABYLON.Engine,
  camera: typings.babylonjs.BABYLON.Camera,
  width: Double,
  height: Double
): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotWithResizeAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def CreateScreenshotWithResizeAsync(
  engine: typings.babylonjs.BABYLON.Engine,
  camera: typings.babylonjs.BABYLON.Camera,
  width: Double,
  height: Double,
  mimeType: String
): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateScreenshotWithResizeAsync")(engine.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]

inline def CreateSphere(name: String): typings.babylonjs.BABYLON.Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateSphere")(name.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
inline def CreateSphere(name: String, options: Unit, scene: Nullable[typings.babylonjs.BABYLON.Scene]): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateSphere")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
inline def CreateSphere(name: String, options: Slice): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateSphere")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
inline def CreateSphere(name: String, options: Slice, scene: Nullable[typings.babylonjs.BABYLON.Scene]): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateSphere")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]

inline def CreateSphereVertexData(options: DiameterZ): typings.babylonjs.BABYLON.VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateSphereVertexData")(options.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.BABYLON.VertexData]

inline def CreateTiledBox(name: String, options: AlignHorizontalAlignVertical): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTiledBox")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
inline def CreateTiledBox(
  name: String,
  options: AlignHorizontalAlignVertical,
  scene: Nullable[typings.babylonjs.BABYLON.Scene]
): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTiledBox")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]

inline def CreateTiledBoxVertexData(options: TileWidth): typings.babylonjs.BABYLON.VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateTiledBoxVertexData")(options.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.BABYLON.VertexData]

inline def CreateTiledGround(name: String, options: Precision): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTiledGround")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
inline def CreateTiledGround(name: String, options: Precision, scene: Nullable[typings.babylonjs.BABYLON.Scene]): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTiledGround")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]

inline def CreateTiledGroundVertexData(options: Xmax): typings.babylonjs.BABYLON.VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateTiledGroundVertexData")(options.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.BABYLON.VertexData]

inline def CreateTiledPlane(name: String, options: HeightPattern): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTiledPlane")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
inline def CreateTiledPlane(name: String, options: HeightPattern, scene: Nullable[typings.babylonjs.BABYLON.Scene]): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTiledPlane")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]

inline def CreateTiledPlaneVertexData(options: AlignVerticalBackUVs): typings.babylonjs.BABYLON.VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateTiledPlaneVertexData")(options.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.BABYLON.VertexData]

inline def CreateTorus(name: String): typings.babylonjs.BABYLON.Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorus")(name.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
inline def CreateTorus(name: String, options: Unit, scene: typings.babylonjs.BABYLON.Scene): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorus")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
inline def CreateTorus(name: String, options: DiameterFrontUVs): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorus")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
inline def CreateTorus(name: String, options: DiameterFrontUVs, scene: typings.babylonjs.BABYLON.Scene): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorus")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]

inline def CreateTorusKnot(name: String): typings.babylonjs.BABYLON.Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorusKnot")(name.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
inline def CreateTorusKnot(name: String, options: Unit, scene: typings.babylonjs.BABYLON.Scene): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorusKnot")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
inline def CreateTorusKnot(name: String, options: Tube): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorusKnot")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
inline def CreateTorusKnot(name: String, options: Tube, scene: typings.babylonjs.BABYLON.Scene): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorusKnot")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]

inline def CreateTorusKnotVertexData(options: RadialSegments): typings.babylonjs.BABYLON.VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorusKnotVertexData")(options.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.BABYLON.VertexData]

inline def CreateTorusVertexData(options: BackUVsDiameter): typings.babylonjs.BABYLON.VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorusVertexData")(options.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.BABYLON.VertexData]

inline def CreateTube(name: String, options: RadiusFunction): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTube")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
inline def CreateTube(name: String, options: RadiusFunction, scene: Nullable[typings.babylonjs.BABYLON.Scene]): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTube")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]

inline def Decode(buffer: js.typedarray.Uint16Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("Decode")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
inline def Decode(buffer: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("Decode")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]

inline def DecodeBase64ToBinary(base64Data: String): js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("DecodeBase64ToBinary")(base64Data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBuffer]

inline def DecodeBase64ToString(base64Data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("DecodeBase64ToString")(base64Data.asInstanceOf[js.Any]).asInstanceOf[String]

inline def DecodeBase64UrlToBinary(uri: String): js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("DecodeBase64UrlToBinary")(uri.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBuffer]

inline def DecodeBase64UrlToString(uri: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("DecodeBase64UrlToString")(uri.asInstanceOf[js.Any]).asInstanceOf[String]

inline def EncodeArrayBufferToBase64(buffer: js.typedarray.ArrayBuffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("EncodeArrayBufferToBase64")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
inline def EncodeArrayBufferToBase64(buffer: js.typedarray.ArrayBufferView): String = ^.asInstanceOf[js.Dynamic].applyDynamic("EncodeArrayBufferToBase64")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]

inline def EndsWith(str: String, suffix: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("EndsWith")(str.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[Boolean]

/**
  * Constant used to define the minimal number value in Babylon.js
  * @ignorenaming
  */
inline def Epsilon: /* 0.001 */ Double = ^.asInstanceOf[js.Dynamic].selectDynamic("Epsilon").asInstanceOf[/* 0.001 */ Double]

inline def EscapeRegExp(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("EscapeRegExp")(s.asInstanceOf[js.Any]).asInstanceOf[String]

inline def ExtractBetweenMarkers(markerOpen: String, markerClose: String, block: String, startIndex: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtractBetweenMarkers")(markerOpen.asInstanceOf[js.Any], markerClose.asInstanceOf[js.Any], block.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def ExtrudePolygon(name: String, options: DepthFaceColors): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudePolygon")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
inline def ExtrudePolygon(name: String, options: DepthFaceColors, scene: Unit, earcutInjection: Any): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudePolygon")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], earcutInjection.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
inline def ExtrudePolygon(name: String, options: DepthFaceColors, scene: Nullable[typings.babylonjs.BABYLON.Scene]): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudePolygon")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
inline def ExtrudePolygon(
  name: String,
  options: DepthFaceColors,
  scene: Nullable[typings.babylonjs.BABYLON.Scene],
  earcutInjection: Any
): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudePolygon")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], earcutInjection.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]

inline def ExtrudeShape(name: String, options: FirstNormal): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudeShape")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
inline def ExtrudeShape(name: String, options: FirstNormal, scene: Nullable[typings.babylonjs.BABYLON.Scene]): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudeShape")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]

inline def ExtrudeShapeCustom(name: String, options: RibbonCloseArray): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudeShapeCustom")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
inline def ExtrudeShapeCustom(name: String, options: RibbonCloseArray, scene: Nullable[typings.babylonjs.BABYLON.Scene]): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudeShapeCustom")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]

inline def FindBackward(s: String, index: Double, c: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("FindBackward")(s.asInstanceOf[js.Any], index.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def FromHalfFloat(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("FromHalfFloat")(value.asInstanceOf[js.Any]).asInstanceOf[Double]

inline def GenerateBase64StringFromPixelData(pixels: js.typedarray.ArrayBufferView, size: ISize): Nullable[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("GenerateBase64StringFromPixelData")(pixels.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Nullable[String]]
inline def GenerateBase64StringFromPixelData(pixels: js.typedarray.ArrayBufferView, size: ISize, invertY: Boolean): Nullable[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("GenerateBase64StringFromPixelData")(pixels.asInstanceOf[js.Any], size.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any])).asInstanceOf[Nullable[String]]

inline def GenerateBase64StringFromTexture(texture: typings.babylonjs.BABYLON.BaseTexture): Nullable[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("GenerateBase64StringFromTexture")(texture.asInstanceOf[js.Any]).asInstanceOf[Nullable[String]]
inline def GenerateBase64StringFromTexture(texture: typings.babylonjs.BABYLON.BaseTexture, faceIndex: Double): Nullable[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("GenerateBase64StringFromTexture")(texture.asInstanceOf[js.Any], faceIndex.asInstanceOf[js.Any])).asInstanceOf[Nullable[String]]
inline def GenerateBase64StringFromTexture(texture: typings.babylonjs.BABYLON.BaseTexture, faceIndex: Double, level: Double): Nullable[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("GenerateBase64StringFromTexture")(texture.asInstanceOf[js.Any], faceIndex.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[Nullable[String]]
inline def GenerateBase64StringFromTexture(texture: typings.babylonjs.BABYLON.BaseTexture, faceIndex: Unit, level: Double): Nullable[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("GenerateBase64StringFromTexture")(texture.asInstanceOf[js.Any], faceIndex.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[Nullable[String]]

inline def GenerateBase64StringFromTextureAsync(texture: typings.babylonjs.BABYLON.BaseTexture): js.Promise[Nullable[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("GenerateBase64StringFromTextureAsync")(texture.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Nullable[String]]]
inline def GenerateBase64StringFromTextureAsync(texture: typings.babylonjs.BABYLON.BaseTexture, faceIndex: Double): js.Promise[Nullable[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("GenerateBase64StringFromTextureAsync")(texture.asInstanceOf[js.Any], faceIndex.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Nullable[String]]]
inline def GenerateBase64StringFromTextureAsync(texture: typings.babylonjs.BABYLON.BaseTexture, faceIndex: Double, level: Double): js.Promise[Nullable[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("GenerateBase64StringFromTextureAsync")(texture.asInstanceOf[js.Any], faceIndex.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Nullable[String]]]
inline def GenerateBase64StringFromTextureAsync(texture: typings.babylonjs.BABYLON.BaseTexture, faceIndex: Unit, level: Double): js.Promise[Nullable[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("GenerateBase64StringFromTextureAsync")(texture.asInstanceOf[js.Any], faceIndex.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Nullable[String]]]

inline def GetClass(fqdn: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("GetClass")(fqdn.asInstanceOf[js.Any]).asInstanceOf[Any]

inline def GetDOMTextContent(element: HTMLElement): String = ^.asInstanceOf[js.Dynamic].applyDynamic("GetDOMTextContent")(element.asInstanceOf[js.Any]).asInstanceOf[String]

inline def GetEnvInfo(data: js.typedarray.ArrayBufferView): Nullable[EnvironmentTextureInfoV2] = ^.asInstanceOf[js.Dynamic].applyDynamic("GetEnvInfo")(data.asInstanceOf[js.Any]).asInstanceOf[Nullable[EnvironmentTextureInfoV2]]

inline def GetEnvironmentBRDFTexture(scene: typings.babylonjs.BABYLON.Scene): typings.babylonjs.BABYLON.BaseTexture = ^.asInstanceOf[js.Dynamic].applyDynamic("GetEnvironmentBRDFTexture")(scene.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.BABYLON.BaseTexture]

inline def GetInternalFormatFromBasisFormat(basisFormat: Double, engine: typings.babylonjs.BABYLON.Engine): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("GetInternalFormatFromBasisFormat")(basisFormat.asInstanceOf[js.Any], engine.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def GetTGAHeader(data: js.typedarray.Uint8Array): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("GetTGAHeader")(data.asInstanceOf[js.Any]).asInstanceOf[Any]

inline def IsBase64DataUrl(uri: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsBase64DataUrl")(uri.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def IsDocumentAvailable(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsDocumentAvailable")().asInstanceOf[Boolean]

inline def IsFileURL(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsFileURL")().asInstanceOf[Boolean]

inline def IsIdentifierChar(c: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsIdentifierChar")(c.asInstanceOf[js.Any]).asInstanceOf[Boolean]

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
    /* request */ js.UndefOr[typings.babylonjs.BABYLON.WebRequest], 
    /* exception */ js.UndefOr[typings.babylonjs.BABYLON.LoadFileError], 
    Unit
  ]
],
  onOpened: js.UndefOr[js.Function1[/* request */ typings.babylonjs.BABYLON.WebRequest, Unit]]
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

inline def LoadTextureFromTranscodeResult(
  texture: typings.babylonjs.BABYLON.InternalTexture,
  transcodeResult: typings.babylonjs.BABYLON.TranscodeResult
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadTextureFromTranscodeResult")(texture.asInstanceOf[js.Any], transcodeResult.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def ObserveArray[T](array: js.Array[T], callback: ObserveCallback): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("_ObserveArray")(array.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]

inline def PHI: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("PHI").asInstanceOf[Double]
inline def PHI_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PHI")(x.asInstanceOf[js.Any])

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
  onError: js.Function1[/* error */ typings.babylonjs.BABYLON.ReadFileError, Unit]
): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("ReadFile")(file.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
inline def ReadFile(
  file: File,
  onSuccess: js.Function1[/* data */ Any, Unit],
  onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Any],
  useArrayBuffer: Unit,
  onError: js.Function1[/* error */ typings.babylonjs.BABYLON.ReadFileError, Unit]
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
  onError: js.Function1[/* error */ typings.babylonjs.BABYLON.ReadFileError, Unit]
): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("ReadFile")(file.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]
inline def ReadFile(
  file: File,
  onSuccess: js.Function1[/* data */ Any, Unit],
  onProgress: Unit,
  useArrayBuffer: Unit,
  onError: js.Function1[/* error */ typings.babylonjs.BABYLON.ReadFileError, Unit]
): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("ReadFile")(file.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]

inline def RegisterClass(className: String, `type`: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("RegisterClass")(className.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def RegisterMaterialPlugin(pluginName: String, factory: PluginMaterialFactory): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("RegisterMaterialPlugin")(pluginName.asInstanceOf[js.Any], factory.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def RegisterNativeTypeAsync[Type](typeName: String, constructor: Type): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("RegisterNativeTypeAsync")(typeName.asInstanceOf[js.Any], constructor.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]

inline def RemoveComments(block: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("RemoveComments")(block.asInstanceOf[js.Any]).asInstanceOf[String]

inline def RequestFile(
  url: String,
  onSuccess: js.UndefOr[
  js.Function2[
    /* data */ String | js.typedarray.ArrayBuffer, 
    /* request */ js.UndefOr[typings.babylonjs.BABYLON.WebRequest], 
    Unit
  ]
],
  onProgress: js.UndefOr[js.Function1[/* event */ ProgressEvent[EventTarget], Unit]],
  offlineProvider: js.UndefOr[IOfflineProvider],
  useArrayBuffer: js.UndefOr[Boolean],
  onError: js.UndefOr[js.Function1[/* error */ typings.babylonjs.BABYLON.RequestFileError, Unit]],
  onOpened: js.UndefOr[js.Function1[/* request */ typings.babylonjs.BABYLON.WebRequest, Unit]]
): IFileRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("RequestFile")(url.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], offlineProvider.asInstanceOf[js.Any], useArrayBuffer.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onOpened.asInstanceOf[js.Any])).asInstanceOf[IFileRequest]

inline def SetCorsBehavior: js.Function2[/* url */ String | js.Array[String], /* element */ CrossOrigin, Unit] = ^.asInstanceOf[js.Dynamic].selectDynamic("SetCorsBehavior").asInstanceOf[js.Function2[/* url */ String | js.Array[String], /* element */ CrossOrigin, Unit]]
inline def SetCorsBehavior_=(x: js.Function2[/* url */ String | js.Array[String], /* element */ CrossOrigin, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SetCorsBehavior")(x.asInstanceOf[js.Any])

inline def SkipWhitespaces(s: String, index: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("SkipWhitespaces")(s.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def StartsWith(str: String, suffix: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("StartsWith")(str.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def TestBase64DataUrl(uri: String): Match = ^.asInstanceOf[js.Dynamic].applyDynamic("TestBase64DataUrl")(uri.asInstanceOf[js.Any]).asInstanceOf[Match]

inline def ToGammaSpace: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("ToGammaSpace").asInstanceOf[Double]
inline def ToGammaSpace_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ToGammaSpace")(x.asInstanceOf[js.Any])

inline def ToHalfFloat(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("ToHalfFloat")(value.asInstanceOf[js.Any]).asInstanceOf[Double]

inline def ToLinearSpace: /* 2.2 */ Double = ^.asInstanceOf[js.Dynamic].selectDynamic("ToLinearSpace").asInstanceOf[/* 2.2 */ Double]

inline def TranscodeAsync(data: js.typedarray.ArrayBufferView, config: typings.babylonjs.BABYLON.BasisTranscodeConfiguration): js.Promise[typings.babylonjs.BABYLON.TranscodeResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("TranscodeAsync")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babylonjs.BABYLON.TranscodeResult]]
inline def TranscodeAsync(data: js.typedarray.ArrayBuffer, config: typings.babylonjs.BABYLON.BasisTranscodeConfiguration): js.Promise[typings.babylonjs.BABYLON.TranscodeResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("TranscodeAsync")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babylonjs.BABYLON.TranscodeResult]]

inline def UnregisterAllMaterialPlugins(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("UnregisterAllMaterialPlugins")().asInstanceOf[Unit]

inline def UnregisterMaterialPlugin(pluginName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("UnregisterMaterialPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def UpdateRGBDAsync(
  internalTexture: typings.babylonjs.BABYLON.InternalTexture,
  data: js.Array[js.Array[js.typedarray.ArrayBufferView]],
  sphericalPolynomial: Nullable[typings.babylonjs.BABYLON.SphericalPolynomial],
  lodScale: Double,
  lodOffset: Double
): js.Promise[typings.babylonjs.BABYLON.InternalTexture] = (^.asInstanceOf[js.Dynamic].applyDynamic("_UpdateRGBDAsync")(internalTexture.asInstanceOf[js.Any], data.asInstanceOf[js.Any], sphericalPolynomial.asInstanceOf[js.Any], lodScale.asInstanceOf[js.Any], lodOffset.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babylonjs.BABYLON.InternalTexture]]

inline def UploadContent(texture: typings.babylonjs.BABYLON.InternalTexture, data: js.typedarray.Uint8Array): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("UploadContent")(texture.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def UploadEnvLevelsAsync(
  texture: typings.babylonjs.BABYLON.InternalTexture,
  data: js.typedarray.ArrayBufferView,
  info: EnvironmentTextureInfo
): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("UploadEnvLevelsAsync")(texture.asInstanceOf[js.Any], data.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]

inline def UploadEnvSpherical(texture: typings.babylonjs.BABYLON.InternalTexture, info: EnvironmentTextureInfo): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("UploadEnvSpherical")(texture.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def UploadLevelsAsync(
  texture: typings.babylonjs.BABYLON.InternalTexture,
  imageData: js.Array[js.Array[js.typedarray.ArrayBufferView]]
): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("UploadLevelsAsync")(texture.asInstanceOf[js.Any], imageData.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def UploadLevelsAsync(
  texture: typings.babylonjs.BABYLON.InternalTexture,
  imageData: js.Array[js.Array[js.typedarray.ArrayBufferView]],
  imageType: String
): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("UploadLevelsAsync")(texture.asInstanceOf[js.Any], imageData.asInstanceOf[js.Any], imageType.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]

inline def WarnImport(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_WarnImport")(name.asInstanceOf[js.Any]).asInstanceOf[String]

inline def allocateAndCopyTypedBuffer(`type`: Double, sizeOrDstBuffer: js.typedarray.ArrayBuffer): js.typedarray.ArrayBufferView = (^.asInstanceOf[js.Dynamic].applyDynamic("allocateAndCopyTypedBuffer")(`type`.asInstanceOf[js.Any], sizeOrDstBuffer.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.ArrayBufferView]
inline def allocateAndCopyTypedBuffer(`type`: Double, sizeOrDstBuffer: js.typedarray.ArrayBuffer, sizeInBytes: Boolean): js.typedarray.ArrayBufferView = (^.asInstanceOf[js.Dynamic].applyDynamic("allocateAndCopyTypedBuffer")(`type`.asInstanceOf[js.Any], sizeOrDstBuffer.asInstanceOf[js.Any], sizeInBytes.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.ArrayBufferView]
inline def allocateAndCopyTypedBuffer(
  `type`: Double,
  sizeOrDstBuffer: js.typedarray.ArrayBuffer,
  sizeInBytes: Boolean,
  copyBuffer: js.typedarray.ArrayBuffer
): js.typedarray.ArrayBufferView = (^.asInstanceOf[js.Dynamic].applyDynamic("allocateAndCopyTypedBuffer")(`type`.asInstanceOf[js.Any], sizeOrDstBuffer.asInstanceOf[js.Any], sizeInBytes.asInstanceOf[js.Any], copyBuffer.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.ArrayBufferView]
inline def allocateAndCopyTypedBuffer(
  `type`: Double,
  sizeOrDstBuffer: js.typedarray.ArrayBuffer,
  sizeInBytes: Unit,
  copyBuffer: js.typedarray.ArrayBuffer
): js.typedarray.ArrayBufferView = (^.asInstanceOf[js.Dynamic].applyDynamic("allocateAndCopyTypedBuffer")(`type`.asInstanceOf[js.Any], sizeOrDstBuffer.asInstanceOf[js.Any], sizeInBytes.asInstanceOf[js.Any], copyBuffer.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.ArrayBufferView]
inline def allocateAndCopyTypedBuffer(`type`: Double, sizeOrDstBuffer: Double): js.typedarray.ArrayBufferView = (^.asInstanceOf[js.Dynamic].applyDynamic("allocateAndCopyTypedBuffer")(`type`.asInstanceOf[js.Any], sizeOrDstBuffer.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.ArrayBufferView]
inline def allocateAndCopyTypedBuffer(`type`: Double, sizeOrDstBuffer: Double, sizeInBytes: Boolean): js.typedarray.ArrayBufferView = (^.asInstanceOf[js.Dynamic].applyDynamic("allocateAndCopyTypedBuffer")(`type`.asInstanceOf[js.Any], sizeOrDstBuffer.asInstanceOf[js.Any], sizeInBytes.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.ArrayBufferView]
inline def allocateAndCopyTypedBuffer(
  `type`: Double,
  sizeOrDstBuffer: Double,
  sizeInBytes: Boolean,
  copyBuffer: js.typedarray.ArrayBuffer
): js.typedarray.ArrayBufferView = (^.asInstanceOf[js.Dynamic].applyDynamic("allocateAndCopyTypedBuffer")(`type`.asInstanceOf[js.Any], sizeOrDstBuffer.asInstanceOf[js.Any], sizeInBytes.asInstanceOf[js.Any], copyBuffer.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.ArrayBufferView]
inline def allocateAndCopyTypedBuffer(`type`: Double, sizeOrDstBuffer: Double, sizeInBytes: Unit, copyBuffer: js.typedarray.ArrayBuffer): js.typedarray.ArrayBufferView = (^.asInstanceOf[js.Dynamic].applyDynamic("allocateAndCopyTypedBuffer")(`type`.asInstanceOf[js.Any], sizeOrDstBuffer.asInstanceOf[js.Any], sizeInBytes.asInstanceOf[js.Any], copyBuffer.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.ArrayBufferView]

inline def className(name: String): js.Function1[/* target */ js.Object, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("className")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* target */ js.Object, Unit]]
inline def className(name: String, module: String): js.Function1[/* target */ js.Object, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("className")(name.asInstanceOf[js.Any], module.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* target */ js.Object, Unit]]

inline def createDetailMapPlugin(material: typings.babylonjs.BABYLON.Material): Nullable[typings.babylonjs.BABYLON.MaterialPluginBase] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDetailMapPlugin")(material.asInstanceOf[js.Any]).asInstanceOf[Nullable[typings.babylonjs.BABYLON.MaterialPluginBase]]

inline def createPBRAnisotropicPlugin(material: typings.babylonjs.BABYLON.Material): Nullable[typings.babylonjs.BABYLON.MaterialPluginBase] = ^.asInstanceOf[js.Dynamic].applyDynamic("createPBRAnisotropicPlugin")(material.asInstanceOf[js.Any]).asInstanceOf[Nullable[typings.babylonjs.BABYLON.MaterialPluginBase]]

inline def createPBRBRDFPlugin(material: typings.babylonjs.BABYLON.Material): Nullable[typings.babylonjs.BABYLON.MaterialPluginBase] = ^.asInstanceOf[js.Dynamic].applyDynamic("createPBRBRDFPlugin")(material.asInstanceOf[js.Any]).asInstanceOf[Nullable[typings.babylonjs.BABYLON.MaterialPluginBase]]

inline def createPBRClearCoatPlugin(material: typings.babylonjs.BABYLON.Material): Nullable[typings.babylonjs.BABYLON.MaterialPluginBase] = ^.asInstanceOf[js.Dynamic].applyDynamic("createPBRClearCoatPlugin")(material.asInstanceOf[js.Any]).asInstanceOf[Nullable[typings.babylonjs.BABYLON.MaterialPluginBase]]

inline def createPBRIridescencePlugin(material: typings.babylonjs.BABYLON.Material): Nullable[typings.babylonjs.BABYLON.MaterialPluginBase] = ^.asInstanceOf[js.Dynamic].applyDynamic("createPBRIridescencePlugin")(material.asInstanceOf[js.Any]).asInstanceOf[Nullable[typings.babylonjs.BABYLON.MaterialPluginBase]]

inline def createPBRSheenPlugin(material: typings.babylonjs.BABYLON.Material): Nullable[typings.babylonjs.BABYLON.MaterialPluginBase] = ^.asInstanceOf[js.Dynamic].applyDynamic("createPBRSheenPlugin")(material.asInstanceOf[js.Any]).asInstanceOf[Nullable[typings.babylonjs.BABYLON.MaterialPluginBase]]

inline def createPBRSubSurfacePlugin(material: typings.babylonjs.BABYLON.Material): Nullable[typings.babylonjs.BABYLON.MaterialPluginBase] = ^.asInstanceOf[js.Dynamic].applyDynamic("createPBRSubSurfacePlugin")(material.asInstanceOf[js.Any]).asInstanceOf[Nullable[typings.babylonjs.BABYLON.MaterialPluginBase]]

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

inline def editableInPropertyPage(displayName: String): js.Function2[/* target */ Any, /* propertyKey */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("editableInPropertyPage")(displayName.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String, Unit]]
inline def editableInPropertyPage(displayName: String, propertyType: Unit, groupName: String): js.Function2[/* target */ Any, /* propertyKey */ String, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("editableInPropertyPage")(displayName.asInstanceOf[js.Any], propertyType.asInstanceOf[js.Any], groupName.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String, Unit]]
inline def editableInPropertyPage(displayName: String, propertyType: Unit, groupName: String, options: IEditablePropertyOption): js.Function2[/* target */ Any, /* propertyKey */ String, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("editableInPropertyPage")(displayName.asInstanceOf[js.Any], propertyType.asInstanceOf[js.Any], groupName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String, Unit]]
inline def editableInPropertyPage(displayName: String, propertyType: Unit, groupName: Unit, options: IEditablePropertyOption): js.Function2[/* target */ Any, /* propertyKey */ String, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("editableInPropertyPage")(displayName.asInstanceOf[js.Any], propertyType.asInstanceOf[js.Any], groupName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String, Unit]]
inline def editableInPropertyPage(displayName: String, propertyType: typings.babylonjs.BABYLON.PropertyTypeForEdition): js.Function2[/* target */ Any, /* propertyKey */ String, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("editableInPropertyPage")(displayName.asInstanceOf[js.Any], propertyType.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String, Unit]]
inline def editableInPropertyPage(
  displayName: String,
  propertyType: typings.babylonjs.BABYLON.PropertyTypeForEdition,
  groupName: String
): js.Function2[/* target */ Any, /* propertyKey */ String, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("editableInPropertyPage")(displayName.asInstanceOf[js.Any], propertyType.asInstanceOf[js.Any], groupName.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String, Unit]]
inline def editableInPropertyPage(
  displayName: String,
  propertyType: typings.babylonjs.BABYLON.PropertyTypeForEdition,
  groupName: String,
  options: IEditablePropertyOption
): js.Function2[/* target */ Any, /* propertyKey */ String, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("editableInPropertyPage")(displayName.asInstanceOf[js.Any], propertyType.asInstanceOf[js.Any], groupName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String, Unit]]
inline def editableInPropertyPage(
  displayName: String,
  propertyType: typings.babylonjs.BABYLON.PropertyTypeForEdition,
  groupName: Unit,
  options: IEditablePropertyOption
): js.Function2[/* target */ Any, /* propertyKey */ String, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("editableInPropertyPage")(displayName.asInstanceOf[js.Any], propertyType.asInstanceOf[js.Any], groupName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String, Unit]]

inline def expandToProperty(callback: String): js.Function2[/* target */ Any, /* propertyKey */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("expandToProperty")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String, Unit]]
inline def expandToProperty(callback: String, targetKey: Nullable[String]): js.Function2[/* target */ Any, /* propertyKey */ String, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("expandToProperty")(callback.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String, Unit]]

inline def extractMinAndMax(positions: FloatArray, start: Double, count: Double): Minimum = (^.asInstanceOf[js.Dynamic].applyDynamic("extractMinAndMax")(positions.asInstanceOf[js.Any], start.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[Minimum]
inline def extractMinAndMax(positions: FloatArray, start: Double, count: Double, bias: Unit, stride: Double): Minimum = (^.asInstanceOf[js.Dynamic].applyDynamic("extractMinAndMax")(positions.asInstanceOf[js.Any], start.asInstanceOf[js.Any], count.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], stride.asInstanceOf[js.Any])).asInstanceOf[Minimum]
inline def extractMinAndMax(
  positions: FloatArray,
  start: Double,
  count: Double,
  bias: Nullable[typings.babylonjs.BABYLON.Vector2]
): Minimum = (^.asInstanceOf[js.Dynamic].applyDynamic("extractMinAndMax")(positions.asInstanceOf[js.Any], start.asInstanceOf[js.Any], count.asInstanceOf[js.Any], bias.asInstanceOf[js.Any])).asInstanceOf[Minimum]
inline def extractMinAndMax(
  positions: FloatArray,
  start: Double,
  count: Double,
  bias: Nullable[typings.babylonjs.BABYLON.Vector2],
  stride: Double
): Minimum = (^.asInstanceOf[js.Dynamic].applyDynamic("extractMinAndMax")(positions.asInstanceOf[js.Any], start.asInstanceOf[js.Any], count.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], stride.asInstanceOf[js.Any])).asInstanceOf[Minimum]

inline def extractMinAndMaxIndexed(positions: FloatArray, indices: IndicesArray, indexStart: Double, indexCount: Double): Minimum = (^.asInstanceOf[js.Dynamic].applyDynamic("extractMinAndMaxIndexed")(positions.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], indexStart.asInstanceOf[js.Any], indexCount.asInstanceOf[js.Any])).asInstanceOf[Minimum]
inline def extractMinAndMaxIndexed(
  positions: FloatArray,
  indices: IndicesArray,
  indexStart: Double,
  indexCount: Double,
  bias: Nullable[typings.babylonjs.BABYLON.Vector2]
): Minimum = (^.asInstanceOf[js.Dynamic].applyDynamic("extractMinAndMaxIndexed")(positions.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], indexStart.asInstanceOf[js.Any], indexCount.asInstanceOf[js.Any], bias.asInstanceOf[js.Any])).asInstanceOf[Minimum]

inline def forceSceneHelpersToBundle: Boolean = ^.asInstanceOf[js.Dynamic].selectDynamic("_forceSceneHelpersToBundle").asInstanceOf[Boolean]
inline def forceSceneHelpersToBundle_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_forceSceneHelpersToBundle")(x.asInstanceOf[js.Any])

inline def forceTransformFeedbackToBundle: Boolean = ^.asInstanceOf[js.Dynamic].selectDynamic("_forceTransformFeedbackToBundle").asInstanceOf[Boolean]
inline def forceTransformFeedbackToBundle_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_forceTransformFeedbackToBundle")(x.asInstanceOf[js.Any])

/**
  * @internal
  */
inline def getImageData16bits(
  header: Any,
  palettes: js.typedarray.Uint8Array,
  pixel_data: js.typedarray.Uint8Array,
  y_start: Double,
  y_step: Double,
  y_end: Double,
  x_start: Double,
  x_step: Double,
  x_end: Double
): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("_getImageData16bits")(header.asInstanceOf[js.Any], palettes.asInstanceOf[js.Any], pixel_data.asInstanceOf[js.Any], y_start.asInstanceOf[js.Any], y_step.asInstanceOf[js.Any], y_end.asInstanceOf[js.Any], x_start.asInstanceOf[js.Any], x_step.asInstanceOf[js.Any], x_end.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]

/**
  * @internal
  */
inline def getImageData24bits(
  header: Any,
  palettes: js.typedarray.Uint8Array,
  pixel_data: js.typedarray.Uint8Array,
  y_start: Double,
  y_step: Double,
  y_end: Double,
  x_start: Double,
  x_step: Double,
  x_end: Double
): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("_getImageData24bits")(header.asInstanceOf[js.Any], palettes.asInstanceOf[js.Any], pixel_data.asInstanceOf[js.Any], y_start.asInstanceOf[js.Any], y_step.asInstanceOf[js.Any], y_end.asInstanceOf[js.Any], x_start.asInstanceOf[js.Any], x_step.asInstanceOf[js.Any], x_end.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]

/**
  * @internal
  */
inline def getImageData32bits(
  header: Any,
  palettes: js.typedarray.Uint8Array,
  pixel_data: js.typedarray.Uint8Array,
  y_start: Double,
  y_step: Double,
  y_end: Double,
  x_start: Double,
  x_step: Double,
  x_end: Double
): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("_getImageData32bits")(header.asInstanceOf[js.Any], palettes.asInstanceOf[js.Any], pixel_data.asInstanceOf[js.Any], y_start.asInstanceOf[js.Any], y_step.asInstanceOf[js.Any], y_end.asInstanceOf[js.Any], x_start.asInstanceOf[js.Any], x_step.asInstanceOf[js.Any], x_end.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]

/**
  * @internal
  */
inline def getImageData8bits(
  header: Any,
  palettes: js.typedarray.Uint8Array,
  pixel_data: js.typedarray.Uint8Array,
  y_start: Double,
  y_step: Double,
  y_end: Double,
  x_start: Double,
  x_step: Double,
  x_end: Double
): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("_getImageData8bits")(header.asInstanceOf[js.Any], palettes.asInstanceOf[js.Any], pixel_data.asInstanceOf[js.Any], y_start.asInstanceOf[js.Any], y_step.asInstanceOf[js.Any], y_end.asInstanceOf[js.Any], x_start.asInstanceOf[js.Any], x_step.asInstanceOf[js.Any], x_end.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]

/**
  * @internal
  */
inline def getImageDataGrey16bits(
  header: Any,
  palettes: js.typedarray.Uint8Array,
  pixel_data: js.typedarray.Uint8Array,
  y_start: Double,
  y_step: Double,
  y_end: Double,
  x_start: Double,
  x_step: Double,
  x_end: Double
): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("_getImageDataGrey16bits")(header.asInstanceOf[js.Any], palettes.asInstanceOf[js.Any], pixel_data.asInstanceOf[js.Any], y_start.asInstanceOf[js.Any], y_step.asInstanceOf[js.Any], y_end.asInstanceOf[js.Any], x_start.asInstanceOf[js.Any], x_step.asInstanceOf[js.Any], x_end.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]

/**
  * @internal
  */
inline def getImageDataGrey8bits(
  header: Any,
  palettes: js.typedarray.Uint8Array,
  pixel_data: js.typedarray.Uint8Array,
  y_start: Double,
  y_step: Double,
  y_end: Double,
  x_start: Double,
  x_step: Double,
  x_end: Double
): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("_getImageDataGrey8bits")(header.asInstanceOf[js.Any], palettes.asInstanceOf[js.Any], pixel_data.asInstanceOf[js.Any], y_start.asInstanceOf[js.Any], y_step.asInstanceOf[js.Any], y_end.asInstanceOf[js.Any], x_start.asInstanceOf[js.Any], x_step.asInstanceOf[js.Any], x_end.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]

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
      /* request */ js.UndefOr[typings.babylonjs.BABYLON.WebRequest], 
      /* exception */ js.UndefOr[typings.babylonjs.BABYLON.LoadFileError], 
      Unit
    ]
  ], 
  /* onOpened */ js.UndefOr[js.Function1[/* request */ typings.babylonjs.BABYLON.WebRequest, Unit]], 
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
  /* onError */ js.UndefOr[js.Function1[/* error */ typings.babylonjs.BABYLON.ReadFileError, Unit]], 
  IFileRequest
],
  RequestFile: js.Function7[
  /* url */ String, 
  /* onSuccess */ js.Function2[
    /* data */ String | js.typedarray.ArrayBuffer, 
    /* request */ js.UndefOr[typings.babylonjs.BABYLON.WebRequest], 
    Unit
  ], 
  /* onProgress */ js.UndefOr[js.Function1[/* event */ ProgressEvent[EventTarget], Unit]], 
  /* offlineProvider */ js.UndefOr[IOfflineProvider], 
  /* useArrayBuffer */ js.UndefOr[Boolean], 
  /* onError */ js.UndefOr[js.Function1[/* error */ typings.babylonjs.BABYLON.RequestFileError, Unit]], 
  /* onOpened */ js.UndefOr[js.Function1[/* request */ typings.babylonjs.BABYLON.WebRequest, Unit]], 
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

inline def setAndStartTimer(options: ITimerOptions[Any]): Nullable[typings.babylonjs.BABYLON.Observer[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("setAndStartTimer")(options.asInstanceOf[js.Any]).asInstanceOf[Nullable[typings.babylonjs.BABYLON.Observer[Any]]]

inline def setStereoscopicAnaglyphRigMode(camera: typings.babylonjs.BABYLON.Camera): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setStereoscopicAnaglyphRigMode")(camera.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def setStereoscopicRigMode(camera: typings.babylonjs.BABYLON.Camera): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setStereoscopicRigMode")(camera.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def setVRRigMode(camera: typings.babylonjs.BABYLON.Camera, rigParams: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setVRRigMode")(camera.asInstanceOf[js.Any], rigParams.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def setWebVRRigMode(camera: typings.babylonjs.BABYLON.Camera, rigParams: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setWebVRRigMode")(camera.asInstanceOf[js.Any], rigParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
