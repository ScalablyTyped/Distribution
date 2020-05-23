package typings.dateFns.esmMod

import typings.dateFns.anon.WeekStartsOn
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns/esm", "startOfWeek")
@js.native
object startOfWeek extends js.Object {
  def apply(date: Double): Date = js.native
  def apply(date: Double, options: WeekStartsOn): Date = js.native
  def apply(date: Date): Date = js.native
  def apply(date: Date, options: WeekStartsOn): Date = js.native
}

