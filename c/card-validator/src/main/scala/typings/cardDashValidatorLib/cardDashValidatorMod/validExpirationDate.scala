package typings
package cardDashValidatorLib.cardDashValidatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait validExpirationDate extends valid {
  var month: java.lang.String | scala.Null
  var year: java.lang.String | scala.Null
}

object validExpirationDate {
  @scala.inline
  def apply(
    isPotentiallyValid: scala.Boolean,
    isValid: scala.Boolean,
    month: java.lang.String = null,
    year: java.lang.String = null
  ): validExpirationDate = {
    val __obj = js.Dynamic.literal(isPotentiallyValid = isPotentiallyValid, isValid = isValid)
    if (month != null) __obj.updateDynamic("month")(month)
    if (year != null) __obj.updateDynamic("year")(year)
    __obj.asInstanceOf[validExpirationDate]
  }
}

