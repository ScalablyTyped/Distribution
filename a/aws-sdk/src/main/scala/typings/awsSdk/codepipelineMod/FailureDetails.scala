package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FailureDetails extends js.Object {
  /**
    * The external ID of the run of the action that failed.
    */
  var externalExecutionId: js.UndefOr[ExecutionId] = js.native
  /**
    * The message about the failure.
    */
  var message: Message = js.native
  /**
    * The type of the failure.
    */
  var `type`: FailureType = js.native
}

object FailureDetails {
  @scala.inline
  def apply(message: Message, `type`: FailureType): FailureDetails = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailureDetails]
  }
  @scala.inline
  implicit class FailureDetailsOps[Self <: FailureDetails] (val x: Self) extends AnyVal {
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
    def setMessage(value: Message): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: FailureType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setExternalExecutionId(value: ExecutionId): Self = this.set("externalExecutionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternalExecutionId: Self = this.set("externalExecutionId", js.undefined)
  }
  
}

