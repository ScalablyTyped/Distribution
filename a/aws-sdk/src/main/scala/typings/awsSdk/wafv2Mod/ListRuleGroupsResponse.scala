package typings.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRuleGroupsResponse extends StObject {
  
  /**
    * When you request a list of objects with a Limit setting, if the number of objects that are still available for retrieval exceeds the limit, AWS WAF returns a NextMarker value in the response. To retrieve the next batch of objects, provide the marker from the prior call in your next request.
    */
  var NextMarker: js.UndefOr[typings.awsSdk.wafv2Mod.NextMarker] = js.undefined
  
  /**
    * 
    */
  var RuleGroups: js.UndefOr[RuleGroupSummaries] = js.undefined
}
object ListRuleGroupsResponse {
  
  @scala.inline
  def apply(): ListRuleGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRuleGroupsResponse]
  }
  
  @scala.inline
  implicit class ListRuleGroupsResponseMutableBuilder[Self <: ListRuleGroupsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextMarker(value: NextMarker): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
    
    @scala.inline
    def setRuleGroups(value: RuleGroupSummaries): Self = StObject.set(x, "RuleGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleGroupsUndefined: Self = StObject.set(x, "RuleGroups", js.undefined)
    
    @scala.inline
    def setRuleGroupsVarargs(value: RuleGroupSummary*): Self = StObject.set(x, "RuleGroups", js.Array(value :_*))
  }
}
