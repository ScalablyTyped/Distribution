package typings.awsSdk.wafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRegexPatternSetsRequest extends StObject {
  
  /**
    * Specifies the number of RegexPatternSet objects that you want AWS WAF to return for this request. If you have more RegexPatternSet objects than the number you specify for Limit, the response includes a NextMarker value that you can use to get another batch of RegexPatternSet objects.
    */
  var Limit: js.UndefOr[PaginationLimit] = js.undefined
  
  /**
    * If you specify a value for Limit and you have more RegexPatternSet objects than the value of Limit, AWS WAF returns a NextMarker value in the response that allows you to list another group of RegexPatternSet objects. For the second and subsequent ListRegexPatternSets requests, specify the value of NextMarker from the previous response to get information about another batch of RegexPatternSet objects.
    */
  var NextMarker: js.UndefOr[typings.awsSdk.wafregionalMod.NextMarker] = js.undefined
}
object ListRegexPatternSetsRequest {
  
  @scala.inline
  def apply(): ListRegexPatternSetsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRegexPatternSetsRequest]
  }
  
  @scala.inline
  implicit class ListRegexPatternSetsRequestMutableBuilder[Self <: ListRegexPatternSetsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLimit(value: PaginationLimit): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    @scala.inline
    def setNextMarker(value: NextMarker): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
  }
}
