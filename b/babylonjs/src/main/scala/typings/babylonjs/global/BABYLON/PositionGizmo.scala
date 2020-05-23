package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.PositionGizmo")
@js.native
/**
  * Creates a PositionGizmo
  * @param gizmoLayer The utility layer the gizmo will be added to
  */
class PositionGizmo ()
  extends typings.babylonjs.BABYLON.PositionGizmo {
  def this(gizmoLayer: typings.babylonjs.BABYLON.UtilityLayerRenderer) = this()
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
}

