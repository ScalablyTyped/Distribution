package typings.awsSdk.wafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRateBasedRulesRequest extends StObject {
  
  /**
    * Specifies the number of Rules that you want AWS WAF to return for this request. If you have more Rules than the number that you specify for Limit, the response includes a NextMarker value that you can use to get another batch of Rules.
    */
  var Limit: js.UndefOr[PaginationLimit] = js.undefined
  
  /**
    * If you specify a value for Limit and you have more Rules than the value of Limit, AWS WAF returns a NextMarker value in the response that allows you to list another group of Rules. For the second and subsequent ListRateBasedRules requests, specify the value of NextMarker from the previous response to get information about another batch of Rules.
    */
  var NextMarker: js.UndefOr[typings.awsSdk.wafMod.NextMarker] = js.undefined
}
object ListRateBasedRulesRequest {
  
  @scala.inline
  def apply(): ListRateBasedRulesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRateBasedRulesRequest]
  }
  
  @scala.inline
  implicit class ListRateBasedRulesRequestMutableBuilder[Self <: ListRateBasedRulesRequest] (val x: Self) extends AnyVal {
    
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
