package typings.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociateResolverEndpointIpAddressResponse extends StObject {
  
  /**
    * The response to an AssociateResolverEndpointIpAddress request.
    */
  var ResolverEndpoint: js.UndefOr[typings.awsSdk.route53resolverMod.ResolverEndpoint] = js.native
}
object AssociateResolverEndpointIpAddressResponse {
  
  @scala.inline
  def apply(): AssociateResolverEndpointIpAddressResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateResolverEndpointIpAddressResponse]
  }
  
  @scala.inline
  implicit class AssociateResolverEndpointIpAddressResponseMutableBuilder[Self <: AssociateResolverEndpointIpAddressResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResolverEndpoint(value: ResolverEndpoint): Self = StObject.set(x, "ResolverEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolverEndpointUndefined: Self = StObject.set(x, "ResolverEndpoint", js.undefined)
  }
}
