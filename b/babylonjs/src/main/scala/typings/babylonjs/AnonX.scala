package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonX extends js.Object {
  var X: Double
  var Y: Double
  var Z: Double
  var max: Double
}

object AnonX {
  @scala.inline
  def apply(X: Double, Y: Double, Z: Double, max: Double): AnonX = {
    val __obj = js.Dynamic.literal(X = X.asInstanceOf[js.Any], Y = Y.asInstanceOf[js.Any], Z = Z.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonX]
  }
}

