package typings.browserfs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MAXLENGTH extends js.Object {
  var MAX_LENGTH: Double
  var MAX_STRING_LENGTH: Double
}

object MAXLENGTH {
  @scala.inline
  def apply(MAX_LENGTH: Double, MAX_STRING_LENGTH: Double): MAXLENGTH = {
    val __obj = js.Dynamic.literal(MAX_LENGTH = MAX_LENGTH.asInstanceOf[js.Any], MAX_STRING_LENGTH = MAX_STRING_LENGTH.asInstanceOf[js.Any])
    __obj.asInstanceOf[MAXLENGTH]
  }
}

