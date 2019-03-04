package typings
package cardDashValidatorLib.cardDashValidatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait valid extends js.Object {
  var isPotentiallyValid: scala.Boolean
  var isValid: scala.Boolean
}

object valid {
  @scala.inline
  def apply(isPotentiallyValid: scala.Boolean, isValid: scala.Boolean): valid = {
    val __obj = js.Dynamic.literal(isPotentiallyValid = isPotentiallyValid, isValid = isValid)
  
    __obj.asInstanceOf[valid]
  }
}

