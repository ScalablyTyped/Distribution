package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudwatchLogsExportConfiguration extends js.Object {
  /**
    * The list of log types to disable.
    */
  var DisableLogTypes: js.UndefOr[LogTypeList] = js.native
  /**
    * The list of log types to enable.
    */
  var EnableLogTypes: js.UndefOr[LogTypeList] = js.native
}

object CloudwatchLogsExportConfiguration {
  @scala.inline
  def apply(): CloudwatchLogsExportConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudwatchLogsExportConfiguration]
  }
  @scala.inline
  implicit class CloudwatchLogsExportConfigurationOps[Self <: CloudwatchLogsExportConfiguration] (val x: Self) extends AnyVal {
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
    def setDisableLogTypesVarargs(value: String*): Self = this.set("DisableLogTypes", js.Array(value :_*))
    @scala.inline
    def setDisableLogTypes(value: LogTypeList): Self = this.set("DisableLogTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableLogTypes: Self = this.set("DisableLogTypes", js.undefined)
    @scala.inline
    def setEnableLogTypesVarargs(value: String*): Self = this.set("EnableLogTypes", js.Array(value :_*))
    @scala.inline
    def setEnableLogTypes(value: LogTypeList): Self = this.set("EnableLogTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableLogTypes: Self = this.set("EnableLogTypes", js.undefined)
  }
  
}

