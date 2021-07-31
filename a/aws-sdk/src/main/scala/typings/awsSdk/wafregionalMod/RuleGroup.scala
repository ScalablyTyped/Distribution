package typings.awsSdk.wafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroup extends StObject {
  
  /**
    * A friendly name or description for the metrics for this RuleGroup. The name can contain only alphanumeric characters (A-Z, a-z, 0-9), with maximum length 128 and minimum length one. It can't contain whitespace or metric names reserved for AWS WAF, including "All" and "Default_Action." You can't change the name of the metric after you create the RuleGroup.
    */
  var MetricName: js.UndefOr[typings.awsSdk.wafregionalMod.MetricName] = js.undefined
  
  /**
    * The friendly name or description for the RuleGroup. You can't change the name of a RuleGroup after you create it.
    */
  var Name: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * A unique identifier for a RuleGroup. You use RuleGroupId to get more information about a RuleGroup (see GetRuleGroup), update a RuleGroup (see UpdateRuleGroup), insert a RuleGroup into a WebACL or delete a one from a WebACL (see UpdateWebACL), or delete a RuleGroup from AWS WAF (see DeleteRuleGroup).  RuleGroupId is returned by CreateRuleGroup and by ListRuleGroups.
    */
  var RuleGroupId: ResourceId
}
object RuleGroup {
  
  @scala.inline
  def apply(RuleGroupId: ResourceId): RuleGroup = {
    val __obj = js.Dynamic.literal(RuleGroupId = RuleGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroup]
  }
  
  @scala.inline
  implicit class RuleGroupMutableBuilder[Self <: RuleGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetricName(value: MetricName): Self = StObject.set(x, "MetricName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricNameUndefined: Self = StObject.set(x, "MetricName", js.undefined)
    
    @scala.inline
    def setName(value: ResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setRuleGroupId(value: ResourceId): Self = StObject.set(x, "RuleGroupId", value.asInstanceOf[js.Any])
  }
}
