package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputClipping extends js.Object {
  /**
    * Set End timecode (EndTimecode) to the end of the portion of the input you are clipping. The frame corresponding to the End timecode value is included in the clip. Start timecode or End timecode may be left blank, but not both. Use the format HH:MM:SS:FF or HH:MM:SS;FF, where HH is the hour, MM is the minute, SS is the second, and FF is the frame number. When choosing this value, take into account your setting for timecode source under input settings (InputTimecodeSource). For example, if you have embedded timecodes that start at 01:00:00:00 and you want your clip to end six minutes into the video, use 01:06:00:00.
    */
  var EndTimecode: js.UndefOr[stringPattern010920405090509092] = js.native
  /**
    * Set Start timecode (StartTimecode) to the beginning of the portion of the input you are clipping. The frame corresponding to the Start timecode value is included in the clip. Start timecode or End timecode may be left blank, but not both. Use the format HH:MM:SS:FF or HH:MM:SS;FF, where HH is the hour, MM is the minute, SS is the second, and FF is the frame number. When choosing this value, take into account your setting for Input timecode source. For example, if you have embedded timecodes that start at 01:00:00:00 and you want your clip to begin five minutes into the video, use 01:05:00:00.
    */
  var StartTimecode: js.UndefOr[stringPattern010920405090509092] = js.native
}

object InputClipping {
  @scala.inline
  def apply(): InputClipping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputClipping]
  }
  @scala.inline
  implicit class InputClippingOps[Self <: InputClipping] (val x: Self) extends AnyVal {
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
    def setEndTimecode(value: stringPattern010920405090509092): Self = this.set("EndTimecode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTimecode: Self = this.set("EndTimecode", js.undefined)
    @scala.inline
    def setStartTimecode(value: stringPattern010920405090509092): Self = this.set("StartTimecode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTimecode: Self = this.set("StartTimecode", js.undefined)
  }
  
}

