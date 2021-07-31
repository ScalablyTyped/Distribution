package typings.awsSdk.networkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoggingConfiguration extends StObject {
  
  /**
    * Defines the logging destinations for the logs for a firewall. Network Firewall generates logs for stateful rule groups. 
    */
  var LogDestinationConfigs: typings.awsSdk.networkfirewallMod.LogDestinationConfigs
}
object LoggingConfiguration {
  
  @scala.inline
  def apply(LogDestinationConfigs: LogDestinationConfigs): LoggingConfiguration = {
    val __obj = js.Dynamic.literal(LogDestinationConfigs = LogDestinationConfigs.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggingConfiguration]
  }
  
  @scala.inline
  implicit class LoggingConfigurationMutableBuilder[Self <: LoggingConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogDestinationConfigs(value: LogDestinationConfigs): Self = StObject.set(x, "LogDestinationConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogDestinationConfigsVarargs(value: LogDestinationConfig*): Self = StObject.set(x, "LogDestinationConfigs", js.Array(value :_*))
  }
}
