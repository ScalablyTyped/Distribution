package typings.awsSdk.servicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DnsProperties extends StObject {
  
  /**
    * The ID for the Route 53 hosted zone that Cloud Map creates when you create a namespace.
    */
  var HostedZoneId: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * Start of Authority (SOA) record for the hosted zone.
    */
  var SOA: js.UndefOr[typings.awsSdk.servicediscoveryMod.SOA] = js.undefined
}
object DnsProperties {
  
  inline def apply(): DnsProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DnsProperties]
  }
  
  extension [Self <: DnsProperties](x: Self) {
    
    inline def setHostedZoneId(value: ResourceId): Self = StObject.set(x, "HostedZoneId", value.asInstanceOf[js.Any])
    
    inline def setHostedZoneIdUndefined: Self = StObject.set(x, "HostedZoneId", js.undefined)
    
    inline def setSOA(value: SOA): Self = StObject.set(x, "SOA", value.asInstanceOf[js.Any])
    
    inline def setSOAUndefined: Self = StObject.set(x, "SOA", js.undefined)
  }
}
