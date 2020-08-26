package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MonitoringConfigurationUpdate extends js.Object {
  /**
    * Describes updates to whether to use the default CloudWatch logging configuration for an application. You must set this property to CUSTOM in order to set the LogLevel or MetricsLevel parameters.
    */
  var ConfigurationTypeUpdate: js.UndefOr[ConfigurationType] = js.native
  /**
    * Describes updates to the verbosity of the CloudWatch Logs for an application.
    */
  var LogLevelUpdate: js.UndefOr[LogLevel] = js.native
  /**
    * Describes updates to the granularity of the CloudWatch Logs for an application.
    */
  var MetricsLevelUpdate: js.UndefOr[MetricsLevel] = js.native
}

object MonitoringConfigurationUpdate {
  @scala.inline
  def apply(): MonitoringConfigurationUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MonitoringConfigurationUpdate]
  }
  @scala.inline
  implicit class MonitoringConfigurationUpdateOps[Self <: MonitoringConfigurationUpdate] (val x: Self) extends AnyVal {
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
    def setConfigurationTypeUpdate(value: ConfigurationType): Self = this.set("ConfigurationTypeUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigurationTypeUpdate: Self = this.set("ConfigurationTypeUpdate", js.undefined)
    @scala.inline
    def setLogLevelUpdate(value: LogLevel): Self = this.set("LogLevelUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogLevelUpdate: Self = this.set("LogLevelUpdate", js.undefined)
    @scala.inline
    def setMetricsLevelUpdate(value: MetricsLevel): Self = this.set("MetricsLevelUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetricsLevelUpdate: Self = this.set("MetricsLevelUpdate", js.undefined)
  }
  
}

