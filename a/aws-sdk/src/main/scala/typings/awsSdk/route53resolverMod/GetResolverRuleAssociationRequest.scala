package typings.awsSdk.route53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetResolverRuleAssociationRequest extends js.Object {
  
  /**
    * The ID of the Resolver rule association that you want to get information about.
    */
  var ResolverRuleAssociationId: ResourceId = js.native
}
object GetResolverRuleAssociationRequest {
  
  @scala.inline
  def apply(ResolverRuleAssociationId: ResourceId): GetResolverRuleAssociationRequest = {
    val __obj = js.Dynamic.literal(ResolverRuleAssociationId = ResolverRuleAssociationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResolverRuleAssociationRequest]
  }
  
  @scala.inline
  implicit class GetResolverRuleAssociationRequestOps[Self <: GetResolverRuleAssociationRequest] (val x: Self) extends AnyVal {
    
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
    def setResolverRuleAssociationId(value: ResourceId): Self = this.set("ResolverRuleAssociationId", value.asInstanceOf[js.Any])
  }
}
