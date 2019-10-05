package typings.chrome.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object proxy {
  import typings.chrome.chrome.events.Event

  type ProxyErrorEvent = Event[js.Function1[/* details */ ErrorDetails, Unit]]
}
