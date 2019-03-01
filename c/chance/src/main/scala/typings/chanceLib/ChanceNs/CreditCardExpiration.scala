package typings
package chanceLib.ChanceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreditCardExpiration extends js.Object {
  var month: java.lang.String
  var year: java.lang.String
}

object CreditCardExpiration {
  @scala.inline
  def apply(month: java.lang.String, year: java.lang.String): CreditCardExpiration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("month")(month)
    __obj.updateDynamic("year")(year)
    __obj.asInstanceOf[CreditCardExpiration]
  }
}

