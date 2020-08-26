package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioPidSelection extends js.Object {
  /**
    * Selects a specific PID from within a source.
    */
  var Pid: integerMin0Max8191 = js.native
}

object AudioPidSelection {
  @scala.inline
  def apply(Pid: integerMin0Max8191): AudioPidSelection = {
    val __obj = js.Dynamic.literal(Pid = Pid.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioPidSelection]
  }
  @scala.inline
  implicit class AudioPidSelectionOps[Self <: AudioPidSelection] (val x: Self) extends AnyVal {
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
    def setPid(value: integerMin0Max8191): Self = this.set("Pid", value.asInstanceOf[js.Any])
  }
  
}

