package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Min extends js.Object {
  var max: Double
  var min: Double
}

object Min {
  @scala.inline
  def apply(max: Double, min: Double): Min = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[Min]
  }
}

