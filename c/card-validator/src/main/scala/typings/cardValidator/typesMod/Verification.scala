package typings.cardValidator.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Verification extends js.Object {
  var isPotentiallyValid: Boolean = js.native
  var isValid: Boolean = js.native
}

object Verification {
  @scala.inline
  def apply(isPotentiallyValid: Boolean, isValid: Boolean): Verification = {
    val __obj = js.Dynamic.literal(isPotentiallyValid = isPotentiallyValid.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Verification]
  }
  @scala.inline
  implicit class VerificationOps[Self <: Verification] (val x: Self) extends AnyVal {
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
    def setIsPotentiallyValid(value: Boolean): Self = this.set("isPotentiallyValid", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsValid(value: Boolean): Self = this.set("isValid", value.asInstanceOf[js.Any])
  }
  
}

