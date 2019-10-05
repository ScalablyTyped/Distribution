package typings.chrome.chrome.networking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object config {
  import typings.chrome.chrome.events.Event

  type CaptivePorttalDetectedEvent = Event[js.Function1[/* networkInfo */ NetworkInfo, Unit]]
}
