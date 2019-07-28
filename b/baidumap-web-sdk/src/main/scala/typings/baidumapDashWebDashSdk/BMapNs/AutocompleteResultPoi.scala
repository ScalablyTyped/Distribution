package typings.baidumapDashWebDashSdk.BMapNs

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
    val __obj = js.Dynamic.literal(City = City, business = business, district = district, province = province, street = street, streetNumber = streetNumber)
  
    __obj.asInstanceOf[AutocompleteResultPoi]
  }
}

