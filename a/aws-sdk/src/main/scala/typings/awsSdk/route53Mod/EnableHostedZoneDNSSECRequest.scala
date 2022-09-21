package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableHostedZoneDNSSECRequest extends StObject {
  
  /**
    * A unique string used to identify a hosted zone.
    */
  var HostedZoneId: ResourceId
}
object EnableHostedZoneDNSSECRequest {
  
  inline def apply(HostedZoneId: ResourceId): EnableHostedZoneDNSSECRequest = {
    val __obj = js.Dynamic.literal(HostedZoneId = HostedZoneId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableHostedZoneDNSSECRequest]
  }
  
  extension [Self <: EnableHostedZoneDNSSECRequest](x: Self) {
    
    inline def setHostedZoneId(value: ResourceId): Self = StObject.set(x, "HostedZoneId", value.asInstanceOf[js.Any])
  }
}
