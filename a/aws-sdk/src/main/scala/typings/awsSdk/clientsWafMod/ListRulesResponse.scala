package typings.awsSdk.clientsWafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRulesResponse extends StObject {
  
  /**
    * If you have more Rules than the number that you specified for Limit in the request, the response includes a NextMarker value. To list more Rules, submit another ListRules request, and specify the NextMarker value from the response in the NextMarker value in the next request.
    */
  var NextMarker: js.UndefOr[typings.awsSdk.clientsWafMod.NextMarker] = js.undefined
  
  /**
    * An array of RuleSummary objects.
    */
  var Rules: js.UndefOr[RuleSummaries] = js.undefined
}
object ListRulesResponse {
  
  inline def apply(): ListRulesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRulesResponse]
  }
  
  extension [Self <: ListRulesResponse](x: Self) {
    
    inline def setNextMarker(value: NextMarker): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    inline def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
    
    inline def setRules(value: RuleSummaries): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "Rules", js.undefined)
    
    inline def setRulesVarargs(value: RuleSummary*): Self = StObject.set(x, "Rules", js.Array(value*))
  }
}
