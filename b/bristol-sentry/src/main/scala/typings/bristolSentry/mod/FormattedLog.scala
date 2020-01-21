package typings.bristolSentry.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormattedLog extends js.Object {
  var error: js.UndefOr[Error] = js.undefined
  var extra: js.Array[js.Object]
  var message: String
}

object FormattedLog {
  @scala.inline
  def apply(extra: js.Array[js.Object], message: String, error: Error = null): FormattedLog = {
    val __obj = js.Dynamic.literal(extra = extra.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormattedLog]
  }
}

