package typings.convertDashUnits

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Plural extends js.Object {
  var plural: String
  var singular: String
  var unit: String
  var `val`: Double
}

object Anon_Plural {
  @scala.inline
  def apply(plural: String, singular: String, unit: String, `val`: Double): Anon_Plural = {
    val __obj = js.Dynamic.literal(plural = plural.asInstanceOf[js.Any], singular = singular.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Plural]
  }
}

