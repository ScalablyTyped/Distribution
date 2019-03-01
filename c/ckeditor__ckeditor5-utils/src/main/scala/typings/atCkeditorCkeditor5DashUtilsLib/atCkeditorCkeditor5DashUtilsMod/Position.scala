package typings
package atCkeditorCkeditor5DashUtilsLib.atCkeditorCkeditor5DashUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Position extends js.Object {
  var left: scala.Double
  var name: java.lang.String
  var top: scala.Double
}

object Position {
  @scala.inline
  def apply(left: scala.Double, name: java.lang.String, top: scala.Double): Position = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("left")(left)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("top")(top)
    __obj.asInstanceOf[Position]
  }
}

