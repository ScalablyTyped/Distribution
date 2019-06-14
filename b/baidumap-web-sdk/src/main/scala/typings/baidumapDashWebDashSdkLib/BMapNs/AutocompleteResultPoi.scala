package typings
package baidumapDashWebDashSdkLib.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutocompleteResultPoi extends js.Object {
  var City: java.lang.String
  var business: java.lang.String
  			// wtf
  var district: java.lang.String
  var province: java.lang.String
  var street: java.lang.String
  var streetNumber: java.lang.String
}

object AutocompleteResultPoi {
  @scala.inline
  def apply(
    City: java.lang.String,
    business: java.lang.String,
    district: java.lang.String,
    province: java.lang.String,
    street: java.lang.String,
    streetNumber: java.lang.String
  ): AutocompleteResultPoi = {
    val __obj = js.Dynamic.literal(City = City, business = business, district = district, province = province, street = street, streetNumber = streetNumber)
  
    __obj.asInstanceOf[AutocompleteResultPoi]
  }
}

