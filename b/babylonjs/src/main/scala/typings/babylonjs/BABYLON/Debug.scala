package typings.babylonjs.BABYLON

import typings.babylonjs.anon.PartialISkeletonViewerOptComputeBonesUsingShaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Debug {
  
  @js.native
  trait AxesViewer extends StObject {
    
    /* private */ var _instanced: js.Any = js.native
    
    /* private */ var _scaleLinesFactor: js.Any = js.native
    
    /* private */ var _xAxis: js.Any = js.native
    
    /* private */ var _yAxis: js.Any = js.native
    
    /* private */ var _zAxis: js.Any = js.native
    
    /**
      * Creates an instance of this axes viewer.
      * @returns a new axes viewer with instanced meshes
      */
    def createInstance(): AxesViewer = js.native
    
    /** Releases resources */
    def dispose(): Unit = js.native
    
    /**
      * Gets or sets a number used to scale line length
      */
    var scaleLines: Double = js.native
    
    /**
      * Gets the hosting scene
      */
    var scene: Nullable[Scene] = js.native
    
    /**
      * Force the viewer to update
      * @param position defines the position of the viewer
      * @param xaxis defines the x axis of the viewer
      * @param yaxis defines the y axis of the viewer
      * @param zaxis defines the z axis of the viewer
      */
    def update(position: Vector3, xaxis: Vector3, yaxis: Vector3, zaxis: Vector3): Unit = js.native
    
    /** Gets the node hierarchy used to render x-axis */
    def xAxis: TransformNode = js.native
    
    /** Gets the node hierarchy used to render y-axis */
    def yAxis: TransformNode = js.native
    
    /** Gets the node hierarchy used to render z-axis */
    def zAxis: TransformNode = js.native
  }
  
  @js.native
  trait BoneAxesViewer
    extends StObject
       with AxesViewer {
    
    /**
      * Gets or sets the target bone where to display the axes viewer
      */
    var bone: Nullable[Bone] = js.native
    
    /**
      * Gets or sets the target mesh where to display the axes viewer
      */
    var mesh: Nullable[Mesh] = js.native
    
    /** Gets current position */
    var pos: Vector3 = js.native
    
    /**
      * Force the viewer to update
      */
    def update(): Unit = js.native
    
    /** Gets direction of X axis */
    var xaxis: Vector3 = js.native
    
    /** Gets direction of Y axis */
    var yaxis: Vector3 = js.native
    
    /** Gets direction of Z axis */
    var zaxis: Vector3 = js.native
  }
  
  @js.native
  trait PhysicsViewer extends StObject {
    
    /* private */ var _debugBoxMesh: js.Any = js.native
    
    /* private */ var _debugCylinderMesh: js.Any = js.native
    
    /* private */ var _debugMaterial: js.Any = js.native
    
    /* private */ var _debugMeshMeshes: js.Any = js.native
    
    /* private */ var _debugSphereMesh: js.Any = js.native
    
    /* private */ var _getDebugBoxMesh: js.Any = js.native
    
    /* private */ var _getDebugCylinderMesh: js.Any = js.native
    
    /* private */ var _getDebugMaterial: js.Any = js.native
    
    /* private */ var _getDebugMesh: js.Any = js.native
    
    /* private */ var _getDebugMeshMesh: js.Any = js.native
    
    /* private */ var _getDebugSphereMesh: js.Any = js.native
    
    /** @hidden */
    /* protected */ var _impostors: js.Array[Nullable[PhysicsImpostor]] = js.native
    
    /** @hidden */
    /* protected */ var _meshes: js.Array[Nullable[AbstractMesh]] = js.native
    
    /** @hidden */
    /* protected */ var _numMeshes: Double = js.native
    
    /** @hidden */
    /* protected */ var _physicsEnginePlugin: Nullable[IPhysicsEnginePlugin] = js.native
    
    /* private */ var _renderFunction: js.Any = js.native
    
    /** @hidden */
    /* protected */ var _scene: Nullable[Scene] = js.native
    
    /** @hidden */
    /* protected */ def _updateDebugMeshes(): Unit = js.native
    
    /* private */ var _utilityLayer: js.Any = js.native
    
    /** Releases all resources */
    def dispose(): Unit = js.native
    
    /**
      * Hides a specified physic impostor
      * @param impostor defines the impostor to hide
      */
    def hideImpostor(impostor: Nullable[PhysicsImpostor]): Unit = js.native
    
    /**
      * Renders a specified physic impostor
      * @param impostor defines the impostor to render
      * @param targetMesh defines the mesh represented by the impostor
      * @returns the new debug mesh used to render the impostor
      */
    def showImpostor(impostor: PhysicsImpostor): Nullable[AbstractMesh] = js.native
    def showImpostor(impostor: PhysicsImpostor, targetMesh: Mesh): Nullable[AbstractMesh] = js.native
  }
  
  @js.native
  trait SkeletonViewer extends StObject {
    
    /** The Dynamic bindings for the update functions */
    /* private */ var _bindObs: js.Any = js.native
    
    /* private */ var _boneIndices: js.Any = js.native
    
    /* private */ var _buildLocalAxes: js.Any = js.native
    
    /** function to build and bind sphere joint points and spur bone representations. */
    /* private */ var _buildSpheresAndSpurs: js.Any = js.native
    
    /** Array of the points of the skeleton fo the line view. */
    /* private */ var _debugLines: js.Any = js.native
    
    /** The SkeletonViewers Mesh. */
    /* private */ var _debugMesh: js.Any = js.native
    
    /** Update the viewer to sync with current skeleton state, only used for the line display. */
    /* private */ var _displayLinesUpdate: js.Any = js.native
    
    /** function to get the absolute bind pose of a bone by accumulating transformations up the bone hierarchy. */
    /* private */ var _getAbsoluteBindPoseToRef: js.Any = js.native
    
    /* private */ var _getBonePosition: js.Any = js.native
    
    /* private */ var _getLinesForBonesNoLength: js.Any = js.native
    
    /* private */ var _getLinesForBonesWithLength: js.Any = js.native
    
    /** If SkeletonViewer is enabled. */
    /* private */ var _isEnabled: js.Any = js.native
    
    /** The local axes Meshes. */
    /* private */ var _localAxes: js.Any = js.native
    
    /** SkeletonViewer render observable. */
    /* private */ var _obs: js.Any = js.native
    
    /** If SkeletonViewer is ready. */
    /* private */ var _ready: js.Any = js.native
    
    /** function to revert the mesh and scene back to the initial state. */
    /* private */ var _revert: js.Any = js.native
    
    /** If SkeletonViewer scene scope. */
    /* private */ var _scene: js.Any = js.native
    
    /** The Utility Layer to render the gizmos in. */
    /* private */ var _utilityLayer: js.Any = js.native
    
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
    var options: PartialISkeletonViewerOptComputeBonesUsingShaders = js.native
    
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
}
