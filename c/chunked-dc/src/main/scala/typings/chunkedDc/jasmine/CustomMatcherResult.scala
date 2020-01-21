package typings.chunkedDc.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomMatcherResult extends js.Object {
  var message: js.UndefOr[String] = js.undefined
  var pass: Boolean
}

object CustomMatcherResult {
  @scala.inline
  def apply(pass: Boolean, message: String = null): CustomMatcherResult = {
    val __obj = js.Dynamic.literal(pass = pass.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomMatcherResult]
  }
}

