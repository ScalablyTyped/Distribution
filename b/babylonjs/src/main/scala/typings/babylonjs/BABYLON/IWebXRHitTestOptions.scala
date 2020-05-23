package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWebXRHitTestOptions extends js.Object {
  /**
    * Only test when user interacted with the scene. Default - hit test every frame
    */
  var testOnPointerDownOnly: js.UndefOr[Boolean] = js.undefined
  /**
    * The node to use to transform the local results to world coordinates
    */
  var worldParentNode: js.UndefOr[TransformNode] = js.undefined
}

object IWebXRHitTestOptions {
  @scala.inline
  def apply(testOnPointerDownOnly: js.UndefOr[Boolean] = js.undefined, worldParentNode: TransformNode = null): IWebXRHitTestOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(testOnPointerDownOnly)) __obj.updateDynamic("testOnPointerDownOnly")(testOnPointerDownOnly.get.asInstanceOf[js.Any])
    if (worldParentNode != null) __obj.updateDynamic("worldParentNode")(worldParentNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebXRHitTestOptions]
  }
}

