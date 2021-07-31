package typings.awsSdk.secretsmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidationErrorsEntry extends StObject {
  
  /**
    * Checks the name of the policy.
    */
  var CheckName: js.UndefOr[NameType] = js.undefined
  
  /**
    * Displays error messages if validation encounters problems during validation of the resource policy.
    */
  var ErrorMessage: js.UndefOr[typings.awsSdk.secretsmanagerMod.ErrorMessage] = js.undefined
}
object ValidationErrorsEntry {
  
  @scala.inline
  def apply(): ValidationErrorsEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidationErrorsEntry]
  }
  
  @scala.inline
  implicit class ValidationErrorsEntryMutableBuilder[Self <: ValidationErrorsEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheckName(value: NameType): Self = StObject.set(x, "CheckName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckNameUndefined: Self = StObject.set(x, "CheckName", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: ErrorMessage): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
  }
}
