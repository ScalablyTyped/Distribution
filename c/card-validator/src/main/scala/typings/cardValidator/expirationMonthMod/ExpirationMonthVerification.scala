package typings.cardValidator.expirationMonthMod

import typings.cardValidator.typesMod.Verification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExpirationMonthVerification extends Verification {
  
  var isValidForThisYear: Boolean = js.native
}
object ExpirationMonthVerification {
  
  @scala.inline
  def apply(isPotentiallyValid: Boolean, isValid: Boolean, isValidForThisYear: Boolean): ExpirationMonthVerification = {
    val __obj = js.Dynamic.literal(isPotentiallyValid = isPotentiallyValid.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], isValidForThisYear = isValidForThisYear.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpirationMonthVerification]
  }
  
  @scala.inline
  implicit class ExpirationMonthVerificationOps[Self <: ExpirationMonthVerification] (val x: Self) extends AnyVal {
    
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
    def setIsValidForThisYear(value: Boolean): Self = this.set("isValidForThisYear", value.asInstanceOf[js.Any])
  }
}
