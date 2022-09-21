package typings.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRulesInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the listener.
    */
  var ListenerArn: js.UndefOr[typings.awsSdk.elbv2Mod.ListenerArn] = js.undefined
  
  /**
    * The marker for the next set of results. (You received this marker from a previous call.)
    */
  var Marker: js.UndefOr[typings.awsSdk.elbv2Mod.Marker] = js.undefined
  
  /**
    * The maximum number of results to return with this call.
    */
  var PageSize: js.UndefOr[typings.awsSdk.elbv2Mod.PageSize] = js.undefined
  
  /**
    * The Amazon Resource Names (ARN) of the rules.
    */
  var RuleArns: js.UndefOr[typings.awsSdk.elbv2Mod.RuleArns] = js.undefined
}
object DescribeRulesInput {
  
  inline def apply(): DescribeRulesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRulesInput]
  }
  
  extension [Self <: DescribeRulesInput](x: Self) {
    
    inline def setListenerArn(value: ListenerArn): Self = StObject.set(x, "ListenerArn", value.asInstanceOf[js.Any])
    
    inline def setListenerArnUndefined: Self = StObject.set(x, "ListenerArn", js.undefined)
    
    inline def setMarker(value: Marker): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setPageSize(value: PageSize): Self = StObject.set(x, "PageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "PageSize", js.undefined)
    
    inline def setRuleArns(value: RuleArns): Self = StObject.set(x, "RuleArns", value.asInstanceOf[js.Any])
    
    inline def setRuleArnsUndefined: Self = StObject.set(x, "RuleArns", js.undefined)
    
    inline def setRuleArnsVarargs(value: RuleArn*): Self = StObject.set(x, "RuleArns", js.Array(value*))
  }
}
