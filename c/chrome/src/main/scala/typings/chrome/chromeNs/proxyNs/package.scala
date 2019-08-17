package typings.chrome.chromeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object proxyNs {
  import typings.chrome.chromeNs.eventsNs.Event

  type ProxyErrorEvent = Event[js.Function1[/* details */ ErrorDetails, Unit]]
}
