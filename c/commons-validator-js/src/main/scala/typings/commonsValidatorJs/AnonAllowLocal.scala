package typings.commonsValidatorJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAllowLocal extends js.Object {
  var allowLocal: Boolean
  var allowTld: Boolean
}

object AnonAllowLocal {
  @scala.inline
  def apply(allowLocal: Boolean, allowTld: Boolean): AnonAllowLocal = {
    val __obj = js.Dynamic.literal(allowLocal = allowLocal.asInstanceOf[js.Any], allowTld = allowTld.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAllowLocal]
  }
}

