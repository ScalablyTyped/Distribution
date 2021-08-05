package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTransitGatewayMulticastDomainResult extends StObject {
  
  /**
    * Information about the transit gateway multicast domain.
    */
  var TransitGatewayMulticastDomain: js.UndefOr[typings.awsSdk.ec2Mod.TransitGatewayMulticastDomain] = js.undefined
}
object CreateTransitGatewayMulticastDomainResult {
  
  inline def apply(): CreateTransitGatewayMulticastDomainResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTransitGatewayMulticastDomainResult]
  }
  
  extension [Self <: CreateTransitGatewayMulticastDomainResult](x: Self) {
    
    inline def setTransitGatewayMulticastDomain(value: TransitGatewayMulticastDomain): Self = StObject.set(x, "TransitGatewayMulticastDomain", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayMulticastDomainUndefined: Self = StObject.set(x, "TransitGatewayMulticastDomain", js.undefined)
  }
}
