package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Metric extends js.Object {
  /**
    * The mathematical expression that defines the metric aggregation function. You can specify up to 10 variables per expression. You can specify up to 10 functions per expression.  For more information, see Quotas in the AWS IoT SiteWise User Guide.
    */
  var expression: Expression = js.native
  /**
    * The list of variables used in the expression.
    */
  var variables: ExpressionVariables = js.native
  /**
    * The window (time interval) over which AWS IoT SiteWise computes the metric's aggregation expression. AWS IoT SiteWise computes one data point per window.
    */
  var window: MetricWindow = js.native
}

object Metric {
  @scala.inline
  def apply(expression: Expression, variables: ExpressionVariables, window: MetricWindow): Metric = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metric]
  }
}

