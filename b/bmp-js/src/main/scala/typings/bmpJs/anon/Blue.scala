package typings.bmpJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Blue extends js.Object {
  var blue: Double
  var green: Double
  var quad: Double
  var red: Double
}

object Blue {
  @scala.inline
  def apply(blue: Double, green: Double, quad: Double, red: Double): Blue = {
    val __obj = js.Dynamic.literal(blue = blue.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], quad = quad.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any])
    __obj.asInstanceOf[Blue]
  }
}

