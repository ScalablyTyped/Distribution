package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.Gizmo")
@js.native
/**
  * Creates a gizmo
  * @param gizmoLayer The utility layer the gizmo will be added to
  */
class Gizmo ()
  extends typings.babylonjs.BABYLON.Gizmo {
  def this(/** The utility layer the gizmo will be added to */
  gizmoLayer: typings.babylonjs.BABYLON.UtilityLayerRenderer) = this()
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
}

