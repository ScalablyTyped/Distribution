package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rectangle extends js.Object {
  /**
    * Height of rectangle in pixels. Specify only even numbers.
    */
  var Height: js.UndefOr[integerMin2Max2147483647] = js.native
  /**
    * Width of rectangle in pixels. Specify only even numbers.
    */
  var Width: js.UndefOr[integerMin2Max2147483647] = js.native
  /**
    * The distance, in pixels, between the rectangle and the left edge of the video frame. Specify only even numbers.
    */
  var X: js.UndefOr[integerMin0Max2147483647] = js.native
  /**
    * The distance, in pixels, between the rectangle and the top edge of the video frame. Specify only even numbers.
    */
  var Y: js.UndefOr[integerMin0Max2147483647] = js.native
}

object Rectangle {
  @scala.inline
  def apply(): Rectangle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Rectangle]
  }
  @scala.inline
  implicit class RectangleOps[Self <: Rectangle] (val x: Self) extends AnyVal {
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
    def setHeight(value: integerMin2Max2147483647): Self = this.set("Height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("Height", js.undefined)
    @scala.inline
    def setWidth(value: integerMin2Max2147483647): Self = this.set("Width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("Width", js.undefined)
    @scala.inline
    def setX(value: integerMin0Max2147483647): Self = this.set("X", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("X", js.undefined)
    @scala.inline
    def setY(value: integerMin0Max2147483647): Self = this.set("Y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("Y", js.undefined)
  }
  
}

