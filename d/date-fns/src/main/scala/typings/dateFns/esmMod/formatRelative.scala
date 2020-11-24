package typings.dateFns.esmMod

import typings.dateFns.anon.WeekStartsOn
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("date-fns/esm", "formatRelative")
@js.native
object formatRelative extends js.Object {
  
  def apply(date: Double, baseDate: Double): String = js.native
  def apply(date: Double, baseDate: Double, options: WeekStartsOn): String = js.native
  def apply(date: Double, baseDate: Date): String = js.native
  def apply(date: Double, baseDate: Date, options: WeekStartsOn): String = js.native
  def apply(date: Date, baseDate: Double): String = js.native
  def apply(date: Date, baseDate: Double, options: WeekStartsOn): String = js.native
  def apply(date: Date, baseDate: Date): String = js.native
  def apply(date: Date, baseDate: Date, options: WeekStartsOn): String = js.native
}
