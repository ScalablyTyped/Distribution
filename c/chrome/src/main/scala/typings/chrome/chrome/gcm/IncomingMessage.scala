package typings.chrome.chrome.gcm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncomingMessage extends js.Object {
  /**
    * Optional.
    * The collapse key of a message. See Collapsible Messages section of Cloud Messaging documentation for details.
    */
  var collapseKey: js.UndefOr[String] = js.undefined
  /** The message data. */
  var data: js.Object
  /**
    * Optional.
    * The sender who issued the message.
    * @since Since Chrome 41.
    */
  var from: js.UndefOr[String] = js.undefined
}

object IncomingMessage {
  @scala.inline
  def apply(data: js.Object, collapseKey: String = null, from: String = null): IncomingMessage = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (collapseKey != null) __obj.updateDynamic("collapseKey")(collapseKey.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncomingMessage]
  }
}

