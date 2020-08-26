package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopTimecode extends js.Object {
  /**
    * If you specify a StopTimecode in an input (in order to clip the file), you can specify if you want the clip to exclude (the default) or include the frame specified by the timecode.
    */
  var LastFrameClippingBehavior: js.UndefOr[typings.awsSdk.medialiveMod.LastFrameClippingBehavior] = js.native
  /**
    * The timecode for the frame where you want to stop the clip. Optional; if not specified, the clip continues to the end of the file. Enter the timecode as HH:MM:SS:FF or HH:MM:SS;FF.
    */
  var Timecode: js.UndefOr[string] = js.native
}

object StopTimecode {
  @scala.inline
  def apply(): StopTimecode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopTimecode]
  }
  @scala.inline
  implicit class StopTimecodeOps[Self <: StopTimecode] (val x: Self) extends AnyVal {
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
    def setLastFrameClippingBehavior(value: LastFrameClippingBehavior): Self = this.set("LastFrameClippingBehavior", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastFrameClippingBehavior: Self = this.set("LastFrameClippingBehavior", js.undefined)
    @scala.inline
    def setTimecode(value: string): Self = this.set("Timecode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimecode: Self = this.set("Timecode", js.undefined)
  }
  
}

