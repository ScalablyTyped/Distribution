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
    val __obj = js.Dynamic.literal(endAngle = endAngle, radius = radius, startAngle = startAngle)
  
    __obj.asInstanceOf[RibbonSubgroup]
  }
}

