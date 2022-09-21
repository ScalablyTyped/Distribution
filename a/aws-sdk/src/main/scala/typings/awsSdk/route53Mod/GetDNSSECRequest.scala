package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDNSSECRequest extends StObject {
  
  /**
    * A unique string used to identify a hosted zone.
    */
  var HostedZoneId: ResourceId
}
object GetDNSSECRequest {
  
  inline def apply(HostedZoneId: ResourceId): GetDNSSECRequest = {
    val __obj = js.Dynamic.literal(HostedZoneId = HostedZoneId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDNSSECRequest]
  }
  
  extension [Self <: GetDNSSECRequest](x: Self) {
    
    inline def setHostedZoneId(value: ResourceId): Self = StObject.set(x, "HostedZoneId", value.asInstanceOf[js.Any])
  }
}
