package typings.dateFns.esmMod

import typings.dateFns.anon.WeekStartsOn
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("date-fns/esm", "isThisWeek")
@js.native
object isThisWeek extends js.Object {
  
  def apply(date: Double): Boolean = js.native
  def apply(date: Double, options: WeekStartsOn): Boolean = js.native
  def apply(date: Date): Boolean = js.native
  def apply(date: Date, options: WeekStartsOn): Boolean = js.native
}
