package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLoadBasedAutoScalingResult extends js.Object {
  /**
    * An array of LoadBasedAutoScalingConfiguration objects that describe each layer's configuration.
    */
  var LoadBasedAutoScalingConfigurations: js.UndefOr[typings.awsSdk.opsworksMod.LoadBasedAutoScalingConfigurations] = js.native
}

object DescribeLoadBasedAutoScalingResult {
  @scala.inline
  def apply(LoadBasedAutoScalingConfigurations: LoadBasedAutoScalingConfigurations = null): DescribeLoadBasedAutoScalingResult = {
    val __obj = js.Dynamic.literal()
    if (LoadBasedAutoScalingConfigurations != null) __obj.updateDynamic("LoadBasedAutoScalingConfigurations")(LoadBasedAutoScalingConfigurations.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLoadBasedAutoScalingResult]
  }
}

