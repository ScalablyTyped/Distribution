package typings.dateDashFns

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns/setMilliseconds", JSImport.Namespace)
@js.native
object setMillisecondsMod extends js.Object {
  @js.native
  object default extends js.Object {
    def apply(date: Double, milliseconds: Double): Date = js.native
    def apply(date: Date, milliseconds: Double): Date = js.native
  }
  
}

