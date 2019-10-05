package typings.chrome.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cookies {
  import typings.chrome.chrome.events.Event

  type CookieChangedEvent = Event[js.Function1[/* changeInfo */ CookieChangeInfo, Unit]]
}
