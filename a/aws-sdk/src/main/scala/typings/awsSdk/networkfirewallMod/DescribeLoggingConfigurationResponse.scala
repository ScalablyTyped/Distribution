package typings.awsSdk.networkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLoggingConfigurationResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the firewall.
    */
  var FirewallArn: js.UndefOr[ResourceArn] = js.undefined
  
  var LoggingConfiguration: js.UndefOr[typings.awsSdk.networkfirewallMod.LoggingConfiguration] = js.undefined
}
object DescribeLoggingConfigurationResponse {
  
  @scala.inline
  def apply(): DescribeLoggingConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLoggingConfigurationResponse]
  }
  
  @scala.inline
  implicit class DescribeLoggingConfigurationResponseMutableBuilder[Self <: DescribeLoggingConfigurationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFirewallArn(value: ResourceArn): Self = StObject.set(x, "FirewallArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirewallArnUndefined: Self = StObject.set(x, "FirewallArn", js.undefined)
    
    @scala.inline
    def setLoggingConfiguration(value: LoggingConfiguration): Self = StObject.set(x, "LoggingConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggingConfigurationUndefined: Self = StObject.set(x, "LoggingConfiguration", js.undefined)
  }
}
