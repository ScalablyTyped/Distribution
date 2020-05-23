package typings.cassandraDriver.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Frozen extends js.Object {
  var frozen: Boolean
  var reversed: Boolean
}

object Frozen {
  @scala.inline
  def apply(frozen: Boolean, reversed: Boolean): Frozen = {
    val __obj = js.Dynamic.literal(frozen = frozen.asInstanceOf[js.Any], reversed = reversed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Frozen]
  }
}

