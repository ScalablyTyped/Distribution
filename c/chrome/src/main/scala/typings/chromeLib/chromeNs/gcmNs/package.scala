package typings
package chromeLib.chromeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object gcmNs {
  type GcmErrorEvent = chromeLib.chromeNs.eventsNs.Event[js.Function1[/* error */ GcmError, scala.Unit]]
  type MessageDeletionEvent = chromeLib.chromeNs.eventsNs.Event[js.Function0[scala.Unit]]
  type MessageReceptionEvent = chromeLib.chromeNs.eventsNs.Event[js.Function1[/* message */ IncomingMessage, scala.Unit]]
}
