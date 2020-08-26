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
  @scala.inline
  implicit class AutomationExecutionFilterOps[Self <: AutomationExecutionFilter] (val x: Self) extends AnyVal {
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
    def setKey(value: AutomationExecutionFilterKey): Self = this.set("Key", value.asInstanceOf[js.Any])
    @scala.inline
    def setValuesVarargs(value: AutomationExecutionFilterValue*): Self = this.set("Values", js.Array(value :_*))
    @scala.inline
    def setValues(value: AutomationExecutionFilterValueList): Self = this.set("Values", value.asInstanceOf[js.Any])
  }
  
}

