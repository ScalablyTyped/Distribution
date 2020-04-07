package typings.babylonjs.boundingBoxRendererMod.babylonjsSceneAugmentingMod

import typings.babylonjs.boundingBoxRendererMod.BoundingBoxRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scene extends js.Object {
  /** @hidden (Backing field) */
  var _boundingBoxRenderer: BoundingBoxRenderer
  /** @hidden (Backing field) */
  var _forceShowBoundingBoxes: Boolean
  /**
    * Gets or sets a boolean indicating if all bounding boxes must be rendered
    */
  var forceShowBoundingBoxes: Boolean
  /**
    * Gets the bounding box renderer associated with the scene
    * @returns a BoundingBoxRenderer
    */
  def getBoundingBoxRenderer(): BoundingBoxRenderer
}

object Scene {
  @scala.inline
  def apply(
    _boundingBoxRenderer: BoundingBoxRenderer,
    _forceShowBoundingBoxes: Boolean,
    forceShowBoundingBoxes: Boolean,
    getBoundingBoxRenderer: () => BoundingBoxRenderer
  ): Scene = {
    val __obj = js.Dynamic.literal(_boundingBoxRenderer = _boundingBoxRenderer.asInstanceOf[js.Any], _forceShowBoundingBoxes = _forceShowBoundingBoxes.asInstanceOf[js.Any], forceShowBoundingBoxes = forceShowBoundingBoxes.asInstanceOf[js.Any], getBoundingBoxRenderer = js.Any.fromFunction0(getBoundingBoxRenderer))
  
    __obj.asInstanceOf[Scene]
  }
}

