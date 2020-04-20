package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProfilerSessionStoppedParams extends js.Object {
  var ownerUri: String
  var sessionId: Double
}

object ProfilerSessionStoppedParams {
  @scala.inline
  def apply(ownerUri: String, sessionId: Double): ProfilerSessionStoppedParams = {
    val __obj = js.Dynamic.literal(ownerUri = ownerUri.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfilerSessionStoppedParams]
  }
}

