package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidationWarning extends StObject {
  
  /**
    * The error codes and error messages.
    */
  var Errors: js.UndefOr[ErrorSet] = js.undefined
}
object ValidationWarning {
  
  @scala.inline
  def apply(): ValidationWarning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidationWarning]
  }
  
  @scala.inline
  implicit class ValidationWarningMutableBuilder[Self <: ValidationWarning] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrors(value: ErrorSet): Self = StObject.set(x, "Errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "Errors", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: ValidationError*): Self = StObject.set(x, "Errors", js.Array(value :_*))
  }
}
