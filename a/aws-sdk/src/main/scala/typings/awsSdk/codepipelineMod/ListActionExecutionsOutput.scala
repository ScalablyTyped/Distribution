package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListActionExecutionsOutput extends js.Object {
  /**
    * The details for a list of recent executions, such as action execution ID.
    */
  var actionExecutionDetails: js.UndefOr[ActionExecutionDetailList] = js.native
  /**
    * If the amount of returned information is significantly large, an identifier is also returned and can be used in a subsequent ListActionExecutions call to return the next set of action executions in the list.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListActionExecutionsOutput {
  @scala.inline
  def apply(actionExecutionDetails: ActionExecutionDetailList = null, nextToken: NextToken = null): ListActionExecutionsOutput = {
    val __obj = js.Dynamic.literal()
    if (actionExecutionDetails != null) __obj.updateDynamic("actionExecutionDetails")(actionExecutionDetails.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListActionExecutionsOutput]
  }
}

