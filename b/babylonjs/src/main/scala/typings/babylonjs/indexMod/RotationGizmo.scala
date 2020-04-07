package typings.babylonjs.indexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/index", "RotationGizmo")
@js.native
/**
  * Creates a RotationGizmo
  * @param gizmoLayer The utility layer the gizmo will be added to
  * @param tessellation Amount of tessellation to be used when creating rotation circles
  * @param useEulerRotation Use and update Euler angle instead of quaternion
  */
class RotationGizmo ()
  extends typings.babylonjs.gizmosIndexMod.RotationGizmo {
  def this(gizmoLayer: typings.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer) = this()
  def this(gizmoLayer: typings.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer, tessellation: Double) = this()
  def this(
    gizmoLayer: typings.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer,
    tessellation: Double,
    useEulerRotation: Boolean
  ) = this()
}

