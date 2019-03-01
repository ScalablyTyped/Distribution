package typings
package chromeLib.chromeNs.declarativeWebRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RedirectRequest extends js.Object {
  var redirectUrl: java.lang.String
}

object RedirectRequest {
  @scala.inline
  def apply(redirectUrl: java.lang.String): RedirectRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("redirectUrl")(redirectUrl)
    __obj.asInstanceOf[RedirectRequest]
  }
}

