package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputDetail extends js.Object {
  /**
    * Duration in milliseconds
    */
  var DurationInMs: js.UndefOr[integer] = js.native
  /**
    * Contains details about the output's video stream
    */
  var VideoDetails: js.UndefOr[VideoDetail] = js.native
}

object OutputDetail {
  @scala.inline
  def apply(): OutputDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputDetail]
  }
  @scala.inline
  implicit class OutputDetailOps[Self <: OutputDetail] (val x: Self) extends AnyVal {
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
    def setDurationInMs(value: integer): Self = this.set("DurationInMs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDurationInMs: Self = this.set("DurationInMs", js.undefined)
    @scala.inline
    def setVideoDetails(value: VideoDetail): Self = this.set("VideoDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideoDetails: Self = this.set("VideoDetails", js.undefined)
  }
  
}

