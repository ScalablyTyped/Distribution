package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSolutionRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the solution to describe.
    */
  var solutionArn: Arn = js.native
}

object DescribeSolutionRequest {
  @scala.inline
  def apply(solutionArn: Arn): DescribeSolutionRequest = {
    val __obj = js.Dynamic.literal(solutionArn = solutionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSolutionRequest]
  }
  @scala.inline
  implicit class DescribeSolutionRequestOps[Self <: DescribeSolutionRequest] (val x: Self) extends AnyVal {
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

