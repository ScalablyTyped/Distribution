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
    val __obj = js.Dynamic.literal(isPotentiallyValid = isPotentiallyValid.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any])
    if (month != null) __obj.updateDynamic("month")(month.asInstanceOf[js.Any])
    if (year != null) __obj.updateDynamic("year")(year.asInstanceOf[js.Any])
    __obj.asInstanceOf[validExpirationDate]
  }
}

