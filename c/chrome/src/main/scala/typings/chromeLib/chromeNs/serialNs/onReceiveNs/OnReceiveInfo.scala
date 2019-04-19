package typings
package chromeLib.chromeNs.serialNs.onReceiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnReceiveInfo extends js.Object {
  /** The connection identifier. */
  var connectionId: scala.Double
  /** The data received. */
  var data: stdLib.ArrayBuffer
}

object OnReceiveInfo {
  @scala.inline
  def apply(connectionId: scala.Double, data: stdLib.ArrayBuffer): OnReceiveInfo = {
    val __obj = js.Dynamic.literal(connectionId = connectionId, data = data)
  
    __obj.asInstanceOf[OnReceiveInfo]
  }
}

