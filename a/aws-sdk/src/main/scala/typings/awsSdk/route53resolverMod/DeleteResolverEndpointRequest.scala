package typings.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteResolverEndpointRequest extends StObject {
  
  /**
    * The ID of the Resolver endpoint that you want to delete.
    */
  var ResolverEndpointId: ResourceId = js.native
}
object DeleteResolverEndpointRequest {
  
  @scala.inline
  def apply(ResolverEndpointId: ResourceId): DeleteResolverEndpointRequest = {
    val __obj = js.Dynamic.literal(ResolverEndpointId = ResolverEndpointId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResolverEndpointRequest]
  }
  
  @scala.inline
  implicit class DeleteResolverEndpointRequestMutableBuilder[Self <: DeleteResolverEndpointRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResolverEndpointId(value: ResourceId): Self = StObject.set(x, "ResolverEndpointId", value.asInstanceOf[js.Any])
  }
}
