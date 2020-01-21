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
  def apply(X: Int | Double = null, Y: Int | Double = null): Point = {
    val __obj = js.Dynamic.literal()
    if (X != null) __obj.updateDynamic("X")(X.asInstanceOf[js.Any])
    if (Y != null) __obj.updateDynamic("Y")(Y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Point]
  }
}

