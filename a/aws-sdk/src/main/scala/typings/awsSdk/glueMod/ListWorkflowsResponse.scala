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
  def apply(NextToken: GenericString = null, Workflows: WorkflowNames = null): ListWorkflowsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Workflows != null) __obj.updateDynamic("Workflows")(Workflows.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListWorkflowsResponse]
  }
}

