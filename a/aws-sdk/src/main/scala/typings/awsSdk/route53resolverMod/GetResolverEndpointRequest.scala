package typings.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetResolverEndpointRequest extends StObject {
  
  /**
    * The ID of the Resolver endpoint that you want to get information about.
    */
  var ResolverEndpointId: ResourceId = js.native
}
object GetResolverEndpointRequest {
  
  @scala.inline
  def apply(ResolverEndpointId: ResourceId): GetResolverEndpointRequest = {
    val __obj = js.Dynamic.literal(ResolverEndpointId = ResolverEndpointId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResolverEndpointRequest]
  }
  
  @scala.inline
  implicit class GetResolverEndpointRequestMutableBuilder[Self <: GetResolverEndpointRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResolverEndpointId(value: ResourceId): Self = StObject.set(x, "ResolverEndpointId", value.asInstanceOf[js.Any])
  }
}
