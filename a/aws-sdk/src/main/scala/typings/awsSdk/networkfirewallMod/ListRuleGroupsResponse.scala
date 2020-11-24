package typings.awsSdk.networkfirewallMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListRuleGroupsResponse extends js.Object {
  
  /**
    * When you request a list of objects with a MaxResults setting, if the number of objects that are still available for retrieval exceeds the maximum you requested, Network Firewall returns a NextToken value in the response. To retrieve the next batch of objects, use the token returned from the prior request in your next request.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * The rule group metadata objects that you've defined. Depending on your setting for max results and the number of rule groups, this might not be the full list. 
    */
  var RuleGroups: js.UndefOr[typings.awsSdk.networkfirewallMod.RuleGroups] = js.native
}
object ListRuleGroupsResponse {
  
  @scala.inline
  def apply(): ListRuleGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRuleGroupsResponse]
  }
  
  @scala.inline
  implicit class ListRuleGroupsResponseOps[Self <: ListRuleGroupsResponse] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: PaginationToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setRuleGroupsVarargs(value: RuleGroupMetadata*): Self = this.set("RuleGroups", js.Array(value :_*))
    
    @scala.inline
    def setRuleGroups(value: RuleGroups): Self = this.set("RuleGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuleGroups: Self = this.set("RuleGroups", js.undefined)
  }
}
