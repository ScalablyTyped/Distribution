package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MonitoringConfigurationUpdate extends StObject {
  
  /**
    * Describes updates to whether to use the default CloudWatch logging configuration for an application. You must set this property to CUSTOM in order to set the LogLevel or MetricsLevel parameters.
    */
  var ConfigurationTypeUpdate: js.UndefOr[ConfigurationType] = js.native
  
  /**
    * Describes updates to the verbosity of the CloudWatch Logs for an application.
    */
  var LogLevelUpdate: js.UndefOr[LogLevel] = js.native
  
  /**
    * Describes updates to the granularity of the CloudWatch Logs for an application. The Parallelism level is not recommended for applications with a Parallelism over 64 due to excessive costs.
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
  implicit class MonitoringConfigurationUpdateMutableBuilder[Self <: MonitoringConfigurationUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationTypeUpdate(value: ConfigurationType): Self = StObject.set(x, "ConfigurationTypeUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationTypeUpdateUndefined: Self = StObject.set(x, "ConfigurationTypeUpdate", js.undefined)
    
    @scala.inline
    def setLogLevelUpdate(value: LogLevel): Self = StObject.set(x, "LogLevelUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogLevelUpdateUndefined: Self = StObject.set(x, "LogLevelUpdate", js.undefined)
    
    @scala.inline
    def setMetricsLevelUpdate(value: MetricsLevel): Self = StObject.set(x, "MetricsLevelUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricsLevelUpdateUndefined: Self = StObject.set(x, "MetricsLevelUpdate", js.undefined)
  }
}
