package typings.azureSb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCallback extends js.Object {
  def signRequest(webResource: js.Any, callback: js.Function0[Unit]): Unit
}

object AnonCallback {
  @scala.inline
  def apply(signRequest: (js.Any, js.Function0[Unit]) => Unit): AnonCallback = {
    val __obj = js.Dynamic.literal(signRequest = js.Any.fromFunction2(signRequest))
  
    __obj.asInstanceOf[AnonCallback]
  }
}

