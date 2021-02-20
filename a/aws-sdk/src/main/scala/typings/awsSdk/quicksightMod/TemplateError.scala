package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemplateError extends StObject {
  
  /**
    * Description of the error type.
    */
  var Message: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Type of error.
    */
  var Type: js.UndefOr[TemplateErrorType] = js.native
}
object TemplateError {
  
  @scala.inline
  def apply(): TemplateError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateError]
  }
  
  @scala.inline
  implicit class TemplateErrorMutableBuilder[Self <: TemplateError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: NonEmptyString): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    @scala.inline
    def setType(value: TemplateErrorType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
