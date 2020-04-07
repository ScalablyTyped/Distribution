package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMag extends js.Object {
  var mag: Double
  var min: Double
}

object AnonMag {
  @scala.inline
  def apply(mag: Double, min: Double): AnonMag = {
    val __obj = js.Dynamic.literal(mag = mag.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMag]
  }
}

