package typings.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateResolverQueryLogConfigRequest extends StObject {
  
  /**
    * The ID of the query logging configuration that you want to disassociate a specified VPC from.
    */
  var ResolverQueryLogConfigId: ResourceId
  
  /**
    * The ID of the Amazon VPC that you want to disassociate from a specified query logging configuration.
    */
  var ResourceId: typings.awsSdk.route53resolverMod.ResourceId
}
object DisassociateResolverQueryLogConfigRequest {
  
  inline def apply(ResolverQueryLogConfigId: ResourceId, ResourceId: ResourceId): DisassociateResolverQueryLogConfigRequest = {
    val __obj = js.Dynamic.literal(ResolverQueryLogConfigId = ResolverQueryLogConfigId.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateResolverQueryLogConfigRequest]
  }
  
  extension [Self <: DisassociateResolverQueryLogConfigRequest](x: Self) {
    
    inline def setResolverQueryLogConfigId(value: ResourceId): Self = StObject.set(x, "ResolverQueryLogConfigId", value.asInstanceOf[js.Any])
    
    inline def setResourceId(value: ResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
  }
}
