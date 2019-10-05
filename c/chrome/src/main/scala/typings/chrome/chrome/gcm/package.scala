package typings.chrome.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object gcm {
  import typings.chrome.chrome.events.Event

  type GcmErrorEvent = Event[js.Function1[/* error */ GcmError, Unit]]
  type MessageDeletionEvent = Event[js.Function0[Unit]]
  type MessageReceptionEvent = Event[js.Function1[/* message */ IncomingMessage, Unit]]
}
