package typings.colorRgba.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RGBKeyedColor extends _ColorValue {
  var blue: Double
  var green: Double
  var red: Double
}

object RGBKeyedColor {
  @scala.inline
  def apply(blue: Double, green: Double, red: Double): RGBKeyedColor = {
    val __obj = js.Dynamic.literal(blue = blue.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any])
    __obj.asInstanceOf[RGBKeyedColor]
  }
}

