package typings.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResolverRuleAssociationResponse extends StObject {
  
  /**
    * Information about the Resolver rule association that you specified in a GetResolverRuleAssociation request.
    */
  var ResolverRuleAssociation: js.UndefOr[typings.awsSdk.route53resolverMod.ResolverRuleAssociation] = js.undefined
}
object GetResolverRuleAssociationResponse {
  
  @scala.inline
  def apply(): GetResolverRuleAssociationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResolverRuleAssociationResponse]
  }
  
  @scala.inline
  implicit class GetResolverRuleAssociationResponseMutableBuilder[Self <: GetResolverRuleAssociationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResolverRuleAssociation(value: ResolverRuleAssociation): Self = StObject.set(x, "ResolverRuleAssociation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolverRuleAssociationUndefined: Self = StObject.set(x, "ResolverRuleAssociation", js.undefined)
  }
}
