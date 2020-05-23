package typings.cesium.anon

import typings.cesium.mod.Cartesian2
import typings.cesium.mod.Resource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisableCheckIfAllPixelsAreTransparent extends js.Object {
  var disableCheckIfAllPixelsAreTransparent: js.UndefOr[Boolean] = js.undefined
  var missingImageUrl: Resource | String
  var pixelsToCheck: js.Array[Cartesian2]
}

object DisableCheckIfAllPixelsAreTransparent {
  @scala.inline
  def apply(
    missingImageUrl: Resource | String,
    pixelsToCheck: js.Array[Cartesian2],
    disableCheckIfAllPixelsAreTransparent: js.UndefOr[Boolean] = js.undefined
  ): DisableCheckIfAllPixelsAreTransparent = {
    val __obj = js.Dynamic.literal(missingImageUrl = missingImageUrl.asInstanceOf[js.Any], pixelsToCheck = pixelsToCheck.asInstanceOf[js.Any])
    if (!js.isUndefined(disableCheckIfAllPixelsAreTransparent)) __obj.updateDynamic("disableCheckIfAllPixelsAreTransparent")(disableCheckIfAllPixelsAreTransparent.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableCheckIfAllPixelsAreTransparent]
  }
}

