package typings.awsSdk.mediastoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(ContainerLevelMetrics: ContainerLevelMetrics, MetricPolicyRules: MetricPolicyRules = null): MetricPolicy = {
    val __obj = js.Dynamic.literal(ContainerLevelMetrics = ContainerLevelMetrics.asInstanceOf[js.Any])
    if (MetricPolicyRules != null) __obj.updateDynamic("MetricPolicyRules")(MetricPolicyRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricPolicy]
  }
}

