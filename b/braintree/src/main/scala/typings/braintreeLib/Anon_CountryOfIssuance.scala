package typings
package braintreeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CountryOfIssuance extends js.Object {
  var CountryOfIssuance: java.lang.String
  var IssuingBank: java.lang.String
}

object Anon_CountryOfIssuance {
  @scala.inline
  def apply(CountryOfIssuance: java.lang.String, IssuingBank: java.lang.String): Anon_CountryOfIssuance = {
    val __obj = js.Dynamic.literal(CountryOfIssuance = CountryOfIssuance, IssuingBank = IssuingBank)
  
    __obj.asInstanceOf[Anon_CountryOfIssuance]
  }
}

