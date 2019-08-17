package typings.countdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object countdownNs {
  import typings.std.Date

  type DateFunction = js.Function1[/* timespan */ Timespan, Unit]
  type DateTime = js.UndefOr[Double | Date | DateFunction | Null]
}
