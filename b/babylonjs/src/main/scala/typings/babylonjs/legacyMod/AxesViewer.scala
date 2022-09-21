package typings.babylonjs.legacyMod

import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "AxesViewer")
@js.native
open class AxesViewer protected ()
  extends typings.babylonjs.indexMod.AxesViewer {
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
    scene: js.UndefOr[typings.babylonjs.sceneMod.Scene],
    scaleLines: js.UndefOr[Double],
    renderingGroupId: js.UndefOr[Nullable[Double]],
    xAxis: js.UndefOr[typings.babylonjs.transformNodeMod.TransformNode],
    yAxis: js.UndefOr[typings.babylonjs.transformNodeMod.TransformNode],
    zAxis: js.UndefOr[typings.babylonjs.transformNodeMod.TransformNode],
    lineThickness: js.UndefOr[Double]
  ) = this()
}
/* static members */
object AxesViewer {
  
  @JSImport("babylonjs/Legacy/legacy", "AxesViewer")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs/Legacy/legacy", "AxesViewer._SetRenderingGroupId")
  @js.native
  def _SetRenderingGroupId: Any = js.native
  inline def _SetRenderingGroupId_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_SetRenderingGroupId")(x.asInstanceOf[js.Any])
}
