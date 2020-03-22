package typings.convertUnits

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSingular extends js.Object {
  var plural: String
  var singular: String
}

object AnonSingular {
  @scala.inline
  def apply(plural: String, singular: String): AnonSingular = {
    val __obj = js.Dynamic.literal(plural = plural.asInstanceOf[js.Any], singular = singular.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSingular]
  }
}

