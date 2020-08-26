package typings.cardValidator.expirationYearMod

import typings.cardValidator.typesMod.Verification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpirationYearVerification extends Verification {
  var isCurrentYear: Boolean = js.native
}

object ExpirationYearVerification {
  @scala.inline
  def apply(isCurrentYear: Boolean, isPotentiallyValid: Boolean, isValid: Boolean): ExpirationYearVerification = {
    val __obj = js.Dynamic.literal(isCurrentYear = isCurrentYear.asInstanceOf[js.Any], isPotentiallyValid = isPotentiallyValid.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpirationYearVerification]
  }
  @scala.inline
  implicit class ExpirationYearVerificationOps[Self <: ExpirationYearVerification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIsCurrentYear(value: Boolean): Self = this.set("isCurrentYear", value.asInstanceOf[js.Any])
  }
  
}

