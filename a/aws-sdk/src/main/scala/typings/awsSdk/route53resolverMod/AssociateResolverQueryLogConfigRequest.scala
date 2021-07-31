package typings.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateResolverQueryLogConfigRequest extends StObject {
  
  /**
    * The ID of the query logging configuration that you want to associate a VPC with.
    */
  var ResolverQueryLogConfigId: ResourceId
  
  /**
    * The ID of an Amazon VPC that you want this query logging configuration to log queries for.  The VPCs and the query logging configuration must be in the same Region. 
    */
  var ResourceId: typings.awsSdk.route53resolverMod.ResourceId
}
object AssociateResolverQueryLogConfigRequest {
  
  @scala.inline
  def apply(ResolverQueryLogConfigId: ResourceId, ResourceId: ResourceId): AssociateResolverQueryLogConfigRequest = {
    val __obj = js.Dynamic.literal(ResolverQueryLogConfigId = ResolverQueryLogConfigId.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateResolverQueryLogConfigRequest]
  }
  
  @scala.inline
  implicit class AssociateResolverQueryLogConfigRequestMutableBuilder[Self <: AssociateResolverQueryLogConfigRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResolverQueryLogConfigId(value: ResourceId): Self = StObject.set(x, "ResolverQueryLogConfigId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceId(value: ResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
  }
}
