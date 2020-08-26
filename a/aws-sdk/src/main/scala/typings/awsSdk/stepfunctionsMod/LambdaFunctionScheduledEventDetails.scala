package typings.awsSdk.stepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LambdaFunctionScheduledEventDetails extends js.Object {
  /**
    * The JSON data input to the lambda function.
    */
  var input: js.UndefOr[SensitiveData] = js.native
  /**
    * The Amazon Resource Name (ARN) of the scheduled lambda function.
    */
  var resource: Arn = js.native
  /**
    * The maximum allowed duration of the lambda function.
    */
  var timeoutInSeconds: js.UndefOr[TimeoutInSeconds] = js.native
}

object LambdaFunctionScheduledEventDetails {
  @scala.inline
  def apply(resource: Arn): LambdaFunctionScheduledEventDetails = {
    val __obj = js.Dynamic.literal(resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[LambdaFunctionScheduledEventDetails]
  }
  @scala.inline
  implicit class LambdaFunctionScheduledEventDetailsOps[Self <: LambdaFunctionScheduledEventDetails] (val x: Self) extends AnyVal {
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
    def setResource(value: Arn): Self = this.set("resource", value.asInstanceOf[js.Any])
    @scala.inline
    def setInput(value: SensitiveData): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    @scala.inline
    def setTimeoutInSeconds(value: TimeoutInSeconds): Self = this.set("timeoutInSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeoutInSeconds: Self = this.set("timeoutInSeconds", js.undefined)
  }
  
}

