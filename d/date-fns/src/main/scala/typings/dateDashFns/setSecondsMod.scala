package typings.dateDashFns

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns/setSeconds", JSImport.Namespace)
@js.native
object setSecondsMod extends js.Object {
  @js.native
  object default extends js.Object {
    def apply(date: Double, seconds: Double): Date = js.native
    def apply(date: Date, seconds: Double): Date = js.native
  }
  
}

