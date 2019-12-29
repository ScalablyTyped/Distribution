package typings.chromeDashApps.chrome.runtime

import typings.chromeDashApps.chrome.events.Event
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
  var onDisconnect: Event[js.Function1[/* port */ this.type, Unit]]
  /** An object which allows the addition and removal of listeners for a Chrome event. */
  var onMessage: Event[js.Function2[/* message */ _, /* port */ this.type, Unit]]
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
    onDisconnect: Event[js.Function1[Port, Unit]],
    onMessage: Event[js.Function2[/* message */ _, Port, Unit]],
    postMessage: js.Object => Unit,
    sender: MessageSender = null
  ): Port = {
    val __obj = js.Dynamic.literal(disconnect = js.Any.fromFunction0(disconnect), name = name.asInstanceOf[js.Any], onDisconnect = onDisconnect.asInstanceOf[js.Any], onMessage = onMessage.asInstanceOf[js.Any], postMessage = js.Any.fromFunction1(postMessage))
    if (sender != null) __obj.updateDynamic("sender")(sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[Port]
  }
}

