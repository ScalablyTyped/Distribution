package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeJobFlowsInput extends js.Object {
  /**
    * Return only job flows created after this date and time.
    */
  var CreatedAfter: js.UndefOr[Date] = js.native
  /**
    * Return only job flows created before this date and time.
    */
  var CreatedBefore: js.UndefOr[Date] = js.native
  /**
    * Return only job flows whose job flow ID is contained in this list.
    */
  var JobFlowIds: js.UndefOr[XmlStringList] = js.native
  /**
    * Return only job flows whose state is contained in this list.
    */
  var JobFlowStates: js.UndefOr[JobFlowExecutionStateList] = js.native
}

object DescribeJobFlowsInput {
  @scala.inline
  def apply(): DescribeJobFlowsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeJobFlowsInput]
  }
  @scala.inline
  implicit class DescribeJobFlowsInputOps[Self <: DescribeJobFlowsInput] (val x: Self) extends AnyVal {
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
    def setCreatedAfter(value: Date): Self = this.set("CreatedAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedAfter: Self = this.set("CreatedAfter", js.undefined)
    @scala.inline
    def setCreatedBefore(value: Date): Self = this.set("CreatedBefore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedBefore: Self = this.set("CreatedBefore", js.undefined)
    @scala.inline
    def setJobFlowIdsVarargs(value: XmlString*): Self = this.set("JobFlowIds", js.Array(value :_*))
    @scala.inline
    def setJobFlowIds(value: XmlStringList): Self = this.set("JobFlowIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobFlowIds: Self = this.set("JobFlowIds", js.undefined)
    @scala.inline
    def setJobFlowStatesVarargs(value: JobFlowExecutionState*): Self = this.set("JobFlowStates", js.Array(value :_*))
    @scala.inline
    def setJobFlowStates(value: JobFlowExecutionStateList): Self = this.set("JobFlowStates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobFlowStates: Self = this.set("JobFlowStates", js.undefined)
  }
  
}

