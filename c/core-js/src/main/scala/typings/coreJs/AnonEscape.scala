package typings.coreJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEscape extends js.Object {
  def escape(str: java.lang.String): java.lang.String
}

object AnonEscape {
  @scala.inline
  def apply(escape: java.lang.String => java.lang.String): AnonEscape = {
    val __obj = js.Dynamic.literal(escape = js.Any.fromFunction1(escape))
    __obj.asInstanceOf[AnonEscape]
  }
}

