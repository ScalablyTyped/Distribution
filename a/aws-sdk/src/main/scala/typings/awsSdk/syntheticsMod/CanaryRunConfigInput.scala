package typings.awsSdk.syntheticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanaryRunConfigInput extends js.Object {
  /**
    * The maximum amount of memory available to the canary while it is running, in MB. The value you specify must be a multiple of 64.
    */
  var MemoryInMB: js.UndefOr[MaxSize3008] = js.native
  /**
    * How long the canary is allowed to run before it must stop. If you omit this field, the frequency of the canary is used as this value, up to a maximum of 14 minutes.
    */
  var TimeoutInSeconds: MaxFifteenMinutesInSeconds = js.native
}

object CanaryRunConfigInput {
  @scala.inline
  def apply(TimeoutInSeconds: MaxFifteenMinutesInSeconds, MemoryInMB: js.UndefOr[MaxSize3008] = js.undefined): CanaryRunConfigInput = {
    val __obj = js.Dynamic.literal(TimeoutInSeconds = TimeoutInSeconds.asInstanceOf[js.Any])
    if (!js.isUndefined(MemoryInMB)) __obj.updateDynamic("MemoryInMB")(MemoryInMB.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanaryRunConfigInput]
  }
}

