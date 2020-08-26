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
  def apply(TimeoutInSeconds: MaxFifteenMinutesInSeconds): CanaryRunConfigInput = {
    val __obj = js.Dynamic.literal(TimeoutInSeconds = TimeoutInSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanaryRunConfigInput]
  }
  @scala.inline
  implicit class CanaryRunConfigInputOps[Self <: CanaryRunConfigInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTimeoutInSeconds(value: MaxFifteenMinutesInSeconds): Self = this.set("TimeoutInSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def setMemoryInMB(value: MaxSize3008): Self = this.set("MemoryInMB", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMemoryInMB: Self = this.set("MemoryInMB", js.undefined)
  }
  
}

