package typings.convertUnits.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Singular extends js.Object {
  var plural: String
  var singular: String
}

object Singular {
  @scala.inline
  def apply(plural: String, singular: String): Singular = {
    val __obj = js.Dynamic.literal(plural = plural.asInstanceOf[js.Any], singular = singular.asInstanceOf[js.Any])
    __obj.asInstanceOf[Singular]
  }
}

