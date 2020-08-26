package typings.cardValidator.expirationDateMod

import typings.cardValidator.typesMod.Verification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpirationDateVerification extends Verification {
  var month: String | Null = js.native
  var year: String | Null = js.native
}

object ExpirationDateVerification {
  @scala.inline
  def apply(isPotentiallyValid: Boolean, isValid: Boolean): ExpirationDateVerification = {
    val __obj = js.Dynamic.literal(isPotentiallyValid = isPotentiallyValid.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpirationDateVerification]
  }
  @scala.inline
  implicit class ExpirationDateVerificationOps[Self <: ExpirationDateVerification] (val x: Self) extends AnyVal {
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
    def setMonth(value: String): Self = this.set("month", value.asInstanceOf[js.Any])
    @scala.inline
    def setMonthNull: Self = this.set("month", null)
    @scala.inline
    def setYear(value: String): Self = this.set("year", value.asInstanceOf[js.Any])
    @scala.inline
    def setYearNull: Self = this.set("year", null)
  }
  
}

