package typings.braintree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CountryOfIssuance extends js.Object {
  var CountryOfIssuance: String
  var IssuingBank: String
}

object Anon_CountryOfIssuance {
  @scala.inline
  def apply(CountryOfIssuance: String, IssuingBank: String): Anon_CountryOfIssuance = {
    val __obj = js.Dynamic.literal(CountryOfIssuance = CountryOfIssuance.asInstanceOf[js.Any], IssuingBank = IssuingBank.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CountryOfIssuance]
  }
}

