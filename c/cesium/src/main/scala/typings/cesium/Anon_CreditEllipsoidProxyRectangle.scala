package typings.cesium

import typings.cesium.cesiumMod.Credit
import typings.cesium.cesiumMod.Ellipsoid
import typings.cesium.cesiumMod.Rectangle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CreditEllipsoidProxyRectangle extends js.Object {
  var credit: js.UndefOr[Credit | String] = js.undefined
  var ellipsoid: js.UndefOr[Ellipsoid] = js.undefined
  var proxy: js.UndefOr[js.Any] = js.undefined
  var rectangle: js.UndefOr[Rectangle] = js.undefined
  var url: String
}

object Anon_CreditEllipsoidProxyRectangle {
  @scala.inline
  def apply(
    url: String,
    credit: Credit | String = null,
    ellipsoid: Ellipsoid = null,
    proxy: js.Any = null,
    rectangle: Rectangle = null
  ): Anon_CreditEllipsoidProxyRectangle = {
    val __obj = js.Dynamic.literal(url = url)
    if (credit != null) __obj.updateDynamic("credit")(credit.asInstanceOf[js.Any])
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid)
    if (proxy != null) __obj.updateDynamic("proxy")(proxy)
    if (rectangle != null) __obj.updateDynamic("rectangle")(rectangle)
    __obj.asInstanceOf[Anon_CreditEllipsoidProxyRectangle]
  }
}

