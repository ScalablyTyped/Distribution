package typings.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkflowExecutionInfos extends js.Object {
  /**
    * The list of workflow information structures.
    */
  var executionInfos: WorkflowExecutionInfoList = js.native
  /**
    * If a NextPageToken was returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in nextPageToken. Keep all other arguments unchanged. The configured maximumPageSize determines how many results can be returned in a single call.
    */
  var nextPageToken: js.UndefOr[PageToken] = js.native
}

object WorkflowExecutionInfos {
  @scala.inline
  def apply(executionInfos: WorkflowExecutionInfoList): WorkflowExecutionInfos = {
    val __obj = js.Dynamic.literal(executionInfos = executionInfos.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowExecutionInfos]
  }
  @scala.inline
  implicit class WorkflowExecutionInfosOps[Self <: WorkflowExecutionInfos] (val x: Self) extends AnyVal {
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
    def setExecutionInfosVarargs(value: WorkflowExecutionInfo*): Self = this.set("executionInfos", js.Array(value :_*))
    @scala.inline
    def setExecutionInfos(value: WorkflowExecutionInfoList): Self = this.set("executionInfos", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextPageToken(value: PageToken): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

