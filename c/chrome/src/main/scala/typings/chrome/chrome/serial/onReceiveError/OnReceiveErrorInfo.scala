package typings.chrome.chrome.serial.onReceiveError

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnReceiveErrorInfo extends js.Object {
  /** The connection identifier. */
  var connectionId: Double
  /** The data received. */
  var error: ArrayBuffer
}

object OnReceiveErrorInfo {
  @scala.inline
  def apply(connectionId: Double, error: ArrayBuffer): OnReceiveErrorInfo = {
    val __obj = js.Dynamic.literal(connectionId = connectionId.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OnReceiveErrorInfo]
  }
}

