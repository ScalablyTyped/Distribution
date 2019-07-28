package typings.d3DashChord.d3DashChordMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RibbonSubgroup extends js.Object {
  /**
    * End angle of the ribbon subgroup in radians
    */
  var endAngle: Double
  /**
    * Radius of the ribbon subgroup
    */
  var radius: Double
  /**
    * Start angle of the ribbon subgroup in radians
    */
  var startAngle: Double
}

object RibbonSubgroup {
  @scala.inline
  def apply(endAngle: Double, radius: Double, startAngle: Double): RibbonSubgroup = {
    val __obj = js.Dynamic.literal(endAngle = endAngle, radius = radius, startAngle = startAngle)
  
    __obj.asInstanceOf[RibbonSubgroup]
  }
}

