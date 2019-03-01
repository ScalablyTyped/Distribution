package typings
package chromeDashAppsLib.chromeNs.webViewRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RedirectRequestParams extends js.Object {
  /** Destination to where the request is redirected. */
  var redirectUrl: java.lang.String
}

object RedirectRequestParams {
  @scala.inline
  def apply(redirectUrl: java.lang.String): RedirectRequestParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("redirectUrl")(redirectUrl)
    __obj.asInstanceOf[RedirectRequestParams]
  }
}

