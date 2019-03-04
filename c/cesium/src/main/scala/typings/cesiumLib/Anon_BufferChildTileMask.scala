package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BufferChildTileMask extends js.Object {
  var buffer: stdLib.ArrayBuffer
  var childTileMask: js.UndefOr[scala.Double] = js.undefined
  var createdByUpsampling: js.UndefOr[scala.Boolean] = js.undefined
  var credits: js.UndefOr[js.Array[cesiumLib.cesiumMod.CesiumNs.Credit]] = js.undefined
  var negativeAltitudeExponentBias: scala.Double
  var negativeElevationThreshold: scala.Double
}

object Anon_BufferChildTileMask {
  @scala.inline
  def apply(
    buffer: stdLib.ArrayBuffer,
    negativeAltitudeExponentBias: scala.Double,
    negativeElevationThreshold: scala.Double,
    childTileMask: scala.Int | scala.Double = null,
    createdByUpsampling: js.UndefOr[scala.Boolean] = js.undefined,
    credits: js.Array[cesiumLib.cesiumMod.CesiumNs.Credit] = null
  ): Anon_BufferChildTileMask = {
    val __obj = js.Dynamic.literal(buffer = buffer, negativeAltitudeExponentBias = negativeAltitudeExponentBias, negativeElevationThreshold = negativeElevationThreshold)
    if (childTileMask != null) __obj.updateDynamic("childTileMask")(childTileMask.asInstanceOf[js.Any])
    if (!js.isUndefined(createdByUpsampling)) __obj.updateDynamic("createdByUpsampling")(createdByUpsampling)
    if (credits != null) __obj.updateDynamic("credits")(credits)
    __obj.asInstanceOf[Anon_BufferChildTileMask]
  }
}

