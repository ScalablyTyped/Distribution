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
  def apply(
    ConfigurationType: ConfigurationType = null,
    LogLevel: LogLevel = null,
    MetricsLevel: MetricsLevel = null
  ): MonitoringConfigurationDescription = {
    val __obj = js.Dynamic.literal()
    if (ConfigurationType != null) __obj.updateDynamic("ConfigurationType")(ConfigurationType.asInstanceOf[js.Any])
    if (LogLevel != null) __obj.updateDynamic("LogLevel")(LogLevel.asInstanceOf[js.Any])
    if (MetricsLevel != null) __obj.updateDynamic("MetricsLevel")(MetricsLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitoringConfigurationDescription]
  }
}

