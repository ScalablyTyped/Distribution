package typings.awsSdk.networkfirewallMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateLoggingConfigurationResponse extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the firewall.
    */
  var FirewallArn: js.UndefOr[ResourceArn] = js.native
  
  /**
    * The descriptive name of the firewall. You can't change the name of a firewall after you create it.
    */
  var FirewallName: js.UndefOr[ResourceName] = js.native
  
  var LoggingConfiguration: js.UndefOr[typings.awsSdk.networkfirewallMod.LoggingConfiguration] = js.native
}
object UpdateLoggingConfigurationResponse {
  
  @scala.inline
  def apply(): UpdateLoggingConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateLoggingConfigurationResponse]
  }
  
  @scala.inline
  implicit class UpdateLoggingConfigurationResponseOps[Self <: UpdateLoggingConfigurationResponse] (val x: Self) extends AnyVal {
    
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
    def setFirewallArn(value: ResourceArn): Self = this.set("FirewallArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirewallArn: Self = this.set("FirewallArn", js.undefined)
    
    @scala.inline
    def setFirewallName(value: ResourceName): Self = this.set("FirewallName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirewallName: Self = this.set("FirewallName", js.undefined)
    
    @scala.inline
    def setLoggingConfiguration(value: LoggingConfiguration): Self = this.set("LoggingConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoggingConfiguration: Self = this.set("LoggingConfiguration", js.undefined)
  }
}
