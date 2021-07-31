package typings.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResolverQueryLogConfigAssociationRequest extends StObject {
  
  /**
    * The ID of the Resolver query logging configuration association that you want to get information about.
    */
  var ResolverQueryLogConfigAssociationId: ResourceId
}
object GetResolverQueryLogConfigAssociationRequest {
  
  @scala.inline
  def apply(ResolverQueryLogConfigAssociationId: ResourceId): GetResolverQueryLogConfigAssociationRequest = {
    val __obj = js.Dynamic.literal(ResolverQueryLogConfigAssociationId = ResolverQueryLogConfigAssociationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResolverQueryLogConfigAssociationRequest]
  }
  
  @scala.inline
  implicit class GetResolverQueryLogConfigAssociationRequestMutableBuilder[Self <: GetResolverQueryLogConfigAssociationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResolverQueryLogConfigAssociationId(value: ResourceId): Self = StObject.set(x, "ResolverQueryLogConfigAssociationId", value.asInstanceOf[js.Any])
  }
}
