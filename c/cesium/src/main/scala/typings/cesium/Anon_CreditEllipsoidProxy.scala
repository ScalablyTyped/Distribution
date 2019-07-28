package typings.cesium

import typings.cesium.cesiumMod.Credit
import typings.cesium.cesiumMod.Ellipsoid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CreditEllipsoidProxy extends js.Object {
  var credit: js.UndefOr[Credit | String] = js.undefined
  var ellipsoid: js.UndefOr[Ellipsoid] = js.undefined
  var proxy: js.UndefOr[js.Any] = js.undefined
  var url: String
}

object Anon_CreditEllipsoidProxy {
  @scala.inline
  def apply(url: String, credit: Credit | String = null, ellipsoid: Ellipsoid = null, proxy: js.Any = null): Anon_CreditEllipsoidProxy = {
    val __obj = js.Dynamic.literal(url = url)
    if (credit != null) __obj.updateDynamic("credit")(credit.asInstanceOf[js.Any])
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid)
    if (proxy != null) __obj.updateDynamic("proxy")(proxy)
    __obj.asInstanceOf[Anon_CreditEllipsoidProxy]
  }
}

