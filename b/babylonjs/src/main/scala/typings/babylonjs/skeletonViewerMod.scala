package typings.babylonjs

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.anon.PartialISkeletonViewerOpt
import typings.babylonjs.iskeletonviewerMod.IBoneWeightShaderOptions
import typings.babylonjs.iskeletonviewerMod.ISkeletonMapShaderOptions
import typings.babylonjs.linesMeshMod.LinesMesh
import typings.babylonjs.mathColorMod.Color3
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.shaderMaterialMod.ShaderMaterial
import typings.babylonjs.skeletonMod.Skeleton
import typings.babylonjs.typesMod.Nullable
import typings.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Debug/skeletonViewer", JSImport.Namespace)
@js.native
object skeletonViewerMod extends js.Object {
  
  @js.native
  class SkeletonViewer protected () extends js.Object {
    /**
      * Creates a new SkeletonViewer
      * @param skeleton defines the skeleton to render
      * @param mesh defines the mesh attached to the skeleton
      * @param scene defines the hosting scene
      * @param autoUpdateBonesMatrices defines a boolean indicating if bones matrices must be forced to update before rendering (true by default)
      * @param renderingGroupId defines the rendering group id to use with the viewer
      * @param options All of the extra constructor options for the SkeletonViewer
      */
    def this(
      /** defines the skeleton to render */
    skeleton: Skeleton,
      /** defines the mesh attached to the skeleton */
    mesh: AbstractMesh,
      /** The Scene scope*/
    scene: Scene
    ) = this()
    def this(
      /** defines the skeleton to render */
    skeleton: Skeleton,
      /** defines the mesh attached to the skeleton */
    mesh: AbstractMesh,
      /** The Scene scope*/
    scene: Scene,
      /** defines a boolean indicating if bones matrices must be forced to update before rendering (true by default)  */
    autoUpdateBonesMatrices: Boolean
    ) = this()
    def this(
      /** defines the skeleton to render */
    skeleton: Skeleton,
      /** defines the mesh attached to the skeleton */
    mesh: AbstractMesh,
      /** The Scene scope*/
    scene: Scene,
      /** defines a boolean indicating if bones matrices must be forced to update before rendering (true by default)  */
    autoUpdateBonesMatrices: js.UndefOr[scala.Nothing],
      /** defines the rendering group id to use with the viewer */
    renderingGroupId: Double
    ) = this()
    def this(
      /** defines the skeleton to render */
    skeleton: Skeleton,
      /** defines the mesh attached to the skeleton */
    mesh: AbstractMesh,
      /** The Scene scope*/
    scene: Scene,
      /** defines a boolean indicating if bones matrices must be forced to update before rendering (true by default)  */
    autoUpdateBonesMatrices: Boolean,
      /** defines the rendering group id to use with the viewer */
    renderingGroupId: Double
    ) = this()
    def this(
      /** defines the skeleton to render */
    skeleton: Skeleton,
      /** defines the mesh attached to the skeleton */
    mesh: AbstractMesh,
      /** The Scene scope*/
    scene: Scene,
      /** defines a boolean indicating if bones matrices must be forced to update before rendering (true by default)  */
    autoUpdateBonesMatrices: js.UndefOr[scala.Nothing],
      /** defines the rendering group id to use with the viewer */
    renderingGroupId: js.UndefOr[scala.Nothing],
      /** is the options for the viewer */
    options: PartialISkeletonViewerOpt
    ) = this()
    def this(
      /** defines the skeleton to render */
    skeleton: Skeleton,
      /** defines the mesh attached to the skeleton */
    mesh: AbstractMesh,
      /** The Scene scope*/
    scene: Scene,
      /** defines a boolean indicating if bones matrices must be forced to update before rendering (true by default)  */
    autoUpdateBonesMatrices: js.UndefOr[scala.Nothing],
      /** defines the rendering group id to use with the viewer */
    renderingGroupId: Double,
      /** is the options for the viewer */
    options: PartialISkeletonViewerOpt
    ) = this()
    def this(
      /** defines the skeleton to render */
    skeleton: Skeleton,
      /** defines the mesh attached to the skeleton */
    mesh: AbstractMesh,
      /** The Scene scope*/
    scene: Scene,
      /** defines a boolean indicating if bones matrices must be forced to update before rendering (true by default)  */
    autoUpdateBonesMatrices: Boolean,
      /** defines the rendering group id to use with the viewer */
    renderingGroupId: js.UndefOr[scala.Nothing],
      /** is the options for the viewer */
    options: PartialISkeletonViewerOpt
    ) = this()
    def this(
      /** defines the skeleton to render */
    skeleton: Skeleton,
      /** defines the mesh attached to the skeleton */
    mesh: AbstractMesh,
      /** The Scene scope*/
    scene: Scene,
      /** defines a boolean indicating if bones matrices must be forced to update before rendering (true by default)  */
    autoUpdateBonesMatrices: Boolean,
      /** defines the rendering group id to use with the viewer */
    renderingGroupId: Double,
      /** is the options for the viewer */
    options: PartialISkeletonViewerOpt
    ) = this()
    
    /** The Dynamic bindings for the update functions */
    var _bindObs: js.Any = js.native
    
    var _boneIndices: js.Any = js.native
    
    var _buildLocalAxes: js.Any = js.native
    
    /** function to build and bind sphere joint points and spur bone representations. */
    var _buildSpheresAndSpurs: js.Any = js.native
    
    /** Array of the points of the skeleton fo the line view. */
    var _debugLines: js.Any = js.native
    
    /** The SkeletonViewers Mesh. */
    var _debugMesh: js.Any = js.native
    
    /** Update the viewer to sync with current skeleton state, only used for the line display. */
    var _displayLinesUpdate: js.Any = js.native
    
    /** function to get the absolute bind pose of a bone by accumulating transformations up the bone hierarchy. */
    var _getAbsoluteBindPoseToRef: js.Any = js.native
    
    var _getBonePosition: js.Any = js.native
    
    var _getLinesForBonesNoLength: js.Any = js.native
    
    var _getLinesForBonesWithLength: js.Any = js.native
    
    /** If SkeletonViewer is enabled. */
    var _isEnabled: js.Any = js.native
    
    /** The local axes Meshes. */
    var _localAxes: js.Any = js.native
    
    /** SkeletonViewer render observable. */
    var _obs: js.Any = js.native
    
    /** If SkeletonViewer is ready. */
    var _ready: js.Any = js.native
    
    /** function to revert the mesh and scene back to the initial state. */
    var _revert: js.Any = js.native
    
    /** If SkeletonViewer scene scope. */
    var _scene: js.Any = js.native
    
    /** The Utility Layer to render the gizmos in. */
    var _utilityLayer: js.Any = js.native
    
    /** defines a boolean indicating if bones matrices must be forced to update before rendering (true by default)  */
    var autoUpdateBonesMatrices: Boolean = js.native
    
    /** Changes the displayMode of the skeleton viewer
      * @param mode The displayMode numerical value
      */
    def changeDisplayMode(mode: Double): Unit = js.native
    
    /** Sets a display option of the skeleton viewer
      *
      * | Option           | Type    | Default | Description |
      * | ---------------- | ------- | ------- | ----------- |
      * | midStep          | float   | 0.235   | A percentage between a bone and its child that determines the widest part of a spur. Only used when `displayMode` is set to `DISPLAY_SPHERE_AND_SPURS`. |
      * | midStepFactor    | float   | 0.15    | Mid step width expressed as a factor of the length. A value of 0.5 makes the spur width half of the spur length. Only used when `displayMode` is set to `DISPLAY_SPHERE_AND_SPURS`. |
      * | sphereBaseSize   | float   | 2       | Sphere base size. Only used when `displayMode` is set to `DISPLAY_SPHERE_AND_SPURS`. |
      * | sphereScaleUnit  | float   | 0.865   | Sphere scale factor used to scale spheres in relation to the longest bone. Only used when `displayMode` is set to `DISPLAY_SPHERE_AND_SPURS`. |
      * | spurFollowsChild | boolean | false   | Whether a spur should attach its far end to the child bone. |
      * | showLocalAxes    | boolean | false   | Displays local axes on all bones. |
      * | localAxesSize    | float   | 0.075   | Determines the length of each local axis. |
      *
      * @param option String of the option name
      * @param value The numerical option value
      */
    def changeDisplayOptions(option: String, value: Double): Unit = js.native
    
    /** Gets or sets the color used to render the skeleton */
    var color: Color3 = js.native
    
    /** Gets the debugMesh */
    def debugMesh: Nullable[AbstractMesh | LinesMesh] = js.native
    /** Sets the debugMesh */
    def debugMesh_=(value: Nullable[AbstractMesh | LinesMesh]): Unit = js.native
    
    /** Gets the displayMode */
    def displayMode: Double = js.native
    /** Sets the displayMode */
    def displayMode_=(value: Double): Unit = js.native
    
    /** Release associated resources */
    def dispose(): Unit = js.native
    
    def isEnabled: Boolean = js.native
    /** Gets or sets a boolean indicating if the viewer is enabled */
    def isEnabled_=(value: Boolean): Unit = js.native
    
    /** Checks Ready Status. */
    def isReady: Boolean = js.native
    
    /** defines the mesh attached to the skeleton */
    var mesh: AbstractMesh = js.native
    
    /** is the options for the viewer */
    var options: PartialISkeletonViewerOpt = js.native
    
    /** Sets Ready Status. */
    def ready_=(value: Boolean): Unit = js.native
    
    /** defines the rendering group id to use with the viewer */
    var renderingGroupId: Double = js.native
    
    /** Gets the Scene. */
    def scene: Scene = js.native
    
    /** defines the skeleton to render */
    var skeleton: Skeleton = js.native
    
    /** Update the viewer to sync with current skeleton state, only used to manually update. */
    def update(): Unit = js.native
    
    /** Gets the utilityLayer. */
    def utilityLayer: Nullable[UtilityLayerRenderer] = js.native
  }
  /* static members */
  @js.native
  object SkeletonViewer extends js.Object {
    
    /** public static method to create a BoneWeight Shader
      * @param options The constructor options
      * @param scene The scene that the shader is scoped to
      * @returns The created ShaderMaterial
      * @see http://www.babylonjs-playground.com/#1BZJVJ#395
      */
    def CreateBoneWeightShader(options: IBoneWeightShaderOptions, scene: Scene): ShaderMaterial = js.native
    
    /** public static method to create a BoneWeight Shader
      * @param options The constructor options
      * @param scene The scene that the shader is scoped to
      * @returns The created ShaderMaterial
      */
    def CreateSkeletonMapShader(options: ISkeletonMapShaderOptions, scene: Scene): ShaderMaterial = js.native
    
    /** public Display constants BABYLON.SkeletonViewer.DISPLAY_LINES */
    val DISPLAY_LINES: Double = js.native
    
    /** public Display constants BABYLON.SkeletonViewer.DISPLAY_SPHERES */
    val DISPLAY_SPHERES: Double = js.native
    
    /** public Display constants BABYLON.SkeletonViewer.DISPLAY_SPHERE_AND_SPURS */
    val DISPLAY_SPHERE_AND_SPURS: Double = js.native
    
    /** private static method to create a BoneWeight Shader
      * @param size The size of the buffer to create (usually the bone count)
      * @param colorMap The gradient data to generate
      * @param scene The scene that the shader is scoped to
      * @returns an Array of floats from the color gradient values
      */
    var _CreateBoneMapColorBuffer: js.Any = js.native
  }
}
