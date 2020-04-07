package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.Debug")
@js.native
object Debug extends js.Object {
  @js.native
  class AxesViewer protected () extends js.Object {
    /**
      * Creates a new AxesViewer
      * @param scene defines the hosting scene
      * @param scaleLines defines a number used to scale line length (1 by default)
      * @param renderingGroupId defines a number used to set the renderingGroupId of the meshes (2 by default)
      * @param xAxis defines the node hierarchy used to render the x-axis
      * @param yAxis defines the node hierarchy used to render the y-axis
      * @param zAxis defines the node hierarchy used to render the z-axis
      */
    def this(scene: Scene) = this()
    def this(scene: Scene, scaleLines: Double) = this()
    def this(scene: Scene, scaleLines: Double, renderingGroupId: Nullable[Double]) = this()
    def this(scene: Scene, scaleLines: Double, renderingGroupId: Nullable[Double], xAxis: TransformNode) = this()
    def this(
      scene: Scene,
      scaleLines: Double,
      renderingGroupId: Nullable[Double],
      xAxis: TransformNode,
      yAxis: TransformNode
    ) = this()
    def this(
      scene: Scene,
      scaleLines: Double,
      renderingGroupId: Nullable[Double],
      xAxis: TransformNode,
      yAxis: TransformNode,
      zAxis: TransformNode
    ) = this()
    var _instanced: js.Any = js.native
    var _scaleLinesFactor: js.Any = js.native
    var _xAxis: js.Any = js.native
    var _yAxis: js.Any = js.native
    var _zAxis: js.Any = js.native
    /**
      * Gets or sets a number used to scale line length
      */
    var scaleLines: Double = js.native
    /**
      * Gets the hosting scene
      */
    var scene: Scene = js.native
    /**
      * Creates an instance of this axes viewer.
      * @returns a new axes viewer with instanced meshes
      */
    def createInstance(): AxesViewer = js.native
    /** Releases resources */
    def dispose(): Unit = js.native
    /**
      * Force the viewer to update
      * @param position defines the position of the viewer
      * @param xaxis defines the x axis of the viewer
      * @param yaxis defines the y axis of the viewer
      * @param zaxis defines the z axis of the viewer
      */
    def update(position: Vector3, xaxis: Vector3, yaxis: Vector3, zaxis: Vector3): Unit = js.native
    /** Gets the node hierarchy used to render x-axis */
    def xAxis(): TransformNode = js.native
    /** Gets the node hierarchy used to render y-axis */
    def yAxis(): TransformNode = js.native
    /** Gets the node hierarchy used to render z-axis */
    def zAxis(): TransformNode = js.native
  }
  
  @js.native
  class BoneAxesViewer protected () extends AxesViewer {
    /**
      * Creates a new BoneAxesViewer
      * @param scene defines the hosting scene
      * @param bone defines the target bone
      * @param mesh defines the target mesh
      * @param scaleLines defines a scaling factor for line length (1 by default)
      */
    def this(scene: Scene, bone: Bone, mesh: Mesh) = this()
    def this(scene: Scene, bone: Bone, mesh: Mesh, scaleLines: Double) = this()
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
    /** Gets direction of X axis */
    var xaxis: Vector3 = js.native
    /** Gets direction of Y axis */
    var yaxis: Vector3 = js.native
    /** Gets direction of Z axis */
    var zaxis: Vector3 = js.native
    /**
      * Force the viewer to update
      */
    def update(): Unit = js.native
  }
  
  @js.native
  class PhysicsViewer protected () extends js.Object {
    /**
      * Creates a new PhysicsViewer
      * @param scene defines the hosting scene
      */
    def this(scene: Scene) = this()
    var _debugBoxMesh: js.Any = js.native
    var _debugCylinderMesh: js.Any = js.native
    var _debugMaterial: js.Any = js.native
    var _debugMeshMeshes: js.Any = js.native
    var _debugSphereMesh: js.Any = js.native
    var _getDebugBoxMesh: js.Any = js.native
    var _getDebugCylinderMesh: js.Any = js.native
    var _getDebugMaterial: js.Any = js.native
    var _getDebugMesh: js.Any = js.native
    var _getDebugMeshMesh: js.Any = js.native
    var _getDebugSphereMesh: js.Any = js.native
    /** @hidden */
    var _impostors: js.Array[Nullable[PhysicsImpostor]] = js.native
    /** @hidden */
    var _meshes: js.Array[Nullable[AbstractMesh]] = js.native
    /** @hidden */
    var _numMeshes: Double = js.native
    /** @hidden */
    var _physicsEnginePlugin: Nullable[IPhysicsEnginePlugin] = js.native
    var _renderFunction: js.Any = js.native
    /** @hidden */
    var _scene: Nullable[Scene] = js.native
    var _utilityLayer: js.Any = js.native
    /** @hidden */
    /* protected */ def _updateDebugMeshes(): Unit = js.native
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
  class SkeletonViewer protected () extends js.Object {
    /**
      * Creates a new SkeletonViewer
      * @param skeleton defines the skeleton to render
      * @param mesh defines the mesh attached to the skeleton
      * @param scene defines the hosting scene
      * @param autoUpdateBonesMatrices defines a boolean indicating if bones matrices must be forced to update before rendering (true by default)
      * @param renderingGroupId defines the rendering group id to use with the viewer
      */
    def this(
      /** defines the skeleton to render */
    skeleton: Skeleton,
      /** defines the mesh attached to the skeleton */
    mesh: AbstractMesh,
      scene: Scene
    ) = this()
    def this(
      /** defines the skeleton to render */
    skeleton: Skeleton,
      /** defines the mesh attached to the skeleton */
    mesh: AbstractMesh,
      scene: Scene,
      /** defines a boolean indicating if bones matrices must be forced to update before rendering (true by default)  */
    autoUpdateBonesMatrices: Boolean
    ) = this()
    def this(
      /** defines the skeleton to render */
    skeleton: Skeleton,
      /** defines the mesh attached to the skeleton */
    mesh: AbstractMesh,
      scene: Scene,
      /** defines a boolean indicating if bones matrices must be forced to update before rendering (true by default)  */
    autoUpdateBonesMatrices: Boolean,
      /** defines the rendering group id to use with the viewer */
    renderingGroupId: Double
    ) = this()
    var _debugLines: js.Any = js.native
    var _debugMesh: js.Any = js.native
    var _getBonePosition: js.Any = js.native
    var _getLinesForBonesNoLength: js.Any = js.native
    var _getLinesForBonesWithLength: js.Any = js.native
    var _isEnabled: js.Any = js.native
    var _renderFunction: js.Any = js.native
    var _scene: js.Any = js.native
    var _utilityLayer: js.Any = js.native
    /** defines a boolean indicating if bones matrices must be forced to update before rendering (true by default)  */
    var autoUpdateBonesMatrices: Boolean = js.native
    /** Gets or sets the color used to render the skeleton */
    var color: Color3 = js.native
    /** defines the mesh attached to the skeleton */
    var mesh: AbstractMesh = js.native
    /** defines the rendering group id to use with the viewer */
    var renderingGroupId: Double = js.native
    /** defines the skeleton to render */
    var skeleton: Skeleton = js.native
    /**
      * Returns the mesh used to render the bones
      */
    def debugMesh(): Nullable[LinesMesh] = js.native
    /** Release associated resources */
    def dispose(): Unit = js.native
    def isEnabled(): Boolean = js.native
    /** Gets or sets a boolean indicating if the viewer is enabled */
    def isEnabled(value: Boolean): js.Any = js.native
    /** Update the viewer to sync with current skeleton state */
    def update(): Unit = js.native
  }
  
  /* static members */
  @js.native
  object AxesViewer extends js.Object {
    var _SetRenderingGroupId: js.Any = js.native
  }
  
}

