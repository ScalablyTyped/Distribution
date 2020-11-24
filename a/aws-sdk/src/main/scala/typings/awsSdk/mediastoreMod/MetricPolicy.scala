package typings.awsSdk.mediastoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetricPolicy extends js.Object {
  
  /**
    * A setting to enable or disable metrics at the container level.
    */
  var ContainerLevelMetrics: typings.awsSdk.mediastoreMod.ContainerLevelMetrics = js.native
  
  /**
    * A parameter that holds an array of rules that enable metrics at the object level. This parameter is optional, but if you choose to include it, you must also include at least one rule. By default, you can include up to five rules. You can also request a quota increase to allow up to 300 rules per policy.
    */
  var MetricPolicyRules: js.UndefOr[typings.awsSdk.mediastoreMod.MetricPolicyRules] = js.native
}
object MetricPolicy {
  
  @scala.inline
  def apply(ContainerLevelMetrics: ContainerLevelMetrics): MetricPolicy = {
    val __obj = js.Dynamic.literal(ContainerLevelMetrics = ContainerLevelMetrics.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricPolicy]
  }
  
  @scala.inline
  implicit class MetricPolicyOps[Self <: MetricPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContainerLevelMetrics(value: ContainerLevelMetrics): Self = this.set("ContainerLevelMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricPolicyRulesVarargs(value: MetricPolicyRule*): Self = this.set("MetricPolicyRules", js.Array(value :_*))
    
    @scala.inline
    def setMetricPolicyRules(value: MetricPolicyRules): Self = this.set("MetricPolicyRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetricPolicyRules: Self = this.set("MetricPolicyRules", js.undefined)
  }
}
