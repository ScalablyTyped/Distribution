package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeMetricFiltersResponse extends js.Object {
  /**
    * The metric filters.
    */
  var metricFilters: js.UndefOr[MetricFilters] = js.native
  var nextToken: js.UndefOr[NextToken] = js.native
}

object DescribeMetricFiltersResponse {
  @scala.inline
  def apply(): DescribeMetricFiltersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeMetricFiltersResponse]
  }
  @scala.inline
  implicit class DescribeMetricFiltersResponseOps[Self <: DescribeMetricFiltersResponse] (val x: Self) extends AnyVal {
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
    def setMetricFiltersVarargs(value: MetricFilter*): Self = this.set("metricFilters", js.Array(value :_*))
    @scala.inline
    def setMetricFilters(value: MetricFilters): Self = this.set("metricFilters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetricFilters: Self = this.set("metricFilters", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

