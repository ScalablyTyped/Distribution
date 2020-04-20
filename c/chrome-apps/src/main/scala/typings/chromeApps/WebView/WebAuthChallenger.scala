package typings.chromeApps.WebView

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebAuthChallenger extends js.Object {
  var host: String
  var port: integer
}

object WebAuthChallenger {
  @scala.inline
  def apply(host: String, port: integer): WebAuthChallenger = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAuthChallenger]
  }
}

