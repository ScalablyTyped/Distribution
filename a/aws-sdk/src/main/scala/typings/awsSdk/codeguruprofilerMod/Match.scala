package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Match extends js.Object {
  /**
    * The location in the profiling graph that contains a recommendation found during analysis.
    */
  var frameAddress: js.UndefOr[String] = js.native
  /**
    * The target frame that triggered a match.
    */
  var targetFramesIndex: js.UndefOr[Integer] = js.native
  /**
    * The value in the profile data that exceeded the recommendation threshold.
    */
  var thresholdBreachValue: js.UndefOr[Double] = js.native
}

object Match {
  @scala.inline
  def apply(
    frameAddress: String = null,
    targetFramesIndex: js.UndefOr[Integer] = js.undefined,
    thresholdBreachValue: js.UndefOr[Double] = js.undefined
  ): Match = {
    val __obj = js.Dynamic.literal()
    if (frameAddress != null) __obj.updateDynamic("frameAddress")(frameAddress.asInstanceOf[js.Any])
    if (!js.isUndefined(targetFramesIndex)) __obj.updateDynamic("targetFramesIndex")(targetFramesIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(thresholdBreachValue)) __obj.updateDynamic("thresholdBreachValue")(thresholdBreachValue.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Match]
  }
}

