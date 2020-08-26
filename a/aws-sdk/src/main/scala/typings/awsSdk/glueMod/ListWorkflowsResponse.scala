package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListWorkflowsResponse extends js.Object {
  /**
    * A continuation token, if not all workflow names have been returned.
    */
  var NextToken: js.UndefOr[GenericString] = js.native
  /**
    * List of names of workflows in the account.
    */
  var Workflows: js.UndefOr[WorkflowNames] = js.native
}

object ListWorkflowsResponse {
  @scala.inline
  def apply(): ListWorkflowsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListWorkflowsResponse]
  }
  @scala.inline
  implicit class ListWorkflowsResponseOps[Self <: ListWorkflowsResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: GenericString): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setWorkflowsVarargs(value: NameString*): Self = this.set("Workflows", js.Array(value :_*))
    @scala.inline
    def setWorkflows(value: WorkflowNames): Self = this.set("Workflows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkflows: Self = this.set("Workflows", js.undefined)
  }
  
}

