package typings.convertUnits

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPluralSingular extends js.Object {
  var plural: String
  var singular: String
}

object AnonPluralSingular {
  @scala.inline
  def apply(plural: String, singular: String): AnonPluralSingular = {
    val __obj = js.Dynamic.literal(plural = plural.asInstanceOf[js.Any], singular = singular.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPluralSingular]
  }
}

