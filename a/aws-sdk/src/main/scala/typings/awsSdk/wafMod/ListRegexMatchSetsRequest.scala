package typings.awsSdk.wafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRegexMatchSetsRequest extends StObject {
  
  /**
    * Specifies the number of RegexMatchSet objects that you want AWS WAF to return for this request. If you have more RegexMatchSet objects than the number you specify for Limit, the response includes a NextMarker value that you can use to get another batch of RegexMatchSet objects.
    */
  var Limit: js.UndefOr[PaginationLimit] = js.undefined
  
  /**
    * If you specify a value for Limit and you have more RegexMatchSet objects than the value of Limit, AWS WAF returns a NextMarker value in the response that allows you to list another group of ByteMatchSets. For the second and subsequent ListRegexMatchSets requests, specify the value of NextMarker from the previous response to get information about another batch of RegexMatchSet objects.
    */
  var NextMarker: js.UndefOr[typings.awsSdk.wafMod.NextMarker] = js.undefined
}
object ListRegexMatchSetsRequest {
  
  inline def apply(): ListRegexMatchSetsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRegexMatchSetsRequest]
  }
  
  extension [Self <: ListRegexMatchSetsRequest](x: Self) {
    
    inline def setLimit(value: PaginationLimit): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    inline def setNextMarker(value: NextMarker): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    inline def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
  }
}
