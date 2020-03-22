package typings.cesium

import typings.cesium.mod.Credit
import typings.cesium.mod.Ellipsoid
import typings.cesium.mod.Proxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEllipsoid extends js.Object {
  var credit: js.UndefOr[Credit | String] = js.undefined
  var ellipsoid: js.UndefOr[Ellipsoid] = js.undefined
  var proxy: js.UndefOr[Proxy] = js.undefined
  var requestVertexNormals: js.UndefOr[Boolean] = js.undefined
  var requestWaterMask: js.UndefOr[Boolean] = js.undefined
  var url: String
}

object AnonEllipsoid {
  @scala.inline
  def apply(
    url: String,
    credit: Credit | String = null,
    ellipsoid: Ellipsoid = null,
    proxy: Proxy = null,
    requestVertexNormals: js.UndefOr[Boolean] = js.undefined,
    requestWaterMask: js.UndefOr[Boolean] = js.undefined
  ): AnonEllipsoid = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (credit != null) __obj.updateDynamic("credit")(credit.asInstanceOf[js.Any])
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (!js.isUndefined(requestVertexNormals)) __obj.updateDynamic("requestVertexNormals")(requestVertexNormals.asInstanceOf[js.Any])
    if (!js.isUndefined(requestWaterMask)) __obj.updateDynamic("requestWaterMask")(requestWaterMask.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEllipsoid]
  }
}

