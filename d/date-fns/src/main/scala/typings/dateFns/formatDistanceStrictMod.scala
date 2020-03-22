package typings.dateFns

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns/esm/formatDistanceStrict", JSImport.Namespace)
@js.native
object formatDistanceStrictMod extends js.Object {
  @js.native
  object default extends js.Object {
    def apply(date: Double, baseDate: Double): String = js.native
    def apply(date: Double, baseDate: Double, options: AnonRoundingMethod): String = js.native
    def apply(date: Double, baseDate: Double, options: AnonUnit): String = js.native
    def apply(date: Double, baseDate: Date): String = js.native
    def apply(date: Double, baseDate: Date, options: AnonRoundingMethod): String = js.native
    def apply(date: Double, baseDate: Date, options: AnonUnit): String = js.native
    def apply(date: Date, baseDate: Double): String = js.native
    def apply(date: Date, baseDate: Double, options: AnonRoundingMethod): String = js.native
    def apply(date: Date, baseDate: Double, options: AnonUnit): String = js.native
    def apply(date: Date, baseDate: Date): String = js.native
    def apply(date: Date, baseDate: Date, options: AnonRoundingMethod): String = js.native
    def apply(date: Date, baseDate: Date, options: AnonUnit): String = js.native
  }
  
}

