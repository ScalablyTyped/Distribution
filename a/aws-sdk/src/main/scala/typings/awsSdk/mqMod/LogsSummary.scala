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
  def apply(
    Audit: js.UndefOr[Boolean] = js.undefined,
    AuditLogGroup: string = null,
    General: js.UndefOr[Boolean] = js.undefined,
    GeneralLogGroup: string = null,
    Pending: PendingLogs = null
  ): LogsSummary = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Audit)) __obj.updateDynamic("Audit")(Audit.asInstanceOf[js.Any])
    if (AuditLogGroup != null) __obj.updateDynamic("AuditLogGroup")(AuditLogGroup.asInstanceOf[js.Any])
    if (!js.isUndefined(General)) __obj.updateDynamic("General")(General.asInstanceOf[js.Any])
    if (GeneralLogGroup != null) __obj.updateDynamic("GeneralLogGroup")(GeneralLogGroup.asInstanceOf[js.Any])
    if (Pending != null) __obj.updateDynamic("Pending")(Pending.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogsSummary]
  }
}

