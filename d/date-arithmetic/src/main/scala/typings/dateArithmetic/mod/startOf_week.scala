package typings.dateArithmetic.mod

import typings.dateArithmetic.dateArithmeticStrings.week
import typings.std.Date
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("date-arithmetic", "startOf")
@js.native
object startOf_week extends js.Object {
  
  def apply(date: Date, unit: week, firtOfWeek: StartOfWeek): Date = js.native
  def apply(date: Date, unit: Exclude[Unit, week]): Date = js.native
}
