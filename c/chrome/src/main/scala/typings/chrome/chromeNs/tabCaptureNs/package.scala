package typings.chrome.chromeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tabCaptureNs {
  import typings.chrome.chromeNs.eventsNs.Event

  type CaptureStatusChangedEvent = Event[js.Function1[/* info */ CaptureInfo, Unit]]
}
