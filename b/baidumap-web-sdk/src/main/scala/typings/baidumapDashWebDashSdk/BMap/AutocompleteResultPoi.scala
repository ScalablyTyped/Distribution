package typings.baidumapDashWebDashSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutocompleteResultPoi extends js.Object {
  var City: String
  var business: String
  			// wtf
  var district: String
  var province: String
  var street: String
  var streetNumber: String
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
}

