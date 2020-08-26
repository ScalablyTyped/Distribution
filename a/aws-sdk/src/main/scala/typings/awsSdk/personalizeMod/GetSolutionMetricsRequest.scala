package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSolutionMetricsRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the solution version for which to get metrics.
    */
  var solutionVersionArn: Arn = js.native
}

object GetSolutionMetricsRequest {
  @scala.inline
  def apply(solutionVersionArn: Arn): GetSolutionMetricsRequest = {
    val __obj = js.Dynamic.literal(solutionVersionArn = solutionVersionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSolutionMetricsRequest]
  }
  @scala.inline
  implicit class GetSolutionMetricsRequestOps[Self <: GetSolutionMetricsRequest] (val x: Self) extends AnyVal {
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
    def setSolutionVersionArn(value: Arn): Self = this.set("solutionVersionArn", value.asInstanceOf[js.Any])
  }
  
}

