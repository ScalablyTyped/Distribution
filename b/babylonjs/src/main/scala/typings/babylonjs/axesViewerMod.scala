package typings.babylonjs

import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.transformNodeMod.TransformNode
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object axesViewerMod {
  
  @JSImport("babylonjs/Debug/axesViewer", "AxesViewer")
  @js.native
  class AxesViewer protected () extends StObject {
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
    def this(scene: Scene, scaleLines: js.UndefOr[scala.Nothing], renderingGroupId: Nullable[Double]) = this()
    def this(scene: Scene, scaleLines: Double, renderingGroupId: Nullable[Double]) = this()
    def this(
      scene: Scene,
      scaleLines: js.UndefOr[scala.Nothing],
      renderingGroupId: js.UndefOr[Nullable[Double]],
      xAxis: TransformNode
    ) = this()
    def this(
      scene: Scene,
      scaleLines: Double,
      renderingGroupId: js.UndefOr[Nullable[Double]],
      xAxis: TransformNode
    ) = this()
    def this(
      scene: Scene,
      scaleLines: js.UndefOr[scala.Nothing],
      renderingGroupId: js.UndefOr[Nullable[Double]],
      xAxis: js.UndefOr[scala.Nothing],
      yAxis: TransformNode
    ) = this()
    def this(
      scene: Scene,
      scaleLines: js.UndefOr[scala.Nothing],
      renderingGroupId: js.UndefOr[Nullable[Double]],
      xAxis: TransformNode,
      yAxis: TransformNode
    ) = this()
    def this(
      scene: Scene,
      scaleLines: Double,
      renderingGroupId: js.UndefOr[Nullable[Double]],
      xAxis: js.UndefOr[scala.Nothing],
      yAxis: TransformNode
    ) = this()
    def this(
      scene: Scene,
      scaleLines: Double,
      renderingGroupId: js.UndefOr[Nullable[Double]],
      xAxis: TransformNode,
      yAxis: TransformNode
    ) = this()
    def this(
      scene: Scene,
      scaleLines: js.UndefOr[scala.Nothing],
      renderingGroupId: js.UndefOr[Nullable[Double]],
      xAxis: js.UndefOr[scala.Nothing],
      yAxis: js.UndefOr[scala.Nothing],
      zAxis: TransformNode
    ) = this()
    def this(
      scene: Scene,
      scaleLines: js.UndefOr[scala.Nothing],
      renderingGroupId: js.UndefOr[Nullable[Double]],
      xAxis: js.UndefOr[scala.Nothing],
      yAxis: TransformNode,
      zAxis: TransformNode
    ) = this()
    def this(
      scene: Scene,
      scaleLines: js.UndefOr[scala.Nothing],
      renderingGroupId: js.UndefOr[Nullable[Double]],
      xAxis: TransformNode,
      yAxis: js.UndefOr[scala.Nothing],
      zAxis: TransformNode
    ) = this()
    def this(
      scene: Scene,
      scaleLines: js.UndefOr[scala.Nothing],
      renderingGroupId: js.UndefOr[Nullable[Double]],
      xAxis: TransformNode,
      yAxis: TransformNode,
      zAxis: TransformNode
    ) = this()
    def this(
      scene: Scene,
      scaleLines: Double,
      renderingGroupId: js.UndefOr[Nullable[Double]],
      xAxis: js.UndefOr[scala.Nothing],
      yAxis: js.UndefOr[scala.Nothing],
      zAxis: TransformNode
    ) = this()
    def this(
      scene: Scene,
      scaleLines: Double,
      renderingGroupId: js.UndefOr[Nullable[Double]],
      xAxis: js.UndefOr[scala.Nothing],
      yAxis: TransformNode,
      zAxis: TransformNode
    ) = this()
    def this(
      scene: Scene,
      scaleLines: Double,
      renderingGroupId: js.UndefOr[Nullable[Double]],
      xAxis: TransformNode,
      yAxis: js.UndefOr[scala.Nothing],
      zAxis: TransformNode
    ) = this()
    def this(
      scene: Scene,
      scaleLines: Double,
      renderingGroupId: js.UndefOr[Nullable[Double]],
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
  /* static members */
  object AxesViewer {
    
    @JSImport("babylonjs/Debug/axesViewer", "AxesViewer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Debug/axesViewer", "AxesViewer._SetRenderingGroupId")
    @js.native
    def _SetRenderingGroupId: js.Any = js.native
    @scala.inline
    def _SetRenderingGroupId_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_SetRenderingGroupId")(x.asInstanceOf[js.Any])
  }
}
