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
  def apply(Priority: Int | Double = null, Queue: string = null, WaitMinutes: Int | Double = null): HopDestination = {
    val __obj = js.Dynamic.literal()
    if (Priority != null) __obj.updateDynamic("Priority")(Priority.asInstanceOf[js.Any])
    if (Queue != null) __obj.updateDynamic("Queue")(Queue.asInstanceOf[js.Any])
    if (WaitMinutes != null) __obj.updateDynamic("WaitMinutes")(WaitMinutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[HopDestination]
  }
}

