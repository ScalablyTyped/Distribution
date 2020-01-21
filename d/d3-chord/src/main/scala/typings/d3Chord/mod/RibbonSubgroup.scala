package typings.d3Chord.mod

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
    val __obj = js.Dynamic.literal(endAngle = endAngle.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RibbonSubgroup]
  }
}

