package typings.dateFns

import typings.dateFns.anon.RoundingMethod
import typings.dateFns.anon.Unit
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns/esm/formatDistanceToNowStrict", JSImport.Namespace)
@js.native
object formatDistanceToNowStrictMod extends js.Object {
  @js.native
  object default extends js.Object {
    def apply(date: Double): String = js.native
    def apply(date: Double, options: RoundingMethod): String = js.native
    def apply(date: Double, options: Unit): String = js.native
    def apply(date: Date): String = js.native
    def apply(date: Date, options: RoundingMethod): String = js.native
    def apply(date: Date, options: Unit): String = js.native
  }
  
}

