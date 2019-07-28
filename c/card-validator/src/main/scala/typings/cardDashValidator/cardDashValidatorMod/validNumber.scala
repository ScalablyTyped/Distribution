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
    val __obj = js.Dynamic.literal(isPotentiallyValid = isPotentiallyValid, isValid = isValid)
    if (card != null) __obj.updateDynamic("card")(card)
    __obj.asInstanceOf[validNumber]
  }
}

