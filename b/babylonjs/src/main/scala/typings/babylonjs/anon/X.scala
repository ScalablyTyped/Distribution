package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait X extends js.Object {
  var X: Double
  var Y: Double
  var Z: Double
  var max: Double
}

object X {
  @scala.inline
  def apply(X: Double, Y: Double, Z: Double, max: Double): X = {
    val __obj = js.Dynamic.literal(X = X.asInstanceOf[js.Any], Y = Y.asInstanceOf[js.Any], Z = Z.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any])
    __obj.asInstanceOf[X]
  }
}

