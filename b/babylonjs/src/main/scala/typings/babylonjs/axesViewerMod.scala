package typings.babylonjs

import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.transformNodeMod.TransformNode
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object axesViewerMod {
  
  @JSImport("babylonjs/Debug/axesViewer", "AxesViewer")
  @js.native
  open class AxesViewer protected () extends StObject {
    /**
      * Creates a new AxesViewer
      * @param scene defines the hosting scene
      * @param scaleLines defines a number used to scale line length (1 by default)
      * @param renderingGroupId defines a number used to set the renderingGroupId of the meshes (2 by default)
      * @param xAxis defines the node hierarchy used to render the x-axis
      * @param yAxis defines the node hierarchy used to render the y-axis
      * @param zAxis defines the node hierarchy used to render the z-axis
      * @param lineThickness The line thickness to use when creating the arrow. defaults to 1.
      */
    def this(
      scene: js.UndefOr[Scene],
      scaleLines: js.UndefOr[Double],
      renderingGroupId: js.UndefOr[Nullable[Double]],
      xAxis: js.UndefOr[TransformNode],
      yAxis: js.UndefOr[TransformNode],
      zAxis: js.UndefOr[TransformNode],
      lineThickness: js.UndefOr[Double]
    ) = this()
    
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
  /* static members */
  object AxesViewer {
    
    @JSImport("babylonjs/Debug/axesViewer", "AxesViewer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Debug/axesViewer", "AxesViewer._SetRenderingGroupId")
    @js.native
    def _SetRenderingGroupId: Any = js.native
    inline def _SetRenderingGroupId_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_SetRenderingGroupId")(x.asInstanceOf[js.Any])
  }
}
