package typings.cassandraDriver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFrozen extends js.Object {
  var frozen: Boolean
  var reversed: Boolean
}

object AnonFrozen {
  @scala.inline
  def apply(frozen: Boolean, reversed: Boolean): AnonFrozen = {
    val __obj = js.Dynamic.literal(frozen = frozen.asInstanceOf[js.Any], reversed = reversed.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFrozen]
  }
}

