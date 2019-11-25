package typings.colorDashNamer.colorDashNamerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Color extends js.Object {
  var distance: Double
  var hex: String
  var name: String
}

object Color {
  @scala.inline
  def apply(distance: Double, hex: String, name: String): Color = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], hex = hex.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Color]
  }
}

