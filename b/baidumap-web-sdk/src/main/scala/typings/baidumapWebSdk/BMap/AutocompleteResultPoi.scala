package typings.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutocompleteResultPoi extends js.Object {
  var City: String = js.native
  var business: String = js.native
              // wtf
  var district: String = js.native
  var province: String = js.native
  var street: String = js.native
  var streetNumber: String = js.native
}

object AutocompleteResultPoi {
  @scala.inline
  def apply(
    City: String,
    business: String,
    district: String,
    province: String,
    street: String,
    streetNumber: String
  ): AutocompleteResultPoi = {
    val __obj = js.Dynamic.literal(City = City.asInstanceOf[js.Any], business = business.asInstanceOf[js.Any], district = district.asInstanceOf[js.Any], province = province.asInstanceOf[js.Any], street = street.asInstanceOf[js.Any], streetNumber = streetNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutocompleteResultPoi]
  }
  @scala.inline
  implicit class AutocompleteResultPoiOps[Self <: AutocompleteResultPoi] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCity(value: String): Self = this.set("City", value.asInstanceOf[js.Any])
    @scala.inline
    def setBusiness(value: String): Self = this.set("business", value.asInstanceOf[js.Any])
    @scala.inline
    def setDistrict(value: String): Self = this.set("district", value.asInstanceOf[js.Any])
    @scala.inline
    def setProvince(value: String): Self = this.set("province", value.asInstanceOf[js.Any])
    @scala.inline
    def setStreet(value: String): Self = this.set("street", value.asInstanceOf[js.Any])
    @scala.inline
    def setStreetNumber(value: String): Self = this.set("streetNumber", value.asInstanceOf[js.Any])
  }
  
}

