package typings.babylonjs.webXRAnchorSystemMod

import typings.babylonjs.transformNodeMod.TransformNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWebXRAnchorSystemOptions extends js.Object {
  /**
    * Should a new anchor be added every time a select event is triggered
    */
  var addAnchorOnSelect: js.UndefOr[Boolean] = js.undefined
  /**
    * should the anchor system use plane detection.
    * If set to true, the plane-detection feature should be set using setPlaneDetector
    */
  var usePlaneDetection: js.UndefOr[Boolean] = js.undefined
  /**
    * a node that will be used to convert local to world coordinates
    */
  var worldParentNode: js.UndefOr[TransformNode] = js.undefined
}

object IWebXRAnchorSystemOptions {
  @scala.inline
  def apply(
    addAnchorOnSelect: js.UndefOr[Boolean] = js.undefined,
    usePlaneDetection: js.UndefOr[Boolean] = js.undefined,
    worldParentNode: TransformNode = null
  ): IWebXRAnchorSystemOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addAnchorOnSelect)) __obj.updateDynamic("addAnchorOnSelect")(addAnchorOnSelect.get.asInstanceOf[js.Any])
    if (!js.isUndefined(usePlaneDetection)) __obj.updateDynamic("usePlaneDetection")(usePlaneDetection.get.asInstanceOf[js.Any])
    if (worldParentNode != null) __obj.updateDynamic("worldParentNode")(worldParentNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebXRAnchorSystemOptions]
  }
}

