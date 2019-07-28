package typings.cesium

import typings.cesium.cesiumMod.BlendOption
import typings.cesium.cesiumMod.Matrix4
import typings.cesium.cesiumMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BlendOption extends js.Object {
  var blendOption: js.UndefOr[BlendOption] = js.undefined
  var debugShowBoundingVolume: js.UndefOr[Boolean] = js.undefined
  var modelMatrix: js.UndefOr[Matrix4] = js.undefined
  var scene: js.UndefOr[Scene] = js.undefined
}

object Anon_BlendOption {
  @scala.inline
  def apply(
    blendOption: BlendOption = null,
    debugShowBoundingVolume: js.UndefOr[Boolean] = js.undefined,
    modelMatrix: Matrix4 = null,
    scene: Scene = null
  ): Anon_BlendOption = {
    val __obj = js.Dynamic.literal()
    if (blendOption != null) __obj.updateDynamic("blendOption")(blendOption)
    if (!js.isUndefined(debugShowBoundingVolume)) __obj.updateDynamic("debugShowBoundingVolume")(debugShowBoundingVolume)
    if (modelMatrix != null) __obj.updateDynamic("modelMatrix")(modelMatrix)
    if (scene != null) __obj.updateDynamic("scene")(scene)
    __obj.asInstanceOf[Anon_BlendOption]
  }
}

