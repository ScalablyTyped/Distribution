package typings.awsSdk.marketplacecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorDetail extends StObject {
  
  /**
    * The error code that identifies the type of error.
    */
  var ErrorCode: js.UndefOr[StringValue] = js.undefined
  
  /**
    * The message for the error.
    */
  var ErrorMessage: js.UndefOr[StringValue] = js.undefined
}
object ErrorDetail {
  
  @scala.inline
  def apply(): ErrorDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorDetail]
  }
  
  @scala.inline
  implicit class ErrorDetailMutableBuilder[Self <: ErrorDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorCode(value: StringValue): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: StringValue): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
  }
}
