package typings.awsSdk.mediastoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricPolicy extends StObject {
  
  /**
    * A setting to enable or disable metrics at the container level.
    */
  var ContainerLevelMetrics: typings.awsSdk.mediastoreMod.ContainerLevelMetrics
  
  /**
    * A parameter that holds an array of rules that enable metrics at the object level. This parameter is optional, but if you choose to include it, you must also include at least one rule. By default, you can include up to five rules. You can also request a quota increase to allow up to 300 rules per policy.
    */
  var MetricPolicyRules: js.UndefOr[typings.awsSdk.mediastoreMod.MetricPolicyRules] = js.undefined
}
object MetricPolicy {
  
  @scala.inline
  def apply(ContainerLevelMetrics: ContainerLevelMetrics): MetricPolicy = {
    val __obj = js.Dynamic.literal(ContainerLevelMetrics = ContainerLevelMetrics.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricPolicy]
  }
  
  @scala.inline
  implicit class MetricPolicyMutableBuilder[Self <: MetricPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerLevelMetrics(value: ContainerLevelMetrics): Self = StObject.set(x, "ContainerLevelMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricPolicyRules(value: MetricPolicyRules): Self = StObject.set(x, "MetricPolicyRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricPolicyRulesUndefined: Self = StObject.set(x, "MetricPolicyRules", js.undefined)
    
    @scala.inline
    def setMetricPolicyRulesVarargs(value: MetricPolicyRule*): Self = StObject.set(x, "MetricPolicyRules", js.Array(value :_*))
  }
}
