package typings.cesium

import typings.cesium.mod.Ellipsoid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEllipsoidOnlySunLighting extends js.Object {
  var ellipsoid: js.UndefOr[Ellipsoid] = js.undefined
  var onlySunLighting: js.UndefOr[Boolean] = js.undefined
  var show: js.UndefOr[Boolean] = js.undefined
  var textureUrl: js.UndefOr[String] = js.undefined
}

object AnonEllipsoidOnlySunLighting {
  @scala.inline
  def apply(
    ellipsoid: Ellipsoid = null,
    onlySunLighting: js.UndefOr[Boolean] = js.undefined,
    show: js.UndefOr[Boolean] = js.undefined,
    textureUrl: String = null
  ): AnonEllipsoidOnlySunLighting = {
    val __obj = js.Dynamic.literal()
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid.asInstanceOf[js.Any])
    if (!js.isUndefined(onlySunLighting)) __obj.updateDynamic("onlySunLighting")(onlySunLighting.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (textureUrl != null) __obj.updateDynamic("textureUrl")(textureUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEllipsoidOnlySunLighting]
  }
}

