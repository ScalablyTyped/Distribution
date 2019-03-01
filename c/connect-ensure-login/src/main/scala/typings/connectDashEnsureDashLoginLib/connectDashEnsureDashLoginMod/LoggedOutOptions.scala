package typings
package connectDashEnsureDashLoginLib.connectDashEnsureDashLoginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoggedOutOptions extends js.Object {
  /**
    * URL to redirect to in logged in, defaults to _/_
    */
  var redirectTo: js.UndefOr[java.lang.String] = js.undefined
}

object LoggedOutOptions {
  @scala.inline
  def apply(redirectTo: java.lang.String = null): LoggedOutOptions = {
    val __obj = js.Dynamic.literal()
    if (redirectTo != null) __obj.updateDynamic("redirectTo")(redirectTo)
    __obj.asInstanceOf[LoggedOutOptions]
  }
}

