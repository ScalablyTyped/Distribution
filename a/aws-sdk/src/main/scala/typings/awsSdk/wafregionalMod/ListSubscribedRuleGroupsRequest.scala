package typings.awsSdk.wafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSubscribedRuleGroupsRequest extends StObject {
  
  /**
    * Specifies the number of subscribed rule groups that you want AWS WAF to return for this request. If you have more objects than the number you specify for Limit, the response includes a NextMarker value that you can use to get another batch of objects.
    */
  var Limit: js.UndefOr[PaginationLimit] = js.native
  
  /**
    * If you specify a value for Limit and you have more ByteMatchSetssubscribed rule groups than the value of Limit, AWS WAF returns a NextMarker value in the response that allows you to list another group of subscribed rule groups. For the second and subsequent ListSubscribedRuleGroupsRequest requests, specify the value of NextMarker from the previous response to get information about another batch of subscribed rule groups.
    */
  var NextMarker: js.UndefOr[typings.awsSdk.wafregionalMod.NextMarker] = js.native
}
object ListSubscribedRuleGroupsRequest {
  
  @scala.inline
  def apply(): ListSubscribedRuleGroupsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSubscribedRuleGroupsRequest]
  }
  
  @scala.inline
  implicit class ListSubscribedRuleGroupsRequestMutableBuilder[Self <: ListSubscribedRuleGroupsRequest] (val x: Self) extends AnyVal {
    
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
