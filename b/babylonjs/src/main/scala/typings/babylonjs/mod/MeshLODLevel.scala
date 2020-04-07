package typings.babylonjs.mod

import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs", "MeshLODLevel")
@js.native
class MeshLODLevel protected ()
  extends typings.babylonjs.legacyMod.MeshLODLevel {
  /**
    * Creates a new LOD level
    * @param distance defines the distance where this level should star being displayed
    * @param mesh defines the mesh to use to render this level
    */
  def this(
    /** Defines the distance where this level should start being displayed */
  distance: Double,
    /** Defines the mesh to use to render this level */
  mesh: Nullable[typings.babylonjs.meshMod.Mesh]
  ) = this()
}

