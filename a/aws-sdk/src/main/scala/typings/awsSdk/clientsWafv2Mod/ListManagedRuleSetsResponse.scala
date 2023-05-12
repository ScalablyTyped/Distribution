package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListManagedRuleSetsResponse extends StObject {
  
  /**
    * Your managed rule sets. If you specified a Limit in your request, this might not be the full list. 
    */
  var ManagedRuleSets: js.UndefOr[ManagedRuleSetSummaries] = js.undefined
  
  /**
    * When you request a list of objects with a Limit setting, if the number of objects that are still available for retrieval exceeds the limit, WAF returns a NextMarker value in the response. To retrieve the next batch of objects, provide the marker from the prior call in your next request.
    */
  var NextMarker: js.UndefOr[typings.awsSdk.clientsWafv2Mod.NextMarker] = js.undefined
}
object ListManagedRuleSetsResponse {
  
  inline def apply(): ListManagedRuleSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListManagedRuleSetsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListManagedRuleSetsResponse] (val x: Self) extends AnyVal {
    
    inline def setManagedRuleSets(value: ManagedRuleSetSummaries): Self = StObject.set(x, "ManagedRuleSets", value.asInstanceOf[js.Any])
    
    inline def setManagedRuleSetsUndefined: Self = StObject.set(x, "ManagedRuleSets", js.undefined)
    
    inline def setManagedRuleSetsVarargs(value: ManagedRuleSetSummary*): Self = StObject.set(x, "ManagedRuleSets", js.Array(value*))
    
    inline def setNextMarker(value: NextMarker): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    inline def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
  }
}
