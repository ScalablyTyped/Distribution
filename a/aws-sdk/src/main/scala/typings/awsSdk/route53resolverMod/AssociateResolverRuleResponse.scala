package typings.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociateResolverRuleResponse extends StObject {
  
  /**
    * Information about the AssociateResolverRule request, including the status of the request.
    */
  var ResolverRuleAssociation: js.UndefOr[typings.awsSdk.route53resolverMod.ResolverRuleAssociation] = js.native
}
object AssociateResolverRuleResponse {
  
  @scala.inline
  def apply(): AssociateResolverRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateResolverRuleResponse]
  }
  
  @scala.inline
  implicit class AssociateResolverRuleResponseMutableBuilder[Self <: AssociateResolverRuleResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResolverRuleAssociation(value: ResolverRuleAssociation): Self = StObject.set(x, "ResolverRuleAssociation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolverRuleAssociationUndefined: Self = StObject.set(x, "ResolverRuleAssociation", js.undefined)
  }
}
