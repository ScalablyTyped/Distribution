package typings.cardDashValidator.cardDashValidatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait validExpirationDate extends valid {
  var month: String | Null
  var year: String | Null
}

object validExpirationDate {
  @scala.inline
  def apply(isPotentiallyValid: Boolean, isValid: Boolean, month: String = null, year: String = null): validExpirationDate = {
    val __obj = js.Dynamic.literal(isPotentiallyValid = isPotentiallyValid, isValid = isValid)
    if (month != null) __obj.updateDynamic("month")(month)
    if (year != null) __obj.updateDynamic("year")(year)
    __obj.asInstanceOf[validExpirationDate]
  }
}

