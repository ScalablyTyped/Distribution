package typings.azureSb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignRequest extends js.Object {
  def signRequest(webResource: js.Any, callback: js.Function0[Unit]): Unit
}

object SignRequest {
  @scala.inline
  def apply(signRequest: (js.Any, js.Function0[Unit]) => Unit): SignRequest = {
    val __obj = js.Dynamic.literal(signRequest = js.Any.fromFunction2(signRequest))
    __obj.asInstanceOf[SignRequest]
  }
}

