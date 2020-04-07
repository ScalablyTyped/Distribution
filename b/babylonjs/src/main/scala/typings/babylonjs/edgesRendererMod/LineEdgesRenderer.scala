package typings.babylonjs.edgesRendererMod

import typings.babylonjs.abstractMeshMod.AbstractMesh
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Rendering/edgesRenderer", "LineEdgesRenderer")
@js.native
class LineEdgesRenderer protected () extends EdgesRenderer {
  /**
    * This constructor turns off auto generating edges line in Edges Renderer to make it here.
    * @param  source LineMesh used to generate edges
    * @param  epsilon not important (specified angle for edge detection)
    * @param  checkVerticesInsteadOfIndices not important for LineMesh
    */
  def this(source: AbstractMesh) = this()
  def this(source: AbstractMesh, epsilon: Double) = this()
  def this(source: AbstractMesh, epsilon: Double, checkVerticesInsteadOfIndices: Boolean) = this()
}

