package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorDetail extends StObject {
  
  /**
    * A detailed error code.
    */
  var DetailedErrorCode: js.UndefOr[string] = js.native
  
  /**
    * A detailed error message.
    */
  var DetailedErrorMessage: js.UndefOr[string] = js.native
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
    def setDetailedErrorCode(value: string): Self = StObject.set(x, "DetailedErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailedErrorCodeUndefined: Self = StObject.set(x, "DetailedErrorCode", js.undefined)
    
    @scala.inline
    def setDetailedErrorMessage(value: string): Self = StObject.set(x, "DetailedErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailedErrorMessageUndefined: Self = StObject.set(x, "DetailedErrorMessage", js.undefined)
  }
}
