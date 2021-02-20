package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsLambdaFunctionEnvironmentError extends StObject {
  
  /**
    * The error code.
    */
  var ErrorCode: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The error message.
    */
  var Message: js.UndefOr[NonEmptyString] = js.native
}
object AwsLambdaFunctionEnvironmentError {
  
  @scala.inline
  def apply(): AwsLambdaFunctionEnvironmentError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsLambdaFunctionEnvironmentError]
  }
  
  @scala.inline
  implicit class AwsLambdaFunctionEnvironmentErrorMutableBuilder[Self <: AwsLambdaFunctionEnvironmentError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorCode(value: NonEmptyString): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    @scala.inline
    def setMessage(value: NonEmptyString): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
