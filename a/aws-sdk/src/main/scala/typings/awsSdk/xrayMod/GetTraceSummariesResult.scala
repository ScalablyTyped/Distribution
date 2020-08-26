package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTraceSummariesResult extends js.Object {
  /**
    * The start time of this page of results.
    */
  var ApproximateTime: js.UndefOr[Timestamp] = js.native
  /**
    * If the requested time frame contained more than one page of results, you can use this token to retrieve the next page. The first page contains the most most recent results, closest to the end of the time frame.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Trace IDs and annotations for traces that were found in the specified time frame.
    */
  var TraceSummaries: js.UndefOr[TraceSummaryList] = js.native
  /**
    * The total number of traces processed, including traces that did not match the specified filter expression.
    */
  var TracesProcessedCount: js.UndefOr[NullableLong] = js.native
}

object GetTraceSummariesResult {
  @scala.inline
  def apply(): GetTraceSummariesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTraceSummariesResult]
  }
  @scala.inline
  implicit class GetTraceSummariesResultOps[Self <: GetTraceSummariesResult] (val x: Self) extends AnyVal {
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
    def setApproximateTime(value: Timestamp): Self = this.set("ApproximateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApproximateTime: Self = this.set("ApproximateTime", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setTraceSummariesVarargs(value: TraceSummary*): Self = this.set("TraceSummaries", js.Array(value :_*))
    @scala.inline
    def setTraceSummaries(value: TraceSummaryList): Self = this.set("TraceSummaries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTraceSummaries: Self = this.set("TraceSummaries", js.undefined)
    @scala.inline
    def setTracesProcessedCount(value: NullableLong): Self = this.set("TracesProcessedCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTracesProcessedCount: Self = this.set("TracesProcessedCount", js.undefined)
  }
  
}

