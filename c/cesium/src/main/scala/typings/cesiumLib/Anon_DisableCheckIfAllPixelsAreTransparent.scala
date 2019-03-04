package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DisableCheckIfAllPixelsAreTransparent extends js.Object {
  var disableCheckIfAllPixelsAreTransparent: js.UndefOr[scala.Boolean] = js.undefined
  var missingImageUrl: cesiumLib.cesiumMod.CesiumNs.Resource | java.lang.String
  var pixelsToCheck: js.Array[cesiumLib.cesiumMod.CesiumNs.Cartesian2]
}

object Anon_DisableCheckIfAllPixelsAreTransparent {
  @scala.inline
  def apply(
    missingImageUrl: cesiumLib.cesiumMod.CesiumNs.Resource | java.lang.String,
    pixelsToCheck: js.Array[cesiumLib.cesiumMod.CesiumNs.Cartesian2],
    disableCheckIfAllPixelsAreTransparent: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_DisableCheckIfAllPixelsAreTransparent = {
    val __obj = js.Dynamic.literal(missingImageUrl = missingImageUrl.asInstanceOf[js.Any], pixelsToCheck = pixelsToCheck)
    if (!js.isUndefined(disableCheckIfAllPixelsAreTransparent)) __obj.updateDynamic("disableCheckIfAllPixelsAreTransparent")(disableCheckIfAllPixelsAreTransparent)
    __obj.asInstanceOf[Anon_DisableCheckIfAllPixelsAreTransparent]
  }
}

