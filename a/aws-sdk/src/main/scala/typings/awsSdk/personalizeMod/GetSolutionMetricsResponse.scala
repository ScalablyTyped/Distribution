package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSolutionMetricsResponse extends js.Object {
  /**
    * The metrics for the solution version.
    */
  var metrics: js.UndefOr[Metrics] = js.native
  /**
    * The same solution version ARN as specified in the request.
    */
  var solutionVersionArn: js.UndefOr[Arn] = js.native
}

object GetSolutionMetricsResponse {
  @scala.inline
  def apply(): GetSolutionMetricsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSolutionMetricsResponse]
  }
  @scala.inline
  implicit class GetSolutionMetricsResponseOps[Self <: GetSolutionMetricsResponse] (val x: Self) extends AnyVal {
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
    def setMetrics(value: Metrics): Self = this.set("metrics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetrics: Self = this.set("metrics", js.undefined)
    @scala.inline
    def setSolutionVersionArn(value: Arn): Self = this.set("solutionVersionArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSolutionVersionArn: Self = this.set("solutionVersionArn", js.undefined)
  }
  
}

