package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdministrativeActionFailureDetails extends StObject {
  
  /**
    * Error message providing details about the failed administrative action.
    */
  var Message: js.UndefOr[ErrorMessage] = js.undefined
}
object AdministrativeActionFailureDetails {
  
  @scala.inline
  def apply(): AdministrativeActionFailureDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdministrativeActionFailureDetails]
  }
  
  @scala.inline
  implicit class AdministrativeActionFailureDetailsMutableBuilder[Self <: AdministrativeActionFailureDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: ErrorMessage): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
