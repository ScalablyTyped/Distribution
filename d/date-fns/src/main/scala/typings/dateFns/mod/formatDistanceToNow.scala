package typings.dateFns.mod

import typings.dateFns.anon.AddSuffix
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns", "formatDistanceToNow")
@js.native
object formatDistanceToNow extends js.Object {
  def apply(date: Double): String = js.native
  def apply(date: Double, options: AddSuffix): String = js.native
  def apply(date: Date): String = js.native
  def apply(date: Date, options: AddSuffix): String = js.native
}

