package typings.chance.Chance

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreditCardExpiration extends js.Object {
  var month: String
  var year: String
}

object CreditCardExpiration {
  @scala.inline
  def apply(month: String, year: String): CreditCardExpiration = {
    val __obj = js.Dynamic.literal(month = month.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreditCardExpiration]
  }
}

