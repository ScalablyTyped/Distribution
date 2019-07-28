package typings.cesium

import typings.cesium.cesiumMod.Credit
import typings.cesium.cesiumMod.Ellipsoid
import typings.cesium.cesiumMod.Proxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CreditEllipsoid extends js.Object {
  var credit: js.UndefOr[Credit | String] = js.undefined
  var ellipsoid: js.UndefOr[Ellipsoid] = js.undefined
  var proxy: js.UndefOr[Proxy] = js.undefined
  var requestVertexNormals: js.UndefOr[Boolean] = js.undefined
  var requestWaterMask: js.UndefOr[Boolean] = js.undefined
  var url: String
}

object Anon_CreditEllipsoid {
  @scala.inline
  def apply(
    url: String,
    credit: Credit | String = null,
    ellipsoid: Ellipsoid = null,
    proxy: Proxy = null,
    requestVertexNormals: js.UndefOr[Boolean] = js.undefined,
    requestWaterMask: js.UndefOr[Boolean] = js.undefined
  ): Anon_CreditEllipsoid = {
    val __obj = js.Dynamic.literal(url = url)
    if (credit != null) __obj.updateDynamic("credit")(credit.asInstanceOf[js.Any])
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid)
    if (proxy != null) __obj.updateDynamic("proxy")(proxy)
    if (!js.isUndefined(requestVertexNormals)) __obj.updateDynamic("requestVertexNormals")(requestVertexNormals)
    if (!js.isUndefined(requestWaterMask)) __obj.updateDynamic("requestWaterMask")(requestWaterMask)
    __obj.asInstanceOf[Anon_CreditEllipsoid]
  }
}

