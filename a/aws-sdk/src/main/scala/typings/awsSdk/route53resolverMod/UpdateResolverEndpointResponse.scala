package typings.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateResolverEndpointResponse extends StObject {
  
  /**
    * The response to an UpdateResolverEndpoint request.
    */
  var ResolverEndpoint: js.UndefOr[typings.awsSdk.route53resolverMod.ResolverEndpoint] = js.native
}
object UpdateResolverEndpointResponse {
  
  @scala.inline
  def apply(): UpdateResolverEndpointResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateResolverEndpointResponse]
  }
  
  @scala.inline
  implicit class UpdateResolverEndpointResponseMutableBuilder[Self <: UpdateResolverEndpointResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResolverEndpoint(value: ResolverEndpoint): Self = StObject.set(x, "ResolverEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolverEndpointUndefined: Self = StObject.set(x, "ResolverEndpoint", js.undefined)
  }
}
