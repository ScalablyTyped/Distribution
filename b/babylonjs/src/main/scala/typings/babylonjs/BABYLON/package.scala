package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.NumberDictionary
import typings.babylonjs.XRInputSource
import typings.babylonjs.anon.IsBinary
import typings.babylonjs.anon.Layers
import typings.babylonjs.anon.Object
import typings.babylonjs.anon.TypeofQuaternionInstantiable
import typings.babylonjs.anon.TypeofVector2Instantiable
import typings.babylonjs.anon.TypeofVector3Instantiable
import typings.babylonjs.anon.TypeofVector4Instantiable
import typings.babylonjs.babylonjsStrings.XRProjectionLayer
import typings.babylonjs.babylonjsStrings.XRWebGLLayer
import typings.std.ConstructorParameters
import typings.std.Element
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

type BallAndSocketConstraint = PhysicsConstraint

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

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends babylonjs.BABYLON.Primitive ? T : T extends std.Array<infer U> ? babylonjs.BABYLON.DeepImmutableArray<U> : babylonjs.BABYLON.DeepImmutableObject<T>
  }}}
  */
type DeepImmutable[T] = T

/** @internal */
type DeepImmutableArray[T] = js.Array[DeepImmutable[T]]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends babylonjs.BABYLON.DeviceType.Keyboard | babylonjs.BABYLON.DeviceType.Generic ? number : T extends babylonjs.BABYLON.DeviceType.Mouse | babylonjs.BABYLON.DeviceType.Touch ? std.Exclude<babylonjs.BABYLON.PointerInput, babylonjs.BABYLON.PointerInput.Move | babylonjs.BABYLON.PointerInput.MouseWheelX | babylonjs.BABYLON.PointerInput.MouseWheelY | babylonjs.BABYLON.PointerInput.MouseWheelZ> : T extends babylonjs.BABYLON.DeviceType.DualShock ? babylonjs.BABYLON.DualShockInput : T extends babylonjs.BABYLON.DeviceType.Xbox ? babylonjs.BABYLON.XboxInput : T extends babylonjs.BABYLON.DeviceType.Switch ? babylonjs.BABYLON.SwitchInput : T extends babylonjs.BABYLON.DeviceType.DualSense ? babylonjs.BABYLON.DualSenseInput : never
  }}}
  */
type DeviceInput[T /* <: DeviceType */] = Double

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends babylonjs.BABYLON.DeviceType.Keyboard ? babylonjs.BABYLON.IKeyboardEvent : T extends babylonjs.BABYLON.DeviceType.Mouse ? babylonjs.BABYLON.IWheelEvent | babylonjs.BABYLON.IPointerEvent : T extends babylonjs.BABYLON.DeviceType.Touch ? babylonjs.BABYLON.IPointerEvent : never
  }}}
  */
type DeviceSourceEvent[T /* <: DeviceType */] = IKeyboardEvent

type DeviceSourceType = Distribute[DeviceType]

type DistanceConstraint = PhysicsConstraint

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends babylonjs.BABYLON.DeviceType ? babylonjs.BABYLON.DeviceSource<T> : never
  }}}
  */
type Distribute[T] = DeviceSource[T]

type EvaluateSubMeshStageAction = js.Function2[/* mesh */ AbstractMesh, /* subMesh */ SubMesh, Unit]

type FloatArray = js.Array[Double] | js.typedarray.Float32Array

type GetDepthInMetersType = js.Function2[/* x */ Double, /* y */ Double, Double]

type HingeConstraint = PhysicsConstraint

type IDecisionTree = /**
  * textureFormat can be either UASTC or ETC1S
  */
org.scalablytyped.runtime.StringDictionary[INode]

type IMotionControllerLayoutMap = /**
  * Layouts with handedness type as a key
  */
org.scalablytyped.runtime.StringDictionary[IMotionControllerLayout]

type ISceneLoaderPluginExtensions = /**
  * Defines the list of supported extensions
  */
org.scalablytyped.runtime.StringDictionary[IsBinary]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends babylonjs.BABYLON.Primitive ? T : T extends std.Array<infer U> ? std.ReadonlyArray<U> : babylonjs.BABYLON.DeepImmutable<T>
  }}}
  */
type Immutable[T] = T

type IndicesArray = js.Array[Double] | js.typedarray.Int32Array | js.typedarray.Uint32Array | js.typedarray.Uint16Array

type IndividualBabylonFileParser = js.Function3[/* parsedData */ Any, /* scene */ Scene, /* rootUrl */ String, Any]

type KeepAssets = AbstractScene

type LockConstraint = PhysicsConstraint

type MaterialPluginCreated = js.Object

type MatrixConstructor[T /* <: Matrix */] = Instantiable0[T]

type MeshStageAction = js.Function2[/* mesh */ AbstractMesh, /* hardwareInstancedRendering */ Boolean, Boolean]

type MotionControllerConstructor = js.Function2[/* xrInput */ XRInputSource, /* scene */ Scene, WebXRAbstractMotionController]

type NativeData = js.typedarray.Uint32Array

type NativeFramebuffer = js.typedarray.Uint32Array

type NativeProgram = js.typedarray.Uint32Array

type NativeTexture = js.typedarray.Uint32Array

type NativeUniform = js.typedarray.Uint32Array

type NativeVertexArrayObject = js.typedarray.Uint32Array

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

type PhysicsShapeBox = PhysicsShape

type PhysicsShapeCapsule = PhysicsShape

type PhysicsShapeContainer = PhysicsShape

type PhysicsShapeConvexHull = PhysicsShape

type PhysicsShapeCylinder = PhysicsShape

type PhysicsShapeMesh = PhysicsShape

type PhysicsShapeSphere = PhysicsShape

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

type PrismaticConstraint = PhysicsConstraint

type QuaternionConstructor[T /* <: Quaternion */] = Instantiable1[/* args */ ConstructorParameters[TypeofQuaternionInstantiable], T]

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

type SliderConstraint = PhysicsConstraint

type TextureSize = Double | Layers

type TrianglePickingPredicate = js.Function7[
/* p0 */ Vector3, 
/* p1 */ Vector3, 
/* p2 */ Vector3, 
/* ray */ Ray, 
/* i0 */ Double, 
/* i1 */ Double, 
/* i2 */ Double, 
Boolean]

type Vector2Constructor[T /* <: Vector2 */] = Instantiable1[/* args */ ConstructorParameters[TypeofVector2Instantiable], T]

type Vector3Constructor[T /* <: Vector3 */] = Instantiable1[/* args */ ConstructorParameters[TypeofVector3Instantiable], T]

type Vector4Constructor[T /* <: Vector4 */] = Instantiable1[/* args */ ConstructorParameters[TypeofVector4Instantiable], T]

type WebGPUExternalTexture = ExternalTexture

type WebXRCompositionLayerType = XRProjectionLayer

type WebXRFeatureConstructor = js.Function2[
/* xrSessionManager */ WebXRSessionManager, 
/* options */ js.UndefOr[Any], 
js.Function0[IWebXRFeature]]

type WebXRLayerType = XRWebGLLayer | WebXRCompositionLayerType

type double = Double

type float = Double

type int = Double
