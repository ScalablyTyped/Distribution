package typings.canAutoplay.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckResponse extends js.Object {
  var error: Error
  var result: Boolean
}

object CheckResponse {
  @scala.inline
  def apply(error: Error, result: Boolean): CheckResponse = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckResponse]
  }
}

