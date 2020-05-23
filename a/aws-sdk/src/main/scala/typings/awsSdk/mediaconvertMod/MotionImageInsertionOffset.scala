package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MotionImageInsertionOffset extends js.Object {
  /**
    * Set the distance, in pixels, between the overlay and the left edge of the video frame.
    */
  var ImageX: js.UndefOr[integerMin0Max2147483647] = js.native
  /**
    * Set the distance, in pixels, between the overlay and the top edge of the video frame.
    */
  var ImageY: js.UndefOr[integerMin0Max2147483647] = js.native
}

object MotionImageInsertionOffset {
  @scala.inline
  def apply(
    ImageX: js.UndefOr[integerMin0Max2147483647] = js.undefined,
    ImageY: js.UndefOr[integerMin0Max2147483647] = js.undefined
  ): MotionImageInsertionOffset = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ImageX)) __obj.updateDynamic("ImageX")(ImageX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ImageY)) __obj.updateDynamic("ImageY")(ImageY.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MotionImageInsertionOffset]
  }
}

