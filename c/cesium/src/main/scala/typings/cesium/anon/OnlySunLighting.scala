package typings.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnlySunLighting extends js.Object {
  var ellipsoid: js.UndefOr[typings.cesium.mod.Ellipsoid] = js.undefined
  var onlySunLighting: js.UndefOr[Boolean] = js.undefined
  var show: js.UndefOr[Boolean] = js.undefined
  var textureUrl: js.UndefOr[String] = js.undefined
}

object OnlySunLighting {
  @scala.inline
  def apply(
    ellipsoid: typings.cesium.mod.Ellipsoid = null,
    onlySunLighting: js.UndefOr[Boolean] = js.undefined,
    show: js.UndefOr[Boolean] = js.undefined,
    textureUrl: String = null
  ): OnlySunLighting = {
    val __obj = js.Dynamic.literal()
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid.asInstanceOf[js.Any])
    if (!js.isUndefined(onlySunLighting)) __obj.updateDynamic("onlySunLighting")(onlySunLighting.get.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.get.asInstanceOf[js.Any])
    if (textureUrl != null) __obj.updateDynamic("textureUrl")(textureUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnlySunLighting]
  }
}

