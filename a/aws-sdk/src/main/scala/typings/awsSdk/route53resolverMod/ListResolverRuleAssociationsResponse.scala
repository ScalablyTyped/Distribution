package typings.awsSdk.route53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListResolverRuleAssociationsResponse extends js.Object {
  
  /**
    * The value that you specified for MaxResults in the request.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.route53resolverMod.MaxResults] = js.native
  
  /**
    * If more than MaxResults rule associations match the specified criteria, you can submit another ListResolverRuleAssociation request to get the next group of results. In the next request, specify the value of NextToken from the previous response. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.route53resolverMod.NextToken] = js.native
  
  /**
    * The associations that were created between Resolver rules and VPCs using the current AWS account, and that match the specified filters, if any.
    */
  var ResolverRuleAssociations: js.UndefOr[typings.awsSdk.route53resolverMod.ResolverRuleAssociations] = js.native
}
object ListResolverRuleAssociationsResponse {
  
  @scala.inline
  def apply(): ListResolverRuleAssociationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResolverRuleAssociationsResponse]
  }
  
  @scala.inline
  implicit class ListResolverRuleAssociationsResponseOps[Self <: ListResolverRuleAssociationsResponse] (val x: Self) extends AnyVal {
    
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
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setResolverRuleAssociationsVarargs(value: ResolverRuleAssociation*): Self = this.set("ResolverRuleAssociations", js.Array(value :_*))
    
    @scala.inline
    def setResolverRuleAssociations(value: ResolverRuleAssociations): Self = this.set("ResolverRuleAssociations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolverRuleAssociations: Self = this.set("ResolverRuleAssociations", js.undefined)
  }
}
