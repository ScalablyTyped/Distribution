package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class used to represent a specific level of detail of a mesh
  * @see http://doc.babylonjs.com/how_to/how_to_use_lod
  */
@JSGlobal("BABYLON.MeshLODLevel")
@js.native
class MeshLODLevel protected () extends js.Object {
  /**
    * Creates a new LOD level
    * @param distance defines the distance where this level should star being displayed
    * @param mesh defines the mesh to use to render this level
    */
  def this(/** Defines the distance where this level should star being displayed */
  distance: scala.Double, /** Defines the mesh to use to render this level */
  mesh: Nullable[Mesh]) = this()
  /** Defines the distance where this level should star being displayed */
  var distance: scala.Double = js.native
  /** Defines the mesh to use to render this level */
  var mesh: Nullable[Mesh] = js.native
}

