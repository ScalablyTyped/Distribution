package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadBasedAutoScalingConfiguration extends js.Object {
  /**
    * An AutoScalingThresholds object that describes the downscaling configuration, which defines how and when AWS OpsWorks Stacks reduces the number of instances.
    */
  var DownScaling: js.UndefOr[AutoScalingThresholds] = js.native
  /**
    * Whether load-based auto scaling is enabled for the layer.
    */
  var Enable: js.UndefOr[Boolean] = js.native
  /**
    * The layer ID.
    */
  var LayerId: js.UndefOr[String] = js.native
  /**
    * An AutoScalingThresholds object that describes the upscaling configuration, which defines how and when AWS OpsWorks Stacks increases the number of instances.
    */
  var UpScaling: js.UndefOr[AutoScalingThresholds] = js.native
}

object LoadBasedAutoScalingConfiguration {
  @scala.inline
  def apply(
    DownScaling: AutoScalingThresholds = null,
    Enable: js.UndefOr[Boolean] = js.undefined,
    LayerId: String = null,
    UpScaling: AutoScalingThresholds = null
  ): LoadBasedAutoScalingConfiguration = {
    val __obj = js.Dynamic.literal()
    if (DownScaling != null) __obj.updateDynamic("DownScaling")(DownScaling.asInstanceOf[js.Any])
    if (!js.isUndefined(Enable)) __obj.updateDynamic("Enable")(Enable.get.asInstanceOf[js.Any])
    if (LayerId != null) __obj.updateDynamic("LayerId")(LayerId.asInstanceOf[js.Any])
    if (UpScaling != null) __obj.updateDynamic("UpScaling")(UpScaling.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadBasedAutoScalingConfiguration]
  }
}

