package typings.awsSdk.servicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceChange extends StObject {
  
  /**
    * A description for the service.
    */
  var Description: js.UndefOr[ResourceDescription] = js.undefined
  
  /**
    * Information about the Route 53 DNS records that you want Cloud Map to create when you register an instance.
    */
  var DnsConfig: js.UndefOr[DnsConfigChange] = js.undefined
  
  /**
    *  Public DNS and HTTP namespaces only. Settings for an optional health check. If you specify settings for a health check, Cloud Map associates the health check with the records that you specify in DnsConfig.
    */
  var HealthCheckConfig: js.UndefOr[typings.awsSdk.servicediscoveryMod.HealthCheckConfig] = js.undefined
}
object ServiceChange {
  
  inline def apply(): ServiceChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceChange]
  }
  
  extension [Self <: ServiceChange](x: Self) {
    
    inline def setDescription(value: ResourceDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDnsConfig(value: DnsConfigChange): Self = StObject.set(x, "DnsConfig", value.asInstanceOf[js.Any])
    
    inline def setDnsConfigUndefined: Self = StObject.set(x, "DnsConfig", js.undefined)
    
    inline def setHealthCheckConfig(value: HealthCheckConfig): Self = StObject.set(x, "HealthCheckConfig", value.asInstanceOf[js.Any])
    
    inline def setHealthCheckConfigUndefined: Self = StObject.set(x, "HealthCheckConfig", js.undefined)
  }
}
