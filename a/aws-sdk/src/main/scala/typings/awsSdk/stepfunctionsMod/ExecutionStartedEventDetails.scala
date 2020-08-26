package typings.awsSdk.stepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecutionStartedEventDetails extends js.Object {
  /**
    * The JSON data input to the execution.
    */
  var input: js.UndefOr[SensitiveData] = js.native
  /**
    * The Amazon Resource Name (ARN) of the IAM role used for executing AWS Lambda tasks.
    */
  var roleArn: js.UndefOr[Arn] = js.native
}

object ExecutionStartedEventDetails {
  @scala.inline
  def apply(): ExecutionStartedEventDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecutionStartedEventDetails]
  }
  @scala.inline
  implicit class ExecutionStartedEventDetailsOps[Self <: ExecutionStartedEventDetails] (val x: Self) extends AnyVal {
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
    def setInput(value: SensitiveData): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    @scala.inline
    def setRoleArn(value: Arn): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleArn: Self = this.set("roleArn", js.undefined)
  }
  
}

