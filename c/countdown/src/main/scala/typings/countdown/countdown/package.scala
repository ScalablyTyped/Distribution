package typings.countdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object countdown {
  type DateFunction = js.Function1[/* timespan */ typings.countdown.countdown.Timespan, scala.Unit]
  type DateTime = js.UndefOr[
    scala.Double | typings.std.Date | typings.countdown.countdown.DateFunction | scala.Null
  ]
}
