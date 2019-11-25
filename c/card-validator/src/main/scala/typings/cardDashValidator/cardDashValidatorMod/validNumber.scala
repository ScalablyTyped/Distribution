package typings.cardDashValidator.cardDashValidatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait validNumber extends valid {
  var card: Card | Null
}

object validNumber {
  @scala.inline
  def apply(isPotentiallyValid: Boolean, isValid: Boolean, card: Card = null): validNumber = {
    val __obj = js.Dynamic.literal(isPotentiallyValid = isPotentiallyValid.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any])
    if (card != null) __obj.updateDynamic("card")(card.asInstanceOf[js.Any])
    __obj.asInstanceOf[validNumber]
  }
}

