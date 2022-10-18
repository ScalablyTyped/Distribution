package typings.awsSdk.clientsWafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRuleGroupRequest extends StObject {
  
  /**
    * The value returned by the most recent call to GetChangeToken.
    */
  var ChangeToken: typings.awsSdk.clientsWafregionalMod.ChangeToken
  
  /**
    * A friendly name or description for the metrics for this RuleGroup. The name can contain only alphanumeric characters (A-Z, a-z, 0-9), with maximum length 128 and minimum length one. It can't contain whitespace or metric names reserved for AWS WAF, including "All" and "Default_Action." You can't change the name of the metric after you create the RuleGroup.
    */
  var MetricName: typings.awsSdk.clientsWafregionalMod.MetricName
  
  /**
    * A friendly name or description of the RuleGroup. You can't change Name after you create a RuleGroup.
    */
  var Name: ResourceName
  
  /**
    * 
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateRuleGroupRequest {
  
  inline def apply(ChangeToken: ChangeToken, MetricName: MetricName, Name: ResourceName): CreateRuleGroupRequest = {
    val __obj = js.Dynamic.literal(ChangeToken = ChangeToken.asInstanceOf[js.Any], MetricName = MetricName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRuleGroupRequest]
  }
  
  extension [Self <: CreateRuleGroupRequest](x: Self) {
    
    inline def setChangeToken(value: ChangeToken): Self = StObject.set(x, "ChangeToken", value.asInstanceOf[js.Any])
    
    inline def setMetricName(value: MetricName): Self = StObject.set(x, "MetricName", value.asInstanceOf[js.Any])
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
