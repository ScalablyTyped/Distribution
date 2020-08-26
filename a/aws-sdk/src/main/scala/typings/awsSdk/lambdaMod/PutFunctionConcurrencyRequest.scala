package typings.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutFunctionConcurrencyRequest extends js.Object {
  /**
    * The name of the Lambda function.  Name formats     Function name - my-function.    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:my-function.    Partial ARN - 123456789012:function:my-function.   The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
    */
  var FunctionName: typings.awsSdk.lambdaMod.FunctionName = js.native
  /**
    * The number of simultaneous executions to reserve for the function.
    */
  var ReservedConcurrentExecutions: typings.awsSdk.lambdaMod.ReservedConcurrentExecutions = js.native
}

object PutFunctionConcurrencyRequest {
  @scala.inline
  def apply(FunctionName: FunctionName, ReservedConcurrentExecutions: ReservedConcurrentExecutions): PutFunctionConcurrencyRequest = {
    val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any], ReservedConcurrentExecutions = ReservedConcurrentExecutions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutFunctionConcurrencyRequest]
  }
  @scala.inline
  implicit class PutFunctionConcurrencyRequestOps[Self <: PutFunctionConcurrencyRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFunctionName(value: FunctionName): Self = this.set("FunctionName", value.asInstanceOf[js.Any])
    @scala.inline
    def setReservedConcurrentExecutions(value: ReservedConcurrentExecutions): Self = this.set("ReservedConcurrentExecutions", value.asInstanceOf[js.Any])
  }
  
}

