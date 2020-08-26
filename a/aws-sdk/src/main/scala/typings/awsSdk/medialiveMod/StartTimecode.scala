package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartTimecode extends js.Object {
  /**
    * The timecode for the frame where you want to start the clip. Optional; if not specified, the clip starts at first frame in the file. Enter the timecode as HH:MM:SS:FF or HH:MM:SS;FF.
    */
  var Timecode: js.UndefOr[string] = js.native
}

object StartTimecode {
  @scala.inline
  def apply(): StartTimecode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartTimecode]
  }
  @scala.inline
  implicit class StartTimecodeOps[Self <: StartTimecode] (val x: Self) extends AnyVal {
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
    def setTimecode(value: string): Self = this.set("Timecode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimecode: Self = this.set("Timecode", js.undefined)
  }
  
}

