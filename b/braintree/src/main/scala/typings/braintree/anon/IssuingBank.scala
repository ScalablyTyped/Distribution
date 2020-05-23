package typings.braintree.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuingBank extends js.Object {
  var CountryOfIssuance: String
  var IssuingBank: String
}

object IssuingBank {
  @scala.inline
  def apply(CountryOfIssuance: String, IssuingBank: String): IssuingBank = {
    val __obj = js.Dynamic.literal(CountryOfIssuance = CountryOfIssuance.asInstanceOf[js.Any], IssuingBank = IssuingBank.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuingBank]
  }
}

