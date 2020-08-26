package typings.awsSdk.stepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopExecutionInput extends js.Object {
  /**
    * A more detailed explanation of the cause of the failure.
    */
  var cause: js.UndefOr[SensitiveCause] = js.native
  /**
    * The error code of the failure.
    */
  var error: js.UndefOr[SensitiveError] = js.native
  /**
    * The Amazon Resource Name (ARN) of the execution to stop.
    */
  var executionArn: Arn = js.native
}

object StopExecutionInput {
  @scala.inline
  def apply(executionArn: Arn): StopExecutionInput = {
    val __obj = js.Dynamic.literal(executionArn = executionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopExecutionInput]
  }
  @scala.inline
  implicit class StopExecutionInputOps[Self <: StopExecutionInput] (val x: Self) extends AnyVal {
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
    def setExecutionArn(value: Arn): Self = this.set("executionArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setCause(value: SensitiveCause): Self = this.set("cause", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCause: Self = this.set("cause", js.undefined)
    @scala.inline
    def setError(value: SensitiveError): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
  }
  
}

