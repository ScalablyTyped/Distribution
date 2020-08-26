package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPipelineExecutionsOutput extends js.Object {
  /**
    * A token that can be used in the next ListPipelineExecutions call. To view all items in the list, continue to call this operation with each subsequent token until no more nextToken values are returned.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * A list of executions in the history of a pipeline.
    */
  var pipelineExecutionSummaries: js.UndefOr[PipelineExecutionSummaryList] = js.native
}

object ListPipelineExecutionsOutput {
  @scala.inline
  def apply(): ListPipelineExecutionsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPipelineExecutionsOutput]
  }
  @scala.inline
  implicit class ListPipelineExecutionsOutputOps[Self <: ListPipelineExecutionsOutput] (val x: Self) extends AnyVal {
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
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    @scala.inline
    def setPipelineExecutionSummariesVarargs(value: PipelineExecutionSummary*): Self = this.set("pipelineExecutionSummaries", js.Array(value :_*))
    @scala.inline
    def setPipelineExecutionSummaries(value: PipelineExecutionSummaryList): Self = this.set("pipelineExecutionSummaries", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePipelineExecutionSummaries: Self = this.set("pipelineExecutionSummaries", js.undefined)
  }
  
}

