package typings.cassandraDriver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonType extends js.Object {
  var name: String
  var `type`: AnonCode
}

object AnonType {
  @scala.inline
  def apply(name: String, `type`: AnonCode): AnonType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonType]
  }
}

