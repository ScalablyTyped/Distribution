package typings
package d3DashChordLib.d3DashChordMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RibbonSubgroup extends js.Object {
  /**
    * End angle of the ribbon subgroup in radians
    */
  var endAngle: scala.Double
  /**
    * Radius of the ribbon subgroup
    */
  var radius: scala.Double
  /**
    * Start angle of the ribbon subgroup in radians
    */
  var startAngle: scala.Double
}

object RibbonSubgroup {
  @scala.inline
  def apply(endAngle: scala.Double, radius: scala.Double, startAngle: scala.Double): RibbonSubgroup = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("endAngle")(endAngle)
    __obj.updateDynamic("radius")(radius)
    __obj.updateDynamic("startAngle")(startAngle)
    __obj.asInstanceOf[RibbonSubgroup]
  }
}

