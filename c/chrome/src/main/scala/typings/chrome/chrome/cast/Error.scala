package typings.chrome.chrome.cast

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends js.Object {
  var code: ErrorCode
  var description: js.UndefOr[String] = js.undefined
  var details: js.UndefOr[String] = js.undefined
}

object Error {
  @scala.inline
  def apply(code: ErrorCode, description: String = null, details: String = null): Error = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (details != null) __obj.updateDynamic("details")(details.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
}

