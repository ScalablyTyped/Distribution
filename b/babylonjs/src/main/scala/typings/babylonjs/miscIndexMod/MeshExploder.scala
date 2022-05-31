package typings.babylonjs.miscIndexMod

import typings.babylonjs.meshMod.Mesh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Misc/index", "MeshExploder")
@js.native
class MeshExploder protected ()
  extends typings.babylonjs.meshExploderMod.MeshExploder {
  /**
    * Explodes meshes from a center mesh.
    * @param meshes The meshes to explode.
    * @param centerMesh The mesh to be center of explosion.
    */
  def this(meshes: js.Array[Mesh]) = this()
  def this(meshes: js.Array[Mesh], centerMesh: Mesh) = this()
}
