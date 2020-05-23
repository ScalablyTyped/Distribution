package typings.dateFns.mod

import typings.dateFns.anon.FirstWeekContainsDate
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns", "format")
@js.native
object format extends js.Object {
  def apply(date: Double, format: String): String = js.native
  def apply(date: Double, format: String, options: FirstWeekContainsDate): String = js.native
  def apply(date: Date, format: String): String = js.native
  def apply(date: Date, format: String, options: FirstWeekContainsDate): String = js.native
}

