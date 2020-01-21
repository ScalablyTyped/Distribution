package typings.connectEnsureLogin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoggedOutOptions extends js.Object {
  /**
    * URL to redirect to in logged in, defaults to _/_
    */
  var redirectTo: js.UndefOr[String] = js.undefined
}

object LoggedOutOptions {
  @scala.inline
  def apply(redirectTo: String = null): LoggedOutOptions = {
    val __obj = js.Dynamic.literal()
    if (redirectTo != null) __obj.updateDynamic("redirectTo")(redirectTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggedOutOptions]
  }
}

