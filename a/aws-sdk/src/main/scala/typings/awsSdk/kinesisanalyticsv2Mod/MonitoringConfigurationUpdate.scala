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
  def apply(
    ConfigurationTypeUpdate: ConfigurationType = null,
    LogLevelUpdate: LogLevel = null,
    MetricsLevelUpdate: MetricsLevel = null
  ): MonitoringConfigurationUpdate = {
    val __obj = js.Dynamic.literal()
    if (ConfigurationTypeUpdate != null) __obj.updateDynamic("ConfigurationTypeUpdate")(ConfigurationTypeUpdate.asInstanceOf[js.Any])
    if (LogLevelUpdate != null) __obj.updateDynamic("LogLevelUpdate")(LogLevelUpdate.asInstanceOf[js.Any])
    if (MetricsLevelUpdate != null) __obj.updateDynamic("MetricsLevelUpdate")(MetricsLevelUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitoringConfigurationUpdate]
  }
}

