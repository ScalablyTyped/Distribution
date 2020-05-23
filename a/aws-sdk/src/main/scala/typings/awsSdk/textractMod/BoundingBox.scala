package typings.awsSdk.textractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BoundingBox extends js.Object {
  /**
    * The height of the bounding box as a ratio of the overall document page height.
    */
  var Height: js.UndefOr[Float] = js.native
  /**
    * The left coordinate of the bounding box as a ratio of overall document page width.
    */
  var Left: js.UndefOr[Float] = js.native
  /**
    * The top coordinate of the bounding box as a ratio of overall document page height.
    */
  var Top: js.UndefOr[Float] = js.native
  /**
    * The width of the bounding box as a ratio of the overall document page width.
    */
  var Width: js.UndefOr[Float] = js.native
}

object BoundingBox {
  @scala.inline
  def apply(
    Height: js.UndefOr[Float] = js.undefined,
    Left: js.UndefOr[Float] = js.undefined,
    Top: js.UndefOr[Float] = js.undefined,
    Width: js.UndefOr[Float] = js.undefined
  ): BoundingBox = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Height)) __obj.updateDynamic("Height")(Height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Left)) __obj.updateDynamic("Left")(Left.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Top)) __obj.updateDynamic("Top")(Top.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Width)) __obj.updateDynamic("Width")(Width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoundingBox]
  }
}

