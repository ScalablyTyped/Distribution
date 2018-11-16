package typings
package chromeLib.chromeNs.socketNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SocketInfo extends js.Object {
  var connected: scala.Boolean
  var localAddress: js.UndefOr[java.lang.String] = js.undefined
  var localPort: js.UndefOr[scala.Double] = js.undefined
  var peerAddress: js.UndefOr[java.lang.String] = js.undefined
  var peerPort: js.UndefOr[scala.Double] = js.undefined
  var socketType: java.lang.String
}

