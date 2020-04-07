package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.MeshLODLevel")
@js.native
class MeshLODLevel protected () extends js.Object {
  /**
    * Creates a new LOD level
    * @param distance defines the distance where this level should star being displayed
    * @param mesh defines the mesh to use to render this level
    */
  def this(
    /** Defines the distance where this level should start being displayed */
  distance: Double,
    /** Defines the mesh to use to render this level */
  mesh: Nullable[Mesh]
  ) = this()
  /** Defines the distance where this level should start being displayed */
  var distance: Double = js.native
  /** Defines the mesh to use to render this level */
  var mesh: Nullable[Mesh] = js.native
}

