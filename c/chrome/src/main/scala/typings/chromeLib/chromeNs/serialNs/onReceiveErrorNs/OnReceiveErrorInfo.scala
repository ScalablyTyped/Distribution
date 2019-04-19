package typings
package chromeLib.chromeNs.serialNs.onReceiveErrorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnReceiveErrorInfo extends js.Object {
  /** The connection identifier. */
  var connectionId: scala.Double
  /** The data received. */
  var error: stdLib.ArrayBuffer
}

object OnReceiveErrorInfo {
  @scala.inline
  def apply(connectionId: scala.Double, error: stdLib.ArrayBuffer): OnReceiveErrorInfo = {
    val __obj = js.Dynamic.literal(connectionId = connectionId, error = error)
  
    __obj.asInstanceOf[OnReceiveErrorInfo]
  }
}

