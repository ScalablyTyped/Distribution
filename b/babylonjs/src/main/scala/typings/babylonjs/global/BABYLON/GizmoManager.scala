package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.GizmoManager")
@js.native
class GizmoManager protected ()
  extends typings.babylonjs.BABYLON.GizmoManager {
  /**
    * Instatiates a gizmo manager
    * @param scene the scene to overlay the gizmos on top of
    */
  def this(scene: typings.babylonjs.BABYLON.Scene) = this()
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
}

