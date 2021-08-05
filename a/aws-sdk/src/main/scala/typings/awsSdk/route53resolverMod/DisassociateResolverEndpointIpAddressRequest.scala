package typings.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateResolverEndpointIpAddressRequest extends StObject {
  
  /**
    * The IPv4 address that you want to remove from a Resolver endpoint.
    */
  var IpAddress: IpAddressUpdate
  
  /**
    * The ID of the Resolver endpoint that you want to disassociate an IP address from.
    */
  var ResolverEndpointId: ResourceId
}
object DisassociateResolverEndpointIpAddressRequest {
  
  inline def apply(IpAddress: IpAddressUpdate, ResolverEndpointId: ResourceId): DisassociateResolverEndpointIpAddressRequest = {
    val __obj = js.Dynamic.literal(IpAddress = IpAddress.asInstanceOf[js.Any], ResolverEndpointId = ResolverEndpointId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateResolverEndpointIpAddressRequest]
  }
  
  extension [Self <: DisassociateResolverEndpointIpAddressRequest](x: Self) {
    
    inline def setIpAddress(value: IpAddressUpdate): Self = StObject.set(x, "IpAddress", value.asInstanceOf[js.Any])
    
    inline def setResolverEndpointId(value: ResourceId): Self = StObject.set(x, "ResolverEndpointId", value.asInstanceOf[js.Any])
  }
}
