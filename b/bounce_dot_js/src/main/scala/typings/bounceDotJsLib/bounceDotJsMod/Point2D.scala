package typings
package bounceDotJsLib.bounceDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Point2D extends js.Object {
  var x: scala.Double
  var y: scala.Double
}

object Point2D {
  @scala.inline
  def apply(x: scala.Double, y: scala.Double): Point2D = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[Point2D]
  }
}

