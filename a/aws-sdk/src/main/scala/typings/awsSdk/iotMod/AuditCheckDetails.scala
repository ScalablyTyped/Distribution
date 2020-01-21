package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuditCheckDetails extends js.Object {
  /**
    * True if the check is complete and found all resources compliant.
    */
  var checkCompliant: js.UndefOr[CheckCompliant] = js.native
  /**
    * The completion status of this check. One of "IN_PROGRESS", "WAITING_FOR_DATA_COLLECTION", "CANCELED", "COMPLETED_COMPLIANT", "COMPLETED_NON_COMPLIANT", or "FAILED".
    */
  var checkRunStatus: js.UndefOr[AuditCheckRunStatus] = js.native
  /**
    * The code of any error encountered when this check is performed during this audit. One of "INSUFFICIENT_PERMISSIONS" or "AUDIT_CHECK_DISABLED".
    */
  var errorCode: js.UndefOr[ErrorCode] = js.native
  /**
    * The message associated with any error encountered when this check is performed during this audit.
    */
  var message: js.UndefOr[ErrorMessage] = js.native
  /**
    * The number of resources that were found noncompliant during the check.
    */
  var nonCompliantResourcesCount: js.UndefOr[NonCompliantResourcesCount] = js.native
  /**
    * The number of resources on which the check was performed.
    */
  var totalResourcesCount: js.UndefOr[TotalResourcesCount] = js.native
}

object AuditCheckDetails {
  @scala.inline
  def apply(
    checkCompliant: js.UndefOr[scala.Boolean] = js.undefined,
    checkRunStatus: AuditCheckRunStatus = null,
    errorCode: ErrorCode = null,
    message: ErrorMessage = null,
    nonCompliantResourcesCount: Int | Double = null,
    totalResourcesCount: Int | Double = null
  ): AuditCheckDetails = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checkCompliant)) __obj.updateDynamic("checkCompliant")(checkCompliant.asInstanceOf[js.Any])
    if (checkRunStatus != null) __obj.updateDynamic("checkRunStatus")(checkRunStatus.asInstanceOf[js.Any])
    if (errorCode != null) __obj.updateDynamic("errorCode")(errorCode.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (nonCompliantResourcesCount != null) __obj.updateDynamic("nonCompliantResourcesCount")(nonCompliantResourcesCount.asInstanceOf[js.Any])
    if (totalResourcesCount != null) __obj.updateDynamic("totalResourcesCount")(totalResourcesCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuditCheckDetails]
  }
}

