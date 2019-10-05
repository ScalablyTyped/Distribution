package typings.chrome.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tabCapture {
  import typings.chrome.chrome.events.Event

  type CaptureStatusChangedEvent = Event[js.Function1[/* info */ CaptureInfo, Unit]]
}
