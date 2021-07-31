package typings.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolverRuleAssociation extends StObject {
  
  /**
    * The ID of the association between a Resolver rule and a VPC. Resolver assigns this value when you submit an AssociateResolverRule request.
    */
  var Id: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * The name of an association between a Resolver rule and a VPC.
    */
  var Name: js.UndefOr[typings.awsSdk.route53resolverMod.Name] = js.undefined
  
  /**
    * The ID of the Resolver rule that you associated with the VPC that is specified by VPCId.
    */
  var ResolverRuleId: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * A code that specifies the current status of the association between a Resolver rule and a VPC.
    */
  var Status: js.UndefOr[ResolverRuleAssociationStatus] = js.undefined
  
  /**
    * A detailed description of the status of the association between a Resolver rule and a VPC.
    */
  var StatusMessage: js.UndefOr[typings.awsSdk.route53resolverMod.StatusMessage] = js.undefined
  
  /**
    * The ID of the VPC that you associated the Resolver rule with.
    */
  var VPCId: js.UndefOr[ResourceId] = js.undefined
}
object ResolverRuleAssociation {
  
  @scala.inline
  def apply(): ResolverRuleAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolverRuleAssociation]
  }
  
  @scala.inline
  implicit class ResolverRuleAssociationMutableBuilder[Self <: ResolverRuleAssociation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: ResourceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setResolverRuleId(value: ResourceId): Self = StObject.set(x, "ResolverRuleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolverRuleIdUndefined: Self = StObject.set(x, "ResolverRuleId", js.undefined)
    
    @scala.inline
    def setStatus(value: ResolverRuleAssociationStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessage(value: StatusMessage): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setVPCId(value: ResourceId): Self = StObject.set(x, "VPCId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVPCIdUndefined: Self = StObject.set(x, "VPCId", js.undefined)
  }
}
