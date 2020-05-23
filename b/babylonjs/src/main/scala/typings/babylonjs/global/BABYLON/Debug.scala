package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.Debug")
@js.native
object Debug extends js.Object {
  @js.native
  class AxesViewer protected ()
    extends typings.babylonjs.BABYLON.Debug.AxesViewer {
    /**
      * Creates a new AxesViewer
      * @param scene defines the hosting scene
      * @param scaleLines defines a number used to scale line length (1 by default)
      * @param renderingGroupId defines a number used to set the renderingGroupId of the meshes (2 by default)
      * @param xAxis defines the node hierarchy used to render the x-axis
      * @param yAxis defines the node hierarchy used to render the y-axis
      * @param zAxis defines the node hierarchy used to render the z-axis
      */
    def this(scene: typings.babylonjs.BABYLON.Scene) = this()
    def this(scene: typings.babylonjs.BABYLON.Scene, scaleLines: Double) = this()
    def this(scene: typings.babylonjs.BABYLON.Scene, scaleLines: Double, renderingGroupId: Nullable[Double]) = this()
    def this(
      scene: typings.babylonjs.BABYLON.Scene,
      scaleLines: Double,
      renderingGroupId: Nullable[Double],
      xAxis: typings.babylonjs.BABYLON.TransformNode
    ) = this()
    def this(
      scene: typings.babylonjs.BABYLON.Scene,
      scaleLines: Double,
      renderingGroupId: Nullable[Double],
      xAxis: typings.babylonjs.BABYLON.TransformNode,
      yAxis: typings.babylonjs.BABYLON.TransformNode
    ) = this()
    def this(
      scene: typings.babylonjs.BABYLON.Scene,
      scaleLines: Double,
      renderingGroupId: Nullable[Double],
      xAxis: typings.babylonjs.BABYLON.TransformNode,
      yAxis: typings.babylonjs.BABYLON.TransformNode,
      zAxis: typings.babylonjs.BABYLON.TransformNode
    ) = this()
    /* CompleteClass */
    override var _instanced: js.Any = js.native
    /* CompleteClass */
    override var _scaleLinesFactor: js.Any = js.native
    /* CompleteClass */
    override var _xAxis: js.Any = js.native
    /* CompleteClass */
    override var _yAxis: js.Any = js.native
    /* CompleteClass */
    override var _zAxis: js.Any = js.native
    /**
      * Gets or sets a number used to scale line length
      */
    /* CompleteClass */
    override var scaleLines: Double = js.native
    /**
      * Gets the hosting scene
      */
    /* CompleteClass */
    override var scene: typings.babylonjs.BABYLON.Scene = js.native
    /**
      * Creates an instance of this axes viewer.
      * @returns a new axes viewer with instanced meshes
      */
    /* CompleteClass */
    override def createInstance(): typings.babylonjs.BABYLON.Debug.AxesViewer = js.native
    /** Releases resources */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    /**
      * Force the viewer to update
      * @param position defines the position of the viewer
      * @param xaxis defines the x axis of the viewer
      * @param yaxis defines the y axis of the viewer
      * @param zaxis defines the z axis of the viewer
      */
    /* CompleteClass */
    override def update(
      position: typings.babylonjs.BABYLON.Vector3,
      xaxis: typings.babylonjs.BABYLON.Vector3,
      yaxis: typings.babylonjs.BABYLON.Vector3,
      zaxis: typings.babylonjs.BABYLON.Vector3
    ): Unit = js.native
    /** Gets the node hierarchy used to render x-axis */
    /* CompleteClass */
    override def xAxis: typings.babylonjs.BABYLON.TransformNode = js.native
    /** Gets the node hierarchy used to render y-axis */
    /* CompleteClass */
    override def yAxis: typings.babylonjs.BABYLON.TransformNode = js.native
    /** Gets the node hierarchy used to render z-axis */
    /* CompleteClass */
    override def zAxis: typings.babylonjs.BABYLON.TransformNode = js.native
  }
  
  @js.native
  class BoneAxesViewer protected ()
    extends typings.babylonjs.BABYLON.Debug.BoneAxesViewer {
    /**
      * Creates a new BoneAxesViewer
      * @param scene defines the hosting scene
      * @param bone defines the target bone
      * @param mesh defines the target mesh
      * @param scaleLines defines a scaling factor for line length (1 by default)
      */
    def this(
      scene: typings.babylonjs.BABYLON.Scene,
      bone: typings.babylonjs.BABYLON.Bone,
      mesh: typings.babylonjs.BABYLON.Mesh
    ) = this()
    def this(
      scene: typings.babylonjs.BABYLON.Scene,
      bone: typings.babylonjs.BABYLON.Bone,
      mesh: typings.babylonjs.BABYLON.Mesh,
      scaleLines: Double
    ) = this()
    /* CompleteClass */
    override var _instanced: js.Any = js.native
    /* CompleteClass */
    override var _scaleLinesFactor: js.Any = js.native
    /* CompleteClass */
    override var _xAxis: js.Any = js.native
    /* CompleteClass */
    override var _yAxis: js.Any = js.native
    /* CompleteClass */
    override var _zAxis: js.Any = js.native
    /**
      * Gets or sets the target bone where to display the axes viewer
      */
    /* CompleteClass */
    override var bone: Nullable[typings.babylonjs.BABYLON.Bone] = js.native
    /**
      * Gets or sets the target mesh where to display the axes viewer
      */
    /* CompleteClass */
    override var mesh: Nullable[typings.babylonjs.BABYLON.Mesh] = js.native
    /** Gets current position */
    /* CompleteClass */
    override var pos: typings.babylonjs.BABYLON.Vector3 = js.native
    /**
      * Gets or sets a number used to scale line length
      */
    /* CompleteClass */
    override var scaleLines: Double = js.native
    /**
      * Gets the hosting scene
      */
    /* CompleteClass */
    override var scene: typings.babylonjs.BABYLON.Scene = js.native
    /** Gets direction of X axis */
    /* CompleteClass */
    override var xaxis: typings.babylonjs.BABYLON.Vector3 = js.native
    /** Gets direction of Y axis */
    /* CompleteClass */
    override var yaxis: typings.babylonjs.BABYLON.Vector3 = js.native
    /** Gets direction of Z axis */
    /* CompleteClass */
    override var zaxis: typings.babylonjs.BABYLON.Vector3 = js.native
    /**
      * Creates an instance of this axes viewer.
      * @returns a new axes viewer with instanced meshes
      */
    /* CompleteClass */
    override def createInstance(): typings.babylonjs.BABYLON.Debug.AxesViewer = js.native
    /** Releases resources */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    /**
      * Force the viewer to update
      */
    /* CompleteClass */
    override def update(): Unit = js.native
    /**
      * Force the viewer to update
      * @param position defines the position of the viewer
      * @param xaxis defines the x axis of the viewer
      * @param yaxis defines the y axis of the viewer
      * @param zaxis defines the z axis of the viewer
      */
    /* CompleteClass */
    override def update(
      position: typings.babylonjs.BABYLON.Vector3,
      xaxis: typings.babylonjs.BABYLON.Vector3,
      yaxis: typings.babylonjs.BABYLON.Vector3,
      zaxis: typings.babylonjs.BABYLON.Vector3
    ): Unit = js.native
    /** Gets the node hierarchy used to render x-axis */
    /* CompleteClass */
    override def xAxis: typings.babylonjs.BABYLON.TransformNode = js.native
    /** Gets the node hierarchy used to render y-axis */
    /* CompleteClass */
    override def yAxis: typings.babylonjs.BABYLON.TransformNode = js.native
    /** Gets the node hierarchy used to render z-axis */
    /* CompleteClass */
    override def zAxis: typings.babylonjs.BABYLON.TransformNode = js.native
  }
  
  @js.native
  class PhysicsViewer protected ()
    extends typings.babylonjs.BABYLON.Debug.PhysicsViewer {
    /**
      * Creates a new PhysicsViewer
      * @param scene defines the hosting scene
      */
    def this(scene: typings.babylonjs.BABYLON.Scene) = this()
  }
  
  @js.native
  class SkeletonViewer protected ()
    extends typings.babylonjs.BABYLON.Debug.SkeletonViewer {
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
    skeleton: typings.babylonjs.BABYLON.Skeleton,
      /** defines the mesh attached to the skeleton */
    mesh: typings.babylonjs.BABYLON.AbstractMesh,
      scene: typings.babylonjs.BABYLON.Scene
    ) = this()
    def this(
      /** defines the skeleton to render */
    skeleton: typings.babylonjs.BABYLON.Skeleton,
      /** defines the mesh attached to the skeleton */
    mesh: typings.babylonjs.BABYLON.AbstractMesh,
      scene: typings.babylonjs.BABYLON.Scene,
      /** defines a boolean indicating if bones matrices must be forced to update before rendering (true by default)  */
    autoUpdateBonesMatrices: Boolean
    ) = this()
    def this(
      /** defines the skeleton to render */
    skeleton: typings.babylonjs.BABYLON.Skeleton,
      /** defines the mesh attached to the skeleton */
    mesh: typings.babylonjs.BABYLON.AbstractMesh,
      scene: typings.babylonjs.BABYLON.Scene,
      /** defines a boolean indicating if bones matrices must be forced to update before rendering (true by default)  */
    autoUpdateBonesMatrices: Boolean,
      /** defines the rendering group id to use with the viewer */
    renderingGroupId: Double
    ) = this()
  }
  
  /* static members */
  @js.native
  object AxesViewer extends js.Object {
    var _SetRenderingGroupId: js.Any = js.native
  }
  
}

