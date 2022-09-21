package typings.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMobileSdkReleasesRequest extends StObject {
  
  /**
    * The maximum number of objects that you want WAF to return for this request. If more objects are available, in the response, WAF provides a NextMarker value that you can use in a subsequent call to get the next batch of objects.
    */
  var Limit: js.UndefOr[PaginationLimit] = js.undefined
  
  /**
    * When you request a list of objects with a Limit setting, if the number of objects that are still available for retrieval exceeds the limit, WAF returns a NextMarker value in the response. To retrieve the next batch of objects, provide the marker from the prior call in your next request.
    */
  var NextMarker: js.UndefOr[typings.awsSdk.wafv2Mod.NextMarker] = js.undefined
  
  /**
    * The device platform to retrieve the list for.
    */
  var Platform: typings.awsSdk.wafv2Mod.Platform
}
object ListMobileSdkReleasesRequest {
  
  inline def apply(Platform: Platform): ListMobileSdkReleasesRequest = {
    val __obj = js.Dynamic.literal(Platform = Platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMobileSdkReleasesRequest]
  }
  
  extension [Self <: ListMobileSdkReleasesRequest](x: Self) {
    
    inline def setLimit(value: PaginationLimit): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    inline def setNextMarker(value: NextMarker): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    inline def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
    
    inline def setPlatform(value: Platform): Self = StObject.set(x, "Platform", value.asInstanceOf[js.Any])
  }
}
