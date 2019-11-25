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
    val __obj = js.Dynamic.literal(isPotentiallyValid = isPotentiallyValid.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], isValidForThisYear = isValidForThisYear.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[validExpirationMonth]
  }
}

