package typings.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisassociateResolverRuleResponse extends StObject {
  
  /**
    * Information about the DisassociateResolverRule request, including the status of the request.
    */
  var ResolverRuleAssociation: js.UndefOr[typings.awsSdk.route53resolverMod.ResolverRuleAssociation] = js.native
}
object DisassociateResolverRuleResponse {
  
  @scala.inline
  def apply(): DisassociateResolverRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisassociateResolverRuleResponse]
  }
  
  @scala.inline
  implicit class DisassociateResolverRuleResponseMutableBuilder[Self <: DisassociateResolverRuleResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResolverRuleAssociation(value: ResolverRuleAssociation): Self = StObject.set(x, "ResolverRuleAssociation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolverRuleAssociationUndefined: Self = StObject.set(x, "ResolverRuleAssociation", js.undefined)
  }
}
