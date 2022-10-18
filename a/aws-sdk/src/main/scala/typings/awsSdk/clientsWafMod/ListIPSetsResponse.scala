package typings.awsSdk.clientsWafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListIPSetsResponse extends StObject {
  
  /**
    * An array of IPSetSummary objects.
    */
  var IPSets: js.UndefOr[IPSetSummaries] = js.undefined
  
  /**
    * To list more IPSet objects, submit another ListIPSets request, and in the next request use the NextMarker response value as the NextMarker value.
    */
  var NextMarker: js.UndefOr[typings.awsSdk.clientsWafMod.NextMarker] = js.undefined
}
object ListIPSetsResponse {
  
  inline def apply(): ListIPSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListIPSetsResponse]
  }
  
  extension [Self <: ListIPSetsResponse](x: Self) {
    
    inline def setIPSets(value: IPSetSummaries): Self = StObject.set(x, "IPSets", value.asInstanceOf[js.Any])
    
    inline def setIPSetsUndefined: Self = StObject.set(x, "IPSets", js.undefined)
    
    inline def setIPSetsVarargs(value: IPSetSummary*): Self = StObject.set(x, "IPSets", js.Array(value*))
    
    inline def setNextMarker(value: NextMarker): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    inline def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
  }
}
