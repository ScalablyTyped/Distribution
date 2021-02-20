package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MonitoringConfiguration extends StObject {
  
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
  implicit class MonitoringConfigurationMutableBuilder[Self <: MonitoringConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationType(value: ConfigurationType): Self = StObject.set(x, "ConfigurationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogLevel(value: LogLevel): Self = StObject.set(x, "LogLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogLevelUndefined: Self = StObject.set(x, "LogLevel", js.undefined)
    
    @scala.inline
    def setMetricsLevel(value: MetricsLevel): Self = StObject.set(x, "MetricsLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricsLevelUndefined: Self = StObject.set(x, "MetricsLevel", js.undefined)
  }
}
