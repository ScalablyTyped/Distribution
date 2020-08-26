package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LambdaInvokeOperation extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the AWS Lambda function that the specified job will invoke for each object in the manifest.
    */
  var FunctionArn: js.UndefOr[FunctionArnString] = js.native
}

object LambdaInvokeOperation {
  @scala.inline
  def apply(): LambdaInvokeOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LambdaInvokeOperation]
  }
  @scala.inline
  implicit class LambdaInvokeOperationOps[Self <: LambdaInvokeOperation] (val x: Self) extends AnyVal {
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
    def setFunctionArn(value: FunctionArnString): Self = this.set("FunctionArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFunctionArn: Self = this.set("FunctionArn", js.undefined)
  }
  
}

