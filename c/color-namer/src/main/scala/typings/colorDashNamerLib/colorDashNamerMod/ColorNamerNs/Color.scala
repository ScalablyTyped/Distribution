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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("distance")(distance)
    __obj.updateDynamic("hex")(hex)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Color]
  }
}

