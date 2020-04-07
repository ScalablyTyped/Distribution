package typings.babylonjs.legacyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Legacy/legacy", "EdgesRenderer")
@js.native
class EdgesRenderer protected ()
  extends typings.babylonjs.indexMod.EdgesRenderer {
  /**
    * Creates an instance of the EdgesRenderer. It is primarily use to display edges of a mesh.
    * Beware when you use this class with complex objects as the adjacencies computation can be really long
    * @param  source Mesh used to create edges
    * @param  epsilon sum of angles in adjacency to check for edge
    * @param  checkVerticesInsteadOfIndices bases the edges detection on vertices vs indices
    * @param  generateEdgesLines - should generate Lines or only prepare resources.
    */
  def this(source: typings.babylonjs.abstractMeshMod.AbstractMesh) = this()
  def this(source: typings.babylonjs.abstractMeshMod.AbstractMesh, epsilon: Double) = this()
  def this(
    source: typings.babylonjs.abstractMeshMod.AbstractMesh,
    epsilon: Double,
    checkVerticesInsteadOfIndices: Boolean
  ) = this()
  def this(
    source: typings.babylonjs.abstractMeshMod.AbstractMesh,
    epsilon: Double,
    checkVerticesInsteadOfIndices: Boolean,
    generateEdgesLines: Boolean
  ) = this()
}

