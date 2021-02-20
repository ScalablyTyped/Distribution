package typings.awsSdk.lakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorDetail extends StObject {
  
  /**
    * The code associated with this error.
    */
  var ErrorCode: js.UndefOr[NameString] = js.native
  
  /**
    * A message describing the error.
    */
  var ErrorMessage: js.UndefOr[DescriptionString] = js.native
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
    def setErrorCode(value: NameString): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: DescriptionString): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
  }
}
