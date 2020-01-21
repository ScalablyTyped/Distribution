package typings.dateFns.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns", "lightFormat")
@js.native
object lightFormat extends js.Object {
  def apply(date: Double, format: String): String = js.native
  def apply(date: Date, format: String): String = js.native
}

