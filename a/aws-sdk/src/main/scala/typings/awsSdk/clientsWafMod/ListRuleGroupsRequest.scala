package typings.awsSdk.clientsWafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRuleGroupsRequest extends StObject {
  
  /**
    * Specifies the number of RuleGroups that you want AWS WAF to return for this request. If you have more RuleGroups than the number that you specify for Limit, the response includes a NextMarker value that you can use to get another batch of RuleGroups.
    */
  var Limit: js.UndefOr[PaginationLimit] = js.undefined
  
  /**
    * If you specify a value for Limit and you have more RuleGroups than the value of Limit, AWS WAF returns a NextMarker value in the response that allows you to list another group of RuleGroups. For the second and subsequent ListRuleGroups requests, specify the value of NextMarker from the previous response to get information about another batch of RuleGroups.
    */
  var NextMarker: js.UndefOr[typings.awsSdk.clientsWafMod.NextMarker] = js.undefined
}
object ListRuleGroupsRequest {
  
  inline def apply(): ListRuleGroupsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRuleGroupsRequest]
  }
  
  extension [Self <: ListRuleGroupsRequest](x: Self) {
    
    inline def setLimit(value: PaginationLimit): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    inline def setNextMarker(value: NextMarker): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    inline def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
  }
}
