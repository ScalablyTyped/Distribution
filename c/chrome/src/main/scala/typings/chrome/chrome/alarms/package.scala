package typings.chrome.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object alarms {
  import typings.chrome.chrome.events.Event

  type AlarmEvent = Event[js.Function1[/* alarm */ Alarm, Unit]]
}
