package typings.awsSdk.servicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceChange extends StObject {
  
  /**
    * A description for the service.
    */
  var Description: js.UndefOr[ResourceDescription] = js.native
  
  /**
    * A complex type that contains information about the Route 53 DNS records that you want AWS Cloud Map to create when you register an instance.
    */
  var DnsConfig: js.UndefOr[DnsConfigChange] = js.native
  
  var HealthCheckConfig: js.UndefOr[typings.awsSdk.servicediscoveryMod.HealthCheckConfig] = js.native
}
object ServiceChange {
  
  @scala.inline
  def apply(): ServiceChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceChange]
  }
  
  @scala.inline
  implicit class ServiceChangeMutableBuilder[Self <: ServiceChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: ResourceDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setDnsConfig(value: DnsConfigChange): Self = StObject.set(x, "DnsConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDnsConfigUndefined: Self = StObject.set(x, "DnsConfig", js.undefined)
    
    @scala.inline
    def setHealthCheckConfig(value: HealthCheckConfig): Self = StObject.set(x, "HealthCheckConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthCheckConfigUndefined: Self = StObject.set(x, "HealthCheckConfig", js.undefined)
  }
}
