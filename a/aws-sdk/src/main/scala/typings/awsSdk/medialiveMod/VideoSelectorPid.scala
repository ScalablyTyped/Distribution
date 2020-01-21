package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoSelectorPid extends js.Object {
  /**
    * Selects a specific PID from within a video source.
    */
  var Pid: js.UndefOr[integerMin0Max8191] = js.native
}

object VideoSelectorPid {
  @scala.inline
  def apply(Pid: Int | Double = null): VideoSelectorPid = {
    val __obj = js.Dynamic.literal()
    if (Pid != null) __obj.updateDynamic("Pid")(Pid.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoSelectorPid]
  }
}

