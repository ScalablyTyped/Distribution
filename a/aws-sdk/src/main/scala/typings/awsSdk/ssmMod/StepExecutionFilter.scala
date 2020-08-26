package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StepExecutionFilter extends js.Object {
  /**
    * One or more keys to limit the results. Valid filter keys include the following: StepName, Action, StepExecutionId, StepExecutionStatus, StartTimeBefore, StartTimeAfter.
    */
  var Key: StepExecutionFilterKey = js.native
  /**
    * The values of the filter key.
    */
  var Values: StepExecutionFilterValueList = js.native
}

object StepExecutionFilter {
  @scala.inline
  def apply(Key: StepExecutionFilterKey, Values: StepExecutionFilterValueList): StepExecutionFilter = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepExecutionFilter]
  }
  @scala.inline
  implicit class StepExecutionFilterOps[Self <: StepExecutionFilter] (val x: Self) extends AnyVal {
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
    def setKey(value: StepExecutionFilterKey): Self = this.set("Key", value.asInstanceOf[js.Any])
    @scala.inline
    def setValuesVarargs(value: StepExecutionFilterValue*): Self = this.set("Values", js.Array(value :_*))
    @scala.inline
    def setValues(value: StepExecutionFilterValueList): Self = this.set("Values", value.asInstanceOf[js.Any])
  }
  
}

