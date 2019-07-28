package typings.chrome.chromeNs.webRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebAuthChallenger extends js.Object {
  var host: String
  var port: Double
}

object WebAuthChallenger {
  @scala.inline
  def apply(host: String, port: Double): WebAuthChallenger = {
    val __obj = js.Dynamic.literal(host = host, port = port)
  
    __obj.asInstanceOf[WebAuthChallenger]
  }
}

