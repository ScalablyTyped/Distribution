package typings.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ellipsoid extends js.Object {
  var credit: js.UndefOr[typings.cesium.mod.Credit | String] = js.undefined
  var ellipsoid: js.UndefOr[typings.cesium.mod.Ellipsoid] = js.undefined
  var proxy: js.UndefOr[typings.cesium.mod.Proxy] = js.undefined
  var requestVertexNormals: js.UndefOr[Boolean] = js.undefined
  var requestWaterMask: js.UndefOr[Boolean] = js.undefined
  var url: String
}

object Ellipsoid {
  @scala.inline
  def apply(
    url: String,
    credit: typings.cesium.mod.Credit | String = null,
    ellipsoid: typings.cesium.mod.Ellipsoid = null,
    proxy: typings.cesium.mod.Proxy = null,
    requestVertexNormals: js.UndefOr[Boolean] = js.undefined,
    requestWaterMask: js.UndefOr[Boolean] = js.undefined
  ): Ellipsoid = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (credit != null) __obj.updateDynamic("credit")(credit.asInstanceOf[js.Any])
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (!js.isUndefined(requestVertexNormals)) __obj.updateDynamic("requestVertexNormals")(requestVertexNormals.get.asInstanceOf[js.Any])
    if (!js.isUndefined(requestWaterMask)) __obj.updateDynamic("requestWaterMask")(requestWaterMask.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ellipsoid]
  }
}

