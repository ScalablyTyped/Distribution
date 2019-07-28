package typings.chrome.chromeNs.devtoolsNs

import typings.chrome.chromeNs.eventsNs.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object networkNs {
  type NavigatedEvent = Event[js.Function1[/* url */ String, Unit]]
  type RequestFinishedEvent = Event[js.Function1[/* request */ Request, Unit]]
}
