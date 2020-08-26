package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComplianceExecutionSummary extends js.Object {
  /**
    * An ID created by the system when PutComplianceItems was called. For example, CommandID is a valid execution ID. You can use this ID in subsequent calls.
    */
  var ExecutionId: js.UndefOr[ComplianceExecutionId] = js.native
  /**
    * The time the execution ran as a datetime object that is saved in the following format: yyyy-MM-dd'T'HH:mm:ss'Z'.
    */
  var ExecutionTime: DateTime = js.native
  /**
    * The type of execution. For example, Command is a valid execution type.
    */
  var ExecutionType: js.UndefOr[ComplianceExecutionType] = js.native
}

object ComplianceExecutionSummary {
  @scala.inline
  def apply(ExecutionTime: DateTime): ComplianceExecutionSummary = {
    val __obj = js.Dynamic.literal(ExecutionTime = ExecutionTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComplianceExecutionSummary]
  }
  @scala.inline
  implicit class ComplianceExecutionSummaryOps[Self <: ComplianceExecutionSummary] (val x: Self) extends AnyVal {
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
    def setExecutionTime(value: DateTime): Self = this.set("ExecutionTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setExecutionId(value: ComplianceExecutionId): Self = this.set("ExecutionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecutionId: Self = this.set("ExecutionId", js.undefined)
    @scala.inline
    def setExecutionType(value: ComplianceExecutionType): Self = this.set("ExecutionType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecutionType: Self = this.set("ExecutionType", js.undefined)
  }
  
}

