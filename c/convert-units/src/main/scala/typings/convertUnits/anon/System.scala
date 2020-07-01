package typings.convertUnits.anon

import typings.convertUnits.mod.measure
import typings.convertUnits.mod.system
import typings.convertUnits.mod.unit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait System extends js.Object {
  var abbr: unit
  var measure: typings.convertUnits.mod.measure
  var plural: String
  var singular: String
  var system: typings.convertUnits.mod.system
}

object System {
  @scala.inline
  def apply(abbr: unit, measure: measure, plural: String, singular: String, system: system): System = {
    val __obj = js.Dynamic.literal(abbr = abbr.asInstanceOf[js.Any], measure = measure.asInstanceOf[js.Any], plural = plural.asInstanceOf[js.Any], singular = singular.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any])
    __obj.asInstanceOf[System]
  }
}

