package typings.convertUnits

import typings.convertUnits.mod.measure
import typings.convertUnits.mod.system
import typings.convertUnits.mod.unit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAbbrMeasure[T /* <: unit */] extends js.Object {
  var abbr: T
  var measure: typings.convertUnits.mod.measure
  var plural: String
  var singular: String
  var system: typings.convertUnits.mod.system
}

object AnonAbbrMeasure {
  @scala.inline
  def apply[T /* <: unit */](abbr: T, measure: measure, plural: String, singular: String, system: system): AnonAbbrMeasure[T] = {
    val __obj = js.Dynamic.literal(abbr = abbr.asInstanceOf[js.Any], measure = measure.asInstanceOf[js.Any], plural = plural.asInstanceOf[js.Any], singular = singular.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAbbrMeasure[T]]
  }
}

