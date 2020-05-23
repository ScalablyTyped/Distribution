package typings.babylonjs.renderingIndexMod.babylonjsMeshesAbstractMeshAugmentingMod

import typings.babylonjs.edgesRendererMod.EdgesRenderer
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbstractMesh extends js.Object {
  /** @hidden (Backing field) */
  var _renderOutline: Boolean
  /** @hidden (Backing field) */
  var _renderOverlay: Boolean
  /** @hidden (Backing field) */
  var _showBoundingBox: Boolean
  /**
    * Gets the edgesRenderer associated with the mesh
    */
  var edgesRenderer: Nullable[EdgesRenderer]
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
  /**
    * Gets or sets a boolean indicating if the bounding box must be rendered as well (false by default)
    */
  var showBoundingBox: Boolean
}

object AbstractMesh {
  @scala.inline
  def apply(
    _renderOutline: Boolean,
    _renderOverlay: Boolean,
    _showBoundingBox: Boolean,
    renderOutline: Boolean,
    renderOverlay: Boolean,
    showBoundingBox: Boolean,
    edgesRenderer: Nullable[EdgesRenderer] = null
  ): AbstractMesh = {
    val __obj = js.Dynamic.literal(_renderOutline = _renderOutline.asInstanceOf[js.Any], _renderOverlay = _renderOverlay.asInstanceOf[js.Any], _showBoundingBox = _showBoundingBox.asInstanceOf[js.Any], renderOutline = renderOutline.asInstanceOf[js.Any], renderOverlay = renderOverlay.asInstanceOf[js.Any], showBoundingBox = showBoundingBox.asInstanceOf[js.Any], edgesRenderer = edgesRenderer.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbstractMesh]
  }
}

