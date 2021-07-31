package typings.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateResolverEndpointRequest extends StObject {
  
  /**
    * The name of the Resolver endpoint that you want to update.
    */
  var Name: js.UndefOr[typings.awsSdk.route53resolverMod.Name] = js.undefined
  
  /**
    * The ID of the Resolver endpoint that you want to update.
    */
  var ResolverEndpointId: ResourceId
}
object UpdateResolverEndpointRequest {
  
  @scala.inline
  def apply(ResolverEndpointId: ResourceId): UpdateResolverEndpointRequest = {
    val __obj = js.Dynamic.literal(ResolverEndpointId = ResolverEndpointId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateResolverEndpointRequest]
  }
  
  @scala.inline
  implicit class UpdateResolverEndpointRequestMutableBuilder[Self <: UpdateResolverEndpointRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setResolverEndpointId(value: ResourceId): Self = StObject.set(x, "ResolverEndpointId", value.asInstanceOf[js.Any])
  }
}
