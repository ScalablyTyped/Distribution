package typings.chromeDashApps.WebViewNs

import typings.chromeDashApps.chromeNs.integer
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
    val __obj = js.Dynamic.literal(host = host, port = port)
  
    __obj.asInstanceOf[WebAuthChallenger]
  }
}

