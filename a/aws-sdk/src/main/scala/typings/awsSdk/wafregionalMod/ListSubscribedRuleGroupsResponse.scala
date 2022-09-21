package typings.awsSdk.wafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSubscribedRuleGroupsResponse extends StObject {
  
  /**
    * If you have more objects than the number that you specified for Limit in the request, the response includes a NextMarker value. To list more objects, submit another ListSubscribedRuleGroups request, and specify the NextMarker value from the response in the NextMarker value in the next request.
    */
  var NextMarker: js.UndefOr[typings.awsSdk.wafregionalMod.NextMarker] = js.undefined
  
  /**
    * An array of RuleGroup objects.
    */
  var RuleGroups: js.UndefOr[SubscribedRuleGroupSummaries] = js.undefined
}
object ListSubscribedRuleGroupsResponse {
  
  inline def apply(): ListSubscribedRuleGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSubscribedRuleGroupsResponse]
  }
  
  extension [Self <: ListSubscribedRuleGroupsResponse](x: Self) {
    
    inline def setNextMarker(value: NextMarker): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    inline def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
    
    inline def setRuleGroups(value: SubscribedRuleGroupSummaries): Self = StObject.set(x, "RuleGroups", value.asInstanceOf[js.Any])
    
    inline def setRuleGroupsUndefined: Self = StObject.set(x, "RuleGroups", js.undefined)
    
    inline def setRuleGroupsVarargs(value: SubscribedRuleGroupSummary*): Self = StObject.set(x, "RuleGroups", js.Array(value*))
  }
}
