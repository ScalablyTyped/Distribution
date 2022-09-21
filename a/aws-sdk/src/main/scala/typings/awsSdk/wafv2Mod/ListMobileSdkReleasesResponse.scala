package typings.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMobileSdkReleasesResponse extends StObject {
  
  /**
    * When you request a list of objects with a Limit setting, if the number of objects that are still available for retrieval exceeds the limit, WAF returns a NextMarker value in the response. To retrieve the next batch of objects, provide the marker from the prior call in your next request.
    */
  var NextMarker: js.UndefOr[typings.awsSdk.wafv2Mod.NextMarker] = js.undefined
  
  /**
    * High level information for the available SDK releases. 
    */
  var ReleaseSummaries: js.UndefOr[typings.awsSdk.wafv2Mod.ReleaseSummaries] = js.undefined
}
object ListMobileSdkReleasesResponse {
  
  inline def apply(): ListMobileSdkReleasesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMobileSdkReleasesResponse]
  }
  
  extension [Self <: ListMobileSdkReleasesResponse](x: Self) {
    
    inline def setNextMarker(value: NextMarker): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    inline def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
    
    inline def setReleaseSummaries(value: ReleaseSummaries): Self = StObject.set(x, "ReleaseSummaries", value.asInstanceOf[js.Any])
    
    inline def setReleaseSummariesUndefined: Self = StObject.set(x, "ReleaseSummaries", js.undefined)
    
    inline def setReleaseSummariesVarargs(value: ReleaseSummary*): Self = StObject.set(x, "ReleaseSummaries", js.Array(value*))
  }
}
