package typings.chromeApps.chrome.webViewRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendMessageParams extends js.Object {
  /**
    * The value that will be passed in the message attribute
    * of the interface that is passed to the event handler.
    */
  var message: String
}

object SendMessageParams {
  @scala.inline
  def apply(message: String): SendMessageParams = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendMessageParams]
  }
}

