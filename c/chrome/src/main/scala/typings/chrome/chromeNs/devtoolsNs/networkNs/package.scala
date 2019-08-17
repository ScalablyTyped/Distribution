package typings.chrome.chromeNs.devtoolsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object networkNs {
  import typings.chrome.chromeNs.eventsNs.Event

  type NavigatedEvent = Event[js.Function1[/* url */ String, Unit]]
  type RequestFinishedEvent = Event[js.Function1[/* request */ Request, Unit]]
}
