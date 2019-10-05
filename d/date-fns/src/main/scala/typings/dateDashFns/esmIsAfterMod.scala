package typings.dateDashFns

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns/esm/isAfter", JSImport.Namespace)
@js.native
object esmIsAfterMod extends js.Object {
  @js.native
  object default extends js.Object {
    def apply(date: Double, dateToCompare: Double): Boolean = js.native
    def apply(date: Double, dateToCompare: Date): Boolean = js.native
    def apply(date: Date, dateToCompare: Double): Boolean = js.native
    def apply(date: Date, dateToCompare: Date): Boolean = js.native
  }
  
}

