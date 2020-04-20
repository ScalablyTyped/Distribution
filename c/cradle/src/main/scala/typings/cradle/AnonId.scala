package typings.cradle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonId extends js.Object {
  var id: String
  var rev: String
}

object AnonId {
  @scala.inline
  def apply(id: String, rev: String): AnonId = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], rev = rev.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonId]
  }
}

