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
  @scala.inline
  implicit class MetricOps[Self <: Metric] (val x: Self) extends AnyVal {
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
    def setExpression(value: Expression): Self = this.set("expression", value.asInstanceOf[js.Any])
    @scala.inline
    def setVariablesVarargs(value: ExpressionVariable*): Self = this.set("variables", js.Array(value :_*))
    @scala.inline
    def setVariables(value: ExpressionVariables): Self = this.set("variables", value.asInstanceOf[js.Any])
    @scala.inline
    def setWindow(value: MetricWindow): Self = this.set("window", value.asInstanceOf[js.Any])
  }
  
}

