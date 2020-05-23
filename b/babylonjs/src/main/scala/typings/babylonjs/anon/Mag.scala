package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mag extends js.Object {
  var mag: Double
  var min: Double
}

object Mag {
  @scala.inline
  def apply(mag: Double, min: Double): Mag = {
    val __obj = js.Dynamic.literal(mag = mag.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mag]
  }
}

