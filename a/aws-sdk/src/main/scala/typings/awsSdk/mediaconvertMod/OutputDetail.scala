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
  def apply(DurationInMs: js.UndefOr[integer] = js.undefined, VideoDetails: VideoDetail = null): OutputDetail = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DurationInMs)) __obj.updateDynamic("DurationInMs")(DurationInMs.get.asInstanceOf[js.Any])
    if (VideoDetails != null) __obj.updateDynamic("VideoDetails")(VideoDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputDetail]
  }
}

