package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddListenerCallback extends js.Object {
  val OnReceiveErrorEnum: Anon_Break
  def addListener(
    callback: js.Function1[
      /* info */ chromeLib.chromeNs.serialNs.onReceiveErrorNs.OnReceiveErrorInfo, 
      scala.Unit
    ]
  ): scala.Unit
}

object Anon_AddListenerCallback {
  @scala.inline
  def apply(
    OnReceiveErrorEnum: Anon_Break,
    addListener: js.Function1[
      /* info */ chromeLib.chromeNs.serialNs.onReceiveErrorNs.OnReceiveErrorInfo, 
      scala.Unit
    ] => scala.Unit
  ): Anon_AddListenerCallback = {
    val __obj = js.Dynamic.literal(OnReceiveErrorEnum = OnReceiveErrorEnum, addListener = js.Any.fromFunction1(addListener))
  
    __obj.asInstanceOf[Anon_AddListenerCallback]
  }
}

