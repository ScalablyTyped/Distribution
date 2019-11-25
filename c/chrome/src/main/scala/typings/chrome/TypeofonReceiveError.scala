package typings.chrome

import typings.chrome.chrome.serial.onReceiveError.OnReceiveErrorInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofonReceiveError extends js.Object {
  val OnReceiveErrorEnum: Anon_Break
  def addListener(callback: js.Function1[/* info */ OnReceiveErrorInfo, Unit]): Unit
}

object TypeofonReceiveError {
  @scala.inline
  def apply(
    OnReceiveErrorEnum: Anon_Break,
    addListener: js.Function1[/* info */ OnReceiveErrorInfo, Unit] => Unit
  ): TypeofonReceiveError = {
    val __obj = js.Dynamic.literal(OnReceiveErrorEnum = OnReceiveErrorEnum.asInstanceOf[js.Any], addListener = js.Any.fromFunction1(addListener))
  
    __obj.asInstanceOf[TypeofonReceiveError]
  }
}

