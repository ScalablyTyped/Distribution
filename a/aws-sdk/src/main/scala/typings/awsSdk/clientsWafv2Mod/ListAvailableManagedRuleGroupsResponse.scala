package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAvailableManagedRuleGroupsResponse extends StObject {
  
  /**
    * Array of managed rule groups that you can use. If you specified a Limit in your request, this might not be the full list. 
    */
  var ManagedRuleGroups: js.UndefOr[ManagedRuleGroupSummaries] = js.undefined
  
  /**
    * When you request a list of objects with a Limit setting, if the number of objects that are still available for retrieval exceeds the limit, WAF returns a NextMarker value in the response. To retrieve the next batch of objects, provide the marker from the prior call in your next request.
    */
  var NextMarker: js.UndefOr[typings.awsSdk.clientsWafv2Mod.NextMarker] = js.undefined
}
object ListAvailableManagedRuleGroupsResponse {
  
  inline def apply(): ListAvailableManagedRuleGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAvailableManagedRuleGroupsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListAvailableManagedRuleGroupsResponse] (val x: Self) extends AnyVal {
    
    inline def setManagedRuleGroups(value: ManagedRuleGroupSummaries): Self = StObject.set(x, "ManagedRuleGroups", value.asInstanceOf[js.Any])
    
    inline def setManagedRuleGroupsUndefined: Self = StObject.set(x, "ManagedRuleGroups", js.undefined)
    
    inline def setManagedRuleGroupsVarargs(value: ManagedRuleGroupSummary*): Self = StObject.set(x, "ManagedRuleGroups", js.Array(value*))
    
    inline def setNextMarker(value: NextMarker): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    inline def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
  }
}
