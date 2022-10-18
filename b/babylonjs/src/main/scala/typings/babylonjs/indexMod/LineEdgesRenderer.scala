package typings.babylonjs.indexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "LineEdgesRenderer")
@js.native
open class LineEdgesRenderer protected ()
  extends typings.babylonjs.renderingIndexMod.LineEdgesRenderer {
  /**
    * This constructor turns off auto generating edges line in Edges Renderer to make it here.
    * @param  source LineMesh used to generate edges
    * @param  epsilon not important (specified angle for edge detection)
    * @param  checkVerticesInsteadOfIndices not important for LineMesh
    */
  def this(source: typings.babylonjs.meshesAbstractMeshMod.AbstractMesh) = this()
  def this(source: typings.babylonjs.meshesAbstractMeshMod.AbstractMesh, epsilon: Double) = this()
  def this(
    source: typings.babylonjs.meshesAbstractMeshMod.AbstractMesh,
    epsilon: Double,
    checkVerticesInsteadOfIndices: Boolean
  ) = this()
  def this(
    source: typings.babylonjs.meshesAbstractMeshMod.AbstractMesh,
    epsilon: Unit,
    checkVerticesInsteadOfIndices: Boolean
  ) = this()
}
