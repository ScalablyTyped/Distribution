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
  def apply(metrics: Metrics = null, solutionVersionArn: Arn = null): GetSolutionMetricsResponse = {
    val __obj = js.Dynamic.literal()
    if (metrics != null) __obj.updateDynamic("metrics")(metrics.asInstanceOf[js.Any])
    if (solutionVersionArn != null) __obj.updateDynamic("solutionVersionArn")(solutionVersionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSolutionMetricsResponse]
  }
}

