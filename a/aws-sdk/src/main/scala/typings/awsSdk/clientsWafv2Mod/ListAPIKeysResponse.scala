package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAPIKeysResponse extends StObject {
  
  /**
    * The array of key summaries. If you specified a Limit in your request, this might not be the full list. 
    */
  var APIKeySummaries: js.UndefOr[typings.awsSdk.clientsWafv2Mod.APIKeySummaries] = js.undefined
  
  /**
    * The CAPTCHA application integration URL, for use in your JavaScript implementation. 
    */
  var ApplicationIntegrationURL: js.UndefOr[OutputUrl] = js.undefined
  
  /**
    * When you request a list of objects with a Limit setting, if the number of objects that are still available for retrieval exceeds the limit, WAF returns a NextMarker value in the response. To retrieve the next batch of objects, provide the marker from the prior call in your next request.
    */
  var NextMarker: js.UndefOr[typings.awsSdk.clientsWafv2Mod.NextMarker] = js.undefined
}
object ListAPIKeysResponse {
  
  inline def apply(): ListAPIKeysResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAPIKeysResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListAPIKeysResponse] (val x: Self) extends AnyVal {
    
    inline def setAPIKeySummaries(value: APIKeySummaries): Self = StObject.set(x, "APIKeySummaries", value.asInstanceOf[js.Any])
    
    inline def setAPIKeySummariesUndefined: Self = StObject.set(x, "APIKeySummaries", js.undefined)
    
    inline def setAPIKeySummariesVarargs(value: APIKeySummary*): Self = StObject.set(x, "APIKeySummaries", js.Array(value*))
    
    inline def setApplicationIntegrationURL(value: OutputUrl): Self = StObject.set(x, "ApplicationIntegrationURL", value.asInstanceOf[js.Any])
    
    inline def setApplicationIntegrationURLUndefined: Self = StObject.set(x, "ApplicationIntegrationURL", js.undefined)
    
    inline def setNextMarker(value: NextMarker): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    inline def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
  }
}
