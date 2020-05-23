package typings.babylonjs.edgesRendererMod.babylonjsMeshesAbstractMeshAugmentingMod

import typings.babylonjs.edgesRendererMod.EdgesRenderer
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbstractMesh extends js.Object {
  /**
    * Gets the edgesRenderer associated with the mesh
    */
  var edgesRenderer: Nullable[EdgesRenderer]
}

object AbstractMesh {
  @scala.inline
  def apply(edgesRenderer: Nullable[EdgesRenderer] = null): AbstractMesh = {
    val __obj = js.Dynamic.literal(edgesRenderer = edgesRenderer.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbstractMesh]
  }
}

