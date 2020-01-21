package typings.awsSdkClientLambdaNode.typesTooManyRequestsExceptionMod

import typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.CallerRateLimitExceeded
import typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.ConcurrentInvocationLimitExceeded
import typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.FunctionInvocationRateLimitExceeded
import typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.ReservedFunctionConcurrentInvocationLimitExceeded
import typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.ReservedFunctionInvocationRateLimitExceeded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooManyRequestsExceptionDetails extends js.Object {
  /**
    * _ThrottleReason shape
    */
  var Reason: js.UndefOr[
    ConcurrentInvocationLimitExceeded | FunctionInvocationRateLimitExceeded | ReservedFunctionConcurrentInvocationLimitExceeded | ReservedFunctionInvocationRateLimitExceeded | CallerRateLimitExceeded | String
  ] = js.undefined
  /**
    * _String shape
    */
  var Type: js.UndefOr[String] = js.undefined
  /**
    * _String shape
    */
  var message: js.UndefOr[String] = js.undefined
  /**
    * <p>The number of seconds the caller should wait before retrying.</p>
    */
  var retryAfterSeconds: js.UndefOr[String] = js.undefined
}

object TooManyRequestsExceptionDetails {
  @scala.inline
  def apply(
    Reason: ConcurrentInvocationLimitExceeded | FunctionInvocationRateLimitExceeded | ReservedFunctionConcurrentInvocationLimitExceeded | ReservedFunctionInvocationRateLimitExceeded | CallerRateLimitExceeded | String = null,
    Type: String = null,
    message: String = null,
    retryAfterSeconds: String = null
  ): TooManyRequestsExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (Reason != null) __obj.updateDynamic("Reason")(Reason.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (retryAfterSeconds != null) __obj.updateDynamic("retryAfterSeconds")(retryAfterSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooManyRequestsExceptionDetails]
  }
}

