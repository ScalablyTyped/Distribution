package typings.braintree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCountryOfIssuance extends js.Object {
  var CountryOfIssuance: String
  var IssuingBank: String
}

object AnonCountryOfIssuance {
  @scala.inline
  def apply(CountryOfIssuance: String, IssuingBank: String): AnonCountryOfIssuance = {
    val __obj = js.Dynamic.literal(CountryOfIssuance = CountryOfIssuance.asInstanceOf[js.Any], IssuingBank = IssuingBank.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCountryOfIssuance]
  }
}

