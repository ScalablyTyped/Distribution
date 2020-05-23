package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.RotationGizmo")
@js.native
/**
  * Creates a RotationGizmo
  * @param gizmoLayer The utility layer the gizmo will be added to
  * @param tessellation Amount of tessellation to be used when creating rotation circles
  * @param useEulerRotation Use and update Euler angle instead of quaternion
  */
class RotationGizmo ()
  extends typings.babylonjs.BABYLON.RotationGizmo {
  def this(gizmoLayer: typings.babylonjs.BABYLON.UtilityLayerRenderer) = this()
  def this(gizmoLayer: typings.babylonjs.BABYLON.UtilityLayerRenderer, tessellation: Double) = this()
  def this(
    gizmoLayer: typings.babylonjs.BABYLON.UtilityLayerRenderer,
    tessellation: Double,
    useEulerRotation: Boolean
  ) = this()
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
}

