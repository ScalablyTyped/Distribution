package typings.dateDashFns

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns/esm/isWithinInterval", JSImport.Namespace)
@js.native
object esmIsWithinIntervalMod extends js.Object {
  @js.native
  object default extends js.Object {
    def apply(date: Double, interval: Interval): Boolean = js.native
    def apply(date: Date, interval: Interval): Boolean = js.native
  }
  
}

