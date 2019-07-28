package typings.cardDashValidator.cardDashValidatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait valid extends js.Object {
  var isPotentiallyValid: Boolean
  var isValid: Boolean
}

object valid {
  @scala.inline
  def apply(isPotentiallyValid: Boolean, isValid: Boolean): valid = {
    val __obj = js.Dynamic.literal(isPotentiallyValid = isPotentiallyValid, isValid = isValid)
  
    __obj.asInstanceOf[valid]
  }
}

