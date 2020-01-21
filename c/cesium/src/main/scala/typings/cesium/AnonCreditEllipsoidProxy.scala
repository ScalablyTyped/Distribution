package typings.cesium

import typings.cesium.mod.Credit
import typings.cesium.mod.Ellipsoid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCreditEllipsoidProxy extends js.Object {
  var credit: js.UndefOr[Credit | String] = js.undefined
  var ellipsoid: js.UndefOr[Ellipsoid] = js.undefined
  var proxy: js.UndefOr[js.Any] = js.undefined
  var url: String
}

object AnonCreditEllipsoidProxy {
  @scala.inline
  def apply(url: String, credit: Credit | String = null, ellipsoid: Ellipsoid = null, proxy: js.Any = null): AnonCreditEllipsoidProxy = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (credit != null) __obj.updateDynamic("credit")(credit.asInstanceOf[js.Any])
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCreditEllipsoidProxy]
  }
}

