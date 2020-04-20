package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutomationExecutionFilter extends js.Object {
  /**
    * One or more keys to limit the results. Valid filter keys include the following: DocumentNamePrefix, ExecutionStatus, ExecutionId, ParentExecutionId, CurrentAction, StartTimeBefore, StartTimeAfter.
    */
  var Key: AutomationExecutionFilterKey = js.native
  /**
    * The values used to limit the execution information associated with the filter's key.
    */
  var Values: AutomationExecutionFilterValueList = js.native
}

object AutomationExecutionFilter {
  @scala.inline
  def apply(Key: AutomationExecutionFilterKey, Values: AutomationExecutionFilterValueList): AutomationExecutionFilter = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutomationExecutionFilter]
  }
}

