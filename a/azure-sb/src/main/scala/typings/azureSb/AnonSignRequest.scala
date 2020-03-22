package typings.azureSb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSignRequest extends js.Object {
  def signRequest(webResource: js.Any, callback: js.Function0[Unit]): Unit
}

object AnonSignRequest {
  @scala.inline
  def apply(signRequest: (js.Any, js.Function0[Unit]) => Unit): AnonSignRequest = {
    val __obj = js.Dynamic.literal(signRequest = js.Any.fromFunction2(signRequest))
  
    __obj.asInstanceOf[AnonSignRequest]
  }
}

