package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PendingCloudwatchLogsExports extends js.Object {
  /**
    * Log types that are in the process of being enabled. After they are enabled, these log types are exported to CloudWatch Logs.
    */
  var LogTypesToDisable: js.UndefOr[LogTypeList] = js.native
  /**
    * Log types that are in the process of being deactivated. After they are deactivated, these log types aren't exported to CloudWatch Logs.
    */
  var LogTypesToEnable: js.UndefOr[LogTypeList] = js.native
}

object PendingCloudwatchLogsExports {
  @scala.inline
  def apply(): PendingCloudwatchLogsExports = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PendingCloudwatchLogsExports]
  }
  @scala.inline
  implicit class PendingCloudwatchLogsExportsOps[Self <: PendingCloudwatchLogsExports] (val x: Self) extends AnyVal {
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
    def setLogTypesToDisableVarargs(value: String*): Self = this.set("LogTypesToDisable", js.Array(value :_*))
    @scala.inline
    def setLogTypesToDisable(value: LogTypeList): Self = this.set("LogTypesToDisable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogTypesToDisable: Self = this.set("LogTypesToDisable", js.undefined)
    @scala.inline
    def setLogTypesToEnableVarargs(value: String*): Self = this.set("LogTypesToEnable", js.Array(value :_*))
    @scala.inline
    def setLogTypesToEnable(value: LogTypeList): Self = this.set("LogTypesToEnable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogTypesToEnable: Self = this.set("LogTypesToEnable", js.undefined)
  }
  
}

