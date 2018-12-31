package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * LineEdgesRenderer for LineMeshes to remove unnecessary triangulation
  */
@JSGlobal("BABYLON.LineEdgesRenderer")
@js.native
class LineEdgesRenderer protected () extends EdgesRenderer {
  /**
    * This constructor turns off auto generating edges line in Edges Renderer to make it here.
    * @param  source LineMesh used to generate edges
    * @param  epsilon not important (specified angle for edge detection)
    * @param  checkVerticesInsteadOfIndices not important for LineMesh
    */
  def this(source: AbstractMesh) = this()
  def this(source: AbstractMesh, epsilon: scala.Double) = this()
  def this(source: AbstractMesh, epsilon: scala.Double, checkVerticesInsteadOfIndices: scala.Boolean) = this()
}

