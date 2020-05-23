package typings.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreditEllipsoid extends js.Object {
  var credit: js.UndefOr[typings.cesium.mod.Credit | String] = js.undefined
  var ellipsoid: js.UndefOr[typings.cesium.mod.Ellipsoid] = js.undefined
  var proxy: js.UndefOr[js.Any] = js.undefined
  var rectangle: js.UndefOr[typings.cesium.mod.Rectangle] = js.undefined
  var url: String
}

object CreditEllipsoid {
  @scala.inline
  def apply(
    url: String,
    credit: typings.cesium.mod.Credit | String = null,
    ellipsoid: typings.cesium.mod.Ellipsoid = null,
    proxy: js.Any = null,
    rectangle: typings.cesium.mod.Rectangle = null
  ): CreditEllipsoid = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (credit != null) __obj.updateDynamic("credit")(credit.asInstanceOf[js.Any])
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (rectangle != null) __obj.updateDynamic("rectangle")(rectangle.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreditEllipsoid]
  }
}

