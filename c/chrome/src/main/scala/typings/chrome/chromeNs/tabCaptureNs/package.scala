package typings.chrome.chromeNs

import typings.chrome.chromeNs.eventsNs.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tabCaptureNs {
  type CaptureStatusChangedEvent = Event[js.Function1[/* info */ CaptureInfo, Unit]]
}
