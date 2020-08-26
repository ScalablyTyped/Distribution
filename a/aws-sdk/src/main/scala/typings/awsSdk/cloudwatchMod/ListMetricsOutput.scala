package typings.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListMetricsOutput extends js.Object {
  /**
    * The metrics that match your request. 
    */
  var Metrics: js.UndefOr[typings.awsSdk.cloudwatchMod.Metrics] = js.native
  /**
    * The token that marks the start of the next batch of returned results. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudwatchMod.NextToken] = js.native
}

object ListMetricsOutput {
  @scala.inline
  def apply(): ListMetricsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMetricsOutput]
  }
  @scala.inline
  implicit class ListMetricsOutputOps[Self <: ListMetricsOutput] (val x: Self) extends AnyVal {
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
    def setMetricsVarargs(value: Metric*): Self = this.set("Metrics", js.Array(value :_*))
    @scala.inline
    def setMetrics(value: Metrics): Self = this.set("Metrics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetrics: Self = this.set("Metrics", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

