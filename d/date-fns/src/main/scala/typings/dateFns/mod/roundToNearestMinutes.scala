package typings.dateFns.mod

import typings.dateFns.anon.NearestTo
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns", "roundToNearestMinutes")
@js.native
object roundToNearestMinutes extends js.Object {
  def apply(date: Double): Date = js.native
  def apply(date: Double, options: NearestTo): Date = js.native
  def apply(date: Date): Date = js.native
  def apply(date: Date, options: NearestTo): Date = js.native
}

