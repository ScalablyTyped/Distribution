package typings.colorHash.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HueObject extends js.Object {
  var max: Double
  var min: Double
}

object HueObject {
  @scala.inline
  def apply(max: Double, min: Double): HueObject = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[HueObject]
  }
}

