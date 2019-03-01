package typings
package cucumberLib.cucumberMod.pickleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cell extends js.Object {
  var location: Location
  var value: java.lang.String
}

object Cell {
  @scala.inline
  def apply(location: Location, value: java.lang.String): Cell = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("location")(location)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Cell]
  }
}

