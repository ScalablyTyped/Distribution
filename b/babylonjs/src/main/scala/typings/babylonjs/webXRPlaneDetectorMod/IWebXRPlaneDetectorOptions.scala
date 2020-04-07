package typings.babylonjs.webXRPlaneDetectorMod

import typings.babylonjs.transformNodeMod.TransformNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWebXRPlaneDetectorOptions extends js.Object {
  /**
    * The node to use to transform the local results to world coordinates
    */
  var worldParentNode: js.UndefOr[TransformNode] = js.undefined
}

object IWebXRPlaneDetectorOptions {
  @scala.inline
  def apply(worldParentNode: TransformNode = null): IWebXRPlaneDetectorOptions = {
    val __obj = js.Dynamic.literal()
    if (worldParentNode != null) __obj.updateDynamic("worldParentNode")(worldParentNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebXRPlaneDetectorOptions]
  }
}

