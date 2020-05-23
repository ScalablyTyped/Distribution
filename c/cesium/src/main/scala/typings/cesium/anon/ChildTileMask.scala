package typings.cesium.anon

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChildTileMask extends js.Object {
  var buffer: ArrayBuffer
  var childTileMask: js.UndefOr[Double] = js.undefined
  var createdByUpsampling: js.UndefOr[Boolean] = js.undefined
  var credits: js.UndefOr[js.Array[typings.cesium.mod.Credit]] = js.undefined
  var negativeAltitudeExponentBias: Double
  var negativeElevationThreshold: Double
}

object ChildTileMask {
  @scala.inline
  def apply(
    buffer: ArrayBuffer,
    negativeAltitudeExponentBias: Double,
    negativeElevationThreshold: Double,
    childTileMask: js.UndefOr[Double] = js.undefined,
    createdByUpsampling: js.UndefOr[Boolean] = js.undefined,
    credits: js.Array[typings.cesium.mod.Credit] = null
  ): ChildTileMask = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], negativeAltitudeExponentBias = negativeAltitudeExponentBias.asInstanceOf[js.Any], negativeElevationThreshold = negativeElevationThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(childTileMask)) __obj.updateDynamic("childTileMask")(childTileMask.get.asInstanceOf[js.Any])
    if (!js.isUndefined(createdByUpsampling)) __obj.updateDynamic("createdByUpsampling")(createdByUpsampling.get.asInstanceOf[js.Any])
    if (credits != null) __obj.updateDynamic("credits")(credits.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildTileMask]
  }
}

