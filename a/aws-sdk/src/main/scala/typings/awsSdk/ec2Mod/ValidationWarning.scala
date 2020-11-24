package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidationWarning extends js.Object {
  
  /**
    * The error codes and error messages.
    */
  var Errors: js.UndefOr[ErrorSet] = js.native
}
object ValidationWarning {
  
  @scala.inline
  def apply(): ValidationWarning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidationWarning]
  }
  
  @scala.inline
  implicit class ValidationWarningOps[Self <: ValidationWarning] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setErrorsVarargs(value: ValidationError*): Self = this.set("Errors", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: ErrorSet): Self = this.set("Errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrors: Self = this.set("Errors", js.undefined)
  }
}
