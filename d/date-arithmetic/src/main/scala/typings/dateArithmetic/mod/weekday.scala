package typings.dateArithmetic.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("date-arithmetic", "weekday")
@js.native
object weekday extends js.Object {
  
  def apply(date: Date, value: Date): Double = js.native
  def apply(date: Date, value: Date, firstOfWeek: StartOfWeek): Date = js.native
}
