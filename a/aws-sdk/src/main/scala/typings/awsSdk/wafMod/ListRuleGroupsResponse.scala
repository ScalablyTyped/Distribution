package typings.awsSdk.wafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListRuleGroupsResponse extends StObject {
  
  /**
    * If you have more RuleGroups than the number that you specified for Limit in the request, the response includes a NextMarker value. To list more RuleGroups, submit another ListRuleGroups request, and specify the NextMarker value from the response in the NextMarker value in the next request.
    */
  var NextMarker: js.UndefOr[typings.awsSdk.wafMod.NextMarker] = js.native
  
  /**
    * An array of RuleGroup objects.
    */
  var RuleGroups: js.UndefOr[RuleGroupSummaries] = js.native
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
