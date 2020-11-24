package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MonitoringConfiguration extends js.Object {
  
  /**
    * Describes whether to use the default CloudWatch logging configuration for an application. You must set this property to CUSTOM in order to set the LogLevel or MetricsLevel parameters.
    */
  var ConfigurationType: typings.awsSdk.kinesisanalyticsv2Mod.ConfigurationType = js.native
  
  /**
    * Describes the verbosity of the CloudWatch Logs for an application.
    */
  var LogLevel: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.LogLevel] = js.native
  
  /**
    * Describes the granularity of the CloudWatch Logs for an application. The Parallelism level is not recommended for applications with a Parallelism over 64 due to excessive costs.
    */
  var MetricsLevel: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.MetricsLevel] = js.native
}
object MonitoringConfiguration {
  
  @scala.inline
  def apply(ConfigurationType: ConfigurationType): MonitoringConfiguration = {
    val __obj = js.Dynamic.literal(ConfigurationType = ConfigurationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitoringConfiguration]
  }
  
  @scala.inline
  implicit class MonitoringConfigurationOps[Self <: MonitoringConfiguration] (val x: Self) extends AnyVal {
    
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
    def setLogLevel(value: LogLevel): Self = this.set("LogLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogLevel: Self = this.set("LogLevel", js.undefined)
    
    @scala.inline
    def setMetricsLevel(value: MetricsLevel): Self = this.set("MetricsLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetricsLevel: Self = this.set("MetricsLevel", js.undefined)
  }
}
