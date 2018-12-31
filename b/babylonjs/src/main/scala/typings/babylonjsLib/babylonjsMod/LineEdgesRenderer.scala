package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * LineEdgesRenderer for LineMeshes to remove unnecessary triangulation
  */
@JSImport("babylonjs", "LineEdgesRenderer")
@js.native
class LineEdgesRenderer protected ()
  extends babylonjsLib.BABYLONNs.LineEdgesRenderer {
  /**
    * This constructor turns off auto generating edges line in Edges Renderer to make it here.
    * @param  source LineMesh used to generate edges
    * @param  epsilon not important (specified angle for edge detection)
    * @param  checkVerticesInsteadOfIndices not important for LineMesh
    */
  def this(source: babylonjsLib.BABYLONNs.AbstractMesh) = this()
  def this(source: babylonjsLib.BABYLONNs.AbstractMesh, epsilon: scala.Double) = this()
  def this(source: babylonjsLib.BABYLONNs.AbstractMesh, epsilon: scala.Double, checkVerticesInsteadOfIndices: scala.Boolean) = this()
}

