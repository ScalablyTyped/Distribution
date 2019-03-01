package typings
package baidumapDashWebDashSdkLib.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddressComponent extends js.Object {
  var city: java.lang.String
  var district: java.lang.String
  var province: java.lang.String
  var street: java.lang.String
  var streetNumber: java.lang.String
}

object AddressComponent {
  @scala.inline
  def apply(
    city: java.lang.String,
    district: java.lang.String,
    province: java.lang.String,
    street: java.lang.String,
    streetNumber: java.lang.String
  ): AddressComponent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("city")(city)
    __obj.updateDynamic("district")(district)
    __obj.updateDynamic("province")(province)
    __obj.updateDynamic("street")(street)
    __obj.updateDynamic("streetNumber")(streetNumber)
    __obj.asInstanceOf[AddressComponent]
  }
}

