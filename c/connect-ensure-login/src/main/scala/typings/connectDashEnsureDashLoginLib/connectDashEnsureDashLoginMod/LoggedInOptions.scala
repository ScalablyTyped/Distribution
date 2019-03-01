package typings
package connectDashEnsureDashLoginLib.connectDashEnsureDashLoginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoggedInOptions extends js.Object {
  /**
    * URL to redirect to for login, defaults to _/login_
    */
  var redirectTo: js.UndefOr[java.lang.String] = js.undefined
  /**
    * set redirectTo in session, defaults to _true_
    */
  var setRedirectTo: js.UndefOr[scala.Boolean] = js.undefined
}

object LoggedInOptions {
  @scala.inline
  def apply(redirectTo: java.lang.String = null, setRedirectTo: js.UndefOr[scala.Boolean] = js.undefined): LoggedInOptions = {
    val __obj = js.Dynamic.literal()
    if (redirectTo != null) __obj.updateDynamic("redirectTo")(redirectTo)
    if (!js.isUndefined(setRedirectTo)) __obj.updateDynamic("setRedirectTo")(setRedirectTo)
    __obj.asInstanceOf[LoggedInOptions]
  }
}

