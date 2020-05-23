package typings.backstopjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Blue extends js.Object {
  var blue: Double
  var green: Double
  var red: Double
}

object Blue {
  @scala.inline
  def apply(blue: Double, green: Double, red: Double): Blue = {
    val __obj = js.Dynamic.literal(blue = blue.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any])
    __obj.asInstanceOf[Blue]
  }
}

