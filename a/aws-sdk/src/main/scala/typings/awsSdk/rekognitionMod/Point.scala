package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Point extends js.Object {
  /**
    * The value of the X coordinate for a point on a Polygon.
    */
  var X: js.UndefOr[Float] = js.native
  /**
    * The value of the Y coordinate for a point on a Polygon.
    */
  var Y: js.UndefOr[Float] = js.native
}

object Point {
  @scala.inline
  def apply(X: js.UndefOr[Float] = js.undefined, Y: js.UndefOr[Float] = js.undefined): Point = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(X)) __obj.updateDynamic("X")(X.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Y)) __obj.updateDynamic("Y")(Y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Point]
  }
}

