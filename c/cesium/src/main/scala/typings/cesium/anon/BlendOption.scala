package typings.cesium.anon

import typings.cesium.mod.Matrix4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlendOption extends js.Object {
  var blendOption: js.UndefOr[typings.cesium.mod.BlendOption] = js.undefined
  var debugShowBoundingVolume: js.UndefOr[Boolean] = js.undefined
  var modelMatrix: js.UndefOr[Matrix4] = js.undefined
  var scene: js.UndefOr[typings.cesium.mod.Scene] = js.undefined
}

object BlendOption {
  @scala.inline
  def apply(
    blendOption: typings.cesium.mod.BlendOption = null,
    debugShowBoundingVolume: js.UndefOr[Boolean] = js.undefined,
    modelMatrix: Matrix4 = null,
    scene: typings.cesium.mod.Scene = null
  ): BlendOption = {
    val __obj = js.Dynamic.literal()
    if (blendOption != null) __obj.updateDynamic("blendOption")(blendOption.asInstanceOf[js.Any])
    if (!js.isUndefined(debugShowBoundingVolume)) __obj.updateDynamic("debugShowBoundingVolume")(debugShowBoundingVolume.get.asInstanceOf[js.Any])
    if (modelMatrix != null) __obj.updateDynamic("modelMatrix")(modelMatrix.asInstanceOf[js.Any])
    if (scene != null) __obj.updateDynamic("scene")(scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlendOption]
  }
}

