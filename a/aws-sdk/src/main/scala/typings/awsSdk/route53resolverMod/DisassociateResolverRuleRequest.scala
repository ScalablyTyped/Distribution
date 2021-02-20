package typings.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisassociateResolverRuleRequest extends StObject {
  
  /**
    * The ID of the Resolver rule that you want to disassociate from the specified VPC.
    */
  var ResolverRuleId: ResourceId = js.native
  
  /**
    * The ID of the VPC that you want to disassociate the Resolver rule from.
    */
  var VPCId: ResourceId = js.native
}
object DisassociateResolverRuleRequest {
  
  @scala.inline
  def apply(ResolverRuleId: ResourceId, VPCId: ResourceId): DisassociateResolverRuleRequest = {
    val __obj = js.Dynamic.literal(ResolverRuleId = ResolverRuleId.asInstanceOf[js.Any], VPCId = VPCId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateResolverRuleRequest]
  }
  
  @scala.inline
  implicit class DisassociateResolverRuleRequestMutableBuilder[Self <: DisassociateResolverRuleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResolverRuleId(value: ResourceId): Self = StObject.set(x, "ResolverRuleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVPCId(value: ResourceId): Self = StObject.set(x, "VPCId", value.asInstanceOf[js.Any])
  }
}
