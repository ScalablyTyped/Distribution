package typings
package chromeLib.chromeNs.runtimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Port extends js.Object {
  var name: java.lang.String
  /** An object which allows the addition and removal of listeners for a Chrome event. */
  var onDisconnect: PortDisconnectEvent
  /** An object which allows the addition and removal of listeners for a Chrome event. */
  var onMessage: PortMessageEvent
  /**
    * Optional.
    * This property will only be present on ports passed to onConnect/onConnectExternal listeners.
    */
  var sender: js.UndefOr[MessageSender] = js.undefined
  def disconnect(): scala.Unit
  def postMessage(message: js.Object): scala.Unit
}

object Port {
  @scala.inline
  def apply(
    disconnect: js.Function0[scala.Unit],
    name: java.lang.String,
    onDisconnect: PortDisconnectEvent,
    onMessage: PortMessageEvent,
    postMessage: js.Function1[js.Object, scala.Unit],
    sender: MessageSender = null
  ): Port = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("disconnect")(disconnect)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("onDisconnect")(onDisconnect)
    __obj.updateDynamic("onMessage")(onMessage)
    __obj.updateDynamic("postMessage")(postMessage)
    if (sender != null) __obj.updateDynamic("sender")(sender)
    __obj.asInstanceOf[Port]
  }
}

