package typings.dateFns

import typings.dateFns.anon.RoundingMethod
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns/formatDistanceStrict", JSImport.Namespace)
@js.native
object dateFnsFormatDistanceStrictMod extends js.Object {
  @js.native
  object default extends js.Object {
    def apply(date: Double, baseDate: Double): String = js.native
    def apply(date: Double, baseDate: Double, options: RoundingMethod): String = js.native
    def apply(date: Double, baseDate: Date): String = js.native
    def apply(date: Double, baseDate: Date, options: RoundingMethod): String = js.native
    def apply(date: Date, baseDate: Double): String = js.native
    def apply(date: Date, baseDate: Double, options: RoundingMethod): String = js.native
    def apply(date: Date, baseDate: Date): String = js.native
    def apply(date: Date, baseDate: Date, options: RoundingMethod): String = js.native
  }
  
}

