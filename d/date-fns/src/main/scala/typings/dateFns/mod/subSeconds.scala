package typings.dateFns.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns", "subSeconds")
@js.native
object subSeconds extends js.Object {
  def apply(date: Double, amount: Double): Date = js.native
  def apply(date: Date, amount: Double): Date = js.native
}

