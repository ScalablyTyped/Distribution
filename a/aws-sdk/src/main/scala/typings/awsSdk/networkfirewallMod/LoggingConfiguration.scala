package typings.awsSdk.networkfirewallMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoggingConfiguration extends js.Object {
  
  /**
    * Defines the logging destinations for the logs for a firewall. Network Firewall generates logs for stateful rule groups. 
    */
  var LogDestinationConfigs: typings.awsSdk.networkfirewallMod.LogDestinationConfigs = js.native
}
object LoggingConfiguration {
  
  @scala.inline
  def apply(LogDestinationConfigs: LogDestinationConfigs): LoggingConfiguration = {
    val __obj = js.Dynamic.literal(LogDestinationConfigs = LogDestinationConfigs.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggingConfiguration]
  }
  
  @scala.inline
  implicit class LoggingConfigurationOps[Self <: LoggingConfiguration] (val x: Self) extends AnyVal {
    
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
    def setLogDestinationConfigsVarargs(value: LogDestinationConfig*): Self = this.set("LogDestinationConfigs", js.Array(value :_*))
    
    @scala.inline
    def setLogDestinationConfigs(value: LogDestinationConfigs): Self = this.set("LogDestinationConfigs", value.asInstanceOf[js.Any])
  }
}
