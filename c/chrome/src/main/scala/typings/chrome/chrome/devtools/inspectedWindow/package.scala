package typings.chrome.chrome.devtools

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object inspectedWindow {
  import typings.chrome.chrome.events.Event

  type ResourceAddedEvent = Event[js.Function1[/* resource */ Resource, Unit]]
  type ResourceContentCommittedEvent = Event[js.Function2[/* resource */ Resource, /* content */ String, Unit]]
}
