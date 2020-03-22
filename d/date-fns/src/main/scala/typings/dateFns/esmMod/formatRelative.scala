package typings.dateFns.esmMod

import typings.dateFns.AnonWeekStartsOn
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns/esm", "formatRelative")
@js.native
object formatRelative extends js.Object {
  def apply(date: Double, baseDate: Double): String = js.native
  def apply(date: Double, baseDate: Double, options: AnonWeekStartsOn): String = js.native
  def apply(date: Double, baseDate: Date): String = js.native
  def apply(date: Double, baseDate: Date, options: AnonWeekStartsOn): String = js.native
  def apply(date: Date, baseDate: Double): String = js.native
  def apply(date: Date, baseDate: Double, options: AnonWeekStartsOn): String = js.native
  def apply(date: Date, baseDate: Date): String = js.native
  def apply(date: Date, baseDate: Date, options: AnonWeekStartsOn): String = js.native
}

