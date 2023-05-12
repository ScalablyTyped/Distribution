package typings.babylonjs.BABYLON

import typings.babylonjs.anon.PartialISkeletonViewerOptComputeBonesUsingShaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Debug {
  
  @js.native
  trait AxesViewer extends StObject {
    
    /* private */ var _instanced: Any = js.native
    
    /* private */ var _scaleLinesFactor: Any = js.native
    
    /* private */ var _xAxis: Any = js.native
    
    /* private */ var _yAxis: Any = js.native
    
    /* private */ var _zAxis: Any = js.native
    
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
    
    /** @internal */
    /* protected */ var _bodies: js.Array[Nullable[PhysicsBody]] = js.native
    
    /** @internal */
    /* protected */ var _bodyMeshes: js.Array[Nullable[AbstractMesh]] = js.native
    
    /* private */ var _debugBoxMesh: Any = js.native
    
    /* private */ var _debugCapsuleMesh: Any = js.native
    
    /* private */ var _debugCylinderMesh: Any = js.native
    
    /* private */ var _debugMaterial: Any = js.native
    
    /* private */ var _debugMeshMeshes: Any = js.native
    
    /* private */ var _debugSphereMesh: Any = js.native
    
    /**
      * Creates a debug mesh for a given physics body
      * @param body The physics body to create the debug mesh for
      * @returns The created debug mesh or null if the utility layer is not available
      *
      * This code is useful for creating a debug mesh for a given physics body.
      * It creates a Mesh object with a VertexData object containing the positions and indices
      * of the geometry of the body. The mesh is then assigned a debug material from the utility layer scene.
      * This allows for visualizing the physics body in the scene.
      */
    /* private */ var _getDebugBodyMesh: Any = js.native
    
    /* private */ var _getDebugBoxMesh: Any = js.native
    
    /* private */ var _getDebugCapsuleMesh: Any = js.native
    
    /* private */ var _getDebugCylinderMesh: Any = js.native
    
    /* private */ var _getDebugMaterial: Any = js.native
    
    /* private */ var _getDebugMesh: Any = js.native
    
    /* private */ var _getDebugMeshMesh: Any = js.native
    
    /* private */ var _getDebugSphereMesh: Any = js.native
    
    /** @internal */
    /* protected */ var _impostors: js.Array[Nullable[PhysicsImpostor]] = js.native
    
    /** @internal */
    /* protected */ var _meshes: js.Array[Nullable[AbstractMesh]] = js.native
    
    /** @internal */
    /* protected */ var _numBodies: Double = js.native
    
    /** @internal */
    /* protected */ var _numMeshes: Double = js.native
    
    /** @internal */
    /* protected */ var _physicsEnginePlugin: IPhysicsEnginePlugin | IPhysicsEnginePluginV2 | Null = js.native
    
    /* private */ var _renderFunction: Any = js.native
    
    /** @internal */
    /* protected */ var _scene: Nullable[Scene] = js.native
    
    /**
      * Updates the debug meshes of the physics engine.
      *
      * This code is useful for synchronizing the debug meshes of the physics engine with the physics impostor and mesh.
      * It checks if the impostor is disposed and if the plugin version is 1, then it syncs the mesh with the impostor.
      * This ensures that the debug meshes are up to date with the physics engine.
      */
    /* protected */ def _updateDebugMeshes(): Unit = js.native
    
    /**
      * Updates the debug meshes of the physics engine.
      *
      * This method is useful for synchronizing the debug meshes with the physics impostors.
      * It iterates through the impostors and meshes, and if the plugin version is 1, it syncs the mesh with the impostor.
      * This ensures that the debug meshes accurately reflect the physics impostors, which is important for debugging the physics engine.
      */
    /* protected */ def _updateDebugMeshesV1(): Unit = js.native
    
    /**
      * Updates the debug meshes of the physics engine for V2 plugin.
      *
      * This method is useful for synchronizing the debug meshes of the physics engine with the current state of the bodies.
      * It iterates through the bodies array and updates the debug meshes with the current transform of each body.
      * This ensures that the debug meshes accurately reflect the current state of the physics engine.
      */
    /* protected */ def _updateDebugMeshesV2(): Unit = js.native
    
    /* private */ var _utilityLayer: Any = js.native
    
    /**
      * Clean up physics debug display
      */
    def dispose(): Unit = js.native
    
    /**
      * Hides a body from the physics engine.
      * @param body - The body to hide.
      *
      * This function is useful for hiding a body from the physics engine.
      * It removes the body from the utility layer scene and disposes the mesh associated with it.
      * It also unregisters the render function if the number of bodies is 0.
      * This is useful for hiding a body from the physics engine without deleting it.
      */
    def hideBody(body: Nullable[PhysicsBody]): Unit = js.native
    
    /**
      * Hides an impostor from the scene.
      * @param impostor - The impostor to hide.
      *
      * This method is useful for hiding an impostor from the scene. It removes the
      * impostor from the utility layer scene, disposes the mesh, and removes the
      * impostor from the list of impostors. If the impostor is the last one in the
      * list, it also unregisters the render function.
      */
    def hideImpostor(impostor: Nullable[PhysicsImpostor]): Unit = js.native
    
    /**
      * Shows a debug mesh for a given physics body.
      * @param body The physics body to show.
      * @returns The debug mesh, or null if the body is already shown.
      *
      * This function is useful for visualizing the physics body in the scene.
      * It creates a debug mesh for the given body and adds it to the scene.
      * It also registers a before render function to update the debug mesh position and rotation.
      */
    def showBody(body: PhysicsBody): Nullable[AbstractMesh] = js.native
    
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
    /* private */ var _bindObs: Any = js.native
    
    /* private */ var _boneIndices: Any = js.native
    
    /* private */ var _buildLocalAxes: Any = js.native
    
    /**
      * function to build and bind sphere joint points and spur bone representations.
      * @param spheresOnly
      */
    /* private */ var _buildSpheresAndSpurs: Any = js.native
    
    /** Array of the points of the skeleton fo the line view. */
    /* private */ var _debugLines: Any = js.native
    
    /** The SkeletonViewers Mesh. */
    /* private */ var _debugMesh: Any = js.native
    
    /** Update the viewer to sync with current skeleton state, only used for the line display. */
    /* private */ var _displayLinesUpdate: Any = js.native
    
    /**
      * function to get the absolute bind pose of a bone by accumulating transformations up the bone hierarchy.
      * @param bone
      * @param matrix
      */
    /* private */ var _getAbsoluteBindPoseToRef: Any = js.native
    
    /* private */ var _getBonePosition: Any = js.native
    
    /* private */ var _getLinesForBonesNoLength: Any = js.native
    
    /* private */ var _getLinesForBonesWithLength: Any = js.native
    
    /** If SkeletonViewer is enabled. */
    /* private */ var _isEnabled: Any = js.native
    
    /** The local axes Meshes. */
    /* private */ var _localAxes: Any = js.native
    
    /** SkeletonViewer render observable. */
    /* private */ var _obs: Any = js.native
    
    /** If SkeletonViewer is ready. */
    /* private */ var _ready: Any = js.native
    
    /**
      * function to revert the mesh and scene back to the initial state.
      * @param animationState
      */
    /* private */ var _revert: Any = js.native
    
    /** If SkeletonViewer scene scope. */
    /* private */ var _scene: Any = js.native
    
    /** The Utility Layer to render the gizmos in. */
    /* private */ var _utilityLayer: Any = js.native
    
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
