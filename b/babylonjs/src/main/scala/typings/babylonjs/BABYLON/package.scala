package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.TopLevel
import typings.babylonjs.BABYLON.PointerInput.MouseWheelX
import typings.babylonjs.BABYLON.PointerInput.MouseWheelY
import typings.babylonjs.BABYLON.PointerInput.MouseWheelZ
import typings.babylonjs.BABYLON.PointerInput.Move
import typings.babylonjs.XRInputSource
import typings.babylonjs.anon.IsBinary
import typings.babylonjs.anon.Layers
import typings.babylonjs.anon.Object
import typings.babylonjs.babylonjsStrings.XRProjectionLayer
import typings.babylonjs.babylonjsStrings.XRWebGLLayer
import typings.babylonjs.babylonjsStrings.cpu
import typings.std.Element
import typings.std.Exclude
import typings.std.HTMLElement
import typings.std.IteratorResult
import typings.std.WebGLQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AsyncCoroutine[T] = CoroutineBase[Unit | js.Promise[Unit], T]

type BabylonFileParser = js.Function4[
/* parsedData */ Any, 
/* scene */ Scene, 
/* container */ AssetContainer, 
/* rootUrl */ String, 
Unit]

type BaseError = js.Error

type CameraInputsMap[TCamera /* <: Camera */] = (/**
  * Accessor to the input by input type.
  */
org.scalablytyped.runtime.StringDictionary[ICameraInput[TCamera]]) & (/**
  * Accessor to the input by input index.
  */
NumberDictionary[ICameraInput[TCamera]])

type CameraStageAction = js.Function1[/* camera */ Camera, Unit]

type CameraStageFrameBufferAction = js.Function1[/* camera */ Camera, Boolean]

type ComputeBindingList = org.scalablytyped.runtime.StringDictionary[Object]

type ComputeBindingMapping = org.scalablytyped.runtime.StringDictionary[ComputeBindingLocation]

type Coroutine[T] = CoroutineBase[Unit, T]

type CoroutineScheduler[T] = js.Function3[
/* coroutine */ AsyncCoroutine[T], 
/* onStep */ js.Function1[/* stepResult */ CoroutineStep[T], Unit], 
/* onError */ js.Function1[/* stepError */ Any, Unit], 
Unit]

type CoroutineStep[T] = IteratorResult[Unit, T]

type DataArray = js.Array[Double] | js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView

type DeepImmutable[T] = DeepImmutableObject[T] | DeepImmutableArray[Any] | T

type DeepImmutableObject[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{readonly [ K in keyof T ]: babylonjs.BABYLON.DeepImmutable<T[K]>}
  */ typings.babylonjs.babylonjsStrings.DeepImmutableObject & TopLevel[T]

/* Rewritten from type alias, can be one of: 
  - typings.babylonjs.BABYLON.DualSenseInput
  - typings.babylonjs.BABYLON.SwitchInput
  - typings.babylonjs.BABYLON.XboxInput
  - typings.babylonjs.BABYLON.DualShockInput
  - typings.std.Exclude[
typings.babylonjs.BABYLON.PointerInput, 
typings.babylonjs.BABYLON.PointerInput.Move | typings.babylonjs.BABYLON.PointerInput.MouseWheelX | typings.babylonjs.BABYLON.PointerInput.MouseWheelY | typings.babylonjs.BABYLON.PointerInput.MouseWheelZ]
  - scala.Double
*/
type DeviceInput[T /* <: DeviceType */] = _DeviceInput[T] | (Exclude[PointerInput, Move | MouseWheelX | MouseWheelY | MouseWheelZ]) | Double

type DeviceSourceType = Distribute[DeviceType]

type Distribute[T] = DeviceSource[T]

type EvaluateSubMeshStageAction = js.Function2[/* mesh */ AbstractMesh, /* subMesh */ SubMesh, Unit]

type FloatArray = js.Array[Double] | js.typedarray.Float32Array

type IComputePressureSource = cpu

type IMotionControllerLayoutMap = /**
  * Layouts with handedness type as a key
  */
org.scalablytyped.runtime.StringDictionary[IMotionControllerLayout]

type ISceneLoaderPluginExtensions = /**
  * Defines the list of supported extensions
  */
org.scalablytyped.runtime.StringDictionary[IsBinary]

type Immutable[T] = js.Array[Any] | T

type IndicesArray = js.Array[Double] | js.typedarray.Int32Array | js.typedarray.Uint32Array | js.typedarray.Uint16Array

type IndividualBabylonFileParser = js.Function3[/* parsedData */ Any, /* scene */ Scene, /* rootUrl */ String, Any]

type KeepAssets = AbstractScene

type MaterialPluginCreated = js.Object

type MeshStageAction = js.Function2[/* mesh */ AbstractMesh, /* hardwareInstancedRendering */ Boolean, Boolean]

type MotionControllerConstructor = js.Function2[/* xrInput */ XRInputSource, /* scene */ Scene, WebXRAbstractMotionController]

type NativeData = js.typedarray.Uint32Array

type NodeConstructor = js.Function3[
/* name */ String, 
/* scene */ Scene, 
/* options */ js.UndefOr[Any], 
js.Function0[Node]]

type Nullable[T] = T | Null

type ObserveCallback = js.Function2[/* functionName */ String, /* previousLength */ Double, Unit]

type OcclusionMaterial = ShaderMaterial

type OcclusionQuery = WebGLQuery | Double

type PerfStrategyInitialization = js.Function1[/* scene */ Scene, IPerfViewerCollectionStrategy]

type PluginMaterialFactory = js.Function1[/* material */ Material, Nullable[MaterialPluginBase]]

type PointerMoveStageAction = js.Function5[
/* unTranslatedPointerX */ Double, 
/* unTranslatedPointerY */ Double, 
/* pickResult */ Nullable[PickingInfo], 
/* isMeshPicked */ Boolean, 
/* element */ Nullable[HTMLElement], 
Nullable[PickingInfo]]

type PointerUpDownStageAction = js.Function5[
/* unTranslatedPointerX */ Double, 
/* unTranslatedPointerY */ Double, 
/* pickResult */ Nullable[PickingInfo], 
/* evt */ IPointerEvent, 
/* doubleClick */ Boolean, 
Nullable[PickingInfo]]

type PreActiveMeshStageAction = js.Function1[/* mesh */ AbstractMesh, Unit]

/**
  * Alias type for primitive types
  * @ignorenaming
  */
type Primitive = js.UndefOr[Null | Boolean | String | Double | js.Function | Element]

type RenderTargetStageAction = js.Function3[
/* renderTarget */ RenderTargetTexture, 
/* faceIndex */ js.UndefOr[Double], 
/* layer */ js.UndefOr[Double], 
Unit]

type RenderTargetTextureSize = TextureSize

type RenderTargetsStageAction = js.Function1[/* renderTargets */ SmartArrayNoDuplicate[RenderTargetTexture], Unit]

type RenderingGroupStageAction = js.Function1[/* renderingGroupId */ Double, Unit]

type RenderingMeshStageAction = js.Function4[
/* mesh */ Mesh, 
/* subMesh */ SubMesh, 
/* batch */ Any, 
/* effect */ Nullable[Effect], 
Unit]

type SceneLoaderSuccessCallback = js.Function7[
/* meshes */ js.Array[AbstractMesh], 
/* particleSystems */ js.Array[IParticleSystem], 
/* skeletons */ js.Array[Skeleton], 
/* animationGroups */ js.Array[AnimationGroup], 
/* transformNodes */ js.Array[TransformNode], 
/* geometries */ js.Array[Geometry], 
/* lights */ js.Array[Light], 
Unit]

type ShaderCustomProcessingFunction = js.Function2[/* shaderType */ String, /* code */ String, String]

type SimpleStageAction = js.Function0[Unit]

type TextureSize = Double | Layers

type TrianglePickingPredicate = js.Function4[/* p0 */ Vector3, /* p1 */ Vector3, /* p2 */ Vector3, /* ray */ Ray, Boolean]

type WebGPUExternalTexture = ExternalTexture

type WebXRCompositionLayerType = XRProjectionLayer

type WebXRFeatureConstructor = js.Function2[
/* xrSessionManager */ WebXRSessionManager, 
/* options */ js.UndefOr[Any], 
js.Function0[IWebXRFeature]]

type WebXRLayerType = XRWebGLLayer | WebXRCompositionLayerType

type XRHandMeshRigMapping = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ webXRJointName in babylonjs.BABYLON.XRHandJoint ]: string}
  */ typings.babylonjs.babylonjsStrings.XRHandMeshRigMapping & TopLevel[Any]

type double = Double

type float = Double

type int = Double
