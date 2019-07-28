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
    val __obj = js.Dynamic.literal(distance = distance, hex = hex, name = name)
  
    __obj.asInstanceOf[Color]
  }
}

