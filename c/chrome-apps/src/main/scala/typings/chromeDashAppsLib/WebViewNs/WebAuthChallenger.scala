package typings
package chromeDashAppsLib.WebViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebAuthChallenger extends js.Object {
  var host: java.lang.String
  var port: chromeDashAppsLib.chromeNs.integer
}

object WebAuthChallenger {
  @scala.inline
  def apply(host: java.lang.String, port: chromeDashAppsLib.chromeNs.integer): WebAuthChallenger = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("host")(host)
    __obj.updateDynamic("port")(port)
    __obj.asInstanceOf[WebAuthChallenger]
  }
}

