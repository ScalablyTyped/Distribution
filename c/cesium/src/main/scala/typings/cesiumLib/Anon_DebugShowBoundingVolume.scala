package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DebugShowBoundingVolume extends js.Object {
  var debugShowBoundingVolume: js.UndefOr[scala.Boolean] = js.undefined
  var modelMatrix: js.UndefOr[cesiumLib.cesiumMod.Matrix4] = js.undefined
}

object Anon_DebugShowBoundingVolume {
  @scala.inline
  def apply(
    debugShowBoundingVolume: js.UndefOr[scala.Boolean] = js.undefined,
    modelMatrix: cesiumLib.cesiumMod.Matrix4 = null
  ): Anon_DebugShowBoundingVolume = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debugShowBoundingVolume)) __obj.updateDynamic("debugShowBoundingVolume")(debugShowBoundingVolume)
    if (modelMatrix != null) __obj.updateDynamic("modelMatrix")(modelMatrix)
    __obj.asInstanceOf[Anon_DebugShowBoundingVolume]
  }
}

