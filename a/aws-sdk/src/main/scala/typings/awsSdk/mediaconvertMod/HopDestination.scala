package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HopDestination extends js.Object {
  /**
    * Optional. When you set up a job to use queue hopping, you can specify a different relative priority for the job in the destination queue. If you don't specify, the relative priority will remain the same as in the previous queue.
    */
  var Priority: js.UndefOr[integerMinNegative50Max50] = js.native
  /**
    * Optional unless the job is submitted on the default queue. When you set up a job to use queue hopping, you can specify a destination queue. This queue cannot be the original queue to which the job is submitted. If the original queue isn't the default queue and you don't specify the destination queue, the job will move to the default queue.
    */
  var Queue: js.UndefOr[string] = js.native
  /**
    * Required for setting up a job to use queue hopping. Minimum wait time in minutes until the job can hop to the destination queue. Valid range is 1 to 1440 minutes, inclusive.
    */
  var WaitMinutes: js.UndefOr[integer] = js.native
}

object HopDestination {
  @scala.inline
  def apply(): HopDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HopDestination]
  }
  @scala.inline
  implicit class HopDestinationOps[Self <: HopDestination] (val x: Self) extends AnyVal {
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
    def setPriority(value: integerMinNegative50Max50): Self = this.set("Priority", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriority: Self = this.set("Priority", js.undefined)
    @scala.inline
    def setQueue(value: string): Self = this.set("Queue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueue: Self = this.set("Queue", js.undefined)
    @scala.inline
    def setWaitMinutes(value: integer): Self = this.set("WaitMinutes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWaitMinutes: Self = this.set("WaitMinutes", js.undefined)
  }
  
}

