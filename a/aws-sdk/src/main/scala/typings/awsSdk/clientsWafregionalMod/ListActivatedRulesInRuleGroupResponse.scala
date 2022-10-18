package typings.awsSdk.clientsWafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListActivatedRulesInRuleGroupResponse extends StObject {
  
  /**
    * An array of ActivatedRules objects.
    */
  var ActivatedRules: js.UndefOr[typings.awsSdk.clientsWafregionalMod.ActivatedRules] = js.undefined
  
  /**
    * If you have more ActivatedRules than the number that you specified for Limit in the request, the response includes a NextMarker value. To list more ActivatedRules, submit another ListActivatedRulesInRuleGroup request, and specify the NextMarker value from the response in the NextMarker value in the next request.
    */
  var NextMarker: js.UndefOr[typings.awsSdk.clientsWafregionalMod.NextMarker] = js.undefined
}
object ListActivatedRulesInRuleGroupResponse {
  
  inline def apply(): ListActivatedRulesInRuleGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListActivatedRulesInRuleGroupResponse]
  }
  
  extension [Self <: ListActivatedRulesInRuleGroupResponse](x: Self) {
    
    inline def setActivatedRules(value: ActivatedRules): Self = StObject.set(x, "ActivatedRules", value.asInstanceOf[js.Any])
    
    inline def setActivatedRulesUndefined: Self = StObject.set(x, "ActivatedRules", js.undefined)
    
    inline def setActivatedRulesVarargs(value: ActivatedRule*): Self = StObject.set(x, "ActivatedRules", js.Array(value*))
    
    inline def setNextMarker(value: NextMarker): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    inline def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
  }
}
