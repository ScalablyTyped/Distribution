package typings.cassandraDriver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNameType extends js.Object {
  var name: String
  var `type`: AnonCode
}

object AnonNameType {
  @scala.inline
  def apply(name: String, `type`: AnonCode): AnonNameType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNameType]
  }
}

