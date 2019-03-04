package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CreditEllipsoidProxyRectangle extends js.Object {
  var credit: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Credit | java.lang.String] = js.undefined
  var ellipsoid: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Ellipsoid] = js.undefined
  var proxy: js.UndefOr[js.Any] = js.undefined
  var rectangle: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Rectangle] = js.undefined
  var url: java.lang.String
}

object Anon_CreditEllipsoidProxyRectangle {
  @scala.inline
  def apply(
    url: java.lang.String,
    credit: cesiumLib.cesiumMod.CesiumNs.Credit | java.lang.String = null,
    ellipsoid: cesiumLib.cesiumMod.CesiumNs.Ellipsoid = null,
    proxy: js.Any = null,
    rectangle: cesiumLib.cesiumMod.CesiumNs.Rectangle = null
  ): Anon_CreditEllipsoidProxyRectangle = {
    val __obj = js.Dynamic.literal(url = url)
    if (credit != null) __obj.updateDynamic("credit")(credit.asInstanceOf[js.Any])
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid)
    if (proxy != null) __obj.updateDynamic("proxy")(proxy)
    if (rectangle != null) __obj.updateDynamic("rectangle")(rectangle)
    __obj.asInstanceOf[Anon_CreditEllipsoidProxyRectangle]
  }
}

