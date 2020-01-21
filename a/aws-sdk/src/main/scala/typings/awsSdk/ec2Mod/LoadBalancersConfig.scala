package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadBalancersConfig extends js.Object {
  /**
    * The Classic Load Balancers.
    */
  var ClassicLoadBalancersConfig: js.UndefOr[typings.awsSdk.ec2Mod.ClassicLoadBalancersConfig] = js.native
  /**
    * The target groups.
    */
  var TargetGroupsConfig: js.UndefOr[typings.awsSdk.ec2Mod.TargetGroupsConfig] = js.native
}

object LoadBalancersConfig {
  @scala.inline
  def apply(
    ClassicLoadBalancersConfig: ClassicLoadBalancersConfig = null,
    TargetGroupsConfig: TargetGroupsConfig = null
  ): LoadBalancersConfig = {
    val __obj = js.Dynamic.literal()
    if (ClassicLoadBalancersConfig != null) __obj.updateDynamic("ClassicLoadBalancersConfig")(ClassicLoadBalancersConfig.asInstanceOf[js.Any])
    if (TargetGroupsConfig != null) __obj.updateDynamic("TargetGroupsConfig")(TargetGroupsConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadBalancersConfig]
  }
}

