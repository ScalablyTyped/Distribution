package typings.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetricsConfiguration extends js.Object {
  /**
    * A Boolean that specifies whether cloud metrics are collected.
    */
  var cloudMetricEnabled: js.UndefOr[Enabled] = js.native
  /**
    * The ARN of the role that is used to collect cloud metrics.
    */
  var metricRuleRoleArn: js.UndefOr[RoleArn] = js.native
}

object MetricsConfiguration {
  @scala.inline
  def apply(cloudMetricEnabled: js.UndefOr[Enabled] = js.undefined, metricRuleRoleArn: RoleArn = null): MetricsConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cloudMetricEnabled)) __obj.updateDynamic("cloudMetricEnabled")(cloudMetricEnabled.get.asInstanceOf[js.Any])
    if (metricRuleRoleArn != null) __obj.updateDynamic("metricRuleRoleArn")(metricRuleRoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricsConfiguration]
  }
}

