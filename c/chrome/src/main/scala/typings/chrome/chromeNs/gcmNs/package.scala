package typings.chrome.chromeNs

import typings.chrome.chromeNs.eventsNs.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object gcmNs {
  type GcmErrorEvent = Event[js.Function1[/* error */ GcmError, Unit]]
  type MessageDeletionEvent = Event[js.Function0[Unit]]
  type MessageReceptionEvent = Event[js.Function1[/* message */ IncomingMessage, Unit]]
}
