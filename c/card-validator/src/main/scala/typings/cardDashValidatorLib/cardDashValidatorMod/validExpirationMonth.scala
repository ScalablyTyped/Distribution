package typings
package cardDashValidatorLib.cardDashValidatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait validExpirationMonth extends valid {
  var isValidForThisYear: scala.Boolean
}

object validExpirationMonth {
  @scala.inline
  def apply(isPotentiallyValid: scala.Boolean, isValid: scala.Boolean, isValidForThisYear: scala.Boolean): validExpirationMonth = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isPotentiallyValid")(isPotentiallyValid)
    __obj.updateDynamic("isValid")(isValid)
    __obj.updateDynamic("isValidForThisYear")(isValidForThisYear)
    __obj.asInstanceOf[validExpirationMonth]
  }
}

