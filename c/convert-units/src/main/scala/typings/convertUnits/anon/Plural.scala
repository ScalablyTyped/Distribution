package typings.convertUnits.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plural extends js.Object {
  var plural: String
  var singular: String
  var unit: String
  var `val`: Double
}

object Plural {
  @scala.inline
  def apply(plural: String, singular: String, unit: String, `val`: Double): Plural = {
    val __obj = js.Dynamic.literal(plural = plural.asInstanceOf[js.Any], singular = singular.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Plural]
  }
}

