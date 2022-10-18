package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRuleGroupsResponse extends StObject {
  
  /**
    * When you request a list of objects with a Limit setting, if the number of objects that are still available for retrieval exceeds the limit, WAF returns a NextMarker value in the response. To retrieve the next batch of objects, provide the marker from the prior call in your next request.
    */
  var NextMarker: js.UndefOr[typings.awsSdk.clientsWafv2Mod.NextMarker] = js.undefined
  
  /**
    * 
    */
  var RuleGroups: js.UndefOr[RuleGroupSummaries] = js.undefined
}
object ListRuleGroupsResponse {
  
  inline def apply(): ListRuleGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRuleGroupsResponse]
  }
  
  extension [Self <: ListRuleGroupsResponse](x: Self) {
    
    inline def setNextMarker(value: NextMarker): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    inline def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
    
    inline def setRuleGroups(value: RuleGroupSummaries): Self = StObject.set(x, "RuleGroups", value.asInstanceOf[js.Any])
    
    inline def setRuleGroupsUndefined: Self = StObject.set(x, "RuleGroups", js.undefined)
    
    inline def setRuleGroupsVarargs(value: RuleGroupSummary*): Self = StObject.set(x, "RuleGroups", js.Array(value*))
  }
}
