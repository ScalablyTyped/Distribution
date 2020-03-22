package typings.dateFns.mod

import typings.dateFns.AnonLocale
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns", "differenceInCalendarWeeks")
@js.native
object differenceInCalendarWeeks extends js.Object {
  def apply(dateLeft: Double, dateRight: Double): Double = js.native
  def apply(dateLeft: Double, dateRight: Double, options: AnonLocale): Double = js.native
  def apply(dateLeft: Double, dateRight: Date): Double = js.native
  def apply(dateLeft: Double, dateRight: Date, options: AnonLocale): Double = js.native
  def apply(dateLeft: Date, dateRight: Double): Double = js.native
  def apply(dateLeft: Date, dateRight: Double, options: AnonLocale): Double = js.native
  def apply(dateLeft: Date, dateRight: Date): Double = js.native
  def apply(dateLeft: Date, dateRight: Date, options: AnonLocale): Double = js.native
}

