package typings.cesium

import typings.cesium.mod.BlendOption
import typings.cesium.mod.Matrix4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonModelMatrix extends js.Object {
  var blendOption: js.UndefOr[BlendOption] = js.undefined
  var debugShowBoundingVolume: js.UndefOr[Boolean] = js.undefined
  var modelMatrix: js.UndefOr[Matrix4] = js.undefined
}

object AnonModelMatrix {
  @scala.inline
  def apply(
    blendOption: BlendOption = null,
    debugShowBoundingVolume: js.UndefOr[Boolean] = js.undefined,
    modelMatrix: Matrix4 = null
  ): AnonModelMatrix = {
    val __obj = js.Dynamic.literal()
    if (blendOption != null) __obj.updateDynamic("blendOption")(blendOption.asInstanceOf[js.Any])
    if (!js.isUndefined(debugShowBoundingVolume)) __obj.updateDynamic("debugShowBoundingVolume")(debugShowBoundingVolume.asInstanceOf[js.Any])
    if (modelMatrix != null) __obj.updateDynamic("modelMatrix")(modelMatrix.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonModelMatrix]
  }
}

