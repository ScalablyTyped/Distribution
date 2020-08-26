package typings.awsSdk.mqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogsSummary extends js.Object {
  /**
    * Enables audit logging. Every user management action made using JMX or the ActiveMQ Web Console is logged.
    */
  var Audit: js.UndefOr[boolean] = js.native
  /**
    * The location of the CloudWatch Logs log group where audit logs are sent.
    */
  var AuditLogGroup: js.UndefOr[string] = js.native
  /**
    * Enables general logging.
    */
  var General: js.UndefOr[boolean] = js.native
  /**
    * The location of the CloudWatch Logs log group where general logs are sent.
    */
  var GeneralLogGroup: js.UndefOr[string] = js.native
  /**
    * The list of information about logs pending to be deployed for the specified broker.
    */
  var Pending: js.UndefOr[PendingLogs] = js.native
}

object LogsSummary {
  @scala.inline
  def apply(): LogsSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogsSummary]
  }
  @scala.inline
  implicit class LogsSummaryOps[Self <: LogsSummary] (val x: Self) extends AnyVal {
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
    def setAudit(value: boolean): Self = this.set("Audit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudit: Self = this.set("Audit", js.undefined)
    @scala.inline
    def setAuditLogGroup(value: string): Self = this.set("AuditLogGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuditLogGroup: Self = this.set("AuditLogGroup", js.undefined)
    @scala.inline
    def setGeneral(value: boolean): Self = this.set("General", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeneral: Self = this.set("General", js.undefined)
    @scala.inline
    def setGeneralLogGroup(value: string): Self = this.set("GeneralLogGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeneralLogGroup: Self = this.set("GeneralLogGroup", js.undefined)
    @scala.inline
    def setPending(value: PendingLogs): Self = this.set("Pending", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePending: Self = this.set("Pending", js.undefined)
  }
  
}

