package typings.cesium

import typings.cesium.mod.Matrix4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDebugShowBoundingVolumeModelMatrix extends js.Object {
  var debugShowBoundingVolume: js.UndefOr[Boolean] = js.undefined
  var modelMatrix: js.UndefOr[Matrix4] = js.undefined
}

object AnonDebugShowBoundingVolumeModelMatrix {
  @scala.inline
  def apply(debugShowBoundingVolume: js.UndefOr[Boolean] = js.undefined, modelMatrix: Matrix4 = null): AnonDebugShowBoundingVolumeModelMatrix = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debugShowBoundingVolume)) __obj.updateDynamic("debugShowBoundingVolume")(debugShowBoundingVolume.asInstanceOf[js.Any])
    if (modelMatrix != null) __obj.updateDynamic("modelMatrix")(modelMatrix.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDebugShowBoundingVolumeModelMatrix]
  }
}

