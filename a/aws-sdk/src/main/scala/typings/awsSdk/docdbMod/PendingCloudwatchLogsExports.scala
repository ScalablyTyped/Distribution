package typings.awsSdk.docdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PendingCloudwatchLogsExports extends js.Object {
  /**
    * Log types that are in the process of being enabled. After they are enabled, these log types are exported to Amazon CloudWatch Logs.
    */
  var LogTypesToDisable: js.UndefOr[LogTypeList] = js.native
  /**
    * Log types that are in the process of being deactivated. After they are deactivated, these log types aren't exported to CloudWatch Logs.
    */
  var LogTypesToEnable: js.UndefOr[LogTypeList] = js.native
}

object PendingCloudwatchLogsExports {
  @scala.inline
  def apply(LogTypesToDisable: LogTypeList = null, LogTypesToEnable: LogTypeList = null): PendingCloudwatchLogsExports = {
    val __obj = js.Dynamic.literal()
    if (LogTypesToDisable != null) __obj.updateDynamic("LogTypesToDisable")(LogTypesToDisable.asInstanceOf[js.Any])
    if (LogTypesToEnable != null) __obj.updateDynamic("LogTypesToEnable")(LogTypesToEnable.asInstanceOf[js.Any])
    __obj.asInstanceOf[PendingCloudwatchLogsExports]
  }
}

