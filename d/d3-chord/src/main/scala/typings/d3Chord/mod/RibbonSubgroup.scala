package typings.d3Chord.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RibbonSubgroup extends js.Object {
  /**
    * End angle of the ribbon subgroup in radians
    */
  var endAngle: Double = js.native
  /**
    * Radius of the ribbon subgroup
    */
  var radius: Double = js.native
  /**
    * Start angle of the ribbon subgroup in radians
    */
  var startAngle: Double = js.native
}

object RibbonSubgroup {
  @scala.inline
  def apply(endAngle: Double, radius: Double, startAngle: Double): RibbonSubgroup = {
    val __obj = js.Dynamic.literal(endAngle = endAngle.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any])
    __obj.asInstanceOf[RibbonSubgroup]
  }
  @scala.inline
  implicit class RibbonSubgroupOps[Self <: RibbonSubgroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEndAngle(value: Double): Self = this.set("endAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartAngle(value: Double): Self = this.set("startAngle", value.asInstanceOf[js.Any])
  }
  
}

