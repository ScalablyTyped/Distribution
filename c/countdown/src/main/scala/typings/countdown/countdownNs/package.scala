package typings.countdown

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object countdownNs {
  type DateFunction = js.Function1[/* timespan */ Timespan, Unit]
  type DateTime = js.UndefOr[Double | Date | DateFunction | Null]
}
