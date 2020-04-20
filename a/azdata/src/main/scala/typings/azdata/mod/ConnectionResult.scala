package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionResult extends js.Object {
  var connected: Boolean
  var connectionId: String
  var errorCode: Double
  var errorMessage: String
}

object ConnectionResult {
  @scala.inline
  def apply(connected: Boolean, connectionId: String, errorCode: Double, errorMessage: String): ConnectionResult = {
    val __obj = js.Dynamic.literal(connected = connected.asInstanceOf[js.Any], connectionId = connectionId.asInstanceOf[js.Any], errorCode = errorCode.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionResult]
  }
}

