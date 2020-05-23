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
  def apply(
    Height: js.UndefOr[integerMin2Max2147483647] = js.undefined,
    Width: js.UndefOr[integerMin2Max2147483647] = js.undefined,
    X: js.UndefOr[integerMin0Max2147483647] = js.undefined,
    Y: js.UndefOr[integerMin0Max2147483647] = js.undefined
  ): Rectangle = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Height)) __obj.updateDynamic("Height")(Height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Width)) __obj.updateDynamic("Width")(Width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(X)) __obj.updateDynamic("X")(X.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Y)) __obj.updateDynamic("Y")(Y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rectangle]
  }
}

