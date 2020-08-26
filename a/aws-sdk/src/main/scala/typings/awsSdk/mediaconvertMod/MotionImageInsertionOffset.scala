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
  def apply(): MotionImageInsertionOffset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MotionImageInsertionOffset]
  }
  @scala.inline
  implicit class MotionImageInsertionOffsetOps[Self <: MotionImageInsertionOffset] (val x: Self) extends AnyVal {
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
    def setImageX(value: integerMin0Max2147483647): Self = this.set("ImageX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageX: Self = this.set("ImageX", js.undefined)
    @scala.inline
    def setImageY(value: integerMin0Max2147483647): Self = this.set("ImageY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageY: Self = this.set("ImageY", js.undefined)
  }
  
}

