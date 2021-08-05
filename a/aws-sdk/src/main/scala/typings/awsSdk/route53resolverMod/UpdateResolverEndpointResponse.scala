package typings.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateResolverEndpointResponse extends StObject {
  
  /**
    * The response to an UpdateResolverEndpoint request.
    */
  var ResolverEndpoint: js.UndefOr[typings.awsSdk.route53resolverMod.ResolverEndpoint] = js.undefined
}
object UpdateResolverEndpointResponse {
  
  inline def apply(): UpdateResolverEndpointResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateResolverEndpointResponse]
  }
  
  extension [Self <: UpdateResolverEndpointResponse](x: Self) {
    
    inline def setResolverEndpoint(value: ResolverEndpoint): Self = StObject.set(x, "ResolverEndpoint", value.asInstanceOf[js.Any])
    
    inline def setResolverEndpointUndefined: Self = StObject.set(x, "ResolverEndpoint", js.undefined)
  }
}
