package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetWorkflowRunsRequest extends js.Object {
  /**
    * Specifies whether to include the workflow graph in response or not.
    */
  var IncludeGraph: js.UndefOr[NullableBoolean] = js.native
  /**
    * The maximum number of workflow runs to be included in the response.
    */
  var MaxResults: js.UndefOr[PageSize] = js.native
  /**
    * Name of the workflow whose metadata of runs should be returned.
    */
  var Name: NameString = js.native
  /**
    * The maximum size of the response.
    */
  var NextToken: js.UndefOr[GenericString] = js.native
}

object GetWorkflowRunsRequest {
  @scala.inline
  def apply(Name: NameString): GetWorkflowRunsRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWorkflowRunsRequest]
  }
  @scala.inline
  implicit class GetWorkflowRunsRequestOps[Self <: GetWorkflowRunsRequest] (val x: Self) extends AnyVal {
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
    def setName(value: NameString): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncludeGraph(value: NullableBoolean): Self = this.set("IncludeGraph", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeGraph: Self = this.set("IncludeGraph", js.undefined)
    @scala.inline
    def setMaxResults(value: PageSize): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: GenericString): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

