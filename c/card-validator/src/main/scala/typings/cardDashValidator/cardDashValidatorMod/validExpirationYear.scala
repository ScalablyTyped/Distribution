package typings.cardDashValidator.cardDashValidatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait validExpirationYear extends valid {
  var isCurrentYear: Boolean
}

object validExpirationYear {
  @scala.inline
  def apply(isCurrentYear: Boolean, isPotentiallyValid: Boolean, isValid: Boolean): validExpirationYear = {
    val __obj = js.Dynamic.literal(isCurrentYear = isCurrentYear, isPotentiallyValid = isPotentiallyValid, isValid = isValid)
  
    __obj.asInstanceOf[validExpirationYear]
  }
}

