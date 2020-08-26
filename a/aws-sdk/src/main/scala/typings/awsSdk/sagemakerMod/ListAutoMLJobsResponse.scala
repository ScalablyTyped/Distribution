package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAutoMLJobsResponse extends js.Object {
  /**
    * Returns a summary list of jobs.
    */
  var AutoMLJobSummaries: typings.awsSdk.sagemakerMod.AutoMLJobSummaries = js.native
  /**
    * If the previous response was truncated, you will receive this token. Use it in your next request to receive the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.native
}

object ListAutoMLJobsResponse {
  @scala.inline
  def apply(AutoMLJobSummaries: AutoMLJobSummaries): ListAutoMLJobsResponse = {
    val __obj = js.Dynamic.literal(AutoMLJobSummaries = AutoMLJobSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAutoMLJobsResponse]
  }
  @scala.inline
  implicit class ListAutoMLJobsResponseOps[Self <: ListAutoMLJobsResponse] (val x: Self) extends AnyVal {
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
    def setAutoMLJobSummariesVarargs(value: AutoMLJobSummary*): Self = this.set("AutoMLJobSummaries", js.Array(value :_*))
    @scala.inline
    def setAutoMLJobSummaries(value: AutoMLJobSummaries): Self = this.set("AutoMLJobSummaries", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

