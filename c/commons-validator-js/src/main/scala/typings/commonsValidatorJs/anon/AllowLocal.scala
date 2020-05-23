package typings.commonsValidatorJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllowLocal extends js.Object {
  var allowLocal: Boolean
  var allowTld: Boolean
}

object AllowLocal {
  @scala.inline
  def apply(allowLocal: Boolean, allowTld: Boolean): AllowLocal = {
    val __obj = js.Dynamic.literal(allowLocal = allowLocal.asInstanceOf[js.Any], allowTld = allowTld.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowLocal]
  }
}

