package typings
package chromeDashAppsLib.chromeNs.webViewRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendMessageParams extends js.Object {
  /**
    * The value that will be passed in the message attribute
    * of the interface that is passed to the event handler.
    */
  var message: java.lang.String
}

object SendMessageParams {
  @scala.inline
  def apply(message: java.lang.String): SendMessageParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[SendMessageParams]
  }
}

