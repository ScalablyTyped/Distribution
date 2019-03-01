package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BlendOption extends js.Object {
  var blendOption: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.BlendOption] = js.undefined
  var debugShowBoundingVolume: js.UndefOr[scala.Boolean] = js.undefined
  var modelMatrix: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Matrix4] = js.undefined
  var scene: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Scene] = js.undefined
}

object Anon_BlendOption {
  @scala.inline
  def apply(
    blendOption: cesiumLib.cesiumMod.CesiumNs.BlendOption = null,
    debugShowBoundingVolume: js.UndefOr[scala.Boolean] = js.undefined,
    modelMatrix: cesiumLib.cesiumMod.CesiumNs.Matrix4 = null,
    scene: cesiumLib.cesiumMod.CesiumNs.Scene = null
  ): Anon_BlendOption = {
    val __obj = js.Dynamic.literal()
    if (blendOption != null) __obj.updateDynamic("blendOption")(blendOption)
    if (!js.isUndefined(debugShowBoundingVolume)) __obj.updateDynamic("debugShowBoundingVolume")(debugShowBoundingVolume)
    if (modelMatrix != null) __obj.updateDynamic("modelMatrix")(modelMatrix)
    if (scene != null) __obj.updateDynamic("scene")(scene)
    __obj.asInstanceOf[Anon_BlendOption]
  }
}

