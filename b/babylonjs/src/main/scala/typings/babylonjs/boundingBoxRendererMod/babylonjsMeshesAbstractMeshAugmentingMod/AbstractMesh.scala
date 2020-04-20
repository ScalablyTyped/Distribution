package typings.babylonjs.boundingBoxRendererMod.babylonjsMeshesAbstractMeshAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbstractMesh extends js.Object {
  /** @hidden (Backing field) */
  var _showBoundingBox: Boolean
  /**
    * Gets or sets a boolean indicating if the bounding box must be rendered as well (false by default)
    */
  var showBoundingBox: Boolean
}

object AbstractMesh {
  @scala.inline
  def apply(_showBoundingBox: Boolean, showBoundingBox: Boolean): AbstractMesh = {
    val __obj = js.Dynamic.literal(_showBoundingBox = _showBoundingBox.asInstanceOf[js.Any], showBoundingBox = showBoundingBox.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbstractMesh]
  }
}

