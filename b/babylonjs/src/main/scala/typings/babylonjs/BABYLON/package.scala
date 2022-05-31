package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type BabylonFileParser = js.Function4[
/* parsedData */ js.Any, 
/* scene */ typings.babylonjs.BABYLON.Scene, 
/* container */ typings.babylonjs.BABYLON.AssetContainer, 
/* rootUrl */ java.lang.String, 
scala.Unit]

type BaseError = typings.std.Error

type CameraInputsMap[TCamera /* <: typings.babylonjs.BABYLON.Camera */] = (/**
  * Accessor to the input by input type.
  */
org.scalablytyped.runtime.StringDictionary[typings.babylonjs.BABYLON.ICameraInput[TCamera]]) & (/**
  * Accessor to the input by input index.
  */
org.scalablytyped.runtime.NumberDictionary[typings.babylonjs.BABYLON.ICameraInput[TCamera]])

type CameraStageAction = js.Function1[/* camera */ typings.babylonjs.BABYLON.Camera, scala.Unit]

type CameraStageFrameBufferAction = js.Function1[/* camera */ typings.babylonjs.BABYLON.Camera, scala.Boolean]

type DataArray = js.Array[scala.Double] | typings.std.ArrayBuffer | typings.std.ArrayBufferView

type DeepImmutable[T] = typings.babylonjs.BABYLON.DeepImmutableObject[T] | typings.babylonjs.BABYLON.DeepImmutableArray[js.Any] | T

type DeepImmutableObject[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{readonly [ K in keyof T ]: babylonjs.BABYLON.DeepImmutable<T[K]>}
  */ typings.babylonjs.babylonjsStrings.DeepImmutableObject & org.scalablytyped.runtime.TopLevel[T]

/* Rewritten from type alias, can be one of: 
  - typings.babylonjs.BABYLON.SwitchInput
  - typings.babylonjs.BABYLON.XboxInput
  - typings.babylonjs.BABYLON.DualShockInput
  - typings.babylonjs.BABYLON.PointerInput
  - scala.Double
*/
type DeviceInput[T /* <: typings.babylonjs.BABYLON.DeviceType */] = typings.babylonjs.BABYLON._DeviceInput[T] | scala.Double

type EvaluateSubMeshStageAction = js.Function2[
/* mesh */ typings.babylonjs.BABYLON.AbstractMesh, 
/* subMesh */ typings.babylonjs.BABYLON.SubMesh, 
scala.Unit]

type FloatArray = js.Array[scala.Double] | typings.std.Float32Array

type IMotionControllerLayoutMap = /**
  * Layouts with handedness type as a key
  */
org.scalablytyped.runtime.StringDictionary[typings.babylonjs.BABYLON.IMotionControllerLayout]

type ISceneLoaderPluginExtensions = /**
  * Defines the list of supported extensions
  */
org.scalablytyped.runtime.StringDictionary[typings.babylonjs.anon.IsBinary]

type Immutable[T] = typings.babylonjs.BABYLON.DeepImmutable[T] | js.Array[js.Any] | T

type IndicesArray = js.Array[scala.Double] | typings.std.Int32Array | typings.std.Uint32Array | typings.std.Uint16Array

type IndividualBabylonFileParser = js.Function3[
/* parsedData */ js.Any, 
/* scene */ typings.babylonjs.BABYLON.Scene, 
/* rootUrl */ java.lang.String, 
js.Any]

type KeepAssets = typings.babylonjs.BABYLON.AbstractScene

type MeshStageAction = js.Function2[
/* mesh */ typings.babylonjs.BABYLON.AbstractMesh, 
/* hardwareInstancedRendering */ scala.Boolean, 
scala.Boolean]

type MotionControllerConstructor = js.Function2[
/* xrInput */ typings.babylonjs.XRInputSource, 
/* scene */ typings.babylonjs.BABYLON.Scene, 
typings.babylonjs.BABYLON.WebXRAbstractMotionController]

type NodeConstructor = js.Function3[
/* name */ java.lang.String, 
/* scene */ typings.babylonjs.BABYLON.Scene, 
/* options */ js.UndefOr[js.Any], 
js.Function0[typings.babylonjs.BABYLON.Node]]

type Nullable[T] = T | scala.Null

type PointerMoveStageAction = js.Function5[
/* unTranslatedPointerX */ scala.Double, 
/* unTranslatedPointerY */ scala.Double, 
/* pickResult */ typings.babylonjs.BABYLON.Nullable[typings.babylonjs.BABYLON.PickingInfo], 
/* isMeshPicked */ scala.Boolean, 
/* element */ typings.std.HTMLElement, 
typings.babylonjs.BABYLON.Nullable[typings.babylonjs.BABYLON.PickingInfo]]

type PointerUpDownStageAction = js.Function4[
/* unTranslatedPointerX */ scala.Double, 
/* unTranslatedPointerY */ scala.Double, 
/* pickResult */ typings.babylonjs.BABYLON.Nullable[typings.babylonjs.BABYLON.PickingInfo], 
/* evt */ typings.std.PointerEvent, 
typings.babylonjs.BABYLON.Nullable[typings.babylonjs.BABYLON.PickingInfo]]

type PreActiveMeshStageAction = js.Function1[/* mesh */ typings.babylonjs.BABYLON.AbstractMesh, scala.Unit]

/**
  * Alias type for primitive types
  * @ignorenaming
  */
type Primitive = js.UndefOr[scala.Null | scala.Boolean | java.lang.String | scala.Double | js.Function]

type RenderTargetStageAction = js.Function1[/* renderTarget */ typings.babylonjs.BABYLON.RenderTargetTexture, scala.Unit]

type RenderTargetTextureSize = scala.Double | typings.babylonjs.anon.Height

type RenderTargetsStageAction = js.Function1[
/* renderTargets */ typings.babylonjs.BABYLON.SmartArrayNoDuplicate[typings.babylonjs.BABYLON.RenderTargetTexture], 
scala.Unit]

type RenderingGroupStageAction = js.Function1[/* renderingGroupId */ scala.Double, scala.Unit]

type RenderingMeshStageAction = js.Function4[
/* mesh */ typings.babylonjs.BABYLON.Mesh, 
/* subMesh */ typings.babylonjs.BABYLON.SubMesh, 
/* batch */ typings.babylonjs.BABYLON.InstancesBatch, 
/* effect */ typings.babylonjs.BABYLON.Nullable[typings.babylonjs.BABYLON.Effect], 
scala.Unit]

type SceneLoaderSuccessCallback = js.Function7[
/* meshes */ js.Array[typings.babylonjs.BABYLON.AbstractMesh], 
/* particleSystems */ js.Array[typings.babylonjs.BABYLON.IParticleSystem], 
/* skeletons */ js.Array[typings.babylonjs.BABYLON.Skeleton], 
/* animationGroups */ js.Array[typings.babylonjs.BABYLON.AnimationGroup], 
/* transformNodes */ js.Array[typings.babylonjs.BABYLON.TransformNode], 
/* geometries */ js.Array[typings.babylonjs.BABYLON.Geometry], 
/* lights */ js.Array[typings.babylonjs.BABYLON.Light], 
scala.Unit]

type SimpleStageAction = js.Function0[scala.Unit]

type TrianglePickingPredicate = js.Function4[
/* p0 */ typings.babylonjs.BABYLON.Vector3, 
/* p1 */ typings.babylonjs.BABYLON.Vector3, 
/* p2 */ typings.babylonjs.BABYLON.Vector3, 
/* ray */ typings.babylonjs.BABYLON.Ray, 
scala.Boolean]

type WebXRFeatureConstructor = js.Function2[
/* xrSessionManager */ typings.babylonjs.BABYLON.WebXRSessionManager, 
/* options */ js.UndefOr[js.Any], 
js.Function0[typings.babylonjs.BABYLON.IWebXRFeature]]

type double = scala.Double

type float = scala.Double

type int = scala.Double
