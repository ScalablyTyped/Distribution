package typings.awsSdk.route53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociateResolverRuleResponse extends js.Object {
  
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
  implicit class AssociateResolverRuleResponseOps[Self <: AssociateResolverRuleResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setResolverRuleAssociation(value: ResolverRuleAssociation): Self = this.set("ResolverRuleAssociation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolverRuleAssociation: Self = this.set("ResolverRuleAssociation", js.undefined)
  }
}
