package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BlendOption extends js.Object {
  var blendOption: js.UndefOr[cesiumLib.cesiumMod.BlendOption] = js.undefined
  var debugShowBoundingVolume: js.UndefOr[scala.Boolean] = js.undefined
  var modelMatrix: js.UndefOr[cesiumLib.cesiumMod.Matrix4] = js.undefined
  var scene: js.UndefOr[cesiumLib.cesiumMod.Scene] = js.undefined
}

object Anon_BlendOption {
  @scala.inline
  def apply(
    blendOption: cesiumLib.cesiumMod.BlendOption = null,
    debugShowBoundingVolume: js.UndefOr[scala.Boolean] = js.undefined,
    modelMatrix: cesiumLib.cesiumMod.Matrix4 = null,
    scene: cesiumLib.cesiumMod.Scene = null
  ): Anon_BlendOption = {
    val __obj = js.Dynamic.literal()
    if (blendOption != null) __obj.updateDynamic("blendOption")(blendOption)
    if (!js.isUndefined(debugShowBoundingVolume)) __obj.updateDynamic("debugShowBoundingVolume")(debugShowBoundingVolume)
    if (modelMatrix != null) __obj.updateDynamic("modelMatrix")(modelMatrix)
    if (scene != null) __obj.updateDynamic("scene")(scene)
    __obj.asInstanceOf[Anon_BlendOption]
  }
}

