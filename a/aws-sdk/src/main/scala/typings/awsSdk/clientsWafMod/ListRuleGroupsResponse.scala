package typings.awsSdk.clientsWafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRuleGroupsResponse extends StObject {
  
  /**
    * If you have more RuleGroups than the number that you specified for Limit in the request, the response includes a NextMarker value. To list more RuleGroups, submit another ListRuleGroups request, and specify the NextMarker value from the response in the NextMarker value in the next request.
    */
  var NextMarker: js.UndefOr[typings.awsSdk.clientsWafMod.NextMarker] = js.undefined
  
  /**
    * An array of RuleGroup objects.
    */
  var RuleGroups: js.UndefOr[RuleGroupSummaries] = js.undefined
}
object ListRuleGroupsResponse {
  
  inline def apply(): ListRuleGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRuleGroupsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListRuleGroupsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextMarker(value: NextMarker): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    inline def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
    
    inline def setRuleGroups(value: RuleGroupSummaries): Self = StObject.set(x, "RuleGroups", value.asInstanceOf[js.Any])
    
    inline def setRuleGroupsUndefined: Self = StObject.set(x, "RuleGroups", js.undefined)
    
    inline def setRuleGroupsVarargs(value: RuleGroupSummary*): Self = StObject.set(x, "RuleGroups", js.Array(value*))
  }
}
