package typings.baidumapWebSdk.BMap

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
    val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], district = district.asInstanceOf[js.Any], province = province.asInstanceOf[js.Any], street = street.asInstanceOf[js.Any], streetNumber = streetNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddressComponent]
  }
}

