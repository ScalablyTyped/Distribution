package typings.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateResolverRuleRequest extends StObject {
  
  /**
    * The ID of the Resolver rule that you want to disassociate from the specified VPC.
    */
  var ResolverRuleId: ResourceId
  
  /**
    * The ID of the VPC that you want to disassociate the Resolver rule from.
    */
  var VPCId: ResourceId
}
object DisassociateResolverRuleRequest {
  
  inline def apply(ResolverRuleId: ResourceId, VPCId: ResourceId): DisassociateResolverRuleRequest = {
    val __obj = js.Dynamic.literal(ResolverRuleId = ResolverRuleId.asInstanceOf[js.Any], VPCId = VPCId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateResolverRuleRequest]
  }
  
  extension [Self <: DisassociateResolverRuleRequest](x: Self) {
    
    inline def setResolverRuleId(value: ResourceId): Self = StObject.set(x, "ResolverRuleId", value.asInstanceOf[js.Any])
    
    inline def setVPCId(value: ResourceId): Self = StObject.set(x, "VPCId", value.asInstanceOf[js.Any])
  }
}
