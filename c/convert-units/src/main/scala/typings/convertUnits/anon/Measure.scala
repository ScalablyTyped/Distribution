package typings.convertUnits.anon

import typings.convertUnits.mod.measure
import typings.convertUnits.mod.system
import typings.convertUnits.mod.unit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Measure[T /* <: unit */] extends js.Object {
  var abbr: T = js.native
  var measure: typings.convertUnits.mod.measure = js.native
  var plural: String = js.native
  var singular: String = js.native
  var system: typings.convertUnits.mod.system = js.native
}

object Measure {
  @scala.inline
  def apply[/* <: typings.convertUnits.mod.unit */ T](abbr: T, measure: measure, plural: String, singular: String, system: system): Measure[T] = {
    val __obj = js.Dynamic.literal(abbr = abbr.asInstanceOf[js.Any], measure = measure.asInstanceOf[js.Any], plural = plural.asInstanceOf[js.Any], singular = singular.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any])
    __obj.asInstanceOf[Measure[T]]
  }
  @scala.inline
  implicit class MeasureOps[Self <: Measure[_], /* <: typings.convertUnits.mod.unit */ T] (val x: Self with Measure[T]) extends AnyVal {
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
    def setAbbr(value: T): Self = this.set("abbr", value.asInstanceOf[js.Any])
    @scala.inline
    def setMeasure(value: measure): Self = this.set("measure", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlural(value: String): Self = this.set("plural", value.asInstanceOf[js.Any])
    @scala.inline
    def setSingular(value: String): Self = this.set("singular", value.asInstanceOf[js.Any])
    @scala.inline
    def setSystem(value: system): Self = this.set("system", value.asInstanceOf[js.Any])
  }
  
}

