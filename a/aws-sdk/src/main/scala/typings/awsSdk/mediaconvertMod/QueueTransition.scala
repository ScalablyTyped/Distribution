package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueueTransition extends js.Object {
  /**
    * The queue that the job was on after the transition.
    */
  var DestinationQueue: js.UndefOr[string] = js.native
  /**
    * The queue that the job was on before the transition.
    */
  var SourceQueue: js.UndefOr[string] = js.native
  /**
    * The time, in Unix epoch format, that the job moved from the source queue to the destination queue.
    */
  var Timestamp: js.UndefOr[timestampUnix] = js.native
}

object QueueTransition {
  @scala.inline
  def apply(DestinationQueue: string = null, SourceQueue: string = null, Timestamp: timestampUnix = null): QueueTransition = {
    val __obj = js.Dynamic.literal()
    if (DestinationQueue != null) __obj.updateDynamic("DestinationQueue")(DestinationQueue.asInstanceOf[js.Any])
    if (SourceQueue != null) __obj.updateDynamic("SourceQueue")(SourceQueue.asInstanceOf[js.Any])
    if (Timestamp != null) __obj.updateDynamic("Timestamp")(Timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueTransition]
  }
}

