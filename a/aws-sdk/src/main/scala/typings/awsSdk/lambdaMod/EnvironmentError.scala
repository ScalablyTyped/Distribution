package typings.awsSdk.lambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvironmentError extends StObject {
  
  /**
    * The error code.
    */
  var ErrorCode: js.UndefOr[String] = js.native
  
  /**
    * The error message.
    */
  var Message: js.UndefOr[SensitiveString] = js.native
}
object EnvironmentError {
  
  @scala.inline
  def apply(): EnvironmentError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvironmentError]
  }
  
  @scala.inline
  implicit class EnvironmentErrorMutableBuilder[Self <: EnvironmentError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorCode(value: String): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    @scala.inline
    def setMessage(value: SensitiveString): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
