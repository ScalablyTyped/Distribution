package typings.braintree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIssuingBank extends js.Object {
  var CountryOfIssuance: String
  var IssuingBank: String
}

object AnonIssuingBank {
  @scala.inline
  def apply(CountryOfIssuance: String, IssuingBank: String): AnonIssuingBank = {
    val __obj = js.Dynamic.literal(CountryOfIssuance = CountryOfIssuance.asInstanceOf[js.Any], IssuingBank = IssuingBank.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIssuingBank]
  }
}

