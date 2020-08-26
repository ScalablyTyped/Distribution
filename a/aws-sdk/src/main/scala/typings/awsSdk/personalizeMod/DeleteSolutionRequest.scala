package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteSolutionRequest extends js.Object {
  /**
    * The ARN of the solution to delete.
    */
  var solutionArn: Arn = js.native
}

object DeleteSolutionRequest {
  @scala.inline
  def apply(solutionArn: Arn): DeleteSolutionRequest = {
    val __obj = js.Dynamic.literal(solutionArn = solutionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSolutionRequest]
  }
  @scala.inline
  implicit class DeleteSolutionRequestOps[Self <: DeleteSolutionRequest] (val x: Self) extends AnyVal {
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
    def setSolutionArn(value: Arn): Self = this.set("solutionArn", value.asInstanceOf[js.Any])
  }
  
}

