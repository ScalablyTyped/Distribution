package typings.cardDashValidator.cardDashValidatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait validExpirationMonth extends valid {
  var isValidForThisYear: Boolean
}

object validExpirationMonth {
  @scala.inline
  def apply(isPotentiallyValid: Boolean, isValid: Boolean, isValidForThisYear: Boolean): validExpirationMonth = {
    val __obj = js.Dynamic.literal(isPotentiallyValid = isPotentiallyValid, isValid = isValid, isValidForThisYear = isValidForThisYear)
  
    __obj.asInstanceOf[validExpirationMonth]
  }
}

