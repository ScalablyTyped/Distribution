package typings.cesium

import typings.cesium.cesiumMod.Matrix4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DebugShowBoundingVolume extends js.Object {
  var debugShowBoundingVolume: js.UndefOr[Boolean] = js.undefined
  var modelMatrix: js.UndefOr[Matrix4] = js.undefined
}

object Anon_DebugShowBoundingVolume {
  @scala.inline
  def apply(debugShowBoundingVolume: js.UndefOr[Boolean] = js.undefined, modelMatrix: Matrix4 = null): Anon_DebugShowBoundingVolume = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debugShowBoundingVolume)) __obj.updateDynamic("debugShowBoundingVolume")(debugShowBoundingVolume)
    if (modelMatrix != null) __obj.updateDynamic("modelMatrix")(modelMatrix)
    __obj.asInstanceOf[Anon_DebugShowBoundingVolume]
  }
}

