package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Class used to represent a specific level of detail of a mesh
     * @see http://doc.babylonjs.com/how_to/how_to_use_lod
     */
@JSImport("babylonjs", "MeshLODLevel")
@js.native
class MeshLODLevel protected ()
  extends babylonjsLib.BABYLONNs.MeshLODLevel {
  /**
           * Creates a new LOD level
           * @param distance defines the distance where this level should star being displayed
           * @param mesh defines the mesh to use to render this level
           */
  def this(/** Defines the distance where this level should star being displayed */
  distance: scala.Double, /** Defines the mesh to use to render this level */
  mesh: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Mesh]) = this()
}

