package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeshLODLevel extends js.Object {
  /** Defines the distance where this level should start being displayed */
  var distance: Double
  /** Defines the mesh to use to render this level */
  var mesh: Nullable[Mesh]
}

object MeshLODLevel {
  @scala.inline
  def apply(distance: Double, mesh: Nullable[Mesh] = null): MeshLODLevel = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], mesh = mesh.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeshLODLevel]
  }
}

