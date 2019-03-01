package typings
package cardDashValidatorLib.cardDashValidatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait validNumber extends valid {
  var card: Card | scala.Null
}

object validNumber {
  @scala.inline
  def apply(isPotentiallyValid: scala.Boolean, isValid: scala.Boolean, card: Card = null): validNumber = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isPotentiallyValid")(isPotentiallyValid)
    __obj.updateDynamic("isValid")(isValid)
    if (card != null) __obj.updateDynamic("card")(card)
    __obj.asInstanceOf[validNumber]
  }
}

