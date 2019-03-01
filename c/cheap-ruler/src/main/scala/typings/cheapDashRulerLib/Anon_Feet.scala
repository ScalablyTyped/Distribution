package typings
package cheapDashRulerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Feet extends js.Object {
  var feet: scala.Double
  var inches: scala.Double
  var kilometers: scala.Double
  var meters: scala.Double
  var metres: scala.Double
  var miles: scala.Double
  var nauticalmiles: scala.Double
  var yards: scala.Double
}

object Anon_Feet {
  @scala.inline
  def apply(
    feet: scala.Double,
    inches: scala.Double,
    kilometers: scala.Double,
    meters: scala.Double,
    metres: scala.Double,
    miles: scala.Double,
    nauticalmiles: scala.Double,
    yards: scala.Double
  ): Anon_Feet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("feet")(feet)
    __obj.updateDynamic("inches")(inches)
    __obj.updateDynamic("kilometers")(kilometers)
    __obj.updateDynamic("meters")(meters)
    __obj.updateDynamic("metres")(metres)
    __obj.updateDynamic("miles")(miles)
    __obj.updateDynamic("nauticalmiles")(nauticalmiles)
    __obj.updateDynamic("yards")(yards)
    __obj.asInstanceOf[Anon_Feet]
  }
}

