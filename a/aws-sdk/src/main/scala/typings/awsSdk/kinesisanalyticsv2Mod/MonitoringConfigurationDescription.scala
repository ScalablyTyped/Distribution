package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MonitoringConfigurationDescription extends js.Object {
  /**
    * Describes whether to use the default CloudWatch logging configuration for an application.
    */
  var ConfigurationType: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.ConfigurationType] = js.native
  /**
    * Describes the verbosity of the CloudWatch Logs for an application.
    */
  var LogLevel: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.LogLevel] = js.native
  /**
    * Describes the granularity of the CloudWatch Logs for an application.
    */
  var MetricsLevel: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.MetricsLevel] = js.native
}

object MonitoringConfigurationDescription {
  @scala.inline
  def apply(): MonitoringConfigurationDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MonitoringConfigurationDescription]
  }
  @scala.inline
  implicit class MonitoringConfigurationDescriptionOps[Self <: MonitoringConfigurationDescription] (val x: Self) extends AnyVal {
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
    def setConfigurationType(value: ConfigurationType): Self = this.set("ConfigurationType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigurationType: Self = this.set("ConfigurationType", js.undefined)
    @scala.inline
    def setLogLevel(value: LogLevel): Self = this.set("LogLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogLevel: Self = this.set("LogLevel", js.undefined)
    @scala.inline
    def setMetricsLevel(value: MetricsLevel): Self = this.set("MetricsLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetricsLevel: Self = this.set("MetricsLevel", js.undefined)
  }
  
}

