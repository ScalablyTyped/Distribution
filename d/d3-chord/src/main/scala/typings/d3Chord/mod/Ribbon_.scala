package typings.d3Chord.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ribbon_ extends js.Object {
  /**
    * Ribbon subgroup constituting the source of the Ribbon
    */
  var source: RibbonSubgroup = js.native
  /**
    * Ribbon subgroup constituting the target of the Ribbon
    */
  var target: RibbonSubgroup = js.native
}

object Ribbon_ {
  @scala.inline
  def apply(source: RibbonSubgroup, target: RibbonSubgroup): Ribbon_ = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ribbon_]
  }
  @scala.inline
  implicit class Ribbon_Ops[Self <: Ribbon_] (val x: Self) extends AnyVal {
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
    def setSource(value: RibbonSubgroup): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: RibbonSubgroup): Self = this.set("target", value.asInstanceOf[js.Any])
  }
  
}

