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
  def apply(Pid: js.UndefOr[integerMin0Max8191] = js.undefined): VideoSelectorPid = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Pid)) __obj.updateDynamic("Pid")(Pid.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoSelectorPid]
  }
}

