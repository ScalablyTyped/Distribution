package typings
package chromeDashAppsLib.WebViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Messaging handle to a guest window. */
trait ContentWindow extends js.Object {
  /**
    * Posts a message to the embedded web content as long as the embedded
    * content is displaying a page from the target origin. This method is
    * available once the page has completed loading. Listen for the
    * contentload event and then call the method.
    *
    * The guest will be able to send replies to the embedder by posting message
    * to event.source on the message event it receives.
    *
    * This API is identical to the HTML5 postMessage API for communication
    * between web pages. The embedder may listen for replies by adding
    * a message event listener to its own frame.
    *
    * @param message Message object to send to the guest.
    * @param targetOrigin Specifies what the origin of the guest window must be for the event to be dispatched.
    */
  def postMessage(message: js.Any, targetOrigin: java.lang.String): scala.Unit
}

