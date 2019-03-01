package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CreditEllipsoid extends js.Object {
  var credit: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Credit | java.lang.String] = js.undefined
  var ellipsoid: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Ellipsoid] = js.undefined
  var proxy: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Proxy] = js.undefined
  var requestVertexNormals: js.UndefOr[scala.Boolean] = js.undefined
  var requestWaterMask: js.UndefOr[scala.Boolean] = js.undefined
  var url: java.lang.String
}

object Anon_CreditEllipsoid {
  @scala.inline
  def apply(
    url: java.lang.String,
    credit: cesiumLib.cesiumMod.CesiumNs.Credit | java.lang.String = null,
    ellipsoid: cesiumLib.cesiumMod.CesiumNs.Ellipsoid = null,
    proxy: cesiumLib.cesiumMod.CesiumNs.Proxy = null,
    requestVertexNormals: js.UndefOr[scala.Boolean] = js.undefined,
    requestWaterMask: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_CreditEllipsoid = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("url")(url)
    if (credit != null) __obj.updateDynamic("credit")(credit.asInstanceOf[js.Any])
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid)
    if (proxy != null) __obj.updateDynamic("proxy")(proxy)
    if (!js.isUndefined(requestVertexNormals)) __obj.updateDynamic("requestVertexNormals")(requestVertexNormals)
    if (!js.isUndefined(requestWaterMask)) __obj.updateDynamic("requestWaterMask")(requestWaterMask)
    __obj.asInstanceOf[Anon_CreditEllipsoid]
  }
}

