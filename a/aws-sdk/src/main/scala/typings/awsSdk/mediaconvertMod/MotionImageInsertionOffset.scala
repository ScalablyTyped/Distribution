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
  def apply(ImageX: Int | Double = null, ImageY: Int | Double = null): MotionImageInsertionOffset = {
    val __obj = js.Dynamic.literal()
    if (ImageX != null) __obj.updateDynamic("ImageX")(ImageX.asInstanceOf[js.Any])
    if (ImageY != null) __obj.updateDynamic("ImageY")(ImageY.asInstanceOf[js.Any])
    __obj.asInstanceOf[MotionImageInsertionOffset]
  }
}

