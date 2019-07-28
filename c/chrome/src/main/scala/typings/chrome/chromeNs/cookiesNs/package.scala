package typings.chrome.chromeNs

import typings.chrome.chromeNs.eventsNs.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cookiesNs {
  type CookieChangedEvent = Event[js.Function1[/* changeInfo */ CookieChangeInfo, Unit]]
}
