package typings.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResolverEndpointResponse extends StObject {
  
  /**
    * Information about the DeleteResolverEndpoint request, including the status of the request.
    */
  var ResolverEndpoint: js.UndefOr[typings.awsSdk.route53resolverMod.ResolverEndpoint] = js.undefined
}
object DeleteResolverEndpointResponse {
  
  @scala.inline
  def apply(): DeleteResolverEndpointResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteResolverEndpointResponse]
  }
  
  @scala.inline
  implicit class DeleteResolverEndpointResponseMutableBuilder[Self <: DeleteResolverEndpointResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResolverEndpoint(value: ResolverEndpoint): Self = StObject.set(x, "ResolverEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolverEndpointUndefined: Self = StObject.set(x, "ResolverEndpoint", js.undefined)
  }
}
