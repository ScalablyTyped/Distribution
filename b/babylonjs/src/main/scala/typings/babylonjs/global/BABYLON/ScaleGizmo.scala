package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.ScaleGizmo")
@js.native
/**
  * Creates a ScaleGizmo
  * @param gizmoLayer The utility layer the gizmo will be added to
  */
class ScaleGizmo ()
  extends typings.babylonjs.BABYLON.ScaleGizmo {
  def this(gizmoLayer: typings.babylonjs.BABYLON.UtilityLayerRenderer) = this()
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
}

