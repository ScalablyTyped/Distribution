package typings.cesium

import typings.cesium.cesiumMod.Credit
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BufferChildTileMask extends js.Object {
  var buffer: ArrayBuffer
  var childTileMask: js.UndefOr[Double] = js.undefined
  var createdByUpsampling: js.UndefOr[Boolean] = js.undefined
  var credits: js.UndefOr[js.Array[Credit]] = js.undefined
  var negativeAltitudeExponentBias: Double
  var negativeElevationThreshold: Double
}

object Anon_BufferChildTileMask {
  @scala.inline
  def apply(
    buffer: ArrayBuffer,
    negativeAltitudeExponentBias: Double,
    negativeElevationThreshold: Double,
    childTileMask: Int | Double = null,
    createdByUpsampling: js.UndefOr[Boolean] = js.undefined,
    credits: js.Array[Credit] = null
  ): Anon_BufferChildTileMask = {
    val __obj = js.Dynamic.literal(buffer = buffer, negativeAltitudeExponentBias = negativeAltitudeExponentBias, negativeElevationThreshold = negativeElevationThreshold)
    if (childTileMask != null) __obj.updateDynamic("childTileMask")(childTileMask.asInstanceOf[js.Any])
    if (!js.isUndefined(createdByUpsampling)) __obj.updateDynamic("createdByUpsampling")(createdByUpsampling)
    if (credits != null) __obj.updateDynamic("credits")(credits)
    __obj.asInstanceOf[Anon_BufferChildTileMask]
  }
}

