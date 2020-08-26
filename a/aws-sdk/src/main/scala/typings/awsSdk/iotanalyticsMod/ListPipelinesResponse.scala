package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPipelinesResponse extends js.Object {
  /**
    * The token to retrieve the next set of results, or null if there are no more results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * A list of "PipelineSummary" objects.
    */
  var pipelineSummaries: js.UndefOr[PipelineSummaries] = js.native
}

object ListPipelinesResponse {
  @scala.inline
  def apply(): ListPipelinesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPipelinesResponse]
  }
  @scala.inline
  implicit class ListPipelinesResponseOps[Self <: ListPipelinesResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    @scala.inline
    def setPipelineSummariesVarargs(value: PipelineSummary*): Self = this.set("pipelineSummaries", js.Array(value :_*))
    @scala.inline
    def setPipelineSummaries(value: PipelineSummaries): Self = this.set("pipelineSummaries", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePipelineSummaries: Self = this.set("pipelineSummaries", js.undefined)
  }
  
}

