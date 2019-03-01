package typings
package chromeLib.chromeNs.webRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebAuthChallenger extends js.Object {
  var host: java.lang.String
  var port: scala.Double
}

object WebAuthChallenger {
  @scala.inline
  def apply(host: java.lang.String, port: scala.Double): WebAuthChallenger = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("host")(host)
    __obj.updateDynamic("port")(port)
    __obj.asInstanceOf[WebAuthChallenger]
  }
}

