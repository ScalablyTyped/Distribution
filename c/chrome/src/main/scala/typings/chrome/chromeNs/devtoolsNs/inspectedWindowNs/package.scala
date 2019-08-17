package typings.chrome.chromeNs.devtoolsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object inspectedWindowNs {
  import typings.chrome.chromeNs.eventsNs.Event

  type ResourceAddedEvent = Event[js.Function1[/* resource */ Resource, Unit]]
  type ResourceContentCommittedEvent = Event[js.Function2[/* resource */ Resource, /* content */ String, Unit]]
}
