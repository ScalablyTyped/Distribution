package typings.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateResolverEndpointIpAddressResponse extends StObject {
  
  /**
    * The response to an DisassociateResolverEndpointIpAddress request.
    */
  var ResolverEndpoint: js.UndefOr[typings.awsSdk.route53resolverMod.ResolverEndpoint] = js.undefined
}
object DisassociateResolverEndpointIpAddressResponse {
  
  @scala.inline
  def apply(): DisassociateResolverEndpointIpAddressResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisassociateResolverEndpointIpAddressResponse]
  }
  
  @scala.inline
  implicit class DisassociateResolverEndpointIpAddressResponseMutableBuilder[Self <: DisassociateResolverEndpointIpAddressResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResolverEndpoint(value: ResolverEndpoint): Self = StObject.set(x, "ResolverEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolverEndpointUndefined: Self = StObject.set(x, "ResolverEndpoint", js.undefined)
  }
}
