package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartOnDemandAuditTaskRequest extends js.Object {
  /**
    * Which checks are performed during the audit. The checks you specify must be enabled for your account or an exception occurs. Use DescribeAccountAuditConfiguration to see the list of all checks, including those that are enabled or UpdateAccountAuditConfiguration to select which checks are enabled.
    */
  var targetCheckNames: TargetAuditCheckNames = js.native
}

object StartOnDemandAuditTaskRequest {
  @scala.inline
  def apply(targetCheckNames: TargetAuditCheckNames): StartOnDemandAuditTaskRequest = {
    val __obj = js.Dynamic.literal(targetCheckNames = targetCheckNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartOnDemandAuditTaskRequest]
  }
  @scala.inline
  implicit class StartOnDemandAuditTaskRequestOps[Self <: StartOnDemandAuditTaskRequest] (val x: Self) extends AnyVal {
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
    def setTargetCheckNamesVarargs(value: AuditCheckName*): Self = this.set("targetCheckNames", js.Array(value :_*))
    @scala.inline
    def setTargetCheckNames(value: TargetAuditCheckNames): Self = this.set("targetCheckNames", value.asInstanceOf[js.Any])
  }
  
}

