package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobFlowExecutionStatusDetail extends js.Object {
  /**
    * The creation date and time of the job flow.
    */
  var CreationDateTime: Date = js.native
  /**
    * The completion date and time of the job flow.
    */
  var EndDateTime: js.UndefOr[Date] = js.native
  /**
    * Description of the job flow last changed state.
    */
  var LastStateChangeReason: js.UndefOr[XmlString] = js.native
  /**
    * The date and time when the job flow was ready to start running bootstrap actions.
    */
  var ReadyDateTime: js.UndefOr[Date] = js.native
  /**
    * The start date and time of the job flow.
    */
  var StartDateTime: js.UndefOr[Date] = js.native
  /**
    * The state of the job flow.
    */
  var State: JobFlowExecutionState = js.native
}

object JobFlowExecutionStatusDetail {
  @scala.inline
  def apply(CreationDateTime: Date, State: JobFlowExecutionState): JobFlowExecutionStatusDetail = {
    val __obj = js.Dynamic.literal(CreationDateTime = CreationDateTime.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobFlowExecutionStatusDetail]
  }
  @scala.inline
  implicit class JobFlowExecutionStatusDetailOps[Self <: JobFlowExecutionStatusDetail] (val x: Self) extends AnyVal {
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
    def setCreationDateTime(value: Date): Self = this.set("CreationDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: JobFlowExecutionState): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndDateTime(value: Date): Self = this.set("EndDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndDateTime: Self = this.set("EndDateTime", js.undefined)
    @scala.inline
    def setLastStateChangeReason(value: XmlString): Self = this.set("LastStateChangeReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastStateChangeReason: Self = this.set("LastStateChangeReason", js.undefined)
    @scala.inline
    def setReadyDateTime(value: Date): Self = this.set("ReadyDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadyDateTime: Self = this.set("ReadyDateTime", js.undefined)
    @scala.inline
    def setStartDateTime(value: Date): Self = this.set("StartDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartDateTime: Self = this.set("StartDateTime", js.undefined)
  }
  
}

