package typings.awsSdk.wafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListActivatedRulesInRuleGroupResponse extends StObject {
  
  /**
    * An array of ActivatedRules objects.
    */
  var ActivatedRules: js.UndefOr[typings.awsSdk.wafMod.ActivatedRules] = js.undefined
  
  /**
    * If you have more ActivatedRules than the number that you specified for Limit in the request, the response includes a NextMarker value. To list more ActivatedRules, submit another ListActivatedRulesInRuleGroup request, and specify the NextMarker value from the response in the NextMarker value in the next request.
    */
  var NextMarker: js.UndefOr[typings.awsSdk.wafMod.NextMarker] = js.undefined
}
object ListActivatedRulesInRuleGroupResponse {
  
  @scala.inline
  def apply(): ListActivatedRulesInRuleGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListActivatedRulesInRuleGroupResponse]
  }
  
  @scala.inline
  implicit class ListActivatedRulesInRuleGroupResponseMutableBuilder[Self <: ListActivatedRulesInRuleGroupResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivatedRules(value: ActivatedRules): Self = StObject.set(x, "ActivatedRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivatedRulesUndefined: Self = StObject.set(x, "ActivatedRules", js.undefined)
    
    @scala.inline
    def setActivatedRulesVarargs(value: ActivatedRule*): Self = StObject.set(x, "ActivatedRules", js.Array(value :_*))
    
    @scala.inline
    def setNextMarker(value: NextMarker): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
  }
}
