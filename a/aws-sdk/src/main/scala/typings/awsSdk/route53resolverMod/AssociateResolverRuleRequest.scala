package typings.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociateResolverRuleRequest extends StObject {
  
  /**
    * A name for the association that you're creating between a Resolver rule and a VPC.
    */
  var Name: js.UndefOr[typings.awsSdk.route53resolverMod.Name] = js.native
  
  /**
    * The ID of the Resolver rule that you want to associate with the VPC. To list the existing Resolver rules, use ListResolverRules.
    */
  var ResolverRuleId: ResourceId = js.native
  
  /**
    * The ID of the VPC that you want to associate the Resolver rule with.
    */
  var VPCId: ResourceId = js.native
}
object AssociateResolverRuleRequest {
  
  @scala.inline
  def apply(ResolverRuleId: ResourceId, VPCId: ResourceId): AssociateResolverRuleRequest = {
    val __obj = js.Dynamic.literal(ResolverRuleId = ResolverRuleId.asInstanceOf[js.Any], VPCId = VPCId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateResolverRuleRequest]
  }
  
  @scala.inline
  implicit class AssociateResolverRuleRequestMutableBuilder[Self <: AssociateResolverRuleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setResolverRuleId(value: ResourceId): Self = StObject.set(x, "ResolverRuleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVPCId(value: ResourceId): Self = StObject.set(x, "VPCId", value.asInstanceOf[js.Any])
  }
}
