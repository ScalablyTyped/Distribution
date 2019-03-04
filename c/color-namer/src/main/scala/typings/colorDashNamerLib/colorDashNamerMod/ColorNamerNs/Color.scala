package typings
package colorDashNamerLib.colorDashNamerMod.ColorNamerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Color extends js.Object {
  var distance: scala.Double
  var hex: java.lang.String
  var name: java.lang.String
}

object Color {
  @scala.inline
  def apply(distance: scala.Double, hex: java.lang.String, name: java.lang.String): Color = {
    val __obj = js.Dynamic.literal(distance = distance, hex = hex, name = name)
  
    __obj.asInstanceOf[Color]
  }
}

