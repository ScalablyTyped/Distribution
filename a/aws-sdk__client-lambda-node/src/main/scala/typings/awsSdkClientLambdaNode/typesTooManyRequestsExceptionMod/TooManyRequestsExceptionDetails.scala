package typings.awsSdkClientLambdaNode.typesTooManyRequestsExceptionMod

import typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.CallerRateLimitExceeded
import typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.ConcurrentInvocationLimitExceeded
import typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.FunctionInvocationRateLimitExceeded
import typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.ReservedFunctionConcurrentInvocationLimitExceeded
import typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.ReservedFunctionInvocationRateLimitExceeded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TooManyRequestsExceptionDetails extends js.Object {
  
  /**
    * _ThrottleReason shape
    */
  var Reason: js.UndefOr[
    ConcurrentInvocationLimitExceeded | FunctionInvocationRateLimitExceeded | ReservedFunctionConcurrentInvocationLimitExceeded | ReservedFunctionInvocationRateLimitExceeded | CallerRateLimitExceeded | String
  ] = js.native
  
  /**
    * _String shape
    */
  var Type: js.UndefOr[String] = js.native
  
  /**
    * _String shape
    */
  var message: js.UndefOr[String] = js.native
  
  /**
    * <p>The number of seconds the caller should wait before retrying.</p>
    */
  var retryAfterSeconds: js.UndefOr[String] = js.native
}
object TooManyRequestsExceptionDetails {
  
  @scala.inline
  def apply(): TooManyRequestsExceptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooManyRequestsExceptionDetails]
  }
  
  @scala.inline
  implicit class TooManyRequestsExceptionDetailsOps[Self <: TooManyRequestsExceptionDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setReason(
      value: ConcurrentInvocationLimitExceeded | FunctionInvocationRateLimitExceeded | ReservedFunctionConcurrentInvocationLimitExceeded | ReservedFunctionInvocationRateLimitExceeded | CallerRateLimitExceeded | String
    ): Self = this.set("Reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReason: Self = this.set("Reason", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setRetryAfterSeconds(value: String): Self = this.set("retryAfterSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetryAfterSeconds: Self = this.set("retryAfterSeconds", js.undefined)
  }
}
