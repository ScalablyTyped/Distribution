package typings.awsSdk.servicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DnsProperties extends StObject {
  
  /**
    * The ID for the Route 53 hosted zone that AWS Cloud Map creates when you create a namespace.
    */
  var HostedZoneId: js.UndefOr[ResourceId] = js.undefined
}
object DnsProperties {
  
  inline def apply(): DnsProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DnsProperties]
  }
  
  extension [Self <: DnsProperties](x: Self) {
    
    inline def setHostedZoneId(value: ResourceId): Self = StObject.set(x, "HostedZoneId", value.asInstanceOf[js.Any])
    
    inline def setHostedZoneIdUndefined: Self = StObject.set(x, "HostedZoneId", js.undefined)
  }
}
