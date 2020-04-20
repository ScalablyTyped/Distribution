package typings.dateFns.mod

import typings.dateFns.AnonRoundingMethod
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns", "formatDistanceToNowStrict")
@js.native
object formatDistanceToNowStrict extends js.Object {
  def apply(date: Double): String = js.native
  def apply(date: Double, options: AnonRoundingMethod): String = js.native
  def apply(date: Date): String = js.native
  def apply(date: Date, options: AnonRoundingMethod): String = js.native
}

