package typings.baidumapDashWebDashSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddressComponent extends js.Object {
  var city: String
  var district: String
  var province: String
  var street: String
  var streetNumber: String
}

object AddressComponent {
  @scala.inline
  def apply(city: String, district: String, province: String, street: String, streetNumber: String): AddressComponent = {
    val __obj = js.Dynamic.literal(city = city, district = district, province = province, street = street, streetNumber = streetNumber)
  
    __obj.asInstanceOf[AddressComponent]
  }
}

