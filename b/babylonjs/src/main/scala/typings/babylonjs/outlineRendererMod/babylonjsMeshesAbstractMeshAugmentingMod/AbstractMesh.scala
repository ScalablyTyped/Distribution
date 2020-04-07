package typings.babylonjs.outlineRendererMod.babylonjsMeshesAbstractMeshAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbstractMesh extends js.Object {
  /** @hidden (Backing field) */
  var _renderOutline: Boolean
  /** @hidden (Backing field) */
  var _renderOverlay: Boolean
  /**
    * Gets or sets a boolean indicating if the outline must be rendered as well
    * @see https://www.babylonjs-playground.com/#10WJ5S#3
    */
  var renderOutline: Boolean
  /**
    * Gets or sets a boolean indicating if the overlay must be rendered as well
    * @see https://www.babylonjs-playground.com/#10WJ5S#2
    */
  var renderOverlay: Boolean
}

object AbstractMesh {
  @scala.inline
  def apply(_renderOutline: Boolean, _renderOverlay: Boolean, renderOutline: Boolean, renderOverlay: Boolean): AbstractMesh = {
    val __obj = js.Dynamic.literal(_renderOutline = _renderOutline.asInstanceOf[js.Any], _renderOverlay = _renderOverlay.asInstanceOf[js.Any], renderOutline = renderOutline.asInstanceOf[js.Any], renderOverlay = renderOverlay.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AbstractMesh]
  }
}

