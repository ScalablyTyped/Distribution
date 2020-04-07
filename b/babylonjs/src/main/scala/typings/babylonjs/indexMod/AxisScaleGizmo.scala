package typings.babylonjs.indexMod

import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/index", "AxisScaleGizmo")
@js.native
class AxisScaleGizmo protected ()
  extends typings.babylonjs.gizmosIndexMod.AxisScaleGizmo {
  /**
    * Creates an AxisScaleGizmo
    * @param gizmoLayer The utility layer the gizmo will be added to
    * @param dragAxis The axis which the gizmo will be able to scale on
    * @param color The color of the gizmo
    */
  def this(dragAxis: typings.babylonjs.mathVectorMod.Vector3) = this()
  def this(dragAxis: typings.babylonjs.mathVectorMod.Vector3, color: typings.babylonjs.mathColorMod.Color3) = this()
  def this(
    dragAxis: typings.babylonjs.mathVectorMod.Vector3,
    color: typings.babylonjs.mathColorMod.Color3,
    gizmoLayer: typings.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer
  ) = this()
  def this(
    dragAxis: typings.babylonjs.mathVectorMod.Vector3,
    color: typings.babylonjs.mathColorMod.Color3,
    gizmoLayer: typings.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer,
    parent: Nullable[typings.babylonjs.scaleGizmoMod.ScaleGizmo]
  ) = this()
}

