package typings.awsSdk.syntheticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanaryRunConfigOutput extends js.Object {
  /**
    * The maximum amount of memory available to the canary while it is running, in MB. The value you must be a multiple of 64.
    */
  var MemoryInMB: js.UndefOr[MaxSize3008] = js.native
  /**
    * How long the canary is allowed to run before it must stop.
    */
  var TimeoutInSeconds: js.UndefOr[MaxFifteenMinutesInSeconds] = js.native
}

object CanaryRunConfigOutput {
  @scala.inline
  def apply(
    MemoryInMB: js.UndefOr[MaxSize3008] = js.undefined,
    TimeoutInSeconds: js.UndefOr[MaxFifteenMinutesInSeconds] = js.undefined
  ): CanaryRunConfigOutput = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MemoryInMB)) __obj.updateDynamic("MemoryInMB")(MemoryInMB.get.asInstanceOf[js.Any])
    if (!js.isUndefined(TimeoutInSeconds)) __obj.updateDynamic("TimeoutInSeconds")(TimeoutInSeconds.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanaryRunConfigOutput]
  }
}

