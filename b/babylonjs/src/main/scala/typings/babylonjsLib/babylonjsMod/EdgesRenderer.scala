package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * This class is used to generate edges of the mesh that could then easily be rendered in a scene.
     */
@JSImport("babylonjs", "EdgesRenderer")
@js.native
class EdgesRenderer protected ()
  extends babylonjsLib.BABYLONNs.EdgesRenderer {
  /**
           * Creates an instance of the EdgesRenderer. It is primarily use to display edges of a mesh.
           * Beware when you use this class with complex objects as the adjacencies computation can be really long
           * @param  source Mesh used to create edges
           * @param  epsilon sum of angles in adjacency to check for edge
           * @param  checkVerticesInsteadOfIndices
           * @param  generateEdgesLines - should generate Lines or only prepare resources.
           */
  def this(source: babylonjsLib.BABYLONNs.AbstractMesh) = this()
  /**
           * Creates an instance of the EdgesRenderer. It is primarily use to display edges of a mesh.
           * Beware when you use this class with complex objects as the adjacencies computation can be really long
           * @param  source Mesh used to create edges
           * @param  epsilon sum of angles in adjacency to check for edge
           * @param  checkVerticesInsteadOfIndices
           * @param  generateEdgesLines - should generate Lines or only prepare resources.
           */
  def this(source: babylonjsLib.BABYLONNs.AbstractMesh, epsilon: scala.Double) = this()
  /**
           * Creates an instance of the EdgesRenderer. It is primarily use to display edges of a mesh.
           * Beware when you use this class with complex objects as the adjacencies computation can be really long
           * @param  source Mesh used to create edges
           * @param  epsilon sum of angles in adjacency to check for edge
           * @param  checkVerticesInsteadOfIndices
           * @param  generateEdgesLines - should generate Lines or only prepare resources.
           */
  def this(source: babylonjsLib.BABYLONNs.AbstractMesh, epsilon: scala.Double, checkVerticesInsteadOfIndices: scala.Boolean) = this()
  /**
           * Creates an instance of the EdgesRenderer. It is primarily use to display edges of a mesh.
           * Beware when you use this class with complex objects as the adjacencies computation can be really long
           * @param  source Mesh used to create edges
           * @param  epsilon sum of angles in adjacency to check for edge
           * @param  checkVerticesInsteadOfIndices
           * @param  generateEdgesLines - should generate Lines or only prepare resources.
           */
  def this(source: babylonjsLib.BABYLONNs.AbstractMesh, epsilon: scala.Double, checkVerticesInsteadOfIndices: scala.Boolean, generateEdgesLines: scala.Boolean) = this()
}

