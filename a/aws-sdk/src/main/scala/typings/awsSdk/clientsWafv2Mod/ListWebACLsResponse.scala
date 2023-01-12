package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListWebACLsResponse extends StObject {
  
  /**
    * When you request a list of objects with a Limit setting, if the number of objects that are still available for retrieval exceeds the limit, WAF returns a NextMarker value in the response. To retrieve the next batch of objects, provide the marker from the prior call in your next request.
    */
  var NextMarker: js.UndefOr[typings.awsSdk.clientsWafv2Mod.NextMarker] = js.undefined
  
  /**
    * 
    */
  var WebACLs: js.UndefOr[WebACLSummaries] = js.undefined
}
object ListWebACLsResponse {
  
  inline def apply(): ListWebACLsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListWebACLsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListWebACLsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextMarker(value: NextMarker): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    inline def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
    
    inline def setWebACLs(value: WebACLSummaries): Self = StObject.set(x, "WebACLs", value.asInstanceOf[js.Any])
    
    inline def setWebACLsUndefined: Self = StObject.set(x, "WebACLs", js.undefined)
    
    inline def setWebACLsVarargs(value: WebACLSummary*): Self = StObject.set(x, "WebACLs", js.Array(value*))
  }
}
