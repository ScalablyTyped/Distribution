package typings.chromeDashApps.chromeNs.runtimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object which allows two way communication with other pages.
  * @since Chrome 26.
  */
trait Port extends js.Object {
  var name: String
  /** An object which allows the addition and removal of listeners for a Chrome event. */
  var onDisconnect: typings.chromeDashApps.chromeNs.eventsNs.Event[js.Function1[/* port */ this.type, Unit]]
  /** An object which allows the addition and removal of listeners for a Chrome event. */
  var onMessage: typings.chromeDashApps.chromeNs.eventsNs.Event[js.Function2[/* message */ _, /* port */ this.type, Unit]]
  /**
    * Optional.
    * This property will only be present on ports passed to onConnect/onConnectExternal listeners.
    */
  var sender: js.UndefOr[MessageSender] = js.undefined
  def disconnect(): Unit
  def postMessage(message: js.Object): Unit
}

object Port {
  @scala.inline
  def apply(
    disconnect: () => Unit,
    name: String,
    onDisconnect: typings.chromeDashApps.chromeNs.eventsNs.Event[js.Function1[Port, Unit]],
    onMessage: typings.chromeDashApps.chromeNs.eventsNs.Event[js.Function2[/* message */ _, Port, Unit]],
    postMessage: js.Object => Unit,
    sender: MessageSender = null
  ): Port = {
    val __obj = js.Dynamic.literal(disconnect = js.Any.fromFunction0(disconnect), name = name, onDisconnect = onDisconnect, onMessage = onMessage, postMessage = js.Any.fromFunction1(postMessage))
    if (sender != null) __obj.updateDynamic("sender")(sender)
    __obj.asInstanceOf[Port]
  }
}

