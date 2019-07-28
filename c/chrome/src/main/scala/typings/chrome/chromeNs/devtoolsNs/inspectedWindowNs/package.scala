package typings.chrome.chromeNs.devtoolsNs

import typings.chrome.chromeNs.eventsNs.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object inspectedWindowNs {
  type ResourceAddedEvent = Event[js.Function1[/* resource */ Resource, Unit]]
  type ResourceContentCommittedEvent = Event[js.Function2[/* resource */ Resource, /* content */ String, Unit]]
}
