package typings.cesium

import typings.cesium.cesiumMod.Ellipsoid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EllipsoidOnlySunLighting extends js.Object {
  var ellipsoid: js.UndefOr[Ellipsoid] = js.undefined
  var onlySunLighting: js.UndefOr[Boolean] = js.undefined
  var show: js.UndefOr[Boolean] = js.undefined
  var textureUrl: js.UndefOr[String] = js.undefined
}

object Anon_EllipsoidOnlySunLighting {
  @scala.inline
  def apply(
    ellipsoid: Ellipsoid = null,
    onlySunLighting: js.UndefOr[Boolean] = js.undefined,
    show: js.UndefOr[Boolean] = js.undefined,
    textureUrl: String = null
  ): Anon_EllipsoidOnlySunLighting = {
    val __obj = js.Dynamic.literal()
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid)
    if (!js.isUndefined(onlySunLighting)) __obj.updateDynamic("onlySunLighting")(onlySunLighting)
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    if (textureUrl != null) __obj.updateDynamic("textureUrl")(textureUrl)
    __obj.asInstanceOf[Anon_EllipsoidOnlySunLighting]
  }
}

